/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rainsoft;

/**
 *
 * @author jonas
 */
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

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelAnotacao = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(249, 249, 249));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(530, 45));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelAnotacao.setBackground(new java.awt.Color(204, 204, 204));
        jLabelAnotacao.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabelAnotacao.setText("jLabel1");
        jLabelAnotacao.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabelAnotacao.setOpaque(true);
        add(jLabelAnotacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 40));

        jPanel1.setBackground(new java.awt.Color(249, 249, 249));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 530, 10));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelAnotacao;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
