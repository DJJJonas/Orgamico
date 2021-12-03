package com.rainsoft;

import java.awt.Color;

public class AnotacaoPanel extends javax.swing.JPanel {

    public AnotacaoPanel() {
        initComponents();
    }

    public void setText(String text) {
        jLabelAnotacao.setText(text);
    }

    public String getText() {
        return jLabelAnotacao.getText();
    }
    
    public void setColor(int r, int g, int b) {
        this.jLabelSelecionado.setBackground(new Color(r, g, b));
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelSelecionado = new javax.swing.JLabel();
        jLabelAnotacao = new javax.swing.JLabel();
        gap = new javax.swing.JPanel();

        setBackground(new java.awt.Color(249, 249, 249));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(530, 45));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelSelecionado.setBackground(new java.awt.Color(0, 255, 255));
        jLabelSelecionado.setOpaque(true);
        add(jLabelSelecionado, new org.netbeans.lib.awtextra.AbsoluteConstraints(524, 0, 10, 40));

        jLabelAnotacao.setBackground(new java.awt.Color(204, 204, 204));
        jLabelAnotacao.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabelAnotacao.setText("jLabel1");
        jLabelAnotacao.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabelAnotacao.setOpaque(true);
        add(jLabelAnotacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 40));

        gap.setBackground(new java.awt.Color(249, 249, 249));

        javax.swing.GroupLayout gapLayout = new javax.swing.GroupLayout(gap);
        gap.setLayout(gapLayout);
        gapLayout.setHorizontalGroup(
            gapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );
        gapLayout.setVerticalGroup(
            gapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        add(gap, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 530, 10));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel gap;
    private javax.swing.JLabel jLabelAnotacao;
    private javax.swing.JLabel jLabelSelecionado;
    // End of variables declaration//GEN-END:variables
}
