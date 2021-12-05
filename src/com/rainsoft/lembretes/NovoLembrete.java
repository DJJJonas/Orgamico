package com.rainsoft.lembretes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.SwingConstants;

import org.joda.time.DateTime;

public class NovoLembrete extends javax.swing.JFrame {

        public NovoLembrete() {
                initComponents();
                Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
                this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
                this.setBackground(new Color(0, 0, 0, 0));
                jPanel1.setBackground(new Color(0, 0, 0, 0));
        }

        // <editor-fold defaultstate="collapsed" desc="Generated
        // Code">//GEN-BEGIN:initComponents
        private void initComponents() {
                javax.swing.JLabel campoHora;
                javax.swing.JLabel data;
                javax.swing.JLabel hora;
                javax.swing.JLabel tituloAba;
                javax.swing.JLabel campoData;
                javax.swing.JButton jButtonAdd;
                javax.swing.JButton jButtonCancelar;
                javax.swing.JLabel jLabel1;
                javax.swing.JSeparator jSeparator1;

                jPanel1 = new javax.swing.JPanel();
                tituloAba = new javax.swing.JLabel();
                jTextTitulo = new javax.swing.JTextField();
                jSeparator1 = new javax.swing.JSeparator();
                data = new javax.swing.JLabel();
                jFormattedData = new javax.swing.JFormattedTextField();
                campoData = new javax.swing.JLabel();
                hora = new javax.swing.JLabel();
                jFormattedHora = new javax.swing.JFormattedTextField();
                campoHora = new javax.swing.JLabel();
                jButtonAdd = new javax.swing.JButton();
                jButtonCancelar = new javax.swing.JButton();
                jLabel1 = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
                setUndecorated(true);
                getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
                getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

                tituloAba.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 26)); // NOI18N
                tituloAba.setForeground(new java.awt.Color(62, 62, 62));
                tituloAba.setText("Novo Lembrete");
                getContentPane().add(tituloAba, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

                jTextTitulo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
                jTextTitulo.setForeground(new java.awt.Color(77, 76, 76));
                jTextTitulo.setText("Digite o Título");
                jTextTitulo.setBorder(null);
                jTextTitulo.addFocusListener(new java.awt.event.FocusAdapter() {
                        @Override
                        public void focusGained(java.awt.event.FocusEvent evt) {
                                jTextTituloFocusGained();
                        }
                });
                getContentPane().add(jTextTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 570, 30));

                jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
                getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 570, 20));

                data.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
                data.setForeground(new java.awt.Color(50, 48, 48));
                data.setText("Data");
                getContentPane().add(data, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

                jFormattedData.setBorder(null);
                jFormattedData.setForeground(new java.awt.Color(77, 76, 76));
                jFormattedData.setFormatterFactory(
                                new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(
                                                java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
                jFormattedData.setHorizontalAlignment(SwingConstants.CENTER);
                jFormattedData.setText("18/11/2021");
                jFormattedData.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
                jFormattedData.addFocusListener(new java.awt.event.FocusAdapter() {
                        @Override
                        public void focusGained(java.awt.event.FocusEvent evt) {
                                jFormattedDataFocusGained();
                        }

                        @Override
                        public void focusLost(java.awt.event.FocusEvent evt) {
                                jFormattedDataFocusLost();
                        }
                });
                getContentPane().add(jFormattedData,
                                new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 180, 40));

                campoData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/campos.png"))); // NOI18N
                getContentPane().add(campoData, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

                hora.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
                hora.setForeground(new java.awt.Color(53, 53, 53));
                hora.setText("Hora");
                hora.addContainerListener(new java.awt.event.ContainerAdapter() {
                        @Override
                        public void componentRemoved(java.awt.event.ContainerEvent evt) {
                                horaComponentRemoved(evt);
                        }
                });
                getContentPane().add(hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 50, 20));

                jFormattedHora.setBorder(null);
                jFormattedHora.setForeground(new java.awt.Color(77, 76, 76));
                jFormattedHora.setFormatterFactory(
                                new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(
                                                java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
                jFormattedHora.setHorizontalAlignment(SwingConstants.CENTER);
                jFormattedHora.setText("14:22");
                jFormattedHora.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
                jFormattedHora.addFocusListener(new java.awt.event.FocusAdapter() {
                        @Override
                        public void focusGained(java.awt.event.FocusEvent evt) {
                                jFormattedHoraFocusGained(evt);
                        }

                        @Override
                        public void focusLost(java.awt.event.FocusEvent evt) {
                                jFormattedHoraFocusLost(evt);
                        }
                });
                jFormattedHora.addActionListener(this::jFormattedHoraActionPerformed);
                getContentPane().add(jFormattedHora,
                                new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 180, 40));

                campoHora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/campos.png"))); // NOI18N
                getContentPane().add(campoHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

                jButtonAdd.setIcon(new javax.swing.ImageIcon(
                                getClass().getResource("/com/rainsoft/images/adicionar.png"))); // NOI18N
                jButtonAdd.setToolTipText("Adicionar");
                jButtonAdd.setBorder(null);
                jButtonAdd.setContentAreaFilled(false);
                jButtonAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
                jButtonAdd.addActionListener(this::jButtonAddActionPerformed);
                getContentPane().add(jButtonAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 330, 50, 50));

                jButtonCancelar.setIcon(
                                new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/cancelar.png"))); // NOI18N
                jButtonCancelar.setToolTipText("Cancelar");
                jButtonCancelar.setBorder(null);
                jButtonCancelar.setContentAreaFilled(false);
                jButtonCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
                jButtonCancelar.addActionListener(this::jButtonCancelarActionPerformed);
                getContentPane().add(jButtonCancelar,
                                new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, 50, -1));

                jLabel1.setIcon(new javax.swing.ImageIcon(
                                getClass().getResource("/com/rainsoft/images/telaPadraoLembrete.png"))); // NOI18N
                getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void jTextTituloFocusGained() {// GEN-FIRST:event_jTextTituloFocusGained
                if (jTextTitulo.getText().equals("Digite o Título" + "")) {
                        jTextTitulo.setText("");
                        jTextTitulo.setForeground(new Color(77, 76, 76));
                }
        }// GEN-LAST:event_jTextTituloFocusGained

        private void jFormattedDataFocusGained() {// GEN-FIRST:event_jFormattedDataFocusGained
                if (jFormattedData.getText().equals("16/12/2021" + "")) {
                        jFormattedData.setText("");
                        jFormattedData.setForeground(new Color(77, 76, 76));
                }
        }// GEN-LAST:event_jFormattedDataFocusGained

        private void jFormattedHoraActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jFormattedHoraActionPerformed
        }// GEN-LAST:event_jFormattedHoraActionPerformed

        private void jFormattedHoraFocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_jFormattedHoraFocusGained
                if (jFormattedHora.getText().equals("21:15" + "")) {
                        jFormattedHora.setText("");
                        jFormattedHora.setForeground(new Color(77, 76, 76));
                }
        }// GEN-LAST:event_jFormattedHoraFocusGained

        private void horaComponentRemoved(java.awt.event.ContainerEvent evt) {// GEN-FIRST:event_HoraComponentRemoved
        }// GEN-LAST:event_HoraComponentRemoved

        private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonCancelarActionPerformed
                setVisible(false);
        }// GEN-LAST:event_jButtonCancelarActionPerformed

        private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonAddActionPerformed
                if (jTextTitulo.getText().equals(""))
                        return;
                if (jFormattedData.getText().equals(""))
                        return;
                if (jFormattedHora.getText().equals(""))
                        return;
                // Função de adicionar lembrete funcionando 👍
                String titulo = jTextTitulo.getText();
                if (titulo.length() > 256)
                        titulo = titulo.substring(0, 255);
                String day, month, year, hour, minute;

                day = jFormattedData.getText().split("/")[0];
                month = jFormattedData.getText().split("/")[1];
                year = jFormattedData.getText().split("/")[2];

                hour = jFormattedHora.getText().split(":")[0];
                minute = jFormattedHora.getText().split(":")[1];

                // "2002-09-10T10:11"
                String formatedDateTime = year + "-" + month + "-" + day + "T" + hour + ":" + minute;
                DateTime datetime = new DateTime(formatedDateTime);

                Lembrete lembrete = new Lembrete(titulo, datetime);
                GerenciaLembretes.addLembrete(lembrete);
                JSONManager.saveLembretes();
                setVisible(false);
        }// GEN-LAST:event_jButtonAddActionPerformed

        private void jFormattedDataFocusLost() {// GEN-FIRST:event_jFormattedDataFocusLost
                if (jFormattedData.getText().equals("")) {
                        jFormattedData.setText("16/12/2021");
                        jFormattedData.setForeground(new Color(77, 76, 76));
                }
        }// GEN-LAST:event_jFormattedDataFocusLost

        private void jFormattedHoraFocusLost(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_jFormattedHoraFocusLost
                if (jFormattedHora.getText().equals("")) {
                        jFormattedHora.setText("21:15");
                        jFormattedHora.setForeground(new Color(77, 76, 76));
                }
        }// GEN-LAST:event_jFormattedHoraFocusLost

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JFormattedTextField jFormattedData;
        private javax.swing.JFormattedTextField jFormattedHora;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JTextField jTextTitulo;
        // End of variables declaration//GEN-END:variables
}
