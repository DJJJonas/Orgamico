package com.rainsoft.lembretes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import org.joda.time.DateTime;

public class EditarLembrete extends javax.swing.JFrame {

    public Lembrete lembrete;
    
    public EditarLembrete() {
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
        jButtonSalva = new javax.swing.JButton();
        jButtonCancela = new javax.swing.JButton();
        jButtonFecha = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TituloAba.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 26)); // NOI18N
        TituloAba.setForeground(new java.awt.Color(77, 76, 76));
        TituloAba.setText("Editar Lembrete");
        jPanel1.add(TituloAba, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 220, 30));

        jTextTitulo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        jTextTitulo.setForeground(new java.awt.Color(77, 76, 76));
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

        jButtonSalva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/Salvar.png"))); // NOI18N
        jButtonSalva.setToolTipText("Salvar");
        jButtonSalva.setBorder(null);
        jButtonSalva.setContentAreaFilled(false);
        jButtonSalva.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSalva.addActionListener(this::jButtonSalvaActionPerformed);
        jPanel1.add(jButtonSalva, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 330, 50, 50));

        jButtonCancela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/remover.png"))); // NOI18N
        jButtonCancela.setToolTipText("Cancelar");
        jButtonCancela.setBorder(null);
        jButtonCancela.setContentAreaFilled(false);
        jButtonCancela.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancela.addActionListener(this::jButtonCancelaActionPerformed);
        jPanel1.add(jButtonCancela, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, 50, 50));

        jButtonFecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/FecharAba.png"))); // NOI18N
        jButtonFecha.setToolTipText("Fechar");
        jButtonFecha.setBorder(null);
        jButtonFecha.setContentAreaFilled(false);
        jButtonFecha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonFecha.addActionListener(this::jButtonFechaActionPerformed);
        jPanel1.add(jButtonFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, 40, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/telaPadraoLembrete.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFechaActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButtonFechaActionPerformed

    private void jButtonSalvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvaActionPerformed
        if (jTextTitulo.getText().equals("")) return;
        if (jFormattedData.getText().equals("")) return;
        if (jFormattedHora.getText().equals("")) return;
        
        String titulo = jTextTitulo.getText();
        if (titulo.length() > 256) titulo = titulo.substring(0, 255);
        String day, month, year, hour, minute;
        
        day = jFormattedData.getText().split("/")[0];
        month = jFormattedData.getText().split("/")[1];
        year = jFormattedData.getText().split("/")[2];
        
        hour = jFormattedHora.getText().split(":")[0];
        minute = jFormattedHora.getText().split(":")[1];

        // "2002-09-10T10:11"
        String formatedDateTime = year+"-"+month+"-"+day+"T"+hour+":"+minute;
        
        DateTime datetime = new DateTime(formatedDateTime);

        lembrete.setTitle(titulo);
        lembrete.setDate(datetime);

        JSONManager.saveLembretes();
        setVisible(false);
    }//GEN-LAST:event_jButtonSalvaActionPerformed

    private void jButtonCancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelaActionPerformed
        GerenciaLembretes.removeSelectedLembrete();
        JSONManager.saveLembretes();
        dispose();
    }//GEN-LAST:event_jButtonCancelaActionPerformed

    void editar(Lembrete lembrete) {
        this.lembrete = lembrete;
        jTextTitulo.setText(lembrete.getTitle());
        DateTime date = lembrete.getDate();
        jFormattedData.setText(date.toString("dd/MM/yyyy"));
        jFormattedHora.setText(date.toString("HH:mm"));
        setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Campo1;
    private javax.swing.JLabel Campo2;
    private javax.swing.JLabel Data;
    private javax.swing.JLabel Hora;
    private javax.swing.JLabel TituloAba;
    private javax.swing.JButton jButtonCancela;
    private javax.swing.JButton jButtonFecha;
    private javax.swing.JButton jButtonSalva;
    private javax.swing.JFormattedTextField jFormattedData;
    private javax.swing.JFormattedTextField jFormattedHora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextTitulo;
    // End of variables declaration//GEN-END:variables

}
