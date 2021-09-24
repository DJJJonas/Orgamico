package com.rainsoft;

import java.util.ArrayList;
import javax.swing.ImageIcon;

public class Materia {
    private String titulo;
    private ArrayList<String> anotacoes;
    private ImageIcon icon;

    public Materia(){}
    public Materia(String titulo) {
        this.titulo = titulo;
        this.anotacoes = new ArrayList<String>();
    }
    public Materia(String titulo, ArrayList<String> anotacoes) {
        this.titulo = titulo;
        this.anotacoes = anotacoes;
    }
    
    public void addAnotacao(String anotacao) {
        anotacoes.add(anotacao);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ImageIcon getIcon() {
        return icon;
    }

    public void setIcon(ImageIcon icon) {
        this.icon = icon;
    }
}
