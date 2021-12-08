package com.rainsoft.calendario;

import com.rainsoft.Orgamico;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

public class AnotacaoCalendario extends javax.swing.JFrame {
    private String dia, mes, ano;

    public AnotacaoCalendario() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        this.setBackground(new Color(0, 0, 0, 0));
        jPanelAnotacao.setBackground(new Color(0, 0, 0, 0));
    }

    public void visualizarAnotacao(String dia, String mes, String ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        if (JSONCalendario.getMensagem(dia, mes, ano) == null)
            this.anotacao.setText("");
        else
            this.anotacao.setText(JSONCalendario.getMensagem(dia, mes, ano));
        setVisible(true);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelAnotacao = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        anotacao = new javax.swing.JTextArea();
        fechar = new javax.swing.JButton();
        adicionar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelAnotacao.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(58, 58, 58));
        jLabel2.setText("Lembrete Diário");
        jPanelAnotacao.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 160, 20));

        jScrollPane1.setBorder(null);

        anotacao.setColumns(20);
        anotacao.setRows(5);
        anotacao.setBorder(null);
        jScrollPane1.setViewportView(anotacao);

        jPanelAnotacao.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 340, 300));

        fechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/FecharAba.png"))); // NOI18N
        fechar.setToolTipText("Fechar");
        fechar.setBorder(null);
        fechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fechar.setContentAreaFilled(false);
        fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecharActionPerformed(evt);
            }
        });
        jPanelAnotacao.add(fechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 30, 40));

        adicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/SalvarAnotacao.png"))); // NOI18N
        adicionar.setToolTipText("Salvar");
        adicionar.setBorder(null);
        adicionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adicionar.setContentAreaFilled(false);
        adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarActionPerformed(evt);
            }
        });
        jPanelAnotacao.add(adicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, -1, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/anotacaoDia.png"))); // NOI18N
        jPanelAnotacao.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanelAnotacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fecharActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_fecharActionPerformed
        setVisible(false);
        Orgamico.checarDias();
    }// GEN-LAST:event_fecharActionPerformed

    private void adicionarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_adicionarActionPerformed
        // Essa função também edita a anotação caso ela já exista.
        JSONCalendario.salvar(anotacao.getText(), dia, mes, ano);
        setVisible(false);
        Orgamico.checarDias();
    }// GEN-LAST:event_adicionarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanelAnotacao;
    private javax.swing.JButton adicionar;
    private javax.swing.JTextArea anotacao;
    private javax.swing.JButton fechar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
