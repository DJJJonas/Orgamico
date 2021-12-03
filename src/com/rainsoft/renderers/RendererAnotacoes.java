package com.rainsoft.renderers;

import com.rainsoft.AnotacaoPanel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

public class RendererAnotacoes extends AnotacaoPanel implements ListCellRenderer<String>{

    @Override
    public java.awt.Component getListCellRendererComponent(JList<? extends String> list, String anotacao, int index,
            boolean isSelected, boolean cellHasFocus) {
        setText(anotacao);
        if (isSelected) {
            setColor(190, 133, 212);
        } else {
            setColor(180, 180, 180);
        }
        return this;
    }
}
