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
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.DefaultListModel;
import javax.swing.ListModel;

import org.json.JSONArray;
import org.json.JSONObject;

public class GerenciadorMaterias {

    private final DefaultListModel<Materia> materias;
    private DefaultListModel<String> modelAnotacoes;
    private String json = "{}";

    public GerenciadorMaterias() {
        // Inicia uma nova lista vazia de materias
        materias = new DefaultListModel<>();
        modelAnotacoes = new DefaultListModel<>();
        loadMaterias();
    }

    // Função chamada na função loadMaterias()
    // Adiciona todas as matérias do arquivo json as materias do programa
    private void adicionarMateriasALista(JSONObject jsonMaterias) {
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
    public void addMateria(Materia materia) {
        // Se a materia não tem nome, ela não será adicionada
        if (materia.getTitulo().strip().equals("")) {
            return;
        }
        // ADICIONA uma NOVA MATERIA na ultima posição
        materias.add(materias.size(), materia);
        salvarMaterias();
    }

    // Funções que remove a materia da posição especificada matéria
    public void removerMateriaIndex(int pos) {
        // REMOVE a MATERIA da posição pos
        materias.remove(pos);
        removeMateriaJSON(pos);
        // Salva para o arquivo
        salvarMaterias();
    }

    public void removerMateria(Materia materia) {
        for (int i = 0; i < materias.size(); i++) {
            if (materias.get(i) == materia)
                removerMateriaIndex(i);
        }
    }

    public void removerMateriaSelecionada() {
        removerMateriaIndex(getMateriaSelecionadaIndex());
    }

    public int getMateriaSelecionadaIndex() {
        return Orgamico.jListMaterias.getSelectedIndex();
    }

    public int getAnotacaoSelecionadaIndex() {
        return Orgamico.jListAnotacoes.getSelectedIndex();
    }

    public void setAnotacoes(int index) {
        this.modelAnotacoes.clear();
        this.modelAnotacoes.addAll(materias.get(index).getAnotacoes());
    }

    public DefaultListModel<String> getModelAnotacoes() {
        return modelAnotacoes;
    }

    // Salva o conteúdo da variavel json para o arquivo materias.json
    public void salvarMaterias() {
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

    private void addMateriaJSON(Materia materia) {
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

    private void removeMateriaJSON(int pos) {
        // Lista de materias
        JSONObject materiasjson = new JSONObject(json);
        // Remove a matéria da posição pos
        materiasjson.getJSONArray("materias").remove(pos);
        // Atualiza a variavel que contem o conteudo do arquivo json
        // O 4 simboliza a indentação do arquivo (4 espaços)
        json = materiasjson.toString(4);
    }

    public void removeAnotacao(int mpos, int pos) {
        Materia materia = materias.get(mpos);
        materia.removeAnotacao(Orgamico.g.getAnotacaoSelecionadaIndex());
        removeAnotacaoJSON(mpos, pos);
    }

    public void removeAnotacaoJSON(int mpos, int pos) {
        // Lista de materias
        JSONObject materiasjson = new JSONObject(json);
        // Remove a anotação da matéria na posição
        materiasjson.getJSONArray("materias").getJSONObject(mpos).getJSONArray("anotacoes").remove(pos);
        // Atualiza a variavel que contem o conteudo do arquivo json
        // O 4 simboliza a indentação do arquivo (4 espaços)
        json = materiasjson.toString(4);
    }

    private JSONObject criarMateriaJSONObject(String titulo, String descricao) {
        JSONObject materiaobj = new JSONObject();
        materiaobj.put("titulo", titulo);
        materiaobj.put("descricao", descricao);
        materiaobj.put("anotacoes", new JSONArray());

        return materiaobj;
    }

    private ArrayList<String> extrairAnotacoesJSON(JSONObject materia) {
        ArrayList<String> anotacoes = new ArrayList<>();
        JSONArray anotacoesjson = materia.getJSONArray("anotacoes");

        for (int i = 0; i < anotacoesjson.length(); i++) {
            anotacoes.add(anotacoesjson.getString(i));
        }

        return anotacoes;
    }

    private void loadMaterias() {
        JSONObject jsonMaterias = getMateriasJSON();
        adicionarMateriasALista(jsonMaterias);
    }

    private JSONObject getMateriasJSON() {
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

    private void criarArquivoJSON() {
        // Cria um objeto
        File jsonFile = new File(MATERIAS_JSON_PATH);
        // Cria todo o caminho de pastas que conterá o arquivo .json
        new File(ORGAMICODATA_PATH).mkdirs();
        try {
            // Cria um arquivo na pasta
            jsonFile.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(GerenciadorMaterias.class.getName()).log(Level.SEVERE, null, ex);
        }
        // Adiciona um lista vazia de matérias ao arquivo
        escreverArquivo(jsonFile, "{\n    \"materias\":[\n    ]\n}\n");
    }

    private void escreverArquivo(File jsonFile, String texto) {
        try (FileWriter writer = new FileWriter(jsonFile) // Objeto escritor
        ) {
            // Adiciona um lista vazia de matérias ao arquivo
            writer.write(texto);
        } catch (IOException ex) {
            Logger.getLogger(GerenciadorMaterias.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Retorna o texto de um arquivo
    private String lerArquivo(String path) {
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

    public Materia getMateriaSelecionada() {
        return materias.get(getMateriaSelecionadaIndex());
    }

    public ListModel<Materia> getMaterias() {
        return materias;
    }

    public void nextMateria() {
        int index = Orgamico.jListMaterias.getSelectedIndex() + 1;
        if (index < materias.size()) {
            Orgamico.jListMaterias.setSelectedIndex(index);
            setAnotacoes(index);
        }
    }

    public void lastMateria() {
        int index = Orgamico.jListMaterias.getSelectedIndex() - 1;
        if (index >= 0) {
            Orgamico.jListMaterias.setSelectedIndex(index);
            setAnotacoes(index);
        }
    }

    // Função que adiciona uma anotação à matéria selecionada
    public void addAnotacao(String anotacao) {
        // Se a anotação estiver vazia, ela não será adicionada
        if (anotacao.strip().equals("")) {
            return;
        }
        // ADICIONA uma NOVA ANOTAÇÃO na ultima posição
        getMateriaSelecionada().addAnotacao(anotacao);
        // ADICIONA ao arquivo JSON
        addAnotacaoJSON(getMateriaSelecionadaIndex(), anotacao);
        // Atualiza todas as anotações
        Orgamico.g.setAnotacoes(getMateriaSelecionadaIndex());
        // Salva para o arquivo
        salvarMaterias();
    }
    
    // Função que adiciona uma anotação à matéria selecionada
    public void editarAnotacao(String anotacao) {
        // ADICIONA uma NOVA ANOTAÇÃO na ultima posição
        getMateriaSelecionada().addAnotacao(anotacao);
        // ADICIONA ao arquivo JSON
        addAnotacaoJSON(getMateriaSelecionadaIndex() ,anotacao);
        // Salva para o arquivo
        salvarMaterias();
        // Atualiza todas as anotações
        Orgamico.g.setAnotacoes(getMateriaSelecionadaIndex());
    }

    private void addAnotacaoJSON(int pos, String anotacao) {
        // Lista de materias
        JSONObject materiasjson = new JSONObject(json);
        // Adicionar anotação
        materiasjson.getJSONArray("materias").getJSONObject(pos).getJSONArray("anotacoes").put(anotacao);
        // Atualiza a variavel que contem o conteudo do arquivo json
        // O 4 simboliza a indentação do arquivo (4 espaços)
        json = materiasjson.toString(4);
    }
}
