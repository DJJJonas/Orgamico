package com.rainsoft;

import com.rainsoft.calendario.AnotacaoCalendario;
import com.rainsoft.calendario.JSONCalendario;
import com.rainsoft.lembretes.GerenciaLembretes;
import com.rainsoft.renderers.RendererAnotacoes;
import com.rainsoft.renderers.RendererMaterias;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import com.fathzer.soft.javaluator.DoubleEvaluator;
import javax.swing.JOptionPane;

public class Orgamico extends javax.swing.JFrame {

    public static final String ORGAMICODATA_PATH = System.getenv("APPDATA") + "\\OrgamicoData";
    public static final String MATERIAS_JSON_PATH = ORGAMICODATA_PATH + "\\materias.json";
    public static final String CALENDARIO_JSON_PATH = ORGAMICODATA_PATH + "\\calendario.json";
    public static final GerenciadorMaterias g = new GerenciadorMaterias();
    public static final AddMateria addMateriaPanel = new AddMateria();
    public static final MostrarMateria mostrarMateria = new MostrarMateria();
    public static final EditarMateria editarMateria = new EditarMateria();
    public static final AddAnotacao addAnotacao = new AddAnotacao();
    public static final EditarAnotacao editarAnotacao = new EditarAnotacao();
    public static final MostrarAnotacao mostrarAnotacao = new MostrarAnotacao();
    public static final GerenciaLembretes gerenciar = new GerenciaLembretes();
    public static final AnotacaoCalendario anotacaocalendario = new AnotacaoCalendario();

    // Declaração das Variáveis do Calendário
    static int AnoFixo = 0, MesFixo = 0, DiaFixo = 0;
    static int AnoAltera = 0, MesAltera = 0, DiaAltera = 0;
    static int valorselecao = 0;

    // Creates new form Orgamica
    public Orgamico() {
        initComponents();
        jldias = new javax.swing.JLabel[]{d1, d2, d3, d4, d5, d6, d7, d8, d9, d10, d11, d12, d13, d14, d15, d16, d17, d18, d19, d20, d21, d22, d23, d24, d25, d26, d27, d28, d29, d30, d31, d32, d33, d34, d35, d36, d37, d38, d39, d40, d41, d42};
        iniciacalendario();
        organizaCalendario();
        Calendario_evt();
    }

        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanelMenuBarra = new javax.swing.JPanel();
                calculo = new javax.swing.JTextField();
                calc1 = new javax.swing.JButton();
                calc2 = new javax.swing.JButton();
                calc3 = new javax.swing.JButton();
                calc4 = new javax.swing.JButton();
                calc5 = new javax.swing.JButton();
                calc6 = new javax.swing.JButton();
                calc7 = new javax.swing.JButton();
                calc8 = new javax.swing.JButton();
                calc9 = new javax.swing.JButton();
                calc0 = new javax.swing.JButton();
                calcsoma = new javax.swing.JButton();
                calcsubtrai = new javax.swing.JButton();
                calcmultiplica = new javax.swing.JButton();
                calcdivide = new javax.swing.JButton();
                calcabrepar = new javax.swing.JButton();
                calcfechapar = new javax.swing.JButton();
                calcigual = new javax.swing.JButton();
                calclimpar = new javax.swing.JButton();
                calcapagarultimo = new javax.swing.JButton();
                jButtonAddMateria = new javax.swing.JButton();
                jButtonCriarAnotacao = new javax.swing.JButton();
                jScrollPane1 = new javax.swing.JScrollPane();
                jListMaterias = new javax.swing.JList<>();
                jLabel1 = new javax.swing.JLabel();
                jButton1 = new javax.swing.JButton();
                jScrollPane2 = new javax.swing.JScrollPane();
                jListAnotacoes = new javax.swing.JList<>();
                jLabelLembrete = new javax.swing.JLabel();
                jLabelHora = new javax.swing.JLabel();
                jLabelMaterias = new javax.swing.JLabel();
                jLabelAnotacoes = new javax.swing.JLabel();
                SelecionaMes = new javax.swing.JComboBox<>();
                SelecionaAno = new javax.swing.JComboBox<>();
                jSpinner1 = new javax.swing.JSpinner();
                jDom = new javax.swing.JLabel();
                d8 = new javax.swing.JLabel();
                d15 = new javax.swing.JLabel();
                d36 = new javax.swing.JLabel();
                d9 = new javax.swing.JLabel();
                jSeg = new javax.swing.JLabel();
                d1 = new javax.swing.JLabel();
                d2 = new javax.swing.JLabel();
                d29 = new javax.swing.JLabel();
                d22 = new javax.swing.JLabel();
                d37 = new javax.swing.JLabel();
                jTer = new javax.swing.JLabel();
                d3 = new javax.swing.JLabel();
                d10 = new javax.swing.JLabel();
                d16 = new javax.swing.JLabel();
                d23 = new javax.swing.JLabel();
                d30 = new javax.swing.JLabel();
                d17 = new javax.swing.JLabel();
                d11 = new javax.swing.JLabel();
                d39 = new javax.swing.JLabel();
                d32 = new javax.swing.JLabel();
                d31 = new javax.swing.JLabel();
                d18 = new javax.swing.JLabel();
                jQui = new javax.swing.JLabel();
                d40 = new javax.swing.JLabel();
                jQua = new javax.swing.JLabel();
                d24 = new javax.swing.JLabel();
                d25 = new javax.swing.JLabel();
                d4 = new javax.swing.JLabel();
                d38 = new javax.swing.JLabel();
                d26 = new javax.swing.JLabel();
                d5 = new javax.swing.JLabel();
                d33 = new javax.swing.JLabel();
                d21 = new javax.swing.JLabel();
                jSex = new javax.swing.JLabel();
                d19 = new javax.swing.JLabel();
                d35 = new javax.swing.JLabel();
                d14 = new javax.swing.JLabel();
                jSab = new javax.swing.JLabel();
                d41 = new javax.swing.JLabel();
                d13 = new javax.swing.JLabel();
                d28 = new javax.swing.JLabel();
                d34 = new javax.swing.JLabel();
                d27 = new javax.swing.JLabel();
                d7 = new javax.swing.JLabel();
                d42 = new javax.swing.JLabel();
                d6 = new javax.swing.JLabel();
                d12 = new javax.swing.JLabel();
                d20 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
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

