/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rainsoft;

/**
 *
 * @author cicer
 */
public class AvisoDelete extends javax.swing.JFrame {

    /**
     * Creates new form AvisoDelete
     */
    public AvisoDelete() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        javax.swing.JButton jButtonOp1;
        javax.swing.JButton jButtonOp2;
        javax.swing.JLabel jLabel1;
        javax.swing.JLabel jLabel2;
        javax.swing.JLabel jLabel3;
        javax.swing.JLabel jLabel4;
        javax.swing.JPanel jPanel1;
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButtonOp1 = new javax.swing.JButton();
        jButtonOp2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        String arialFont = "Arial Rounded MT Bold";
        jLabel2.setFont(new java.awt.Font(arialFont, 0, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(77, 76, 76));
        jLabel2.setText("Alerta!");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 80, 20));

        jLabel3.setFont(new java.awt.Font(arialFont, 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(77, 76, 76));
        jLabel3.setText("Você está prestes a deletar um item,");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 360, -1));

        jLabel4.setFont(new java.awt.Font(arialFont, 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(77, 76, 76));
        jLabel4.setText(" Deseja continuar?");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, -1, -1));

        jButtonOp1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/opcao1.png"))); // NOI18N
        jButtonOp1.setToolTipText("Deletar");
        jButtonOp1.setBorder(null);
        jButtonOp1.setContentAreaFilled(false);
        jPanel1.add(jButtonOp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 90, 30));

        jButtonOp2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/opcao2.png"))); // NOI18N
        jButtonOp2.setToolTipText("Cancelar");
        jButtonOp2.setBorder(null);
        jButtonOp2.setContentAreaFilled(false);
        jPanel1.add(jButtonOp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 90, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/TelaAlerta.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 190));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 190));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    
    // End of variables declaration//GEN-END:variables
}
