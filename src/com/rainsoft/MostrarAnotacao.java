package com.rainsoft;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author cicer
 */
public class MostrarAnotacao extends javax.swing.JFrame {

    /**
     * Creates new form MostrarAnotacao
     */
    private Materia materia;
    private int anotacao;

    public MostrarAnotacao() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
    }

    public void mostrarAnotacao(Materia materia, int pos) {
        this.materia = materia;
        this.anotacao = pos;
        String anotacao = materia.getAnotacoes().get(pos);
        setVisible(true);
        jTextAreaAnotacao.setText(anotacao);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaAnotacao = new javax.swing.JTextArea();
        jButtonEditar = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(null);

        jTextAreaAnotacao.setColumns(20);
        jTextAreaAnotacao.setRows(5);
        jScrollPane1.setViewportView(jTextAreaAnotacao);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 750, 430));

        jButtonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/edit.png"))); // NOI18N
        jButtonEditar.setToolTipText("Editar");
        jButtonEditar.setBorder(null);
        jButtonEditar.setContentAreaFilled(false);
        jButtonEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 450, 60, 50));

        jButtonVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/voltar.png"))); // NOI18N
        jButtonVoltar.setToolTipText("Voltar");
        jButtonVoltar.setBorder(null);
        jButtonVoltar.setContentAreaFilled(false);
        jButtonVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 60, 40));

        jButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/remover.png"))); // NOI18N
        jButtonExcluir.setToolTipText("Excluir");
        jButtonExcluir.setBorder(null);
        jButtonExcluir.setContentAreaFilled(false);
        jButtonExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 450, 70, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/visualizarAnota.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonVoltarActionPerformed
        setVisible(false);
    }// GEN-LAST:event_jButtonVoltarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonEditarActionPerformed
        setVisible(false);
        Orgamico.editarAnotacao.editarAnotacao(materia, anotacao);
    }// GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonExcluirActionPerformed
        Orgamico.g.removeAnotacao(Orgamico.g.getMateriaSelecionadaIndex(), Orgamico.g.getAnotacaoSelecionadaIndex());
        // Salva
        Orgamico.g.salvarMaterias();
        // Fecha
        setVisible(false);
        // Atualiza a parte das anotações
        Orgamico.g.setAnotacoes(Orgamico.g.getMateriaSelecionadaIndex());
    }// GEN-LAST:event_jButtonExcluirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaAnotacao;
    // End of variables declaration//GEN-END:variables
}
