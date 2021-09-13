/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rainsoft;

/**
 *
 * @author jonas
 */
public class Orgamica extends javax.swing.JFrame {

    /**
     * Creates new form Orgamica
     */
    public Orgamica() {
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
        jLabelMateriais = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanelContainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Orgamica - Organizador Acadêmico");
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(960, 451));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelMenuBarra.setBackground(new java.awt.Color(204, 204, 204));
        jPanelMenuBarra.setPreferredSize(new java.awt.Dimension(970, 541));

        jLabelMateriais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/Materias.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/Anotações.png"))); // NOI18N

        javax.swing.GroupLayout jPanelMenuBarraLayout = new javax.swing.GroupLayout(jPanelMenuBarra);
        jPanelMenuBarra.setLayout(jPanelMenuBarraLayout);
        jPanelMenuBarraLayout.setHorizontalGroup(
            jPanelMenuBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuBarraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelMateriais)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanelMenuBarraLayout.setVerticalGroup(
            jPanelMenuBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMenuBarraLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelMenuBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabelMateriais))
                .addGap(670, 670, 670))
        );

        getContentPane().add(jPanelMenuBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 970, 660));

        jPanelContainer.setBackground(new java.awt.Color(51, 153, 255));

        javax.swing.GroupLayout jPanelContainerLayout = new javax.swing.GroupLayout(jPanelContainer);
        jPanelContainer.setLayout(jPanelContainerLayout);
        jPanelContainerLayout.setHorizontalGroup(
            jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 970, Short.MAX_VALUE)
        );
        jPanelContainerLayout.setVerticalGroup(
            jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, -1));

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelMateriais;
    private javax.swing.JPanel jPanelContainer;
    private javax.swing.JPanel jPanelMenuBarra;
    // End of variables declaration//GEN-END:variables
}
