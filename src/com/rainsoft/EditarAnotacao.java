package com.rainsoft;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JOptionPane;

public class EditarAnotacao extends javax.swing.JFrame {
    private Materia materia;
    private int pos;

    public EditarAnotacao() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        this.setBackground(new Color(0, 0, 0, 0));
        jPanel1.setBackground(new Color(0, 0, 0, 0));
    }

    public void editarAnotacao(Materia materia, int pos) {
        this.materia = materia;
        this.pos = pos;
        jTextAreaAnotacao.setText(materia.getAnotacoes().get(pos));
        setVisible(true);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtonCancelar = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaAnotacao = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Editar Anotação");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 150, 30));

        jButtonCancelar
                .setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/CancelAnotacao.png"))); // NOI18N
        jButtonCancelar.setBorder(null);
        jButtonCancelar.setContentAreaFilled(false);
        jButtonCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, 50, 40));

        jButtonSalvar
                .setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/SalvarAnotacao.png"))); // NOI18N
        jButtonSalvar.setBorder(null);
        jButtonSalvar.setContentAreaFilled(false);
        jButtonSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 50, 40));

        jScrollPane1.setBorder(null);

        jTextAreaAnotacao.setColumns(20);
        jTextAreaAnotacao.setRows(5);
        jTextAreaAnotacao.setBorder(null);
        jTextAreaAnotacao.setInheritsPopupMenu(true);
        jScrollPane1.setViewportView(jTextAreaAnotacao);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 750, 480));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/AnotacaoAdd.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonCancelarActionPerformed
        setVisible(false);
    }// GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonSalvarActionPerformed
        String novaAnotacao = jTextAreaAnotacao.getText();
        if (novaAnotacao.length() > 4096)
            novaAnotacao = novaAnotacao.substring(0, 4095);
        try {
            materia.getAnotacoes().set(pos, novaAnotacao);
        } catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível editar a anotação pois ela foi excluída", "Erro",
                    JOptionPane.ERROR_MESSAGE);
        } finally {
            setVisible(false);
            Orgamico.jListMaterias.updateUI();
            Orgamico.g.salvarMaterias();
        }
    }// GEN-LAST:event_jButtonSalvarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaAnotacao;
    // End of variables declaration//GEN-END:variables
}
