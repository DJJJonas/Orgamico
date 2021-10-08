package com.rainsoft;

import javax.swing.JOptionPane;

/**
 * Classe principal. As funções e atributos principais estão aqui.
 *
 * @author Rainsoft
 */
public class Orgamico extends javax.swing.JFrame {

    public static GerenciadorMaterias g;
    public static String MATERIAS_JSON_PATH;
    public static String ORGAMICODATA_PATH;
    public AddMateria addMateriaPanel = new AddMateria();

    // Creates new form Orgamica
    public Orgamico() {
        // Caminho do arquivo que contem as materias salvas
        ORGAMICODATA_PATH = System.getenv("APPDATA") + "\\OrgamicoData";
        MATERIAS_JSON_PATH = ORGAMICODATA_PATH + "\\materias.json";

        // Cria uma classe que contem todas as funções relacionadas à area
        // de matérias.
        // Ao termino da criação desse objeto, todas as matérias salvas no
        // arquivo .json serão adicionados a lista de materias
        g = new GerenciadorMaterias();

        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMenuBarra = new javax.swing.JPanel();
        jButtonAddMateria = new javax.swing.JButton();
        jButtonCriarAnotacao = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListMaterias = new javax.swing.JList<>();
        jLabelAba1 = new javax.swing.JLabel();
        jLabelAba2 = new javax.swing.JLabel();
        jLabelAba3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabelMateriais = new javax.swing.JLabel();
        jLabelAnotacoes = new javax.swing.JLabel();
        jPanelBarraAzul = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Orgamica - Organizador Acadêmico");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/icon.png")).getImage());
        setMinimumSize(new java.awt.Dimension(1250, 730));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelMenuBarra.setBackground(new java.awt.Color(218, 218, 218));
        jPanelMenuBarra.setFocusCycleRoot(true);
        jPanelMenuBarra.setPreferredSize(new java.awt.Dimension(970, 541));
        jPanelMenuBarra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonAddMateria.setBackground(new java.awt.Color(51, 153, 255));
        jButtonAddMateria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/materia.png"))); // NOI18N
        jButtonAddMateria.setToolTipText("");
        jButtonAddMateria.setBorder(null);
        jButtonAddMateria.setContentAreaFilled(false);
        jButtonAddMateria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAddMateria.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButtonAddMateria.setFocusCycleRoot(true);
        jButtonAddMateria.setFocusable(false);
        jButtonAddMateria.setVerifyInputWhenFocusTarget(false);
        jButtonAddMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddMateriaActionPerformed(evt);
            }
        });
        jPanelMenuBarra.add(jButtonAddMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 40, 40));

        jButtonCriarAnotacao.setBackground(new java.awt.Color(0, 153, 255));
        jButtonCriarAnotacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/notas.png"))); // NOI18N
        jButtonCriarAnotacao.setBorder(null);
        jButtonCriarAnotacao.setContentAreaFilled(false);
        jButtonCriarAnotacao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCriarAnotacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCriarAnotacaoActionPerformed(evt);
            }
        });
        jPanelMenuBarra.add(jButtonCriarAnotacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(851, 30, 40, 40));

        jScrollPane1.setBackground(new java.awt.Color(249, 249, 249));
        jScrollPane1.setBorder(null);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jListMaterias.setBackground(new java.awt.Color(249, 249, 249));
        jListMaterias.setModel(g.getMaterias());
        jListMaterias.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jListMaterias.setCellRenderer(new RendererMaterias());
        jListMaterias.setSelectedIndex(1);
        jScrollPane1.setViewportView(jListMaterias);

        jPanelMenuBarra.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 300, 580));

        jLabelAba1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/Aba.png"))); // NOI18N
        jLabelAba1.setToolTipText("");
        jPanelMenuBarra.add(jLabelAba1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 230, -1, -1));

        jLabelAba2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/Aba.png"))); // NOI18N
        jLabelAba2.setToolTipText("");
        jPanelMenuBarra.add(jLabelAba2, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 450, -1, -1));

        jLabelAba3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/Aba.png"))); // NOI18N
        jLabelAba3.setToolTipText("");
        jPanelMenuBarra.add(jLabelAba3, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, -1, -1));

        jScrollPane2.setBackground(new java.awt.Color(249, 249, 249));
        jScrollPane2.setBorder(null);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jList1.setBackground(new java.awt.Color(249, 249, 249));
        jList1.setModel(g.getModelAnotacoes());
        jList1.setCellRenderer(new RendererAnotacoes());
        jScrollPane2.setViewportView(jList1);

        jPanelMenuBarra.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 72, 550, 580));

        jLabelMateriais.setBackground(new java.awt.Color(0, 0, 0));
        jLabelMateriais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/Materias.png"))); // NOI18N
        jPanelMenuBarra.add(jLabelMateriais, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 320, -1));

        jLabelAnotacoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/Anotações.png"))); // NOI18N
        jPanelMenuBarra.add(jLabelAnotacoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        getContentPane().add(jPanelMenuBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1250, 670));

        jPanelBarraAzul.setBackground(new java.awt.Color(51, 153, 255));

        javax.swing.GroupLayout jPanelBarraAzulLayout = new javax.swing.GroupLayout(jPanelBarraAzul);
        jPanelBarraAzul.setLayout(jPanelBarraAzulLayout);
        jPanelBarraAzulLayout.setHorizontalGroup(
            jPanelBarraAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1250, Short.MAX_VALUE)
        );
        jPanelBarraAzulLayout.setVerticalGroup(
            jPanelBarraAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelBarraAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // FUNÇÃO PARA O BOTÃO DE ADICIONAR MATÉRIA
    // Ao clicar, a tela de nova matéria ficará visível.
    private void jButtonAddMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddMateriaActionPerformed
        addMateriaPanel.setVisible(true);
    }//GEN-LAST:event_jButtonAddMateriaActionPerformed

    private void jButtonCriarAnotacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCriarAnotacaoActionPerformed
        String anotacao = JOptionPane.showInputDialog(null, "Nova anotação: (Janela temporária) (Bug já conhecido: Ao digitar a anotação e clicar em cancelar, a anotação é adicionada)");
        g.addAnotacao(anotacao);
    }//GEN-LAST:event_jButtonCriarAnotacaoActionPerformed

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
            java.util.logging.Logger.getLogger(Orgamico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Orgamico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Orgamico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Orgamico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Orgamico().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddMateria;
    private javax.swing.JButton jButtonCriarAnotacao;
    private javax.swing.JLabel jLabelAba1;
    private javax.swing.JLabel jLabelAba2;
    private javax.swing.JLabel jLabelAba3;
    private javax.swing.JLabel jLabelAnotacoes;
    private javax.swing.JLabel jLabelMateriais;
    public static javax.swing.JList<String> jList1;
    public static javax.swing.JList<Materia> jListMaterias;
    private javax.swing.JPanel jPanelBarraAzul;
    private javax.swing.JPanel jPanelMenuBarra;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

}
