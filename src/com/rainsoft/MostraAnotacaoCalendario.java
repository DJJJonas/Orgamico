package com.rainsoft;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

public class MostraAnotacaoCalendario extends javax.swing.JFrame {

    public MostraAnotacaoCalendario() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
         this.setLocation(dim.width / 1 - this.getSize().width / 1, dim.height / 2 - this.getSize().height / 1);
        this.setBackground(new Color(0, 0, 0, 0));
        Anotacao.setBackground(new Color(0, 0, 0, 0));
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Anotacao = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAnotacao = new javax.swing.JTextArea();
        jFechar = new javax.swing.JButton();
        jSalvar = new javax.swing.JButton();
        jDelete1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Anotacao.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(58, 58, 58));
        jLabel2.setText("Lembrete");
        Anotacao.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, 20));

        jScrollPane1.setBorder(null);

        jTextAnotacao.setColumns(20);
        jTextAnotacao.setRows(5);
        jTextAnotacao.setBorder(null);
        jScrollPane1.setViewportView(jTextAnotacao);

        Anotacao.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 340, 300));

        jFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/FecharAba.png"))); // NOI18N
        jFechar.setToolTipText("Fechar");
        jFechar.setBorder(null);
        jFechar.setContentAreaFilled(false);
        jFechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFecharActionPerformed(evt);
            }
        });
        Anotacao.add(jFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 30, 40));

        jSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/SalvarAnotacao.png"))); // NOI18N
        jSalvar.setToolTipText("Salvar");
        jSalvar.setBorder(null);
        jSalvar.setContentAreaFilled(false);
        jSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalvarActionPerformed(evt);
            }
        });
        Anotacao.add(jSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 50, 40));

        jDelete1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/CancelAnotacao.png"))); // NOI18N
        jDelete1.setToolTipText("Limpar");
        jDelete1.setBorder(null);
        jDelete1.setContentAreaFilled(false);
        jDelete1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDelete1ActionPerformed(evt);
            }
        });
        Anotacao.add(jDelete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 50, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/anotacaoDia.png"))); // NOI18N
        Anotacao.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(Anotacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFecharActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jFecharActionPerformed

    private void jSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSalvarActionPerformed

    private void jDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDelete1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDelete1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Anotacao;
    private javax.swing.JButton jDelete1;
    private javax.swing.JButton jFechar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jSalvar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAnotacao;
    // End of variables declaration//GEN-END:variables
}
