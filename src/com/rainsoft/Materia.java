package com.rainsoft;

import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Materia {
    private String titulo;
    private String descricao;
    private ArrayList<String> anotacoes;
    private ImageIcon icon;

    public Materia() {
        this.titulo = "";
        this.descricao = "";
        this.anotacoes = new ArrayList<String>();
    }

    public Materia(String titulo) {
        this.titulo = titulo;
        this.descricao = "";
        this.anotacoes = new ArrayList<String>();
    }

    public Materia(String titulo, String descricao) {
        this.titulo = titulo;
        if (descricao.startsWith("Ex: Data e Hora das Aulas"))
            this.descricao = "";
        else
            this.descricao = descricao;
        this.anotacoes = new ArrayList<String>();
    }

    public Materia(String titulo, ArrayList<String> anotacoes) {
        this.titulo = titulo;
        this.descricao = "";
        this.anotacoes = anotacoes;
    }

    public Materia(String titulo, String descricao, ArrayList<String> anotacoes) {
        this.titulo = titulo;
        if (descricao.startsWith("Ex: Data e Hora das Aulas"))
            this.descricao = "";
        else
            this.descricao = descricao;
        this.anotacoes = anotacoes;
    }

    public void addAnotacao(String anotacao) {
        anotacoes.add(anotacao);
    }

    public void removeAnotacao(int pos) {
        anotacoes.remove(pos);
    }

    public ArrayList<String> getAnotacoes() {
        return anotacoes;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ImageIcon getIcon() {
        return icon;
    }

    public void setIcon(ImageIcon icon) {
        this.icon = icon;
    }
}
