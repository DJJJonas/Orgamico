package com.rainsoft.calendario;

import com.rainsoft.Orgamico;
import com.rainsoft.lembretes.GerenciaLembretes;
import com.rainsoft.lembretes.JSONManager;
import com.rainsoft.lembretes.Lembrete;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONObject;

public class JSONCalendario {
    private static File file = new File(Orgamico.CALENDARIO_JSON_PATH);
    /* 
     * Salva o lembrete no arquivo JSON
     */
    public static void salvar(String anotacao, String dia, String mes, String ano) {
        JSONObject json = new JSONObject(readJSON());
        JSONArray anotacoes = json.getJSONArray("anotacoes");
        for (int i = 0; i < anotacoes.length(); i++) {
            JSONObject a = anotacoes.getJSONObject(i);
            if (a.getString("dia").equals(dia) && a.getString("mes").equals(mes) && a.getString("ano").equals(ano)) {
                a.remove("anotacao");
                a.put("anotacao", anotacao);
                writeJSON(json.toString(4));
                return;
            }
        }
        JSONObject novaAnotacao = new JSONObject();
        novaAnotacao.put("anotacao", anotacao);
        novaAnotacao.put("dia", dia);
        novaAnotacao.put("mes", mes);
        novaAnotacao.put("ano", ano);
        anotacoes.put(novaAnotacao);
        writeJSON(json.toString(4));
    }
    /*
     * Retorna a mensagem da data especificada, se não houver mensagem na data
     * especificada, a função retornará null
     */
    public static String getMensagem(String dia, String mes, String ano) {
        JSONObject json = new JSONObject(readJSON());
        JSONArray anotacoes = json.getJSONArray("anotacoes");
        for (int i = 0; i < anotacoes.length(); i++) {
            JSONObject a = anotacoes.getJSONObject(i);
            if (a.getString("dia").equals(dia) && a.getString("mes").equals(mes) && a.getString("ano").equals(ano))
                return a.getString("anotacao");
        }
        return null;
    }

    public static void criarJSONCalendario() {
        try {
            if (file.createNewFile()) {
                /* Anotação
                {
                    "anotacao":"minha anotação",
                    "dia":"10",
                    "mes":"Janeiro",
                    "ano":"2021"
                }
                */
                writeJSON("{\n    \"anotacoes\":[]\n}");
            }
        } catch (IOException ex) {
            Logger.getLogger(JSONCalendario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static String readJSON() {
        String content = "";
        try {
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                content += data;
            }
            myReader.close();
        } catch (java.io.FileNotFoundException ex) {
            Logger.getLogger(JSONManager.class.getName()).log(Level.SEVERE, "An error occurred.", ex);
        }
        return content;
    }

    private static void writeJSON(String text) {
        // creates a FileWriter Object
        FileWriter writer;
        try {
            writer = new FileWriter(file);
            // Writes the content to the file
            writer.write(text);
            writer.flush();
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(JSONManager.class.getName()).log(Level.SEVERE, "An error occurred.", ex);
        }
    }
}
