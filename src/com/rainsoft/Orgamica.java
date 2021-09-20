/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rainsoft;

import javax.swing.DefaultListModel;

/**
 *
 * @author jonas
 */
public class Orgamica extends javax.swing.JFrame {

    // Lista que contem as matérias que serão renderizadas
    // na parte das materias.
    private DefaultListModel<Materia> materias;
    
    /**
     * Creates new form Orgamica
     */
    public Orgamica() {
        materias = new DefaultListModel<>();
        addMateria("<html>Programação orientada à objetos");
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMenuBarra = new javax.swing.JPanel();
        jLabelAba1 = new javax.swing.JLabel();
        jLabelAba2 = new javax.swing.JLabel();
        jLabelAba3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListMaterias = new javax.swing.JList<>();
        jLabelMateriais = new javax.swing.JLabel();
        jLabelAnotacoes = new javax.swing.JLabel();
        jPanelBarraAzul = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Orgamica - Organizador Acadêmico");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelMenuBarra.setBackground(new java.awt.Color(218, 218, 218));
        jPanelMenuBarra.setPreferredSize(new java.awt.Dimension(970, 541));
        jPanelMenuBarra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelAba1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/Aba.png"))); // NOI18N
        jLabelAba1.setToolTipText("");
        jPanelMenuBarra.add(jLabelAba1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 230, -1, -1));

        jLabelAba2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/Aba.png"))); // NOI18N
        jLabelAba2.setToolTipText("");
        jPanelMenuBarra.add(jLabelAba2, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 450, -1, -1));

        jLabelAba3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/Aba.png"))); // NOI18N
        jLabelAba3.setToolTipText("");
        jPanelMenuBarra.add(jLabelAba3, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 10, -1, -1));

        jScrollPane1.setBorder(null);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jListMaterias.setModel(materias);
        jListMaterias.setCellRenderer(new RendererMaterias());
        jScrollPane1.setViewportView(jListMaterias);

        jPanelMenuBarra.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 290, 580));

        jLabelMateriais.setBackground(new java.awt.Color(0, 0, 0));
        jLabelMateriais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/Materias.png"))); // NOI18N
        jPanelMenuBarra.add(jLabelMateriais, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 310, -1));

        jLabelAnotacoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/Anotações.png"))); // NOI18N
        jPanelMenuBarra.add(jLabelAnotacoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        getContentPane().add(jPanelMenuBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1250, 670));

        jPanelBarraAzul.setBackground(new java.awt.Color(51, 153, 255));

        javax.swing.GroupLayout jPanelBarraAzulLayout = new javax.swing.GroupLayout(jPanelBarraAzul);
        jPanelBarraAzul.setLayout(jPanelBarraAzulLayout);
        jPanelBarraAzulLayout.setHorizontalGroup(
            jPanelBarraAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1250, Short.MAX_VALUE)
        );
        jPanelBarraAzulLayout.setVerticalGroup(
            jPanelBarraAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelBarraAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Orgamica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Orgamica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Orgamica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Orgamica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Orgamica().setVisible(true);
            }
        });
        
    }
    
    public void addMateria(String nome) {
        materias.add(0, new Materia(nome));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelAba1;
    private javax.swing.JLabel jLabelAba2;
    private javax.swing.JLabel jLabelAba3;
    private javax.swing.JLabel jLabelAnotacoes;
    private javax.swing.JLabel jLabelMateriais;
    private javax.swing.JList<Materia> jListMaterias;
    private javax.swing.JPanel jPanelBarraAzul;
    private javax.swing.JPanel jPanelMenuBarra;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}