                calculo.setFont(new java.awt.Font("DejaVu Sans Mono", 0, 18)); // NOI18N
                calculo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
                calculo.setEnabled(false);
                jPanelMenuBarra.add(calculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 460, 240, 30));

                calc1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
                calc1.setText("1");
                calc1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                calc1ActionPerformed(evt);
                        }
                });
                jPanelMenuBarra.add(calc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 510, 40, 30));

                calc2.setText("2");
                calc2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                calc2ActionPerformed(evt);
                        }
                });
                jPanelMenuBarra.add(calc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 510, 40, 30));

                calc3.setText("3");
                calc3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                calc3ActionPerformed(evt);
                        }
                });
                jPanelMenuBarra.add(calc3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 510, 40, 30));

                calc4.setText("4");
                calc4.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                calc4ActionPerformed(evt);
                        }
                });
                jPanelMenuBarra.add(calc4, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 540, 40, 30));

                calc5.setText("5");
                calc5.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                calc5ActionPerformed(evt);
                        }
                });
                jPanelMenuBarra.add(calc5, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 540, 40, 30));

                calc6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
                calc6.setText("6");
                calc6.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                calc6ActionPerformed(evt);
                        }
                });
                jPanelMenuBarra.add(calc6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 540, 40, 30));

                calc7.setText("7");
                calc7.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                calc7ActionPerformed(evt);
                        }
                });
                jPanelMenuBarra.add(calc7, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 570, 40, 30));

                calc8.setText("8");
                calc8.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                calc8ActionPerformed(evt);
                        }
                });
                jPanelMenuBarra.add(calc8, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 570, 40, 30));

                calc9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
                calc9.setText("9");
                calc9.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                calc9ActionPerformed(evt);
                        }
                });
                jPanelMenuBarra.add(calc9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 570, 40, 30));

                calc0.setText("0");
                calc0.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                calc0ActionPerformed(evt);
                        }
                });
                jPanelMenuBarra.add(calc0, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 600, 40, 30));

                calcsoma.setText("+");
                calcsoma.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                calcsomaActionPerformed(evt);
                        }
                });
                jPanelMenuBarra.add(calcsoma, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 510, 50, 40));

                calcsubtrai.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
                calcsubtrai.setText("-");
                calcsubtrai.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                calcsubtraiActionPerformed(evt);
                        }
                });
                jPanelMenuBarra.add(calcsubtrai, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 550, 50, 40));

                calcmultiplica.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
                calcmultiplica.setText("*");
                calcmultiplica.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                calcmultiplicaActionPerformed(evt);
                        }
                });
                jPanelMenuBarra.add(calcmultiplica, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 510, 50, 40));

                calcdivide.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
                calcdivide.setText("/");
                calcdivide.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                calcdivideActionPerformed(evt);
                        }
                });
                jPanelMenuBarra.add(calcdivide, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 550, 50, 40));

                calcabrepar.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
                calcabrepar.setText("(");
                calcabrepar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                calcabreparActionPerformed(evt);
                        }
                });
                jPanelMenuBarra.add(calcabrepar, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 600, 40, 30));

                calcfechapar.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
                calcfechapar.setText(")");
                calcfechapar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                calcfechaparActionPerformed(evt);
                        }
                });
                jPanelMenuBarra.add(calcfechapar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 600, 40, 30));

                calcigual.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
                calcigual.setText("=");
                calcigual.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                calcigualActionPerformed(evt);
                        }
                });
                jPanelMenuBarra.add(calcigual, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 590, 140, 40));

                calclimpar.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
                calclimpar.setText("C");
                calclimpar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                calclimparActionPerformed(evt);
                        }
                });
                jPanelMenuBarra.add(calclimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 510, 40, 80));

                calcapagarultimo.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
                calcapagarultimo.setText("←");
                calcapagarultimo.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                calcapagarultimoActionPerformed(evt);
                        }
                });
                jPanelMenuBarra.add(calcapagarultimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 460, 50, 30));

                jButtonAddMateria.setBackground(new java.awt.Color(51, 153, 255));
                jButtonAddMateria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/materia.png"))); // NOI18N
                jButtonAddMateria.setToolTipText("Nova Matéria");
                jButtonAddMateria.setBorder(null);
                jButtonAddMateria.setContentAreaFilled(false);
                jButtonAddMateria.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
                jButtonCriarAnotacao.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
                jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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

                jLabelHora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/AbaCalculadora.png"))); // NOI18N
                jLabelHora.setToolTipText("");
                jPanelMenuBarra.add(jLabelHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 450, -1, -1));

                jLabelMaterias.setBackground(new java.awt.Color(0, 0, 0));
                jLabelMaterias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/Materias.png"))); // NOI18N
                jPanelMenuBarra.add(jLabelMaterias, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 320, -1));

                jLabelAnotacoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/Anotações.png"))); // NOI18N
                jPanelMenuBarra.add(jLabelAnotacoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

                SelecionaMes.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
                SelecionaMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));
                SelecionaMes.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                SelecionaMesActionPerformed(evt);
                        }
                });
                jPanelMenuBarra.add(SelecionaMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 230, 130, 30));

                SelecionaAno.setEditable(true);
                SelecionaAno.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
                SelecionaAno.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                SelecionaAnoActionPerformed(evt);
                        }
                });
                jPanelMenuBarra.add(SelecionaAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 230, 120, 30));

                jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
                        public void stateChanged(javax.swing.event.ChangeEvent evt) {
                                jSpinner1StateChanged(evt);
                        }
                });
                jPanelMenuBarra.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 230, 20, 30));

                jDom.setBackground(new java.awt.Color(255, 255, 255));
                jDom.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
                jDom.setForeground(new java.awt.Color(45, 43, 43));
                jDom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jDom.setText("Dom");
                jPanelMenuBarra.add(jDom, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 260, 30, -1));

                d8.setBackground(new java.awt.Color(255, 255, 255));
                d8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
                d8.setForeground(new java.awt.Color(255, 0, 0));
                d8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                d8.setText("0");
                jPanelMenuBarra.add(d8, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 310, 30, -1));

                d15.setBackground(new java.awt.Color(255, 255, 255));
                d15.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
                d15.setForeground(new java.awt.Color(255, 0, 0));
                d15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                d15.setText("0");
                jPanelMenuBarra.add(d15, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 330, 30, -1));

                d36.setBackground(new java.awt.Color(255, 255, 255));
                d36.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
                d36.setForeground(new java.awt.Color(255, 0, 0));
                d36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                d36.setText("0");
                jPanelMenuBarra.add(d36, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 390, 30, -1));

                d9.setBackground(new java.awt.Color(255, 255, 255));
                d9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
                d9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                d9.setText("0");
                jPanelMenuBarra.add(d9, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 310, 30, -1));

                jSeg.setBackground(new java.awt.Color(255, 255, 255));
                jSeg.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
                jSeg.setForeground(new java.awt.Color(45, 43, 43));
                jSeg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jSeg.setText("Seg");
                jPanelMenuBarra.add(jSeg, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 260, 30, -1));

                d1.setBackground(new java.awt.Color(255, 255, 255));
                d1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
                d1.setForeground(new java.awt.Color(255, 0, 0));
                d1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                d1.setText("0");
                jPanelMenuBarra.add(d1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 290, 30, -1));

                d2.setBackground(new java.awt.Color(255, 255, 255));
                d2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
                d2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                d2.setText("0");
                jPanelMenuBarra.add(d2, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 290, 30, -1));

                d29.setBackground(new java.awt.Color(255, 255, 255));
                d29.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
                d29.setForeground(new java.awt.Color(255, 0, 0));
                d29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                d29.setText("0");
                jPanelMenuBarra.add(d29, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 370, 30, -1));

                d22.setBackground(new java.awt.Color(255, 255, 255));
                d22.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
                d22.setForeground(new java.awt.Color(255, 0, 0));
                d22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                d22.setText("0");
                jPanelMenuBarra.add(d22, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 350, 30, -1));

                d37.setBackground(new java.awt.Color(255, 255, 255));
                d37.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
                d37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                d37.setText("0");
                jPanelMenuBarra.add(d37, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 390, 30, -1));

                jTer.setBackground(new java.awt.Color(255, 255, 255));
                jTer.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
                jTer.setForeground(new java.awt.Color(45, 43, 43));
                jTer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jTer.setText("Ter");
                jPanelMenuBarra.add(jTer, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 260, 30, -1));

                d3.setBackground(new java.awt.Color(255, 255, 255));
                d3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
                d3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                d3.setText("0");
                jPanelMenuBarra.add(d3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 290, 30, -1));

                d10.setBackground(new java.awt.Color(255, 255, 255));
                d10.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
                d10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                d10.setText("0");
                jPanelMenuBarra.add(d10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 310, 30, -1));

                d16.setBackground(new java.awt.Color(255, 255, 255));
                d16.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
                d16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                d16.setText("0");
                jPanelMenuBarra.add(d16, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 330, 30, -1));

                d23.setBackground(new java.awt.Color(255, 255, 255));
                d23.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
                d23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                d23.setText("0");
                jPanelMenuBarra.add(d23, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 350, 30, -1));

                d30.setBackground(new java.awt.Color(255, 255, 255));
                d30.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
                d30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                d30.setText("0");
                jPanelMenuBarra.add(d30, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 370, 30, -1));

                d17.setBackground(new java.awt.Color(255, 255, 255));
                d17.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
                d17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                d17.setText("0");
                jPanelMenuBarra.add(d17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 330, 30, -1));

                d11.setBackground(new java.awt.Color(255, 255, 255));
                d11.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
                d11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                d11.setText("0");
                jPanelMenuBarra.add(d11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 310, 30, -1));

                d39.setBackground(new java.awt.Color(255, 255, 255));
                d39.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
                d39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                d39.setText("0");
                jPanelMenuBarra.add(d39, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 390, 30, -1));

                d32.setBackground(new java.awt.Color(255, 255, 255));
                d32.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
                d32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                d32.setText("0");
                jPanelMenuBarra.add(d32, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 370, 30, -1));

                d31.setBackground(new java.awt.Color(255, 255, 255));
                d31.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
                d31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                d31.setText("0");
                jPanelMenuBarra.add(d31, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 370, 30, -1));

                d18.setBackground(new java.awt.Color(255, 255, 255));
                d18.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
                d18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                d18.setText("0");
                jPanelMenuBarra.add(d18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 330, 30, -1));

                jQui.setBackground(new java.awt.Color(255, 255, 255));
                jQui.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
                jQui.setForeground(new java.awt.Color(45, 43, 43));
                jQui.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jQui.setText("Qui");
                jPanelMenuBarra.add(jQui, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 260, 30, -1));

                d40.setBackground(new java.awt.Color(255, 255, 255));
                d40.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
                d40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                d40.setText("0");
                jPanelMenuBarra.add(d40, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 390, 30, -1));

                jQua.setBackground(new java.awt.Color(255, 255, 255));
                jQua.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
                jQua.setForeground(new java.awt.Color(45, 43, 43));
                jQua.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jQua.setText("Qua");
                jPanelMenuBarra.add(jQua, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 260, 30, -1));

                d24.setBackground(new java.awt.Color(255, 255, 255));
                d24.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
                d24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                d24.setText("0");
                jPanelMenuBarra.add(d24, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 350, 30, -1));

                d25.setBackground(new java.awt.Color(255, 255, 255));
                d25.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
                d25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                d25.setText("0");
                jPanelMenuBarra.add(d25, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 350, 30, -1));

                d4.setBackground(new java.awt.Color(255, 255, 255));
                d4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
                d4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                d4.setText("0");
                jPanelMenuBarra.add(d4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 290, 30, -1));

                d38.setBackground(new java.awt.Color(255, 255, 255));
                d38.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
                d38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                d38.setText("0");
                jPanelMenuBarra.add(d38, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 390, 30, -1));

                d26.setBackground(new java.awt.Color(255, 255, 255));
                d26.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
                d26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                d26.setText("0");
                jPanelMenuBarra.add(d26, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 350, 30, -1));

                d5.setBackground(new java.awt.Color(255, 255, 255));
                d5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
                d5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                d5.setText("0");
                jPanelMenuBarra.add(d5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 290, 30, -1));

                d33.setBackground(new java.awt.Color(255, 255, 255));
                d33.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
                d33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                d33.setText("0");
                jPanelMenuBarra.add(d33, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 370, 30, -1));

                d21.setBackground(new java.awt.Color(255, 255, 255));
                d21.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
                d21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                d21.setText("0");
                jPanelMenuBarra.add(d21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 330, 30, -1));

                jSex.setBackground(new java.awt.Color(255, 255, 255));
                jSex.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
                jSex.setForeground(new java.awt.Color(45, 43, 43));
                jSex.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jSex.setText("Sex");
                jPanelMenuBarra.add(jSex, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 260, 30, -1));

                d19.setBackground(new java.awt.Color(255, 255, 255));
                d19.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
                d19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                d19.setText("0");
                jPanelMenuBarra.add(d19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 330, 30, -1));

                d35.setBackground(new java.awt.Color(255, 255, 255));
                d35.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
                d35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                d35.setText("0");
                jPanelMenuBarra.add(d35, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 370, 30, -1));

                d14.setBackground(new java.awt.Color(255, 255, 255));
                d14.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
                d14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                d14.setText("0");
                jPanelMenuBarra.add(d14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 310, 30, -1));

                jSab.setBackground(new java.awt.Color(255, 255, 255));
                jSab.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
                jSab.setForeground(new java.awt.Color(45, 43, 43));
                jSab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jSab.setText("Sáb");
                jPanelMenuBarra.add(jSab, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 260, 30, -1));

                d41.setBackground(new java.awt.Color(255, 255, 255));
                d41.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
                d41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                d41.setText("0");
                jPanelMenuBarra.add(d41, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 390, 30, -1));

                d13.setBackground(new java.awt.Color(255, 255, 255));
                d13.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
                d13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                d13.setText("0");
                jPanelMenuBarra.add(d13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 310, 30, -1));

                d28.setBackground(new java.awt.Color(255, 255, 255));
                d28.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
                d28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                d28.setText("0");
                jPanelMenuBarra.add(d28, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 350, 30, -1));

                d34.setBackground(new java.awt.Color(255, 255, 255));
                d34.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
                d34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                d34.setText("0");
                jPanelMenuBarra.add(d34, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 370, 30, -1));

                d27.setBackground(new java.awt.Color(255, 255, 255));
                d27.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
                d27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                d27.setText("0");
                jPanelMenuBarra.add(d27, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 350, 30, -1));

                d7.setBackground(new java.awt.Color(255, 255, 255));
                d7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
                d7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                d7.setText("0");
                jPanelMenuBarra.add(d7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 290, 30, -1));

                d42.setBackground(new java.awt.Color(255, 255, 255));
                d42.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
                d42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                d42.setText("0");
                jPanelMenuBarra.add(d42, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 390, 30, -1));

                d6.setBackground(new java.awt.Color(255, 255, 255));
                d6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
                d6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                d6.setText("0");
                jPanelMenuBarra.add(d6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 290, 30, -1));

                d12.setBackground(new java.awt.Color(255, 255, 255));
                d12.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
                d12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                d12.setText("0");
                jPanelMenuBarra.add(d12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 310, 30, -1));

                d20.setBackground(new java.awt.Color(255, 255, 255));
                d20.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
                d20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                d20.setText("0");
                jPanelMenuBarra.add(d20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 330, 30, -1));

                jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/abaCalendario.png"))); // NOI18N
                jPanelMenuBarra.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 220, -1, 210));

                getContentPane().add(jPanelMenuBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1240, 660));

                jPanelBarraAzul.setBackground(new java.awt.Color(51, 153, 255));
                jPanelBarraAzul.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
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

    private void SelecionaMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelecionaMesActionPerformed
        DiaAltera = DiaFixo;
        organizaCalendario();
    }//GEN-LAST:event_SelecionaMesActionPerformed

    private void SelecionaAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelecionaAnoActionPerformed
        try {
            int x = Integer.parseInt(SelecionaAno.getSelectedItem().toString());
            DiaAltera = DiaFixo;
            organizaCalendario();

        } catch (Exception e) {
            SelecionaAno.setSelectedItem(AnoFixo);
        }
    }//GEN-LAST:event_SelecionaAnoActionPerformed

    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged
        valorselecao = Integer.parseInt(jSpinner1.getValue().toString());
        int x = SelecionaMes.getSelectedIndex();
        int ano = Integer.parseInt(SelecionaAno.getSelectedItem().toString());

        if (valorselecao == -1) {
            if (SelecionaMes.getSelectedIndex() != 11) {
                SelecionaMes.setSelectedIndex(x + 1);
            } else {
                SelecionaMes.setSelectedIndex(0);
                ano = ano + 1;
                SelecionaAno.setSelectedItem(ano);
            }
        }

        if (valorselecao == 1) {
            if (SelecionaMes.getSelectedIndex() != 0) {
                SelecionaMes.setSelectedIndex(x - 1);
            } else {
                SelecionaMes.setSelectedIndex(11);
                ano = ano - 1;
                SelecionaAno.setSelectedItem(ano);
            }
        }
        jSpinner1.setValue(0);
    }//GEN-LAST:event_jSpinner1StateChanged

    private void calc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calc1ActionPerformed
        String text = ((javax.swing.JButton)evt.getSource()).getText();
        calculo.setText(calculo.getText() + text);
    }//GEN-LAST:event_calc1ActionPerformed

    private void calc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calc2ActionPerformed
        String text = ((javax.swing.JButton)evt.getSource()).getText();
        calculo.setText(calculo.getText() + text);
    }//GEN-LAST:event_calc2ActionPerformed

    private void calc3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calc3ActionPerformed
        String text = ((javax.swing.JButton)evt.getSource()).getText();
        calculo.setText(calculo.getText() + text);
    }//GEN-LAST:event_calc3ActionPerformed

    private void calc4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calc4ActionPerformed
        String text = ((javax.swing.JButton)evt.getSource()).getText();
        calculo.setText(calculo.getText() + text);
    }//GEN-LAST:event_calc4ActionPerformed

    private void calc5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calc5ActionPerformed
        String text = ((javax.swing.JButton)evt.getSource()).getText();
        calculo.setText(calculo.getText() + text);
    }//GEN-LAST:event_calc5ActionPerformed

    private void calc6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calc6ActionPerformed
        String text = ((javax.swing.JButton)evt.getSource()).getText();
        calculo.setText(calculo.getText() + text);
    }//GEN-LAST:event_calc6ActionPerformed

    private void calc7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calc7ActionPerformed
        String text = ((javax.swing.JButton)evt.getSource()).getText();
        calculo.setText(calculo.getText() + text);
    }//GEN-LAST:event_calc7ActionPerformed

    private void calc0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calc0ActionPerformed
        String text = ((javax.swing.JButton)evt.getSource()).getText();
        calculo.setText(calculo.getText() + text);
    }//GEN-LAST:event_calc0ActionPerformed

    private void calc9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calc9ActionPerformed
        String text = ((javax.swing.JButton)evt.getSource()).getText();
        calculo.setText(calculo.getText() + text);
    }//GEN-LAST:event_calc9ActionPerformed

    private void calcsomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcsomaActionPerformed
        String text = ((javax.swing.JButton)evt.getSource()).getText();
        calculo.setText(calculo.getText() + text);
    }//GEN-LAST:event_calcsomaActionPerformed

    private void calcsubtraiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcsubtraiActionPerformed
        String text = ((javax.swing.JButton)evt.getSource()).getText();
        calculo.setText(calculo.getText() + text);
    }//GEN-LAST:event_calcsubtraiActionPerformed

    private void calcmultiplicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcmultiplicaActionPerformed
        String text = ((javax.swing.JButton)evt.getSource()).getText();
        calculo.setText(calculo.getText() + text);
    }//GEN-LAST:event_calcmultiplicaActionPerformed

    private void calcdivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcdivideActionPerformed
        String text = ((javax.swing.JButton)evt.getSource()).getText();
        calculo.setText(calculo.getText() + text);
    }//GEN-LAST:event_calcdivideActionPerformed

    private void calcabreparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcabreparActionPerformed
        String text = ((javax.swing.JButton)evt.getSource()).getText();
        calculo.setText(calculo.getText() + text);
    }//GEN-LAST:event_calcabreparActionPerformed

    private void calcfechaparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcfechaparActionPerformed
        String text = ((javax.swing.JButton)evt.getSource()).getText();
        calculo.setText(calculo.getText() + text);
    }//GEN-LAST:event_calcfechaparActionPerformed

    private void calcigualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcigualActionPerformed
        try {
            String resultado = "" + new DoubleEvaluator().evaluate(calculo.getText());
            if (resultado.equals("Infinity")) resultado = "infinito";
            else if (resultado.equals("NaN")) resultado = "erro";
            calculo.setText(resultado);
        } catch (Exception e) {
            calculo.setText("erro");
        }
    }//GEN-LAST:event_calcigualActionPerformed

    private void calclimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calclimparActionPerformed
        calculo.setText("");
    }//GEN-LAST:event_calclimparActionPerformed

    private void calc8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calc8ActionPerformed
        String text = ((javax.swing.JButton)evt.getSource()).getText();
        calculo.setText(calculo.getText() + text);
    }//GEN-LAST:event_calc8ActionPerformed

    private void calcapagarultimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcapagarultimoActionPerformed
        if (calculo.getText().length() == 0) return;
        if (calculo.getText().length() == 1) {
            calculo.setText("");
            return;
        }
        calculo.setText(calculo.getText().substring(0, calculo.getText().length()-1));
    }//GEN-LAST:event_calcapagarultimoActionPerformed

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
        private static javax.swing.JComboBox<String> SelecionaAno;
        private static javax.swing.JComboBox<String> SelecionaMes;
        private javax.swing.JButton calc0;
        private javax.swing.JButton calc1;
        private javax.swing.JButton calc2;
        private javax.swing.JButton calc3;
        private javax.swing.JButton calc4;
        private javax.swing.JButton calc5;
        private javax.swing.JButton calc6;
        private javax.swing.JButton calc7;
        private javax.swing.JButton calc8;
        private javax.swing.JButton calc9;
        private javax.swing.JButton calcabrepar;
        private javax.swing.JButton calcapagarultimo;
        private javax.swing.JButton calcdivide;
        private javax.swing.JButton calcfechapar;
        private javax.swing.JButton calcigual;
        private javax.swing.JButton calclimpar;
        private javax.swing.JButton calcmultiplica;
        private javax.swing.JButton calcsoma;
        private javax.swing.JButton calcsubtrai;
        private javax.swing.JTextField calculo;
        private static javax.swing.JLabel d1;
        private static javax.swing.JLabel d10;
        private static javax.swing.JLabel d11;
        private static javax.swing.JLabel d12;
        private static javax.swing.JLabel d13;
        private static javax.swing.JLabel d14;
        private static javax.swing.JLabel d15;
        private static javax.swing.JLabel d16;
        private static javax.swing.JLabel d17;
        private static javax.swing.JLabel d18;
        private static javax.swing.JLabel d19;
        private static javax.swing.JLabel d2;
        private static javax.swing.JLabel d20;
        private static javax.swing.JLabel d21;
        private static javax.swing.JLabel d22;
        private static javax.swing.JLabel d23;
        private static javax.swing.JLabel d24;
        private static javax.swing.JLabel d25;
        private static javax.swing.JLabel d26;
        private static javax.swing.JLabel d27;
        private static javax.swing.JLabel d28;
        private static javax.swing.JLabel d29;
        private static javax.swing.JLabel d3;
        private static javax.swing.JLabel d30;
        private static javax.swing.JLabel d31;
        private static javax.swing.JLabel d32;
        private static javax.swing.JLabel d33;
        private static javax.swing.JLabel d34;
        private static javax.swing.JLabel d35;
        private static javax.swing.JLabel d36;
        private static javax.swing.JLabel d37;
        private static javax.swing.JLabel d38;
        private static javax.swing.JLabel d39;
        private static javax.swing.JLabel d4;
        private static javax.swing.JLabel d40;
        private static javax.swing.JLabel d41;
        private static javax.swing.JLabel d42;
        private static javax.swing.JLabel d5;
        private static javax.swing.JLabel d6;
        private static javax.swing.JLabel d7;
        private static javax.swing.JLabel d8;
        private static javax.swing.JLabel d9;
        private javax.swing.JButton jButton1;
        private javax.swing.JButton jButtonAddMateria;
        private javax.swing.JButton jButtonCriarAnotacao;
        private static javax.swing.JLabel jDom;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabelAnotacoes;
        private javax.swing.JLabel jLabelHora;
        private javax.swing.JLabel jLabelLembrete;
        private javax.swing.JLabel jLabelMaterias;
        public static javax.swing.JList<String> jListAnotacoes;
        public static javax.swing.JList<Materia> jListMaterias;
        private javax.swing.JPanel jPanelBarraAzul;
        private javax.swing.JPanel jPanelMenuBarra;
        private static javax.swing.JLabel jQua;
        private static javax.swing.JLabel jQui;
        private static javax.swing.JLabel jSab;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JScrollPane jScrollPane2;
        private static javax.swing.JLabel jSeg;
        private static javax.swing.JLabel jSex;
        private static javax.swing.JSpinner jSpinner1;
        private static javax.swing.JLabel jTer;
        // End of variables declaration//GEN-END:variables
    private static javax.swing.JLabel[] jldias;

    //        Inicializacao do calendario
    public void iniciacalendario() {
        // {Jonas}: Cria o arquivo JSON caso não exista
        JSONCalendario.criarJSONCalendario();

        SimpleDateFormat Ano = new SimpleDateFormat("YYYY");
        SimpleDateFormat Mes = new SimpleDateFormat("MM");
        SimpleDateFormat Dia = new SimpleDateFormat("dd");

        AnoFixo = Integer.parseInt(Ano.format(new Date()));
        MesFixo = Integer.parseInt(Mes.format(new Date()));
        DiaFixo = Integer.parseInt(Dia.format(new Date()));

//        Identificar o ano 
        int AnoMaximo = AnoFixo + 50;
        for (int i = 2000; i < AnoMaximo; i++) {
            SelecionaAno.addItem(String.valueOf(i));
        }
        SelecionaAno.setSelectedItem(AnoFixo);

        switch (MesFixo) {
            case 1:
                SelecionaMes.setSelectedIndex(0);
                break;
            case 2:
                SelecionaMes.setSelectedIndex(1);
                break;
            case 3:
                SelecionaMes.setSelectedIndex(2);
                break;
            case 4:
                SelecionaMes.setSelectedIndex(3);
                break;
            case 5:
                SelecionaMes.setSelectedIndex(4);
                break;
            case 6:
                SelecionaMes.setSelectedIndex(5);
                break;
            case 7:
                SelecionaMes.setSelectedIndex(6);
                break;
            case 8:
                SelecionaMes.setSelectedIndex(7);
                break;
            case 9:
                SelecionaMes.setSelectedIndex(8);
                break;
            case 10:
                SelecionaMes.setSelectedIndex(9);
                break;
            case 11:
                SelecionaMes.setSelectedIndex(10);
                break;
            case 12:
                SelecionaMes.setSelectedIndex(11);
                break;
            default:
                break;
        }
    }

    //    Organização dos dias do Calendário
    /**
     *
     */
    public static void organizaCalendario() {
        d1.setText("");
        d2.setText("");
        d3.setText("");
        d4.setText("");
        d5.setText("");
        d6.setText("");
        d7.setText("");
        d8.setText("");
        d9.setText("");
        d10.setText("");
        d11.setText("");
        d12.setText("");
        d13.setText("");
        d14.setText("");
        d15.setText("");
        d16.setText("");
        d17.setText("");
        d18.setText("");
        d19.setText("");
        d20.setText("");
        d21.setText("");
        d22.setText("");
        d23.setText("");
        d24.setText("");
        d25.setText("");
        d26.setText("");
        d27.setText("");
        d28.setText("");
        d29.setText("");
        d30.setText("");
        d31.setText("");
        d32.setText("");
        d33.setText("");
        d34.setText("");
        d35.setText("");
        d36.setText("");
        d37.setText("");
        d38.setText("");
        d39.setText("");
        d40.setText("");
        d41.setText("");
        d42.setText("");

        DiaAltera = DiaFixo;
        MesAltera = SelecionaMes.getSelectedIndex();
        AnoAltera = Integer.parseInt(SelecionaAno.getSelectedItem().toString());

        int TotalDiaMes = 0;
        if (MesAltera == 0) {
            TotalDiaMes = 31;
        } else if (MesAltera == 1) {
            int resultado = (AnoAltera % 4);
            if (resultado == 0) {
                TotalDiaMes = 29; // o ano é bissexto
            } else {
                TotalDiaMes = 28; // o ano não é bissexto 
            }
        } else if (MesFixo == 3) {
            TotalDiaMes = 31;
        } else if (MesFixo == 4) {
            TotalDiaMes = 30;
        } else if (MesFixo == 5) {
            TotalDiaMes = 31;
        } else if (MesFixo == 6) {
            TotalDiaMes = 30;
        } else if (MesFixo == 7) {
            TotalDiaMes = 31;
        } else if (MesFixo == 8) {
            TotalDiaMes = 31;
        } else if (MesFixo == 9) {
            TotalDiaMes = 30;
        } else if (MesFixo == 10) {
            TotalDiaMes = 31;
        } else if (MesFixo == 11) {
            TotalDiaMes = 30;
        } else if (MesFixo == 12) {
            TotalDiaMes = 31;
        }

//              Mostrar em qual dia da Semana será o dia 1 do mês
        Calendar c = Calendar.getInstance();
        c.set(AnoAltera, MesAltera, 1);
        int SetaDia = 0;

        int Semana = c.get(Calendar.DAY_OF_WEEK);
        switch (Semana) {
            case Calendar.SUNDAY:
                SetaDia = 1;
//                System.out.println("dom");
                break;
            case Calendar.MONDAY:
                SetaDia = 2;
//                System.out.println("seg");
                break;
            case Calendar.TUESDAY:
                SetaDia = 3;
//                System.out.println("ter");
                break;
            case Calendar.WEDNESDAY:
                SetaDia = 4;
//                System.out.println("qua");
                break;
            case Calendar.THURSDAY:
                SetaDia = 5;
//                System.out.println("qui");
                break;
            case Calendar.FRIDAY:
                SetaDia = 6;
//                System.out.println("sex");
                break;
            case Calendar.SATURDAY:
                SetaDia = 7;
//                System.out.println("sab");
                break;
            default:
                break;
        }

//        setar os dias da semana
        for (int i = 1; i <= TotalDiaMes; i++) {
            switch (SetaDia) {
                case 1:
                    d1.setText("" + i);
                    if (i == DiaFixo && MesAltera == MesFixo - 1 && AnoAltera == AnoFixo) {
                        d1.setForeground(Color.green);
                    } else {
                        d1.setForeground(Color.red);
                    }
                    break;

                case 2:
                    d2.setText("" + i);
                    if (i == DiaFixo && MesAltera == MesFixo - 1 && AnoAltera == AnoFixo) {
                        d2.setForeground(Color.red);
                    } else {
                        d2.setForeground(Color.black);
                    }
                    break;

                case 3:
                    d3.setText("" + i);
                    if (i == DiaFixo && MesAltera == MesFixo - 1 && AnoAltera == AnoFixo) {
                        d3.setForeground(Color.red);
                    } else {
                        d3.setForeground(Color.black);
                    }
                    break;

                case 4:
                    d4.setText("" + i);
                    if (i == DiaFixo && MesAltera == MesFixo - 1 && AnoAltera == AnoFixo) {
                        d4.setForeground(Color.red);
                    } else {
                        d4.setForeground(Color.black);
                    }
                    break;

                case 5:
                    d5.setText("" + i);
                    if (i == DiaFixo && MesAltera == MesFixo - 1 && AnoAltera == AnoFixo) {
                        d5.setForeground(Color.red);
                    } else {
                        d5.setForeground(Color.black);
                    }
                    break;

                case 6:
                    d6.setText("" + i);
                    if (i == DiaFixo && MesAltera == MesFixo - 1 && AnoAltera == AnoFixo) {
                        d6.setForeground(Color.red);
                    } else {
                        d6.setForeground(Color.black);
                    }
                    break;

                case 7:
                    d7.setText("" + i);
                    if (i == DiaFixo && MesAltera == MesFixo - 1 && AnoAltera == AnoFixo) {
                        d7.setForeground(Color.red);
                    } else {
                        d7.setForeground(Color.black);
                    }
                    break;

                case 8:
                    d8.setText("" + i);
                    if (i == DiaFixo && MesAltera == MesFixo - 1 && AnoAltera == AnoFixo) {
                        d8.setForeground(Color.green);
                    } else {
                        d8.setForeground(Color.red);
                    }
                    break;

                case 9:
                    d9.setText("" + i);
                    if (i == DiaFixo && MesAltera == MesFixo - 1 && AnoAltera == AnoFixo) {
                        d9.setForeground(Color.red);
                    } else {
                        d9.setForeground(Color.black);
                    }
                    break;

                case 10:
                    d10.setText("" + i);
                    if (i == DiaFixo && MesAltera == MesFixo - 1 && AnoAltera == AnoFixo) {
                        d10.setForeground(Color.red);
                    } else {
                        d10.setForeground(Color.black);
                    }
                    break;

                case 11:
                    d11.setText("" + i);
                    if (i == DiaFixo && MesAltera == MesFixo - 1 && AnoAltera == AnoFixo) {
                        d11.setForeground(Color.red);
                    } else {
                        d11.setForeground(Color.black);
                    }
                    break;

                case 12:
                    d12.setText("" + i);
                    if (i == DiaFixo && MesAltera == MesFixo - 1 && AnoAltera == AnoFixo) {
                        d12.setForeground(Color.red);
                    } else {
                        d12.setForeground(Color.black);
                    }
                    break;

                case 13:
                    d13.setText("" + i);
                    if (i == DiaFixo && MesAltera == MesFixo - 1 && AnoAltera == AnoFixo) {
                        d13.setForeground(Color.red);
                    } else {
                        d13.setForeground(Color.black);
                    }
                    break;

                case 14:
                    d14.setText("" + i);
                    if (i == DiaFixo && MesAltera == MesFixo - 1 && AnoAltera == AnoFixo) {
                        d14.setForeground(Color.red);
                    } else {
                        d14.setForeground(Color.black);
                    }
                    break;

                case 15:
                    d15.setText("" + i);
                    if (i == DiaFixo && MesAltera == MesFixo - 1 && AnoAltera == AnoFixo) {
                        d15.setForeground(Color.green);
                    } else {
                        d15.setForeground(Color.red);
                    }
                    break;

                case 16:
                    d16.setText("" + i);
                    if (i == DiaFixo && MesAltera == MesFixo - 1 && AnoAltera == AnoFixo) {
                        d16.setForeground(Color.red);
                    } else {
                        d16.setForeground(Color.black);
                    }
                    break;

                case 17:
                    d17.setText("" + i);
                    if (i == DiaFixo && MesAltera == MesFixo - 1 && AnoAltera == AnoFixo) {
                        d17.setForeground(Color.red);
                    } else {
                        d17.setForeground(Color.black);
                    }
                    break;

                case 18:
                    d18.setText("" + i);
                    if (i == DiaFixo && MesAltera == MesFixo - 1 && AnoAltera == AnoFixo) {
                        d18.setForeground(Color.red);
                    } else {
                        d18.setForeground(Color.black);
                    }
                    break;

                case 19:
                    d19.setText("" + i);
                    if (i == DiaFixo && MesAltera == MesFixo - 1 && AnoAltera == AnoFixo) {
                        d19.setForeground(Color.red);
                    } else {
                        d19.setForeground(Color.black);
                    }
                    break;

                case 20:
                    d20.setText("" + i);
                    if (i == DiaFixo && MesAltera == MesFixo - 1 && AnoAltera == AnoFixo) {
                        d20.setForeground(Color.red);
                    } else {
                        d20.setForeground(Color.black);
                    }
                    break;
                case 21:
                    d21.setText("" + i);
                    if (i == DiaFixo && MesAltera == MesFixo - 1 && AnoAltera == AnoFixo) {
                        d21.setForeground(Color.red);
                    } else {
                        d21.setForeground(Color.black);
                    }
                    break;

                case 22:
                    d22.setText("" + i);
                    if (i == DiaFixo && MesAltera == MesFixo - 1 && AnoAltera == AnoFixo) {
                        d22.setForeground(Color.green);
                    } else {
                        d22.setForeground(Color.red);
                    }
                    break;

                case 23:
                    d23.setText("" + i);
                    if (i == DiaFixo && MesAltera == MesFixo - 1 && AnoAltera == AnoFixo) {
                        d23.setForeground(Color.red);
                    } else {
                        d23.setForeground(Color.black);
                    }
                    break;

                case 24:
                    d24.setText("" + i);
                    if (i == DiaFixo && MesAltera == MesFixo - 1 && AnoAltera == AnoFixo) {
                        d24.setForeground(Color.red);
                    } else {
                        d24.setForeground(Color.black);
                    }
                    break;

                case 25:
                    d25.setText("" + i);
                    if (i == DiaFixo && MesAltera == MesFixo - 1 && AnoAltera == AnoFixo) {
                        d25.setForeground(Color.red);
                    } else {
                        d25.setForeground(Color.black);
                    }
                    break;

                case 26:
                    d26.setText("" + i);
                    if (i == DiaFixo && MesAltera == MesFixo - 1 && AnoAltera == AnoFixo) {
                        d26.setForeground(Color.red);
                    } else {
                        d26.setForeground(Color.black);
                    }
                    break;

                case 27:
                    d27.setText("" + i);
                    if (i == DiaFixo && MesAltera == MesFixo - 1 && AnoAltera == AnoFixo) {
                        d27.setForeground(Color.red);
                    } else {
                        d27.setForeground(Color.black);
                    }
                    break;

                case 28:
                    d28.setText("" + i);
                    if (i == DiaFixo && MesAltera == MesFixo - 1 && AnoAltera == AnoFixo) {
                        d28.setForeground(Color.red);
                    } else {
                        d28.setForeground(Color.black);
                    }
                    break;

                case 29:
                    d29.setText("" + i);
                    if (i == DiaFixo && MesAltera == MesFixo - 1 && AnoAltera == AnoFixo) {
                        d29.setForeground(Color.green);
                    } else {
                        d29.setForeground(Color.red);
                    }
                    break;

                case 30:
                    d30.setText("" + i);
                    if (i == DiaFixo && MesAltera == MesFixo - 1 && AnoAltera == AnoFixo) {
                        d30.setForeground(Color.red);
                    } else {
                        d30.setForeground(Color.black);
                    }
                    break;
                case 31:
                    d31.setText("" + i);
                    if (i == DiaFixo && MesAltera == MesFixo - 1 && AnoAltera == AnoFixo) {
                        d31.setForeground(Color.red);
                    } else {
                        d31.setForeground(Color.black);
                    }
                    break;

                case 32:
                    d32.setText("" + i);
                    if (i == DiaFixo && MesAltera == MesFixo - 1 && AnoAltera == AnoFixo) {
                        d32.setForeground(Color.red);
                    } else {
                        d32.setForeground(Color.black);
                    }
                    break;

                case 33:
                    d33.setText("" + i);
                    if (i == DiaFixo && MesAltera == MesFixo - 1 && AnoAltera == AnoFixo) {
                        d33.setForeground(Color.red);
                    } else {
                        d33.setForeground(Color.black);
                    }
                    break;

                case 34:
                    d34.setText("" + i);
                    if (i == DiaFixo && MesAltera == MesFixo - 1 && AnoAltera == AnoFixo) {
                        d34.setForeground(Color.red);
                    } else {
                        d34.setForeground(Color.black);
                    }
                    break;

                case 35:
                    d35.setText("" + i);
                    if (i == DiaFixo && MesAltera == MesFixo - 1 && AnoAltera == AnoFixo) {
                        d35.setForeground(Color.red);
                    } else {
                        d35.setForeground(Color.black);
                    }
                    break;

                case 36:
                    d36.setText("" + i);
                    if (i == DiaFixo && MesAltera == MesFixo - 1 && AnoAltera == AnoFixo) {
                        d36.setForeground(Color.green);
                    } else {
                        d36.setForeground(Color.red);
                    }
                    break;

                case 37:
                    d37.setText("" + i);
                    if (i == DiaFixo && MesAltera == MesFixo - 1 && AnoAltera == AnoFixo) {
                        d37.setForeground(Color.red);
                    } else {
                        d37.setForeground(Color.black);
                    }
                    break;

                case 38:
                    d38.setText("" + i);
                    if (i == DiaFixo && MesAltera == MesFixo - 1 && AnoAltera == AnoFixo) {
                        d38.setForeground(Color.red);
                    } else {
                        d38.setForeground(Color.black);
                    }
                    break;

                case 39:
                    d39.setText("" + i);
                    if (i == DiaFixo && MesAltera == MesFixo - 1 && AnoAltera == AnoFixo) {
                        d39.setForeground(Color.red);
                    } else {
                        d39.setForeground(Color.black);
                    }
                    break;

                case 40:
                    d40.setText("" + i);
                    if (i == DiaFixo && MesAltera == MesFixo - 1 && AnoAltera == AnoFixo) {
                        d40.setForeground(Color.red);
                    } else {
                        d40.setForeground(Color.black);
                    }
                    break;

                case 41:
                    d41.setText("" + i);
                    if (i == DiaFixo && MesAltera == MesFixo - 1 && AnoAltera == AnoFixo) {
                        d41.setForeground(Color.red);
                    } else {
                        d41.setForeground(Color.black);
                    }
                    break;

                case 42:
                    d42.setText("" + i);
                    if (i == DiaFixo && MesAltera == MesFixo - 1 && AnoAltera == AnoFixo) {
                        d42.setForeground(Color.red);
                    } else {
                        d42.setForeground(Color.black);
                    }
                    break;

            }
            SetaDia++;
        }
        if (!"".equals(d1.getText())) {
            d1.setOpaque(true);
        } else {
            d1.setOpaque(false);
        }
        if (!"".equals(d2.getText())) {
            d2.setOpaque(true);
        } else {
            d2.setOpaque(false);
        }
        if (!"".equals(d3.getText())) {
            d3.setOpaque(true);
        } else {
            d3.setOpaque(false);
        }
        if (!"".equals(d4.getText())) {
            d4.setOpaque(true);
        } else {
            d4.setOpaque(false);
        }
        if (!"".equals(d5.getText())) {
            d5.setOpaque(true);
        } else {
            d5.setOpaque(false);
        }
        if (!"".equals(d6.getText())) {
            d6.setOpaque(true);
        } else {
            d6.setOpaque(false);
        }
        if (!"".equals(d7.getText())) {
            d7.setOpaque(true);
        } else {
            d7.setOpaque(false);
        }
        if (!"".equals(d8.getText())) {
            d8.setOpaque(true);
        } else {
            d8.setOpaque(false);
        }
        if (!"".equals(d9.getText())) {
            d9.setOpaque(true);
        } else {
            d9.setOpaque(false);
        }
        if (!"".equals(d10.getText())) {
            d10.setOpaque(true);
        } else {
            d10.setOpaque(false);
        }
        if (!"".equals(d11.getText())) {
            d11.setOpaque(true);
        } else {
            d11.setOpaque(false);
        }
        if (!"".equals(d12.getText())) {
            d12.setOpaque(true);
        } else {
            d12.setOpaque(false);
        }
        if (!"".equals(d13.getText())) {
            d13.setOpaque(true);
        } else {
            d13.setOpaque(false);
        }
        if (!"".equals(d14.getText())) {
            d14.setOpaque(true);
        } else {
            d14.setOpaque(false);
        }
        if (!"".equals(d15.getText())) {
            d15.setOpaque(true);
        } else {
            d15.setOpaque(false);
        }
        if (!"".equals(d16.getText())) {
            d16.setOpaque(true);
        } else {
            d16.setOpaque(false);
        }
        if (!"".equals(d17.getText())) {
            d17.setOpaque(true);
        } else {
            d17.setOpaque(false);
        }
        if (!"".equals(d18.getText())) {
            d18.setOpaque(true);
        } else {
            d18.setOpaque(false);
        }
        if (!"".equals(d19.getText())) {
            d19.setOpaque(true);
        } else {
            d19.setOpaque(false);
        }
        if (!"".equals(d20.getText())) {
            d20.setOpaque(true);
        } else {
            d20.setOpaque(false);
        }
        if (!"".equals(d21.getText())) {
            d21.setOpaque(true);
        } else {
            d21.setOpaque(false);
        }
        if (!"".equals(d22.getText())) {
            d22.setOpaque(true);
        } else {
            d22.setOpaque(false);
        }
        if (!"".equals(d23.getText())) {
            d23.setOpaque(true);
        } else {
            d23.setOpaque(false);
        }
        if (!"".equals(d24.getText())) {
            d24.setOpaque(true);
        } else {
            d24.setOpaque(false);
        }
        if (!"".equals(d25.getText())) {
            d25.setOpaque(true);
        } else {
            d25.setOpaque(false);
        }
        if (!"".equals(d26.getText())) {
            d26.setOpaque(true);
        } else {
            d26.setOpaque(false);
        }
        if (!"".equals(d27.getText())) {
            d27.setOpaque(true);
        } else {
            d27.setOpaque(false);
        }
        if (!"".equals(d28.getText())) {
            d28.setOpaque(true);
        } else {
            d28.setOpaque(false);
        }
        if (!"".equals(d29.getText())) {
            d29.setOpaque(true);
        } else {
            d29.setOpaque(false);
        }
        if (!"".equals(d30.getText())) {
            d30.setOpaque(true);
        } else {
            d30.setOpaque(false);
        }
        if (!"".equals(d31.getText())) {
            d31.setOpaque(true);
        } else {
            d31.setOpaque(false);
        }
        if (!"".equals(d32.getText())) {
            d32.setOpaque(true);
        } else {
            d32.setOpaque(false);
        }
        if (!"".equals(d33.getText())) {
            d33.setOpaque(true);
        } else {
            d33.setOpaque(false);
        }
        if (!"".equals(d34.getText())) {
            d34.setOpaque(true);
        } else {
            d34.setOpaque(false);
        }
        if (!"".equals(d35.getText())) {
            d35.setOpaque(true);
        } else {
            d35.setOpaque(false);
        }
        if (!"".equals(d36.getText())) {
            d36.setOpaque(true);
        } else {
            d36.setOpaque(false);
        }
        if (!"".equals(d37.getText())) {
            d37.setOpaque(true);
        } else {
            d37.setOpaque(false);
        }
        if (!"".equals(d38.getText())) {
            d38.setOpaque(true);
        } else {
            d38.setOpaque(false);
        }
        if (!"".equals(d39.getText())) {
            d39.setOpaque(true);
        } else {
            d39.setOpaque(false);
        }
        if (!"".equals(d40.getText())) {
            d40.setOpaque(true);
        } else {
            d40.setOpaque(false);
        }
        if (!"".equals(d41.getText())) {
            d41.setOpaque(true);
        } else {
            d41.setOpaque(false);
        }
        if (!"".equals(d42.getText())) {
            d42.setOpaque(true);
        } else {
            d42.setOpaque(false);
        }
        checarDias();
    }

    //    evento nos dias do mes
    public void Calendario_evt() {
        d1.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (!"".equals(d1.getText())) {
                    d1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                d1.setBorder(null);
            }

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                String dia = d1.getText();
                if (dia.length() > 1024) {
                    dia = dia.substring(0, 1023);
                }
                String mes = (String) SelecionaMes.getSelectedItem();
                String ano = String.valueOf(SelecionaAno.getSelectedItem());
                anotacaocalendario.visualizarAnotacao(dia, mes, ano);
            }
        });

        d2.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (!"".equals(d2.getText())) {
                    d2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                d2.setBorder(null);
            }

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                String dia = d2.getText();
                // {Jonas}: essa função substring serve pra limitar a quantidade de caracteres
                // sem ela, Hudson vai salvar 3GB de texto no arquivo JSON.¯\_(ツ)_/¯
                if (dia.length() > 1024) {
                    dia = dia.substring(0, 1023);
                }
                String mes = (String) SelecionaMes.getSelectedItem();
                String ano = String.valueOf(SelecionaAno.getSelectedItem());
                anotacaocalendario.visualizarAnotacao(dia, mes, ano);
            }
        });

        d3.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (!"".equals(d3.getText())) {
                    d3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                d3.setBorder(null);
            }

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                String dia = d3.getText();
                if (dia.length() > 1024) {
                    dia = dia.substring(0, 1023);
                }
                String mes = (String) SelecionaMes.getSelectedItem();
                String ano = String.valueOf(SelecionaAno.getSelectedItem());
                anotacaocalendario.visualizarAnotacao(dia, mes, ano);
            }
        });

        d4.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (!"".equals(d4.getText())) {
                    d4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                d4.setBorder(null);
            }

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                String dia = d4.getText();
                if (dia.length() > 1024) {
                    dia = dia.substring(0, 1023);
                }
                String mes = (String) SelecionaMes.getSelectedItem();
                String ano = String.valueOf(SelecionaAno.getSelectedItem());
                anotacaocalendario.visualizarAnotacao(dia, mes, ano);
            }
        });

        d5.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (!"".equals(d5.getText())) {
                    d5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                d5.setBorder(null);
            }

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                String dia = d5.getText();
                if (dia.length() > 1024) {
                    dia = dia.substring(0, 1023);
                }
                String mes = (String) SelecionaMes.getSelectedItem();
                String ano = String.valueOf(SelecionaAno.getSelectedItem());
                anotacaocalendario.visualizarAnotacao(dia, mes, ano);
            }
        });

        d6.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (!"".equals(d6.getText())) {
                    d6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                d6.setBorder(null);
            }

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                String dia = d6.getText();
                if (dia.length() > 1024) {
                    dia = dia.substring(0, 1023);
                }
                String mes = (String) SelecionaMes.getSelectedItem();
                String ano = String.valueOf(SelecionaAno.getSelectedItem());
                anotacaocalendario.visualizarAnotacao(dia, mes, ano);
            }
        });

        d7.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (!"".equals(d7.getText())) {
                    d7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                d7.setBorder(null);
            }

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                String dia = d7.getText();
                if (dia.length() > 1024) {
                    dia = dia.substring(0, 1023);
                }
                String mes = (String) SelecionaMes.getSelectedItem();
                String ano = String.valueOf(SelecionaAno.getSelectedItem());
                anotacaocalendario.visualizarAnotacao(dia, mes, ano);
            }
        });

        d8.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (!"".equals(d8.getText())) {
                    d8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                d8.setBorder(null);
            }

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                String dia = d8.getText();
                if (dia.length() > 1024) {
                    dia = dia.substring(0, 1023);
                }
                String mes = (String) SelecionaMes.getSelectedItem();
                String ano = String.valueOf(SelecionaAno.getSelectedItem());
                anotacaocalendario.visualizarAnotacao(dia, mes, ano);
            }
        });

        d9.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (!"".equals(d9.getText())) {
                    d9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                d9.setBorder(null);
            }

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                String dia = d9.getText();
                if (dia.length() > 1024) {
                    dia = dia.substring(0, 1023);
                }
                String mes = (String) SelecionaMes.getSelectedItem();
                String ano = String.valueOf(SelecionaAno.getSelectedItem());
                anotacaocalendario.visualizarAnotacao(dia, mes, ano);
            }
        });

        d10.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (!"".equals(d10.getText())) {
                    d10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                d10.setBorder(null);
            }

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                String dia = d10.getText();
                if (dia.length() > 1024) {
                    dia = dia.substring(0, 1023);
                }
                String mes = (String) SelecionaMes.getSelectedItem();
                String ano = String.valueOf(SelecionaAno.getSelectedItem());
                anotacaocalendario.visualizarAnotacao(dia, mes, ano);
            }
        });

        d11.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (!"".equals(d11.getText())) {
                    d11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                d11.setBorder(null);
            }

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                String dia = d11.getText();
                if (dia.length() > 1024) {
                    dia = dia.substring(0, 1023);
                }
                String mes = (String) SelecionaMes.getSelectedItem();
                String ano = String.valueOf(SelecionaAno.getSelectedItem());
                anotacaocalendario.visualizarAnotacao(dia, mes, ano);
            }
        });

        d12.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (!"".equals(d12.getText())) {
                    d12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                d12.setBorder(null);
            }

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                String dia = d12.getText();
                if (dia.length() > 1024) {
                    dia = dia.substring(0, 1023);
                }
                String mes = (String) SelecionaMes.getSelectedItem();
                String ano = String.valueOf(SelecionaAno.getSelectedItem());
                anotacaocalendario.visualizarAnotacao(dia, mes, ano);
            }
        });

        d13.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (!"".equals(d13.getText())) {
                    d13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                d13.setBorder(null);
            }

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                String dia = d13.getText();
                if (dia.length() > 1024) {
                    dia = dia.substring(0, 1023);
                }
                String mes = (String) SelecionaMes.getSelectedItem();
                String ano = String.valueOf(SelecionaAno.getSelectedItem());
                anotacaocalendario.visualizarAnotacao(dia, mes, ano);
            }
        });

        d14.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (!"".equals(d14.getText())) {
                    d14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                d14.setBorder(null);
            }

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                String dia = d14.getText();
                if (dia.length() > 1024) {
                    dia = dia.substring(0, 1023);
                }
                String mes = (String) SelecionaMes.getSelectedItem();
                String ano = String.valueOf(SelecionaAno.getSelectedItem());
                anotacaocalendario.visualizarAnotacao(dia, mes, ano);
            }
        });

        d15.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (!"".equals(d15.getText())) {
                    d15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                d15.setBorder(null);
            }

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                String dia = d15.getText();
                if (dia.length() > 1024) {
                    dia = dia.substring(0, 1023);
                }
                String mes = (String) SelecionaMes.getSelectedItem();
                String ano = String.valueOf(SelecionaAno.getSelectedItem());
                anotacaocalendario.visualizarAnotacao(dia, mes, ano);
            }
        });

        d16.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (!"".equals(d16.getText())) {
                    d16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                d16.setBorder(null);
            }

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                String dia = d16.getText();
                if (dia.length() > 1024) {
                    dia = dia.substring(0, 1023);
                }
                String mes = (String) SelecionaMes.getSelectedItem();
                String ano = String.valueOf(SelecionaAno.getSelectedItem());
                anotacaocalendario.visualizarAnotacao(dia, mes, ano);
            }
        });

        d17.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (!"".equals(d17.getText())) {
                    d17.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                d17.setBorder(null);
            }

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                String dia = d17.getText();
                if (dia.length() > 1024) {
                    dia = dia.substring(0, 1023);
                }
                String mes = (String) SelecionaMes.getSelectedItem();
                String ano = String.valueOf(SelecionaAno.getSelectedItem());
                anotacaocalendario.visualizarAnotacao(dia, mes, ano);
            }
        });

        d18.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (!"".equals(d18.getText())) {
                    d18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                d18.setBorder(null);
            }

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                String dia = d18.getText();
                if (dia.length() > 1024) {
                    dia = dia.substring(0, 1023);
                }
                String mes = (String) SelecionaMes.getSelectedItem();
                String ano = String.valueOf(SelecionaAno.getSelectedItem());
                anotacaocalendario.visualizarAnotacao(dia, mes, ano);
            }
        });

        d19.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (!"".equals(d19.getText())) {
                    d19.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                d19.setBorder(null);
            }

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                String dia = d19.getText();
                if (dia.length() > 1024) {
                    dia = dia.substring(0, 1023);
                }
                String mes = (String) SelecionaMes.getSelectedItem();
                String ano = String.valueOf(SelecionaAno.getSelectedItem());
                anotacaocalendario.visualizarAnotacao(dia, mes, ano);
            }
        });

        d20.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (!"".equals(d20.getText())) {
                    d20.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                d20.setBorder(null);
            }

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                String dia = d20.getText();
                if (dia.length() > 1024) {
                    dia = dia.substring(0, 1023);
                }
                String mes = (String) SelecionaMes.getSelectedItem();
                String ano = String.valueOf(SelecionaAno.getSelectedItem());
                anotacaocalendario.visualizarAnotacao(dia, mes, ano);
            }
        });

        d21.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (!"".equals(d21.getText())) {
                    d21.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                d21.setBorder(null);
            }

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                String dia = d21.getText();
                if (dia.length() > 1024) {
                    dia = dia.substring(0, 1023);
                }
                String mes = (String) SelecionaMes.getSelectedItem();
                String ano = String.valueOf(SelecionaAno.getSelectedItem());
                anotacaocalendario.visualizarAnotacao(dia, mes, ano);
            }
        });

        d22.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (!"".equals(d22.getText())) {
                    d22.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                d22.setBorder(null);
            }

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                String dia = d22.getText();
                if (dia.length() > 1024) {
                    dia = dia.substring(0, 1023);
                }
                String mes = (String) SelecionaMes.getSelectedItem();
                String ano = String.valueOf(SelecionaAno.getSelectedItem());
                anotacaocalendario.visualizarAnotacao(dia, mes, ano);
            }
        });

        d23.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (!"".equals(d23.getText())) {
                    d23.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                d23.setBorder(null);
            }

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                String dia = d23.getText();
                if (dia.length() > 1024) {
                    dia = dia.substring(0, 1023);
                }
                String mes = (String) SelecionaMes.getSelectedItem();
                String ano = String.valueOf(SelecionaAno.getSelectedItem());
                anotacaocalendario.visualizarAnotacao(dia, mes, ano);
            }
        });

        d24.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (!"".equals(d24.getText())) {
                    d24.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                d24.setBorder(null);
            }

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                String dia = d24.getText();
                if (dia.length() > 1024) {
                    dia = dia.substring(0, 1023);
                }
                String mes = (String) SelecionaMes.getSelectedItem();
                String ano = String.valueOf(SelecionaAno.getSelectedItem());
                anotacaocalendario.visualizarAnotacao(dia, mes, ano);
            }
        });

        d25.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (!"".equals(d25.getText())) {
                    d25.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                d25.setBorder(null);
            }

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                String dia = d25.getText();
                if (dia.length() > 1024) {
                    dia = dia.substring(0, 1023);
                }
                String mes = (String) SelecionaMes.getSelectedItem();
                String ano = String.valueOf(SelecionaAno.getSelectedItem());
                anotacaocalendario.visualizarAnotacao(dia, mes, ano);
            }
        });

        d26.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (!"".equals(d26.getText())) {
                    d26.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                d26.setBorder(null);
            }

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                String dia = d26.getText();
                if (dia.length() > 1024) {
                    dia = dia.substring(0, 1023);
                }
                String mes = (String) SelecionaMes.getSelectedItem();
                String ano = String.valueOf(SelecionaAno.getSelectedItem());
                anotacaocalendario.visualizarAnotacao(dia, mes, ano);
            }
        });

        d27.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (!"".equals(d27.getText())) {
                    d27.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                d27.setBorder(null);
            }

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                String dia = d27.getText();
                if (dia.length() > 1024) {
                    dia = dia.substring(0, 1023);
                }
                String mes = (String) SelecionaMes.getSelectedItem();
                String ano = String.valueOf(SelecionaAno.getSelectedItem());
                anotacaocalendario.visualizarAnotacao(dia, mes, ano);
            }
        });

        d28.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (!"".equals(d28.getText())) {
                    d28.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                d28.setBorder(null);
            }

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                String dia = d28.getText();
                if (dia.length() > 1024) {
                    dia = dia.substring(0, 1023);
                }
                String mes = (String) SelecionaMes.getSelectedItem();
                String ano = String.valueOf(SelecionaAno.getSelectedItem());
                anotacaocalendario.visualizarAnotacao(dia, mes, ano);
            }
        });

        d29.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (!"".equals(d29.getText())) {
                    d29.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                d29.setBorder(null);
            }

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                String dia = d29.getText();
                if (dia.length() > 1024) {
                    dia = dia.substring(0, 1023);
                }
                String mes = (String) SelecionaMes.getSelectedItem();
                String ano = String.valueOf(SelecionaAno.getSelectedItem());
                anotacaocalendario.visualizarAnotacao(dia, mes, ano);
            }
        });

        d30.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (!"".equals(d30.getText())) {
                    d30.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                d30.setBorder(null);
            }

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                String dia = d30.getText();
                if (dia.length() > 1024) {
                    dia = dia.substring(0, 1023);
                }
                String mes = (String) SelecionaMes.getSelectedItem();
                String ano = String.valueOf(SelecionaAno.getSelectedItem());
                anotacaocalendario.visualizarAnotacao(dia, mes, ano);
            }
        });

        d31.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (!"".equals(d31.getText())) {
                    d31.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                d31.setBorder(null);
            }

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                String dia = d31.getText();
                if (dia.length() > 1024) {
                    dia = dia.substring(0, 1023);
                }
                String mes = (String) SelecionaMes.getSelectedItem();
                String ano = String.valueOf(SelecionaAno.getSelectedItem());
                anotacaocalendario.visualizarAnotacao(dia, mes, ano);
            }
        });

        d32.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (!"".equals(d32.getText())) {
                    d32.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                d32.setBorder(null);
            }

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                String dia = d32.getText();
                if (dia.length() > 1024) {
                    dia = dia.substring(0, 1023);
                }
                String mes = (String) SelecionaMes.getSelectedItem();
                String ano = String.valueOf(SelecionaAno.getSelectedItem());
                anotacaocalendario.visualizarAnotacao(dia, mes, ano);
            }
        });

        d33.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (!"".equals(d33.getText())) {
                    d33.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                d33.setBorder(null);
            }

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                String dia = d33.getText();
                if (dia.length() > 1024) {
                    dia = dia.substring(0, 1023);
                }
                String mes = (String) SelecionaMes.getSelectedItem();
                String ano = String.valueOf(SelecionaAno.getSelectedItem());
                anotacaocalendario.visualizarAnotacao(dia, mes, ano);
            }
        });

        d34.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (!"".equals(d34.getText())) {
                    d34.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                d34.setBorder(null);
            }

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                String dia = d34.getText();
                if (dia.length() > 1024) {
                    dia = dia.substring(0, 1023);
                }
                String mes = (String) SelecionaMes.getSelectedItem();
                String ano = String.valueOf(SelecionaAno.getSelectedItem());
                anotacaocalendario.visualizarAnotacao(dia, mes, ano);
            }
        });

        d35.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (!"".equals(d35.getText())) {
                    d35.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                d35.setBorder(null);
            }

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                String dia = d35.getText();
                if (dia.length() > 1024) {
                    dia = dia.substring(0, 1023);
                }
                String mes = (String) SelecionaMes.getSelectedItem();
                String ano = String.valueOf(SelecionaAno.getSelectedItem());
                anotacaocalendario.visualizarAnotacao(dia, mes, ano);
            }
        });

        d36.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (!"".equals(d36.getText())) {
                    d36.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                d36.setBorder(null);
            }

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                String dia = d36.getText();
                if (dia.length() > 1024) {
                    dia = dia.substring(0, 1023);
                }
                String mes = (String) SelecionaMes.getSelectedItem();
                String ano = String.valueOf(SelecionaAno.getSelectedItem());
                anotacaocalendario.visualizarAnotacao(dia, mes, ano);
            }
        });

        d37.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (!"".equals(d37.getText())) {
                    d37.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                d37.setBorder(null);
            }

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                String dia = d37.getText();
                if (dia.length() > 1024) {
                    dia = dia.substring(0, 1023);
                }
                String mes = (String) SelecionaMes.getSelectedItem();
                String ano = String.valueOf(SelecionaAno.getSelectedItem());
                anotacaocalendario.visualizarAnotacao(dia, mes, ano);
            }
        });

        d38.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (!"".equals(d38.getText())) {
                    d38.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                d38.setBorder(null);
            }

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                String dia = d38.getText();
                if (dia.length() > 1024) {
                    dia = dia.substring(0, 1023);
                }
                String mes = (String) SelecionaMes.getSelectedItem();
                String ano = String.valueOf(SelecionaAno.getSelectedItem());
                anotacaocalendario.visualizarAnotacao(dia, mes, ano);
            }
        });

        d39.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (!"".equals(d39.getText())) {
                    d39.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                d39.setBorder(null);
            }

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                String dia = d39.getText();
                if (dia.length() > 1024) {
                    dia = dia.substring(0, 1023);
                }
                String mes = (String) SelecionaMes.getSelectedItem();
                String ano = String.valueOf(SelecionaAno.getSelectedItem());
                anotacaocalendario.visualizarAnotacao(dia, mes, ano);
            }
        });

        d40.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (!"".equals(d40.getText())) {
                    d40.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                d40.setBorder(null);
            }

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                String dia = d40.getText();
                if (dia.length() > 1024) {
                    dia = dia.substring(0, 1023);
                }
                String mes = (String) SelecionaMes.getSelectedItem();
                String ano = String.valueOf(SelecionaAno.getSelectedItem());
                anotacaocalendario.visualizarAnotacao(dia, mes, ano);
            }
        });

        d41.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (!"".equals(d41.getText())) {
                    d41.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                d41.setBorder(null);
            }

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                String dia = d41.getText();
                if (dia.length() > 1024) {
                    dia = dia.substring(0, 1023);
                }
                String mes = (String) SelecionaMes.getSelectedItem();
                String ano = String.valueOf(SelecionaAno.getSelectedItem());
                anotacaocalendario.visualizarAnotacao(dia, mes, ano);
            }
        });

        d42.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (!"".equals(d42.getText())) {
                    d42.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                d42.setBorder(null);
            }

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                String dia = d42.getText();
                if (dia.length() > 1024) {
                    dia = dia.substring(0, 1023);
                }
                String mes = (String) SelecionaMes.getSelectedItem();
                String ano = String.valueOf(SelecionaAno.getSelectedItem());
                anotacaocalendario.visualizarAnotacao(dia, mes, ano);
            }
        });
    }

    public static void checarDias() {
        String mes = (String) SelecionaMes.getSelectedItem();
        String ano = String.valueOf(SelecionaAno.getSelectedItem());
        for (javax.swing.JLabel l : jldias) {
            if (JSONCalendario.getMensagem(l.getText(), mes, ano) == null) {
                l.setBackground(new Color(255, 255, 255));
            } else {
                l.setBackground(new Color(31, 208, 222));
            }
        }
    }
}
