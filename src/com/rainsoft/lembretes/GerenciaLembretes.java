package com.rainsoft.lembretes;

import com.rainsoft.renderers.RendererLembretes;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public final class GerenciaLembretes extends javax.swing.JFrame {

    public static final NovoLembrete novoLembrete = new NovoLembrete();
    public static final EditarLembrete editarLembrete = new EditarLembrete();
    public static final DefaultListModel<Lembrete> lembretesList = new DefaultListModel<Lembrete>();
    public static final String LEMBRETESJSON_PATH = System.getenv("APPDATA") + "\\OrgamicoData\\lembretes.json";

    public GerenciaLembretes() {
        initComponents();

        for (Lembrete l : JSONManager.getLembretes())
            addLembrete(l);

        new LembretesThread().start();

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        this.setBackground(new Color(0, 0, 0, 0));
        jPanel1.setBackground(new Color(0, 0, 0, 0));
    }

    public static void addLembrete(Lembrete lembrete) {
        int lastPosition = lembretesList.getSize();
        lembretesList.add(lastPosition, lembrete);
    }
    
    public static void removeSelectedLembrete() {
        removeLembrete(jListLembretes.getSelectedIndex());
    }

    public static void removeLembrete(int position) {
        lembretesList.remove(position);
    }
    
    public static void activateLembrete(int index) {
        Lembrete lembrete = lembretesList.get(index);
        lembretesList.remove(index);
        JSONManager.saveLembretes();
        JOptionPane.showMessageDialog(null, lembrete.getTitle(), "Alarme ativado", JOptionPane.INFORMATION_MESSAGE);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListLembretes = new javax.swing.JList<>();
        jButtonFechar = new javax.swing.JButton();
        jButtonAdicionar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(93, 93, 93));
        jLabel2.setText("Gerenciar Lembretes");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 270, 30));

        jScrollPane1.setBorder(null);

        jListLembretes.setModel(lembretesList);
        jListLembretes.setCellRenderer(new RendererLembretes());
        jListLembretes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListLembretesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jListLembretes);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 580, 230));

        jButtonFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/FecharAba.png"))); // NOI18N
        jButtonFechar.setToolTipText("Fechar");
        jButtonFechar.setBorder(null);
        jButtonFechar.setContentAreaFilled(false);
        jButtonFechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, 30, 30));

        jButtonAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/adicionar.png"))); // NOI18N
        jButtonAdicionar.setToolTipText("Novo Lembrete");
        jButtonAdicionar.setBorder(null);
        jButtonAdicionar.setContentAreaFilled(false);
        jButtonAdicionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAdicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, 50, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/telaPadraoLembrete.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButtonFecharActionPerformed

    private void jButtonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarActionPerformed
        // TODO add your handling code here:
        novoLembrete.setVisible(true);
    }//GEN-LAST:event_jButtonAdicionarActionPerformed

    private void jListLembretesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListLembretesMouseClicked
        int index = jListLembretes.getSelectedIndex();
        if (index == -1) return;
        editarLembrete.editar(lembretesList.get(index));
    }//GEN-LAST:event_jListLembretesMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionar;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JList<Lembrete> jListLembretes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
