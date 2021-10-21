package com.rainsoft;

import java.awt.Component;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

public class RendererMaterias extends MateriaPanel implements ListCellRenderer<Materia>{
    @Override
    public Component getListCellRendererComponent(JList<? extends Materia> list, Materia materia, int index, boolean isSelected, boolean callHasFocus) {
        setText(materia.getTitulo());
        setDescricao(materia.getDescricao());
        setIndex(index);
        if (isSelected) {
            setColor(204,205,204);
            Orgamico.g.setAnotacoes(index);
        }
        else setColor(204,255,204);
        return this;
    }
}
