/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rainsoft;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author cicer
 */
public class AddMateria extends javax.swing.JFrame {

    /**
     * Creates new form AddMateria
     */
    public AddMateria() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        this.setBackground(new Color(0, 0, 0, 0));
        jPanel1.setBackground(new Color(0, 0, 0, 0));
    }

    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextNomeMat = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelDescText = new javax.swing.JLabel();
        jButtonAdicionar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextDesc = new javax.swing.JTextArea();
        jLabelCabecalho = new javax.swing.JLabel();
        jLabelDesc = new javax.swing.JLabel();
        jLabelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(275, 125));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextNomeMat.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jTextNomeMat.setForeground(new java.awt.Color(132, 132, 132));
        jTextNomeMat.setText("Nome da Matéria");
        jTextNomeMat.setActionCommand("<Not Set>");
        jTextNomeMat.setBorder(null);
        jTextNomeMat.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextNomeMat.setOpaque(false);
        jTextNomeMat.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextNomeMatFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextNomeMatFocusLost(evt);
            }
        });
        jPanel1.add(jTextNomeMat, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 766, -1));

        jSeparator1.setForeground(new java.awt.Color(54, 54, 54));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 750, 10));

        jLabelDescText.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        jLabelDescText.setForeground(new java.awt.Color(133, 133, 133));
        jLabelDescText.setText("Descrição (Opcional)");
        jPanel1.add(jLabelDescText, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jButtonAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/adicionar.png"))); // NOI18N
        jButtonAdicionar.setToolTipText("Salvar");
        jButtonAdicionar.setBorder(null);
        jButtonAdicionar.setContentAreaFilled(false);
        jButtonAdicionar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAdicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 420, 60, 50));

        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/cancelar.png"))); // NOI18N
        jButtonCancelar.setToolTipText("Cancelar e Sair");
        jButtonCancelar.setBorder(null);
        jButtonCancelar.setContentAreaFilled(false);
        jButtonCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonCancelarMouseExited(evt);
            }
        });
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 420, 60, 50));

        jScrollPane1.setBorder(null);
        jScrollPane1.setAutoscrolls(true);
        jScrollPane1.setWheelScrollingEnabled(false);

        jTextDesc.setColumns(20);
        jTextDesc.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        jTextDesc.setForeground(new java.awt.Color(136, 136, 136));
        jTextDesc.setRows(5);
        jTextDesc.setText("Ex: Data e Hora das Aulas\n");
        jTextDesc.setBorder(null);
        jTextDesc.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextDesc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextDescFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextDescFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(jTextDesc);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 740, 80));

        jLabelCabecalho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/cabeçalho.png"))); // NOI18N
        jPanel1.add(jLabelCabecalho, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLabelDesc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/des.png"))); // NOI18N
        jPanel1.add(jLabelDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, 120));

        jLabelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/TelaMat.png"))); // NOI18N
        jPanel1.add(jLabelFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCancelarMouseEntered
       // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCancelarMouseEntered

    private void jButtonCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCancelarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCancelarMouseExited

    private void jTextNomeMatFocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_jTextNomeMatFocusGained
        if (jTextNomeMat.getText().equals("Nome da Matéria")) {
            jTextNomeMat.setText("");
            jTextNomeMat.setForeground(new Color(0, 0, 0));
        }
    }// GEN-LAST:event_jTextNomeMatFocusGained

    private void jTextDescFocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_jTextDescFocusGained
        if (jTextDesc.getText().equals("Ex: Data e Hora das Aulas\n" + "")) {
            jTextDesc.setText("");
            jTextDesc.setForeground(new Color(0, 0, 0));
        }
    }// GEN-LAST:event_jTextDescFocusGained

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonCancelarActionPerformed
        setVisible(false);
    }// GEN-LAST:event_jButtonCancelarActionPerformed

    private void jTextNomeMatFocusLost(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_jTextNomeMatFocusLost
        if (jTextNomeMat.getText().equals("")) {
            jTextNomeMat.setText("Nome da Matéria");
            jTextNomeMat.setForeground(new Color(153, 153, 153));
        }
    }// GEN-LAST:event_jTextNomeMatFocusLost

    private void jTextDescFocusLost(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_jTextDescFocusLost
        if (jTextDesc.getText().equals("")) {
            jTextDesc.setText("Ex: Data e Hora das Aulas\n" + "");
            jTextDesc.setForeground(new Color(153, 153, 153));
        }
    }// GEN-LAST:event_jTextDescFocusLost

    private void jButtonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonAdicionarActionPerformed
        String titulo, descricao;

        titulo = jTextNomeMat.getText();
        if (titulo.startsWith("Nome da Matéria"))
            return;
        descricao = jTextDesc.getText();
        Orgamico.g.addMateria(new Materia(titulo, descricao));

        setVisible(false);
    }// GEN-LAST:event_jButtonAdicionarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JLabel jLabelCabecalho;
    private javax.swing.JLabel jLabelDesc;
    private javax.swing.JLabel jLabelDescText;
    private javax.swing.JLabel jLabelFundo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextDesc;
    private javax.swing.JTextField jTextNomeMat;
    // End of variables declaration//GEN-END:variables

}
