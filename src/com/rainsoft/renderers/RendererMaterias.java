package com.rainsoft.renderers;

import com.rainsoft.Materia;
import com.rainsoft.MateriaPanel;
import com.rainsoft.Orgamico;
import java.awt.Component;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

public class RendererMaterias extends MateriaPanel implements ListCellRenderer<Materia> {
    @Override
    public Component getListCellRendererComponent(JList<? extends Materia> list, Materia materia, int index, boolean isSelected, boolean callHasFocus) {
        setText(materia.getTitulo());
        setIndex(index);
        if (isSelected) {
            setColor(255,155,150);
            Orgamico.g.setAnotacoes(index);
        }
        else setColor(171, 158, 157);
        return this;
    }
}
