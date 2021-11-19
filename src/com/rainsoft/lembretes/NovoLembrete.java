package com.rainsoft.lembretes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import org.joda.time.DateTime;

public class NovoLembrete extends javax.swing.JFrame {

    public NovoLembrete() {
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
        campoData = new javax.swing.JLabel();
        Hora = new javax.swing.JLabel();
        jFormattedHora = new javax.swing.JFormattedTextField();
        CampoHora = new javax.swing.JLabel();
        jButtonAdd = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        TituloAba.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 26)); // NOI18N
        TituloAba.setForeground(new java.awt.Color(62, 62, 62));
        TituloAba.setText("Novo Lembrete");
        getContentPane().add(TituloAba, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jTextTitulo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jTextTitulo.setForeground(new java.awt.Color(77, 76, 76));
        jTextTitulo.setText("Digite o Título");
        jTextTitulo.setBorder(null);
        jTextTitulo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextTituloFocusGained(evt);
            }
        });
        getContentPane().add(jTextTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 570, 30));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 570, 20));

        Data.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        Data.setForeground(new java.awt.Color(50, 48, 48));
        Data.setText("Data");
        getContentPane().add(Data, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jFormattedData.setBorder(null);
        jFormattedData.setForeground(new java.awt.Color(77, 76, 76));
        jFormattedData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        jFormattedData.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedData.setText("18/11/2021");
        jFormattedData.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jFormattedData.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jFormattedDataFocusGained(evt);
            }
        });
        getContentPane().add(jFormattedData, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 180, 40));

        campoData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/campos.png"))); // NOI18N
        getContentPane().add(campoData, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        Hora.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        Hora.setForeground(new java.awt.Color(53, 53, 53));
        Hora.setText("Hora");
        Hora.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                HoraComponentRemoved(evt);
            }
        });
        getContentPane().add(Hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 50, 20));

        jFormattedHora.setBorder(null);
        jFormattedHora.setForeground(new java.awt.Color(77, 76, 76));
        jFormattedHora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
        jFormattedHora.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedHora.setText("14:22");
        jFormattedHora.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jFormattedHora.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jFormattedHoraFocusGained(evt);
            }
        });
        jFormattedHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedHoraActionPerformed(evt);
            }
        });
        getContentPane().add(jFormattedHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 180, 40));

        CampoHora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/campos.png"))); // NOI18N
        getContentPane().add(CampoHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        jButtonAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/adicionar.png"))); // NOI18N
        jButtonAdd.setToolTipText("Adicionar");
        jButtonAdd.setBorder(null);
        jButtonAdd.setContentAreaFilled(false);
        jButtonAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 330, 50, 50));

        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/cancelar.png"))); // NOI18N
        jButtonCancelar.setToolTipText("Cancelar");
        jButtonCancelar.setBorder(null);
        jButtonCancelar.setContentAreaFilled(false);
        jButtonCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, 50, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/telaPadraoLembrete.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextTituloFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextTituloFocusGained
        // TODO add your handling code here:
        if (jTextTitulo.getText().equals("Digite o Título" + "")) {
            jTextTitulo.setText("");
            jTextTitulo.setForeground(new Color(77,76,76));
        }
    }//GEN-LAST:event_jTextTituloFocusGained

    private void jFormattedDataFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedDataFocusGained
        // TODO add your handling code here:
        if (jFormattedData.getText().equals("16/12/2021" + "")) {
            jFormattedData.setText("");
            jFormattedData.setForeground(new Color(77,76,76));
        }
    }//GEN-LAST:event_jFormattedDataFocusGained

    private void jFormattedHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedHoraActionPerformed

    private void jFormattedHoraFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedHoraFocusGained
        // TODO add your handling code here:
        if (jFormattedHora.getText().equals("21:15" + "")) {
            jFormattedHora.setText("");
            jFormattedHora.setForeground(new Color(77,76,76));
        }
    }//GEN-LAST:event_jFormattedHoraFocusGained

    private void HoraComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_HoraComponentRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_HoraComponentRemoved

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        if (jTextTitulo.getText().equals("")) return;
        if (jFormattedData.getText().equals("")) return;
        if (jFormattedHora.getText().equals("")) return;
        // Função de adicionar lembrete funcionando 👍
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
        System.out.println(formatedDateTime);
        DateTime datetime = new DateTime(formatedDateTime);
        System.out.println(datetime.getHourOfDay());
        
        Lembrete lembrete = new Lembrete(titulo, datetime);
        GerenciaLembretes.addLembrete(lembrete);
        JSONManager.saveLembretes();
        setVisible(false);
    }//GEN-LAST:event_jButtonAddActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CampoHora;
    private javax.swing.JLabel Data;
    private javax.swing.JLabel Hora;
    private javax.swing.JLabel TituloAba;
    private javax.swing.JLabel campoData;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JFormattedTextField jFormattedData;
    private javax.swing.JFormattedTextField jFormattedHora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextTitulo;
    // End of variables declaration//GEN-END:variables
}
