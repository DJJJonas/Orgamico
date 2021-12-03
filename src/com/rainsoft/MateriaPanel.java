package com.rainsoft;

import java.awt.Color;
import sas.swing.MultiLineLabel;

public class MateriaPanel extends javax.swing.JPanel {

    private int index;

    public void setIndex(int i) {
        index = i;
    }

    public int getIndex() {
        return index;
    }

    public MateriaPanel() {
        initComponents();
    }

    public MateriaPanel(String text) {
        initComponents();
        jLabelTitulo.setText(text);
    }

    public void setText(String text) {
        jLabelTitulo.setText(text);
    }

    public String getText() {
        return jLabelTitulo.getText();
    }

    public void setColor(int r, int g, int b) {
        this.jLabelSelecionado.setBackground(new Color(r, g, b));
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelSelecionado = new javax.swing.JLabel();
        jLabelTitulo = new MultiLineLabel();
        jLabelBackground = new javax.swing.JLabel();

        setToolTipText("");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(275, 102));
        setMinimumSize(new java.awt.Dimension(275, 102));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(275, 102));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelSelecionado.setBackground(new java.awt.Color(204, 255, 204));
        jLabelSelecionado.setToolTipText("");
        jLabelSelecionado.setOpaque(true);
        add(jLabelSelecionado, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 10, 70));

        jLabelTitulo.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(102, 102, 102));
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelTitulo.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
        jLabelTitulo.setToolTipText("");
        jLabelTitulo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabelTitulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabelTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabelTitulo.setMaximumSize(new java.awt.Dimension(20, 21));
        jLabelTitulo.setMinimumSize(new java.awt.Dimension(20, 21));
        jLabelTitulo.setPreferredSize(new java.awt.Dimension(20, 21));
        jLabelTitulo.setVerifyInputWhenFocusTarget(false);
        add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 250, 70));

        jLabelBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/Nota.png"))); // NOI18N
        jLabelBackground.setMaximumSize(new java.awt.Dimension(271, 110));
        jLabelBackground.setMinimumSize(new java.awt.Dimension(271, 110));
        jLabelBackground.setPreferredSize(new java.awt.Dimension(271, 110));
        add(jLabelBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 110));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelBackground;
    private javax.swing.JLabel jLabelSelecionado;
    private javax.swing.JLabel jLabelTitulo;
    // End of variables declaration//GEN-END:variables
}
