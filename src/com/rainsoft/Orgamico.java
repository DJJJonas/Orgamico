package com.rainsoft;

import com.rainsoft.lembretes.GerenciaLembretes;
import com.rainsoft.renderers.RendererAnotacoes;
import com.rainsoft.renderers.RendererMaterias;

public class Orgamico extends javax.swing.JFrame {

    public static final String ORGAMICODATA_PATH = System.getenv("APPDATA") + "\\OrgamicoData";
    public static final String MATERIAS_JSON_PATH = ORGAMICODATA_PATH + "\\materias.json";
    public static final GerenciadorMaterias g = new GerenciadorMaterias();
    public static final AddMateria addMateriaPanel = new AddMateria();
    public static final MostrarMateria mostrarMateria = new MostrarMateria();
    public static final EditarMateria editarMateria = new EditarMateria();
    public static final AddAnotacao addAnotacao = new AddAnotacao();
    public static final EditarAnotacao editarAnotacao = new EditarAnotacao();
    public static final MostrarAnotacao mostrarAnotacao = new MostrarAnotacao();
    public static final GerenciaLembretes gerenciar = new GerenciaLembretes();

    // Creates new form Orgamica
    public Orgamico() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMenuBarra = new javax.swing.JPanel();
        jButtonAddMateria = new javax.swing.JButton();
        jButtonCriarAnotacao = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListMaterias = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListAnotacoes = new javax.swing.JList<>();
        jLabelLembrete = new javax.swing.JLabel();
        jLabelCalendario = new javax.swing.JLabel();
        jLabelHora = new javax.swing.JLabel();
        jLabelMaterias = new javax.swing.JLabel();
        jLabelAnotacoes = new javax.swing.JLabel();
        jPanelBarraAzul = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Orgamica - Organizador Acadêmico");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/icon.png")).getImage());
        setMinimumSize(new java.awt.Dimension(1250, 730));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelMenuBarra.setBackground(new java.awt.Color(218, 218, 218));
        jPanelMenuBarra.setFocusCycleRoot(true);
        jPanelMenuBarra.setPreferredSize(new java.awt.Dimension(970, 541));
        jPanelMenuBarra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonAddMateria.setBackground(new java.awt.Color(51, 153, 255));
        jButtonAddMateria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/materia.png"))); // NOI18N
        jButtonAddMateria.setToolTipText("Nova Matéria");
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
        jButtonCriarAnotacao.setToolTipText("Nova Anotação");
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
        jListMaterias.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jListMaterias.setSelectedIndex(1);
        jListMaterias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListMateriasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jListMaterias);

        jPanelMenuBarra.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 300, 580));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(73, 73, 73));
        jLabel1.setText("Lembretes");
        jPanelMenuBarra.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 30, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/botaog.png"))); // NOI18N
        jButton1.setToolTipText("Gerenciar Lembretes");
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanelMenuBarra.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 100, 150, 50));

        jScrollPane2.setBackground(new java.awt.Color(249, 249, 249));
        jScrollPane2.setBorder(null);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jListAnotacoes.setBackground(new java.awt.Color(249, 249, 249));
        jListAnotacoes.setModel(g.getModelAnotacoes());
        jListAnotacoes.setCellRenderer(new RendererAnotacoes());
        jListAnotacoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListAnotacoesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jListAnotacoes);

        jPanelMenuBarra.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 72, 550, 580));

        jLabelLembrete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/lembretes.png"))); // NOI18N
        jLabelLembrete.setToolTipText("");
        jPanelMenuBarra.add(jLabelLembrete, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, -1, -1));

        jLabelCalendario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/Abas.png"))); // NOI18N
        jLabelCalendario.setToolTipText("");
        jPanelMenuBarra.add(jLabelCalendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 230, -1, -1));

        jLabelHora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/Abas.png"))); // NOI18N
        jLabelHora.setToolTipText("");
        jPanelMenuBarra.add(jLabelHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 450, -1, -1));

        jLabelMaterias.setBackground(new java.awt.Color(0, 0, 0));
        jLabelMaterias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/Materias.png"))); // NOI18N
        jPanelMenuBarra.add(jLabelMaterias, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 320, -1));

        jLabelAnotacoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/Anotações.png"))); // NOI18N
        jPanelMenuBarra.add(jLabelAnotacoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        getContentPane().add(jPanelMenuBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1240, 660));

        jPanelBarraAzul.setBackground(new java.awt.Color(51, 153, 255));

        javax.swing.GroupLayout jPanelBarraAzulLayout = new javax.swing.GroupLayout(jPanelBarraAzul);
        jPanelBarraAzul.setLayout(jPanelBarraAzulLayout);
        jPanelBarraAzulLayout.setHorizontalGroup(
            jPanelBarraAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1240, Short.MAX_VALUE)
        );
        jPanelBarraAzulLayout.setVerticalGroup(
            jPanelBarraAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelBarraAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        gerenciar.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    // FUNÇÃO PARA O BOTÃO DE ADICIONAR MATÉRIA
    // Ao clicar, a tela de nova matéria ficará visível.
    private void jButtonAddMateriaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonAddMateriaActionPerformed
        addMateriaPanel.setVisible(true);
    }

    private void jButtonCriarAnotacaoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonCriarAnotacaoActionPerformed
        addAnotacao.jTextAnotacao.setText("");
        addAnotacao.setVisible(true);
        // g.addAnotacao(anotacao);
    }

    private void jListMateriasMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jListMateriasMouseClicked
        // Se não houver matérias, não faça nada
        try {
            g.getMateriaSelecionada();
        } catch (ArrayIndexOutOfBoundsException e) {
            return;
        }

        // Se apertou o botão direito
        if (evt.getButton() == 3) {
            mostrarMateria.mostrarMateria(g.getMateriaSelecionada());
        }
    }

    private void jListAnotacoesMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jListAnotacoesMouseClicked
        // Se não houver anotações, não faça nada
        try {
            jListAnotacoes.getSelectedValue();
        } catch (ArrayIndexOutOfBoundsException e) {
            return;
        }
        // Se não houver uma anotação selecionada, não faça nada
        if (jListAnotacoes.getSelectedIndex() < 0) {
            return;
        }

        mostrarAnotacao.mostrarAnotacao(g.getMateriaSelecionada(), jListAnotacoes.getSelectedIndex());

    }

    public static void main(String args[]) {
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
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Orgamico().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAddMateria;
    private javax.swing.JButton jButtonCriarAnotacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAnotacoes;
    private javax.swing.JLabel jLabelCalendario;
    private javax.swing.JLabel jLabelHora;
    private javax.swing.JLabel jLabelLembrete;
    private javax.swing.JLabel jLabelMaterias;
    public static javax.swing.JList<String> jListAnotacoes;
    public static javax.swing.JList<Materia> jListMaterias;
    private javax.swing.JPanel jPanelBarraAzul;
    private javax.swing.JPanel jPanelMenuBarra;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

}
