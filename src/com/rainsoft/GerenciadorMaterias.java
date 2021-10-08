package com.rainsoft;

import static com.rainsoft.Orgamico.MATERIAS_JSON_PATH;
import static com.rainsoft.Orgamico.ORGAMICODATA_PATH;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.DefaultListModel;
import javax.swing.ListModel;

import org.json.JSONArray;
import org.json.JSONObject;

public class GerenciadorMaterias {

    private final DefaultListModel<Materia> materias;
    private DefaultListModel<String> anotacoes;
    private String json;

    public GerenciadorMaterias() {
        // Inicia uma nova lista vazia de materias
        materias = new DefaultListModel<>();
        anotacoes = new DefaultListModel<>();
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
        if (materia.getTitulo().strip() == "")
            return;
        // ADICIONA uma NOVA MATERIA na ultima posição
        materias.add(materias.size(), materia);
        // Adiciona ao arquivo JSON
        addMateriaJSON(materia);
        // Salva para o arquivo
        salvarMaterias();
    }

    // Funções que remove a materia da posição especificada matéria
    public void removeMateria(int pos) {
        // REMOVE a MATERIA da posição pos
        materias.remove(pos);
        // Remove do arquivo JSON;
        removeMateriaJSON(pos);
        // Salva para o arquivo
        salvarMaterias();
    }

    public int getMateriaSelecionada() {
        return Orgamico.jListMaterias.getSelectedIndex();
    }

    public void setAnotacoes(int index) {
        this.anotacoes.clear();
        this.anotacoes.addAll(materias.get(index).getAnotacoes());
    }

    public DefaultListModel<String> getModelAnotacoes() {
        return anotacoes;
    }

    // Salva o conteúdo da variavel json para o arquivo materias.json
    public void salvarMaterias() {
        File jsonFile = new File(MATERIAS_JSON_PATH);
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

    private JSONObject criarMateriaJSONObject(String titulo, String descricao) {
        JSONObject materiaobj = new JSONObject();
        materiaobj.put("titulo", titulo);
        materiaobj.put("descricao", descricao);
        materiaobj.put("anotacoes", new JSONArray());
        System.out.println(materiaobj.toString(4));

        return materiaobj;
    }

    private ArrayList<String> extrairAnotacoesJSON(JSONObject materia) {
        ArrayList<String> anotacoes = new ArrayList<>();
        JSONArray anotacoesjson = materia.getJSONArray("anotacoes");

        for (int i = 0; i < anotacoesjson.length(); i++)
            anotacoes.add(anotacoesjson.getString(i));

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
        JSONObject jsonMaterias = new JSONObject(json);
        return jsonMaterias;
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
        String conteudo = "";
        try (Scanner scanner = new Scanner(new File(path))) {
            while (scanner.hasNextLine()) {
                conteudo += scanner.nextLine() + "\n";
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GerenciadorMaterias.class.getName()).log(Level.SEVERE, null, ex);
        }

        return conteudo;
    }

    public int getSelectedIndex() {
        return Orgamico.jListMaterias.getSelectedIndex();
    }

    public Materia getSelectedMateria() {
        return materias.get(getSelectedIndex());
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
        if (anotacao.strip() == "")
            return;
        // ADICIONA uma NOVA ANOTAÇÃO na ultima posição
        getSelectedMateria().addAnotacao(anotacao);
        // ADICIONA ao arquivo JSON
        addAnotacaoJSON(anotacao);
        // Salva para o arquivo
        salvarMaterias();
        // Atualiza todas as anotações
        Orgamico.g.setAnotacoes(getSelectedIndex());
    }

    private void addAnotacaoJSON(String anotacao) {
        // Lista de materias
        JSONObject materiasjson = new JSONObject(json);
        // Adicionar anotação
        materiasjson.getJSONArray("materias").getJSONObject(getSelectedIndex()).getJSONArray("anotacoes").put(anotacao);
        System.out.println("Anotação adicionada: " + anotacao);
        // Atualiza a variavel que contem o conteudo do arquivo json
        // O 4 simboliza a indentação do arquivo (4 espaços)
        json = materiasjson.toString(4);
    }
}
