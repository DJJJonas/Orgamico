package com.rainsoft;

import static com.rainsoft.Orgamica.MATERIAS_JSON_PATH;
import static com.rainsoft.Orgamica.ORGAMICADATA_PATH;
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
    private String json;

    public GerenciadorMaterias() {
        // Inicia uma nova lista vazia de materias
        materias = new DefaultListModel<>();
        loadMaterias();
    }

    private void adicionarMateriasALista(JSONObject jsonMaterias) {
        JSONArray materiasjson = jsonMaterias.getJSONArray("materias");
        // Loop de materias contidas no .json
        for (int i = 0; i < materiasjson.length(); i++) {
            // Objeto materia
            JSONObject materia = materiasjson.getJSONObject(i);
            // Extrai o TITULO da materia
            String titulo = materia.getString("titulo");
            // Extrai as anotacoes da materia
            ArrayList<String> anotacoes = extrairAnotacoesJSON(materia);

            // ADICIONA uma NOVA MATERIA na ultima posição
            materias.add(materias.size(), new Materia(titulo, anotacoes));
        }
    }

    // Funções que adicionam uma nova matéria à área de materias
    public void addMateria(String nome) {
        Materia materia = new Materia(nome);
        // ADICIONA uma NOVA MATERIA na posição 0
        materias.add(materias.size(), materia);
        addMateriaJSON(materia);
        salvarMaterias();
    }

    public void addMateria(String nome, ArrayList<String> anotacoes) {
        Materia materia = new Materia(nome);
        // ADICIONA uma NOVA MATERIA na ultima posição
        materias.add(materias.size(), new Materia(nome, anotacoes));
        addMateriaJSON(materia);
        salvarMaterias();
    }

    public void salvarMaterias() {
        // json = lerArquivo(MATERIAS_JSON_PATH);
        File jsonFile = new File(MATERIAS_JSON_PATH);
        escreverArquivo(jsonFile, json);

    }

    private void addMateriaJSON(Materia materia) {
        // Lista de materias
        JSONObject materiasjson = new JSONObject(json);
        // Cria uma nova materia no formato JSON
        JSONObject novaMateria = criarMateriaJSONObject(materia.getTitulo());
        // Coloca a nova materia na lista de anotações
        materiasjson.getJSONArray("materias").put(novaMateria);
        // Atualiza a variavel que contem o conteudo do arquivo json
        json = materiasjson.toString(4);
    }

    private JSONObject criarMateriaJSONObject(String titulo) {
        JSONObject materiaobj = new JSONObject();
        materiaobj.put("titulo", titulo);
        materiaobj.put("anotacoes", new JSONArray());
        System.out.println(materiaobj.toString(4));

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
        JSONObject jsonMaterias = new JSONObject(json);
        return jsonMaterias;
    }

    private void criarArquivoJSON() {
        // Cria um objeto
        File jsonFile = new File(MATERIAS_JSON_PATH);
        // Cria todo o caminho de pastas que conterá o arquivo .json
        new File(ORGAMICADATA_PATH).mkdirs();
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

    ListModel<Materia> getMaterias() {
        return materias;
    }
}
