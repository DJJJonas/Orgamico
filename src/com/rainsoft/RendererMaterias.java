/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rainsoft;

import java.awt.Component;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author jonas
 */
public class RendererMaterias extends MateriaPanel implements ListCellRenderer<Materia>{
    @Override
    public Component getListCellRendererComponent(JList<? extends Materia> list, Materia materia, int index, boolean isSelected, boolean callHasFocus) {
        setText(materia.getNome());
        return this;
    }
}
