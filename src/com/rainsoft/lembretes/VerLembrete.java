package com.rainsoft.lembretes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

public class VerLembrete extends javax.swing.JFrame {

    public VerLembrete() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        this.setBackground(new Color(0, 0, 0, 0));
        jPanel1.setBackground(new Color(0, 0, 0, 0));
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TituloAba = new javax.swing.JLabel();
        jTextTitulo = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        Data = new javax.swing.JLabel();
        jFormattedData = new javax.swing.JFormattedTextField();
        Campo1 = new javax.swing.JLabel();
        Hora = new javax.swing.JLabel();
        jFormattedHora = new javax.swing.JFormattedTextField();
        Campo2 = new javax.swing.JLabel();
        jButtonEdita = new javax.swing.JButton();
        jButtonDeleta = new javax.swing.JButton();
        jButtonFecha = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TituloAba.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 26)); // NOI18N
        TituloAba.setForeground(new java.awt.Color(77, 76, 76));
        TituloAba.setText("Lembrete");
        jPanel1.add(TituloAba, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 130, 30));

        jTextTitulo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        jTextTitulo.setForeground(new java.awt.Color(77, 76, 76));
        jTextTitulo.setText("Aqui vai o Título do Lembrete");
        jTextTitulo.setBorder(null);
        jPanel1.add(jTextTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 570, 30));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 570, 10));

        Data.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        Data.setForeground(new java.awt.Color(77, 76, 76));
        Data.setText("Data");
        jPanel1.add(Data, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jFormattedData.setBorder(null);
        jFormattedData.setForeground(new java.awt.Color(77, 76, 76));
        jFormattedData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        jFormattedData.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jPanel1.add(jFormattedData, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 180, 40));

        Campo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/campos.png"))); // NOI18N
        jPanel1.add(Campo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        Hora.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        Hora.setForeground(new java.awt.Color(77, 76, 76));
        Hora.setText("Hora");
        jPanel1.add(Hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        jFormattedHora.setBorder(null);
        jFormattedHora.setForeground(new java.awt.Color(77, 76, 76));
        jFormattedHora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
        jFormattedHora.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jPanel1.add(jFormattedHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 180, 40));

        Campo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/campos.png"))); // NOI18N
        jPanel1.add(Campo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        jButtonEdita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/edit.png"))); // NOI18N
        jButtonEdita.setToolTipText("Editar");
        jButtonEdita.setBorder(null);
        jButtonEdita.setContentAreaFilled(false);
        jButtonEdita.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jButtonEdita, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 330, 50, 50));

        jButtonDeleta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/remover.png"))); // NOI18N
        jButtonDeleta.setToolTipText("Apagar");
        jButtonDeleta.setBorder(null);
        jButtonDeleta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jButtonDeleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, 50, 50));

        jButtonFecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/FecharAba.png"))); // NOI18N
        jButtonFecha.setToolTipText("Fechar");
        jButtonFecha.setBorder(null);
        jButtonFecha.setContentAreaFilled(false);
        jButtonFecha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFechaActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, 40, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/telaPadraoLembrete.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFechaActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButtonFechaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Campo1;
    private javax.swing.JLabel Campo2;
    private javax.swing.JLabel Data;
    private javax.swing.JLabel Hora;
    private javax.swing.JLabel TituloAba;
    private javax.swing.JButton jButtonDeleta;
    private javax.swing.JButton jButtonEdita;
    private javax.swing.JButton jButtonFecha;
    private javax.swing.JFormattedTextField jFormattedData;
    private javax.swing.JFormattedTextField jFormattedHora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextTitulo;
    // End of variables declaration//GEN-END:variables
}
