package com.rainsoft;

import java.awt.Dimension;
import java.awt.Toolkit;

public class AddAnotacao extends javax.swing.JFrame {
    
    public AddAnotacao() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        javax.swing.JButton jButtonAdicionar;
        javax.swing.JButton jButtonCancelar;
        javax.swing.JLabel jLabel1;
        javax.swing.JLabel jLabel2;
        javax.swing.JScrollPane jScrollPane2;

        jLabel1 = new javax.swing.JLabel();
        jButtonCancelar = new javax.swing.JButton();
        jButtonAdicionar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAnotacao = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 102));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(763, 553));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(71, 67, 67));
        jLabel1.setText("Adicionar Anotação");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 200, 40));

        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/CancelAnotacao.png"))); // NOI18N
        jButtonCancelar.setToolTipText("Cancelar");
        jButtonCancelar.setBorder(null);
        jButtonCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelar.setContentAreaFilled(false);
        jButtonCancelar.addActionListener(this::jButtonCancelarActionPerformed);
        getContentPane().add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, 50, 40));

        jButtonAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/addAnotacaoBotao.png"))); // NOI18N
        jButtonAdicionar.setToolTipText("Adicionar");
        jButtonAdicionar.setBorder(null);
        jButtonAdicionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAdicionar.setContentAreaFilled(false);
        jButtonAdicionar.addActionListener(this::jButtonAdicionarActionPerformed);
        getContentPane().add(jButtonAdicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 50, 40));

        jScrollPane2.setBorder(null);

        jTextAnotacao.setColumns(20);
        jTextAnotacao.setRows(5);
        jTextAnotacao.setBorder(null);
        jScrollPane2.setViewportView(jTextAnotacao);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 750, 480));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/AnotacaoAdd.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarActionPerformed
        String novaAnotacao = jTextAnotacao.getText();
        if (novaAnotacao.length() > 4096) novaAnotacao = novaAnotacao.substring(0, 4095);
        Orgamico.g.addAnotacao(novaAnotacao);
        setVisible(false);
    }//GEN-LAST:event_jButtonAdicionarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextArea jTextAnotacao;
    // End of variables declaration//GEN-END:variables
}
