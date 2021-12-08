package com.rainsoft;

import static com.rainsoft.Orgamico.MATERIAS_JSON_PATH;
import static com.rainsoft.Orgamico.ORGAMICODATA_PATH;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

import org.json.JSONArray;
import org.json.JSONObject;

public class GerenciadorMaterias {

    private static final DefaultListModel<Materia> materias = new DefaultListModel<>();
    private static DefaultListModel<String> modelAnotacoes = new DefaultListModel<>();
    private static String json = "{}";

    private GerenciadorMaterias(){
    }

    // Função chamada na função loadMaterias()
    // Adiciona todas as matérias do arquivo json as materias do programa
    private static void adicionarMateriasALista(JSONObject jsonMaterias) {
        JSONArray materiasjson = jsonMaterias.getJSONArray("materias");
        // Loop de materias contidas no .json
        for (int i = 0; i < materiasjson.length(); i++) {
            // Objeto materia
            JSONObject materia = materiasjson.getJSONObject(i);
            // Extrai o TITULO da materia. Se o titulo não existir, exclua-o e continue
            String titulo;
            try {
                titulo = materia.getString("titulo");
            } catch (Exception e) {
                removeMateriaJSON(i);
                salvarMaterias();
                continue;
            }
            // Extrai a DESCRIÇÃO da materia
            String descricao = materia.getString("descricao");
            // Extrai as anotacoes da materia
            ArrayList<String> anotacoes = extrairAnotacoesJSON(materia);

            // ADICIONA uma NOVA MATERIA na ultima posição
            materias.add(materias.size(), new Materia(titulo, descricao, anotacoes));
        }
    }

    // Adiciona uma matéria à lista e ao arquivo JSON
    public static void addMateria(Materia materia) {
        // Se a materia não tem nome, ela não será adicionada
        if (materia.getTitulo().strip().equals("")) {
            return;
        }
        // ADICIONA uma NOVA MATERIA na ultima posição
        materias.add(materias.size(), materia);
        salvarMaterias();
    }

    // Funções que remove a materia da posição especificada matéria
    public static void removerMateriaIndex(int pos) {
        // REMOVE a MATERIA da posição pos
        materias.remove(pos);
        removeMateriaJSON(pos);
        // Salva para o arquivo
        salvarMaterias();
    }

    public static void removerMateria(Materia materia) {
        for (int i = 0; i < materias.size(); i++) {
            if (materias.get(i) == materia)
                removerMateriaIndex(i);
        }
    }

    public static void removerMateriaSelecionada() {
        removerMateriaIndex(getMateriaSelecionadaIndex());
    }

    public static int getMateriaSelecionadaIndex() {
        return Orgamico.jListMaterias.getSelectedIndex();
    }

    public static int getAnotacaoSelecionadaIndex() {
        return Orgamico.jListAnotacoes.getSelectedIndex();
    }

    public static void setAnotacoes(int index) {
        modelAnotacoes.clear();
        modelAnotacoes.addAll(materias.get(index).getAnotacoes());
    }

    public static DefaultListModel<String> getModelAnotacoes() {
        return modelAnotacoes;
    }

    public static void salvarMaterias() {
        File jsonFile = new File(MATERIAS_JSON_PATH);
        json = "{\"materias\":[]}";

        for (int i = 0; i < Orgamico.jListMaterias.getModel().getSize(); i++) {
            Materia materia = materias.get(i);
            addMateriaJSON( materia );
            ArrayList<String> anotacoes = materia.getAnotacoes();

            for (int j = 0; j < anotacoes.size(); j++) {
                addAnotacaoJSON(i, anotacoes.get(j) );
            }
        }

        escreverArquivo(jsonFile, json);
    }

    private static void addMateriaJSON(Materia materia) {
        // Lista de materias
        JSONObject materiasjson = new JSONObject(json);
        // Cria uma nova materia no formato JSON
        JSONObject novaMateria = criarMateriaJSONObject(materia.getTitulo(), materia.getDescricao());
        // Coloca a nova materia na lista de matérias
        materiasjson.getJSONArray("materias").put(novaMateria);
        // Atualiza a variavel que contem o conteudo do arquivo json
        // O 4 simboliza a indentação do arquivo (4 espaços)
        json = materiasjson.toString(4);
    }

    private static void removeMateriaJSON(int pos) {
        // Lista de materias
        JSONObject materiasjson = new JSONObject(json);
        // Remove a matéria da posição pos
        materiasjson.getJSONArray("materias").remove(pos);
        // Atualiza a variavel que contem o conteudo do arquivo json
        // O 4 simboliza a indentação do arquivo (4 espaços)
        json = materiasjson.toString(4);
    }

    public static void removeAnotacao(int mpos, int pos) {
        Materia materia = materias.get(mpos);
        materia.removeAnotacao(getAnotacaoSelecionadaIndex());
        removeAnotacaoJSON(mpos, pos);
    }

