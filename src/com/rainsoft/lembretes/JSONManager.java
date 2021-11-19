package com.rainsoft.lembretes;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.joda.time.DateTime;
import org.json.JSONArray;
import org.json.JSONObject;

public class JSONManager {

    public static ArrayList<Lembrete> getLembretes() {
        File json = new File(GerenciaLembretes.LEMBRETESJSON_PATH);
        ArrayList<Lembrete> lembretes = new ArrayList<Lembrete>();
        if (json.exists() == false) {
            createFile(json);
            JSONObject lembretesJSON = new JSONObject();
            lembretesJSON.put("lembretes", new JSONArray());
            writeFile(json, lembretesJSON.toString(4));
        }
        JSONObject ljson = new JSONObject(readFile(json));
        JSONArray objs = ljson.getJSONArray("lembretes");
        for (int i = 0; i < objs.length(); i++) {
            JSONObject objlembrete = objs.getJSONObject(i);
            lembretes.add(new Lembrete(objlembrete.getString("titulo"), new DateTime(objlembrete.getString("data"))));
        }
        return lembretes;
    }

    public static void saveLembretes() {
        File file = new File(GerenciaLembretes.LEMBRETESJSON_PATH);
        JSONObject lembretesJSON = new JSONObject();
        lembretesJSON.put("lembretes", new JSONArray());
        for (int i=0; i < GerenciaLembretes.lembretesList.size(); i++) {
            Lembrete l = GerenciaLembretes.lembretesList.get(i);
            JSONObject jsonL = new JSONObject();
            jsonL.put("titulo", l.getTitle());
            jsonL.put("data", l.getFormattedDateTime());
            lembretesJSON.getJSONArray("lembretes").put(jsonL);
        }
        writeFile(file, lembretesJSON.toString(4));
    }

    private static void createFile(File file) {
        try {
            file.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(JSONManager.class.getName()).log(Level.SEVERE, "Could not create file", ex);
        }
    }

    private static String readFile(File file) {
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

    private static void writeFile(File file, String text) {
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
