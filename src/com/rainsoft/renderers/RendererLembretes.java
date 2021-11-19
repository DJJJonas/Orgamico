package com.rainsoft.renderers;

import com.rainsoft.lembretes.LembretePanel;
import com.rainsoft.lembretes.Lembrete;
import java.awt.Component;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

public class RendererLembretes extends LembretePanel implements ListCellRenderer<Lembrete>{

    @Override
    public Component getListCellRendererComponent(JList<? extends Lembrete> jlist, Lembrete lembrete, int i, boolean isSelected, boolean callHasFocus) {
        setTitle(lembrete.getTitle());
        setTime(lembrete.getDateTime());
        setLembrete(lembrete);
        return this;
    }
}