    public static void removeAnotacaoJSON(int mpos, int pos) {
        // Lista de materias
        JSONObject materiasjson = new JSONObject(json);
        // Remove a anotação da matéria na posição
        materiasjson.getJSONArray("materias").getJSONObject(mpos).getJSONArray("anotacoes").remove(pos);
        // Atualiza a variavel que contem o conteudo do arquivo json
        // O 4 simboliza a indentação do arquivo (4 espaços)
        json = materiasjson.toString(4);
    }

    private static JSONObject criarMateriaJSONObject(String titulo, String descricao) {
        JSONObject materiaobj = new JSONObject();
        materiaobj.put("titulo", titulo);
        materiaobj.put("descricao", descricao);
        materiaobj.put("anotacoes", new JSONArray());

        return materiaobj;
    }

    private static ArrayList<String> extrairAnotacoesJSON(JSONObject materia) {
        ArrayList<String> anotacoes = new ArrayList<>();
        JSONArray anotacoesjson = materia.getJSONArray("anotacoes");

        for (int i = 0; i < anotacoesjson.length(); i++) {
            anotacoes.add(anotacoesjson.getString(i));
        }

        return anotacoes;
    }

    public static void loadMaterias() {
        JSONObject jsonMaterias = getMateriasJSON();
        adicionarMateriasALista(jsonMaterias);
    }

    private static JSONObject getMateriasJSON() {
        File jsonFile = new File(MATERIAS_JSON_PATH);
        // Se o arquivo materias.json não existir, crie um
        if (!jsonFile.exists()) {
            criarArquivoJSON();
        }
        // Lê o conteúdo do arquivo materias.json
        json = lerArquivo(MATERIAS_JSON_PATH);

        // Cria um objeto JSON que contém todos os dados de matérias
        return new JSONObject(json);
    }

    private static void criarArquivoJSON() {
        // Cria um objeto
        File jsonFile = new File(MATERIAS_JSON_PATH);
        // Cria todo o caminho de pastas que conterá o arquivo .json
        new File(ORGAMICODATA_PATH).mkdirs();
        try {
            // Cria um arquivo na pasta
            jsonFile.createNewFile();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível criar o arquivo JSON", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        // Adiciona um lista vazia de matérias ao arquivo
        escreverArquivo(jsonFile, "{\n    \"materias\":[\n    ]\n}\n");
    }

    private static void escreverArquivo(File jsonFile, String texto) {
        try (FileWriter writer = new FileWriter(jsonFile) // Objeto escritor
        ) {
            // Adiciona um lista vazia de matérias ao arquivo
            writer.write(texto);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível salvar", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static String lerArquivo(String path) {
        String content = "";
        File file = new File(path);
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }
        String st;

        try {
            while ((st = br.readLine()) != null)
                content += st;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }

    public static Materia getMateriaSelecionada() {
        return materias.get(getMateriaSelecionadaIndex());
    }

    public static ListModel<Materia> getModelMaterias() {
        return materias;
    }

    public static void nextMateria() {
        int index = Orgamico.jListMaterias.getSelectedIndex() + 1;
        if (index < materias.size()) {
            Orgamico.jListMaterias.setSelectedIndex(index);
            setAnotacoes(index);
        }
    }

    public static void lastMateria() {
        int index = Orgamico.jListMaterias.getSelectedIndex() - 1;
        if (index >= 0) {
            Orgamico.jListMaterias.setSelectedIndex(index);
            setAnotacoes(index);
        }
    }

    public static void addAnotacao(String anotacao) {
        // Se a anotação estiver vazia, ela não será adicionada
        if (anotacao.strip().equals("")) {
            return;
        }
        // ADICIONA uma NOVA ANOTAÇÃO na ultima posição
        getMateriaSelecionada().addAnotacao(anotacao);
        // ADICIONA ao arquivo JSON
        addAnotacaoJSON(getMateriaSelecionadaIndex(), anotacao);
        // Atualiza todas as anotações
        setAnotacoes(getMateriaSelecionadaIndex());
        // Salva para o arquivo
        salvarMaterias();
    }
    
    public static void editarAnotacao(String anotacao) {
        // ADICIONA uma NOVA ANOTAÇÃO na ultima posição
        getMateriaSelecionada().addAnotacao(anotacao);
        // ADICIONA ao arquivo JSON
        addAnotacaoJSON(getMateriaSelecionadaIndex() ,anotacao);
        // Salva para o arquivo
        salvarMaterias();
        // Atualiza todas as anotações
        setAnotacoes(getMateriaSelecionadaIndex());
    }

    private static void addAnotacaoJSON(int pos, String anotacao) {
        // Lista de materias
        JSONObject materiasjson = new JSONObject(json);
        // Adicionar anotação
        materiasjson.getJSONArray("materias").getJSONObject(pos).getJSONArray("anotacoes").put(anotacao);
        // Atualiza a variavel que contem o conteudo do arquivo json
        // O 4 simboliza a indentação do arquivo (4 espaços)
        json = materiasjson.toString(4);
    }

    public static void editarMateria(String titulo, String descricao) {
        Materia materiaSelecionada = GerenciadorMaterias.getMateriaSelecionada();
        materiaSelecionada.setTitulo(titulo);
        materiaSelecionada.setDescricao(descricao);
        salvarMaterias();
    }
}