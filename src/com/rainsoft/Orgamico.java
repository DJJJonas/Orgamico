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
    static int anoFixo = 0;
    static int mesFixo = 0;
    static int diaFixo = 0;
    static int anoAltera = 0;
    static int mesAltera = 0;
    static int diaAltera = 0;
    static int valorselecao = 0;

    // Creates new form Orgamica
    public Orgamico() {
        initComponents();
        jldias = new javax.swing.JLabel[] { d1, d2, d3, d4, d5, d6, d7, d8, d9, d10, d11, d12, d13, d14, d15, d16, d17,
                d18, d19, d20, d21, d22, d23, d24, d25, d26, d27, d28, d29, d30, d31, d32, d33, d34, d35, d36, d37, d38,
                d39, d40, d41, d42 };
        iniciacalendario();
        organizaCalendario();
        calendarioEvt();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
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
        calcsubtrai1 = new javax.swing.JButton();
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
        jLabel1 = new javax.swing.JLabel();
        jButtonGerenciarLembrete = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jLabelLembrete = new javax.swing.JLabel();
        jLabelHora = new javax.swing.JLabel();
        jLabelMaterias = new javax.swing.JLabel();
        jLabelAnotacoes = new javax.swing.JLabel();
        selecionaMes = new javax.swing.JComboBox<>();
        selecionaAno = new javax.swing.JComboBox<>();
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
                calcAddButtonTextActionPerformed(evt);
            }
        });
        jPanelMenuBarra.add(calc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 510, 40, 30));

        calc2.setText("2");
        calc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcAddButtonTextActionPerformed(evt);
            }
        });
        jPanelMenuBarra.add(calc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 510, 40, 30));

        calc3.setText("3");
        calc3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcAddButtonTextActionPerformed(evt);
            }
        });
        jPanelMenuBarra.add(calc3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 510, 40, 30));

        calc4.setText("4");
        calc4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcAddButtonTextActionPerformed(evt);
            }
        });
        jPanelMenuBarra.add(calc4, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 540, 40, 30));

        calc5.setText("5");
        calc5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcAddButtonTextActionPerformed(evt);
            }
        });
        jPanelMenuBarra.add(calc5, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 540, 40, 30));

        calc6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        calc6.setText("6");
        calc6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcAddButtonTextActionPerformed(evt);
            }
        });
        jPanelMenuBarra.add(calc6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 540, 40, 30));

        calc7.setText("7");
        calc7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcAddButtonTextActionPerformed(evt);
            }
        });
        jPanelMenuBarra.add(calc7, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 570, 40, 30));

        calc8.setText("8");
        calc8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcAddButtonTextActionPerformed(evt);
            }
        });
        jPanelMenuBarra.add(calc8, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 570, 40, 30));

        calc9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        calc9.setText("9");
        calc9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcAddButtonTextActionPerformed(evt);
            }
        });
        jPanelMenuBarra.add(calc9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 570, 40, 30));

        calc0.setText("0");
        calc0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcAddButtonTextActionPerformed(evt);
            }
        });
        jPanelMenuBarra.add(calc0, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 600, 40, 30));

        calcsoma.setText("+");
        calcsoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcAddButtonTextActionPerformed(evt);
            }
        });
        jPanelMenuBarra.add(calcsoma, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 510, 50, 40));

        calcsubtrai1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        calcsubtrai1.setText(".");
        calcsubtrai1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcAddButtonTextActionPerformed(evt);
            }
        });
        jPanelMenuBarra.add(calcsubtrai1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 590, 50, 40));

        calcsubtrai.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        calcsubtrai.setText("-");
        calcsubtrai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcAddButtonTextActionPerformed(evt);
            }
        });
        jPanelMenuBarra.add(calcsubtrai, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 550, 50, 40));

        calcmultiplica.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        calcmultiplica.setText("*");
        calcmultiplica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcAddButtonTextActionPerformed(evt);
            }
        });
        jPanelMenuBarra.add(calcmultiplica, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 510, 50, 40));

        calcdivide.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        calcdivide.setText("/");
        calcdivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcAddButtonTextActionPerformed(evt);
            }
        });
        jPanelMenuBarra.add(calcdivide, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 550, 50, 40));

        calcabrepar.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        calcabrepar.setText("(");
        calcabrepar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcAddButtonTextActionPerformed(evt);
            }
        });
        jPanelMenuBarra.add(calcabrepar, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 600, 40, 30));

        calcfechapar.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        calcfechapar.setText(")");
        calcfechapar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcAddButtonTextActionPerformed(evt);
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
        jPanelMenuBarra.add(calcigual, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 590, 90, 40));

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
        jButtonAddMateria
                .setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/materia.png"))); // NOI18N
        jButtonAddMateria.setToolTipText("Nova Matéria");
        jButtonAddMateria.setBorder(null);
        jButtonAddMateria.setContentAreaFilled(false);
        jButtonAddMateria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAddMateria.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButtonAddMateria.setFocusCycleRoot(true);
        jButtonAddMateria.setFocusable(false);
        jButtonAddMateria.setVerifyInputWhenFocusTarget(false);
        jButtonAddMateria.addActionListener(this::jButtonAddMateriaActionPerformed);
        jPanelMenuBarra.add(jButtonAddMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 40, 40));

        jButtonCriarAnotacao.setBackground(new java.awt.Color(0, 153, 255));
        jButtonCriarAnotacao
                .setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/notas.png"))); // NOI18N
        jButtonCriarAnotacao.setToolTipText("Nova Anotação");
        jButtonCriarAnotacao.setBorder(null);
        jButtonCriarAnotacao.setContentAreaFilled(false);
        jButtonCriarAnotacao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCriarAnotacao.addActionListener(this::jButtonCriarAnotacaoActionPerformed);
        jPanelMenuBarra.add(jButtonCriarAnotacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(851, 30, 40, 40));

        jScrollPane1.setBackground(new java.awt.Color(249, 249, 249));
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jListMaterias.setBackground(new java.awt.Color(249, 249, 249));
        jListMaterias.setModel(g.getMaterias());
        jListMaterias.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jListMaterias.setCellRenderer(new RendererMaterias());
        jListMaterias.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jListMaterias.setSelectedIndex(1);
        jListMaterias.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListMateriasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jListMaterias);
        jScrollPane1.setBorder(null);

        jPanelMenuBarra.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 300, 580));

        String arialFont = "Arial Rounded MT Bold";
        jLabel1.setFont(new java.awt.Font(arialFont, 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(73, 73, 73));
        jLabel1.setText("Lembretes");
        jPanelMenuBarra.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 30, -1, -1));

        jButtonGerenciarLembrete
                .setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/botaog.png"))); // NOI18N
        jButtonGerenciarLembrete.setToolTipText("Gerenciar Lembretes");
        jButtonGerenciarLembrete.setBorder(null);
        jButtonGerenciarLembrete.setContentAreaFilled(false);
        jButtonGerenciarLembrete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonGerenciarLembrete.addActionListener(this::jButtonGerenciarLembreteActionPerformed);
        jPanelMenuBarra.add(jButtonGerenciarLembrete,
                new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 100, 150, 50));

        jScrollPane2.setBackground(new java.awt.Color(249, 249, 249));
        jScrollPane2.setBorder(null);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jListAnotacoes.setBackground(new java.awt.Color(249, 249, 249));
        jListAnotacoes.setModel(g.getModelAnotacoes());
        jListAnotacoes.setCellRenderer(new RendererAnotacoes());
        jListAnotacoes.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListAnotacoesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jListAnotacoes);

        jPanelMenuBarra.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 72, 550, 580));

        jLabelLembrete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/lembretes.png"))); // NOI18N
        jLabelLembrete.setToolTipText("");
        jPanelMenuBarra.add(jLabelLembrete, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, -1, -1));

        jLabelHora
                .setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/AbaCalculadora.png"))); // NOI18N
        jLabelHora.setToolTipText("");
        jPanelMenuBarra.add(jLabelHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 450, -1, -1));

        jLabelMaterias.setBackground(new java.awt.Color(0, 0, 0));
        jLabelMaterias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/Materias.png"))); // NOI18N
        jPanelMenuBarra.add(jLabelMaterias, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 320, -1));

        jLabelAnotacoes
                .setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/Anotações.png"))); // NOI18N
        jPanelMenuBarra.add(jLabelAnotacoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        selecionaMes.setFont(new java.awt.Font(arialFont, 0, 12)); // NOI18N
        selecionaMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Janeiro", "Fevereiro", "Março",
                "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));
        selecionaMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionaMesActionPerformed(evt);
            }
        });
        jPanelMenuBarra.add(selecionaMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 230, 130, 30));

        selecionaAno.setEditable(true);
        selecionaAno.setFont(new java.awt.Font(arialFont, 0, 12)); // NOI18N
        selecionaAno.addActionListener(Orgamico::selecionaAnoActionPerformed);
        jPanelMenuBarra.add(selecionaAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 230, 120, 30));

        jSpinner1.addChangeListener(Orgamico::jSpinner1StateChanged);
        jPanelMenuBarra.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 230, 20, 30));

        jDom.setBackground(new java.awt.Color(255, 255, 255));
        jDom.setFont(new java.awt.Font(arialFont, 0, 13)); // NOI18N
        jDom.setForeground(new java.awt.Color(45, 43, 43));
        jDom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jDom.setText("Dom");
        jPanelMenuBarra.add(jDom, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 260, 30, -1));

        d8.setBackground(new java.awt.Color(255, 255, 255));
        d8.setFont(new java.awt.Font(arialFont, 0, 14)); // NOI18N
        d8.setForeground(new java.awt.Color(255, 0, 0));
        d8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d8.setText("0");
        jPanelMenuBarra.add(d8, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 310, 30, -1));

        d15.setBackground(new java.awt.Color(255, 255, 255));
        d15.setFont(new java.awt.Font(arialFont, 0, 14)); // NOI18N
        d15.setForeground(new java.awt.Color(255, 0, 0));
        d15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d15.setText("0");
        jPanelMenuBarra.add(d15, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 330, 30, -1));

        d36.setBackground(new java.awt.Color(255, 255, 255));
        d36.setFont(new java.awt.Font(arialFont, 0, 14)); // NOI18N
        d36.setForeground(new java.awt.Color(255, 0, 0));
        d36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d36.setText("0");
        jPanelMenuBarra.add(d36, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 390, 30, -1));

        d9.setBackground(new java.awt.Color(255, 255, 255));
        d9.setFont(new java.awt.Font(arialFont, 0, 14)); // NOI18N
        d9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d9.setText("0");
        jPanelMenuBarra.add(d9, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 310, 30, -1));

        jSeg.setBackground(new java.awt.Color(255, 255, 255));
        jSeg.setFont(new java.awt.Font(arialFont, 0, 13)); // NOI18N
        jSeg.setForeground(new java.awt.Color(45, 43, 43));
        jSeg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jSeg.setText("Seg");
        jPanelMenuBarra.add(jSeg, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 260, 30, -1));

        d1.setBackground(new java.awt.Color(255, 255, 255));
        d1.setFont(new java.awt.Font(arialFont, 0, 14)); // NOI18N
        d1.setForeground(new java.awt.Color(255, 0, 0));
        d1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d1.setText("0");
        jPanelMenuBarra.add(d1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 290, 30, -1));

        d2.setBackground(new java.awt.Color(255, 255, 255));
        d2.setFont(new java.awt.Font(arialFont, 0, 14)); // NOI18N
        d2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d2.setText("0");
        jPanelMenuBarra.add(d2, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 290, 30, -1));

        d29.setBackground(new java.awt.Color(255, 255, 255));
        d29.setFont(new java.awt.Font(arialFont, 0, 14)); // NOI18N
        d29.setForeground(new java.awt.Color(255, 0, 0));
        d29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d29.setText("0");
        jPanelMenuBarra.add(d29, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 370, 30, -1));

        d22.setBackground(new java.awt.Color(255, 255, 255));
        d22.setFont(new java.awt.Font(arialFont, 0, 14)); // NOI18N
        d22.setForeground(new java.awt.Color(255, 0, 0));
        d22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d22.setText("0");
        jPanelMenuBarra.add(d22, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 350, 30, -1));

        d37.setBackground(new java.awt.Color(255, 255, 255));
        d37.setFont(new java.awt.Font(arialFont, 0, 14)); // NOI18N
        d37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d37.setText("0");
        jPanelMenuBarra.add(d37, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 390, 30, -1));

        jTer.setBackground(new java.awt.Color(255, 255, 255));
        jTer.setFont(new java.awt.Font(arialFont, 0, 13)); // NOI18N
        jTer.setForeground(new java.awt.Color(45, 43, 43));
        jTer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTer.setText("Ter");
        jPanelMenuBarra.add(jTer, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 260, 30, -1));

        d3.setBackground(new java.awt.Color(255, 255, 255));
        d3.setFont(new java.awt.Font(arialFont, 0, 14)); // NOI18N
        d3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d3.setText("0");
        jPanelMenuBarra.add(d3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 290, 30, -1));

        d10.setBackground(new java.awt.Color(255, 255, 255));
        d10.setFont(new java.awt.Font(arialFont, 0, 14)); // NOI18N
        d10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d10.setText("0");
        jPanelMenuBarra.add(d10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 310, 30, -1));

        d16.setBackground(new java.awt.Color(255, 255, 255));
        d16.setFont(new java.awt.Font(arialFont, 0, 14)); // NOI18N
        d16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d16.setText("0");
        jPanelMenuBarra.add(d16, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 330, 30, -1));

        d23.setBackground(new java.awt.Color(255, 255, 255));
        d23.setFont(new java.awt.Font(arialFont, 0, 14)); // NOI18N
        d23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d23.setText("0");
        jPanelMenuBarra.add(d23, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 350, 30, -1));

        d30.setBackground(new java.awt.Color(255, 255, 255));
        d30.setFont(new java.awt.Font(arialFont, 0, 14)); // NOI18N
        d30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d30.setText("0");
        jPanelMenuBarra.add(d30, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 370, 30, -1));

        d17.setBackground(new java.awt.Color(255, 255, 255));
        d17.setFont(new java.awt.Font(arialFont, 0, 14)); // NOI18N
        d17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d17.setText("0");
        jPanelMenuBarra.add(d17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 330, 30, -1));

        d11.setBackground(new java.awt.Color(255, 255, 255));
        d11.setFont(new java.awt.Font(arialFont, 0, 14)); // NOI18N
        d11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d11.setText("0");
        jPanelMenuBarra.add(d11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 310, 30, -1));

        d39.setBackground(new java.awt.Color(255, 255, 255));
        d39.setFont(new java.awt.Font(arialFont, 0, 14)); // NOI18N
        d39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d39.setText("0");
        jPanelMenuBarra.add(d39, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 390, 30, -1));

        d32.setBackground(new java.awt.Color(255, 255, 255));
        d32.setFont(new java.awt.Font(arialFont, 0, 14)); // NOI18N
        d32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d32.setText("0");
        jPanelMenuBarra.add(d32, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 370, 30, -1));

        d31.setBackground(new java.awt.Color(255, 255, 255));
        d31.setFont(new java.awt.Font(arialFont, 0, 14)); // NOI18N
        d31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d31.setText("0");
        jPanelMenuBarra.add(d31, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 370, 30, -1));

        d18.setBackground(new java.awt.Color(255, 255, 255));
        d18.setFont(new java.awt.Font(arialFont, 0, 14)); // NOI18N
        d18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d18.setText("0");
        jPanelMenuBarra.add(d18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 330, 30, -1));

        jQui.setBackground(new java.awt.Color(255, 255, 255));
        jQui.setFont(new java.awt.Font(arialFont, 0, 13)); // NOI18N
        jQui.setForeground(new java.awt.Color(45, 43, 43));
        jQui.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jQui.setText("Qui");
        jPanelMenuBarra.add(jQui, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 260, 30, -1));

        d40.setBackground(new java.awt.Color(255, 255, 255));
        d40.setFont(new java.awt.Font(arialFont, 0, 14)); // NOI18N
        d40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d40.setText("0");
        jPanelMenuBarra.add(d40, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 390, 30, -1));

        jQua.setBackground(new java.awt.Color(255, 255, 255));
        jQua.setFont(new java.awt.Font(arialFont, 0, 13)); // NOI18N
        jQua.setForeground(new java.awt.Color(45, 43, 43));
        jQua.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jQua.setText("Qua");
        jPanelMenuBarra.add(jQua, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 260, 30, -1));

        d24.setBackground(new java.awt.Color(255, 255, 255));
        d24.setFont(new java.awt.Font(arialFont, 0, 14)); // NOI18N
        d24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d24.setText("0");
        jPanelMenuBarra.add(d24, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 350, 30, -1));

        d25.setBackground(new java.awt.Color(255, 255, 255));
        d25.setFont(new java.awt.Font(arialFont, 0, 14)); // NOI18N
        d25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d25.setText("0");
        jPanelMenuBarra.add(d25, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 350, 30, -1));

        d4.setBackground(new java.awt.Color(255, 255, 255));
        d4.setFont(new java.awt.Font(arialFont, 0, 14)); // NOI18N
        d4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d4.setText("0");
        jPanelMenuBarra.add(d4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 290, 30, -1));

        d38.setBackground(new java.awt.Color(255, 255, 255));
        d38.setFont(new java.awt.Font(arialFont, 0, 14)); // NOI18N
        d38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d38.setText("0");
        jPanelMenuBarra.add(d38, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 390, 30, -1));

        d26.setBackground(new java.awt.Color(255, 255, 255));
        d26.setFont(new java.awt.Font(arialFont, 0, 14)); // NOI18N
        d26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d26.setText("0");
        jPanelMenuBarra.add(d26, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 350, 30, -1));

        d5.setBackground(new java.awt.Color(255, 255, 255));
        d5.setFont(new java.awt.Font(arialFont, 0, 14)); // NOI18N
        d5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d5.setText("0");
        jPanelMenuBarra.add(d5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 290, 30, -1));

        d33.setBackground(new java.awt.Color(255, 255, 255));
        d33.setFont(new java.awt.Font(arialFont, 0, 14)); // NOI18N
        d33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d33.setText("0");
        jPanelMenuBarra.add(d33, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 370, 30, -1));

        d21.setBackground(new java.awt.Color(255, 255, 255));
        d21.setFont(new java.awt.Font(arialFont, 0, 14)); // NOI18N
        d21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d21.setText("0");
        jPanelMenuBarra.add(d21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 330, 30, -1));

        jSex.setBackground(new java.awt.Color(255, 255, 255));
        jSex.setFont(new java.awt.Font(arialFont, 0, 13)); // NOI18N
        jSex.setForeground(new java.awt.Color(45, 43, 43));
        jSex.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jSex.setText("Sex");
        jPanelMenuBarra.add(jSex, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 260, 30, -1));

        d19.setBackground(new java.awt.Color(255, 255, 255));
        d19.setFont(new java.awt.Font(arialFont, 0, 14)); // NOI18N
        d19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d19.setText("0");
        jPanelMenuBarra.add(d19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 330, 30, -1));

        d35.setBackground(new java.awt.Color(255, 255, 255));
        d35.setFont(new java.awt.Font(arialFont, 0, 14)); // NOI18N
        d35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d35.setText("0");
        jPanelMenuBarra.add(d35, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 370, 30, -1));

        d14.setBackground(new java.awt.Color(255, 255, 255));
        d14.setFont(new java.awt.Font(arialFont, 0, 14)); // NOI18N
        d14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d14.setText("0");
        jPanelMenuBarra.add(d14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 310, 30, -1));

        jSab.setBackground(new java.awt.Color(255, 255, 255));
        jSab.setFont(new java.awt.Font(arialFont, 0, 13)); // NOI18N
        jSab.setForeground(new java.awt.Color(45, 43, 43));
        jSab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jSab.setText("Sáb");
        jPanelMenuBarra.add(jSab, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 260, 30, -1));

        d41.setBackground(new java.awt.Color(255, 255, 255));
        d41.setFont(new java.awt.Font(arialFont, 0, 14)); // NOI18N
        d41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d41.setText("0");
        jPanelMenuBarra.add(d41, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 390, 30, -1));

        d13.setBackground(new java.awt.Color(255, 255, 255));
        d13.setFont(new java.awt.Font(arialFont, 0, 14)); // NOI18N
        d13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d13.setText("0");
        jPanelMenuBarra.add(d13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 310, 30, -1));

        d28.setBackground(new java.awt.Color(255, 255, 255));
        d28.setFont(new java.awt.Font(arialFont, 0, 14)); // NOI18N
        d28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d28.setText("0");
        jPanelMenuBarra.add(d28, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 350, 30, -1));

        d34.setBackground(new java.awt.Color(255, 255, 255));
        d34.setFont(new java.awt.Font(arialFont, 0, 14)); // NOI18N
        d34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d34.setText("0");
        jPanelMenuBarra.add(d34, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 370, 30, -1));

        d27.setBackground(new java.awt.Color(255, 255, 255));
        d27.setFont(new java.awt.Font(arialFont, 0, 14)); // NOI18N
        d27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d27.setText("0");
        jPanelMenuBarra.add(d27, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 350, 30, -1));

        d7.setBackground(new java.awt.Color(255, 255, 255));
        d7.setFont(new java.awt.Font(arialFont, 0, 14)); // NOI18N
        d7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d7.setText("0");
        jPanelMenuBarra.add(d7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 290, 30, -1));

        d42.setBackground(new java.awt.Color(255, 255, 255));
        d42.setFont(new java.awt.Font(arialFont, 0, 14)); // NOI18N
        d42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d42.setText("0");
        jPanelMenuBarra.add(d42, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 390, 30, -1));

        d6.setBackground(new java.awt.Color(255, 255, 255));
        d6.setFont(new java.awt.Font(arialFont, 0, 14)); // NOI18N
        d6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d6.setText("0");
        jPanelMenuBarra.add(d6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 290, 30, -1));

        d12.setBackground(new java.awt.Color(255, 255, 255));
        d12.setFont(new java.awt.Font(arialFont, 0, 14)); // NOI18N
        d12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d12.setText("0");
        jPanelMenuBarra.add(d12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 310, 30, -1));

        d20.setBackground(new java.awt.Color(255, 255, 255));
        d20.setFont(new java.awt.Font(arialFont, 0, 14)); // NOI18N
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

    private void jButtonGerenciarLembreteActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonGerenciarLembreteActionPerformed
        gerenciar.setVisible(true);
    }// GEN-LAST:event_jButtonGerenciarLembreteActionPerformed

    private static void selecionaMesActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_SelecionaMesActionPerformed
        diaAltera = diaFixo;
        organizaCalendario();
    }// GEN-LAST:event_SelecionaMesActionPerformed

    private static void selecionaAnoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_SelecionaAnoActionPerformed
        try {
            diaAltera = diaFixo;
            organizaCalendario();

        } catch (Exception e) {
            selecionaAno.setSelectedItem(anoFixo);
        }
    }// GEN-LAST:event_SelecionaAnoActionPerformed

    private static void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_jSpinner1StateChanged
        valorselecao = Integer.parseInt(jSpinner1.getValue().toString());
        int x = selecionaMes.getSelectedIndex();
        int ano = Integer.parseInt(selecionaAno.getSelectedItem().toString());

        if (valorselecao == -1) {
            if (selecionaMes.getSelectedIndex() != 11) {
                selecionaMes.setSelectedIndex(x + 1);
            } else {
                selecionaMes.setSelectedIndex(0);
                ano = ano + 1;
                selecionaAno.setSelectedItem(ano);
            }
        }

        if (valorselecao == 1) {
            if (selecionaMes.getSelectedIndex() != 0) {
                selecionaMes.setSelectedIndex(x - 1);
            } else {
                selecionaMes.setSelectedIndex(11);
                ano = ano - 1;
                selecionaAno.setSelectedItem(ano);
            }
        }
        jSpinner1.setValue(0);
    }// GEN-LAST:event_jSpinner1StateChanged

    private void calcAddButtonTextActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_calc1ActionPerformed
        String text = ((javax.swing.JButton) evt.getSource()).getText();
        calculo.setText(calculo.getText() + text);
    }// GEN-LAST:event_calc1ActionPerformed

    private void calcigualActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_calcigualActionPerformed
        try {
            String resultado = "" + new DoubleEvaluator().evaluate(calculo.getText());
            if (resultado.equals("Infinity"))
                resultado = "infinito";
            else if (resultado.equals("NaN"))
                resultado = "erro";
            calculo.setText(resultado);
        } catch (Exception e) {
            calculo.setText("erro");
        }
    }// GEN-LAST:event_calcigualActionPerformed

    private void calclimparActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_calclimparActionPerformed
        calculo.setText("");
    }// GEN-LAST:event_calclimparActionPerformed

    private void calcapagarultimoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_calcapagarultimoActionPerformed
        if (calculo.getText().length() == 0)
            return;
        if (calculo.getText().length() == 1) {
            calculo.setText("");
            return;
        }
        calculo.setText(calculo.getText().substring(0, calculo.getText().length() - 1));
    }// GEN-LAST:event_calcapagarultimoActionPerformed

    // FUNÇÃO PARA O BOTÃO DE ADICIONAR MATÉRIA
    // Ao clicar, a tela de nova matéria ficará visível.
    private void jButtonAddMateriaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonAddMateriaActionPerformed
        addMateriaPanel.setVisible(true);
    }

    private void jButtonCriarAnotacaoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonCriarAnotacaoActionPerformed
        addAnotacao.jTextAnotacao.setText("");
        addAnotacao.setVisible(true);
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

    public static void main(String[] args) {
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
    private static javax.swing.JComboBox<String> selecionaAno;
    private static javax.swing.JComboBox<String> selecionaMes;
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
    private javax.swing.JButton calcsubtrai1;
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
    private javax.swing.JButton jButtonAddMateria;
    private javax.swing.JButton jButtonCriarAnotacao;
    private javax.swing.JButton jButtonGerenciarLembrete;
    private static javax.swing.JLabel jDom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelAnotacoes;
    private javax.swing.JLabel jLabelHora;
    private javax.swing.JLabel jLabelLembrete;
    private javax.swing.JLabel jLabelMaterias;
    public static final javax.swing.JList<String> jListAnotacoes = new javax.swing.JList<>();
    public static final javax.swing.JList<Materia> jListMaterias = new javax.swing.JList<>();
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

    // Inicializacao do calendario
    public void iniciacalendario() {
        // {Jonas}: Cria o arquivo JSON caso não exista
        JSONCalendario.criarJSONCalendario();

        SimpleDateFormat ano = new SimpleDateFormat("yyyy");
        SimpleDateFormat mes = new SimpleDateFormat("MM");
        SimpleDateFormat dia = new SimpleDateFormat("dd");

        anoFixo = Integer.parseInt(ano.format(new Date()));
        mesFixo = Integer.parseInt(mes.format(new Date()));
        diaFixo = Integer.parseInt(dia.format(new Date()));

        // Identificar o ano
        int anoMaximo = anoFixo + 50;
        for (int i = 2000; i < anoMaximo; i++) {
            selecionaAno.addItem(String.valueOf(i));
        }
        selecionaAno.setSelectedItem(anoFixo);

        switch (mesFixo) {
            case 1:
                selecionaMes.setSelectedIndex(0);
                break;
            case 2:
                selecionaMes.setSelectedIndex(1);
                break;
            case 3:
                selecionaMes.setSelectedIndex(2);
                break;
            case 4:
                selecionaMes.setSelectedIndex(3);
                break;
            case 5:
                selecionaMes.setSelectedIndex(4);
                break;
            case 6:
                selecionaMes.setSelectedIndex(5);
                break;
            case 7:
                selecionaMes.setSelectedIndex(6);
                break;
            case 8:
                selecionaMes.setSelectedIndex(7);
                break;
            case 9:
                selecionaMes.setSelectedIndex(8);
                break;
            case 10:
                selecionaMes.setSelectedIndex(9);
                break;
            case 11:
                selecionaMes.setSelectedIndex(10);
                break;
            case 12:
                selecionaMes.setSelectedIndex(11);
                break;
            default:
                break;
        }
    }

    // Organização dos dias do Calendário
    /**
     *
     */
    public static void organizaCalendario() {
        
        for (javax.swing.JLabel l : jldias)
            l.setText("");
        
        diaAltera = diaFixo;
        mesAltera = selecionaMes.getSelectedIndex();
        anoAltera = Integer.parseInt(selecionaAno.getSelectedItem().toString());

        int totalDiaMes = 0;
        if (mesAltera == 0) {
            totalDiaMes = 31;
        } else if (mesAltera == 1) {
            int resultado = (anoAltera % 4);
            if (resultado == 0) {
                totalDiaMes = 29; // o ano é bissexto
            } else {
                totalDiaMes = 28; // o ano não é bissexto 
            }
        } else if (mesFixo == 3) {
            totalDiaMes = 31;
        } else if (mesFixo == 4) {
            totalDiaMes = 30;
        } else if (mesFixo == 5) {
            totalDiaMes = 31;
        } else if (mesFixo == 6) {
            totalDiaMes = 30;
        } else if (mesFixo == 7) {
            totalDiaMes = 31;
        } else if (mesFixo == 8) {
            totalDiaMes = 31;
        } else if (mesFixo == 9) {
            totalDiaMes = 30;
        } else if (mesFixo == 10) {
            totalDiaMes = 31;
        } else if (mesFixo == 11) {
            totalDiaMes = 30;
        } else if (mesFixo == 12) {
            totalDiaMes = 31;
        }

//              Mostrar em qual dia da Semana será o dia 1 do mês
        Calendar c = Calendar.getInstance();
        c.set(anoAltera, mesAltera, 1);
        int setaDia = 0;

        int semana = c.get(Calendar.DAY_OF_WEEK);
        setaDia = semana;

//        setar os dias da semana
        for (int i = 1; i <= totalDiaMes; i++) {
            switch (setaDia) {
                case 1:
                    d1.setText("" + i);
                    if (i == diaFixo && mesAltera == mesFixo - 1 && anoAltera == anoFixo) {
                        d1.setForeground(Color.green);
                    } else {
                        d1.setForeground(Color.red);
                    }
                    break;

                case 2:
                    d2.setText("" + i);
                    if (i == diaFixo && mesAltera == mesFixo - 1 && anoAltera == anoFixo) {
                        d2.setForeground(Color.red);
                    } else {
                        d2.setForeground(Color.black);
                    }
                    break;

                case 3:
                    d3.setText("" + i);
                    if (i == diaFixo && mesAltera == mesFixo - 1 && anoAltera == anoFixo) {
                        d3.setForeground(Color.red);
                    } else {
                        d3.setForeground(Color.black);
                    }
                    break;

                case 4:
                    d4.setText("" + i);
                    if (i == diaFixo && mesAltera == mesFixo - 1 && anoAltera == anoFixo) {
                        d4.setForeground(Color.red);
                    } else {
                        d4.setForeground(Color.black);
                    }
                    break;

                case 5:
                    d5.setText("" + i);
                    if (i == diaFixo && mesAltera == mesFixo - 1 && anoAltera == anoFixo) {
                        d5.setForeground(Color.red);
                    } else {
                        d5.setForeground(Color.black);
                    }
                    break;

                case 6:
                    d6.setText("" + i);
                    if (i == diaFixo && mesAltera == mesFixo - 1 && anoAltera == anoFixo) {
                        d6.setForeground(Color.red);
                    } else {
                        d6.setForeground(Color.black);
                    }
                    break;

                case 7:
                    d7.setText("" + i);
                    if (i == diaFixo && mesAltera == mesFixo - 1 && anoAltera == anoFixo) {
                        d7.setForeground(Color.red);
                    } else {
                        d7.setForeground(Color.black);
                    }
                    break;

                case 8:
                    d8.setText("" + i);
                    if (i == diaFixo && mesAltera == mesFixo - 1 && anoAltera == anoFixo) {
                        d8.setForeground(Color.green);
                    } else {
                        d8.setForeground(Color.red);
                    }
                    break;

                case 9:
                    d9.setText("" + i);
                    if (i == diaFixo && mesAltera == mesFixo - 1 && anoAltera == anoFixo) {
                        d9.setForeground(Color.red);
                    } else {
                        d9.setForeground(Color.black);
                    }
                    break;

                case 10:
                    d10.setText("" + i);
                    if (i == diaFixo && mesAltera == mesFixo - 1 && anoAltera == anoFixo) {
                        d10.setForeground(Color.red);
                    } else {
                        d10.setForeground(Color.black);
                    }
                    break;

                case 11:
                    d11.setText("" + i);
                    if (i == diaFixo && mesAltera == mesFixo - 1 && anoAltera == anoFixo) {
                        d11.setForeground(Color.red);
                    } else {
                        d11.setForeground(Color.black);
                    }
                    break;

                case 12:
                    d12.setText("" + i);
                    if (i == diaFixo && mesAltera == mesFixo - 1 && anoAltera == anoFixo) {
                        d12.setForeground(Color.red);
                    } else {
                        d12.setForeground(Color.black);
                    }
                    break;

                case 13:
                    d13.setText("" + i);
                    if (i == diaFixo && mesAltera == mesFixo - 1 && anoAltera == anoFixo) {
                        d13.setForeground(Color.red);
                    } else {
                        d13.setForeground(Color.black);
                    }
                    break;

                case 14:
                    d14.setText("" + i);
                    if (i == diaFixo && mesAltera == mesFixo - 1 && anoAltera == anoFixo) {
                        d14.setForeground(Color.red);
                    } else {
                        d14.setForeground(Color.black);
                    }
                    break;

                case 15:
                    d15.setText("" + i);
                    if (i == diaFixo && mesAltera == mesFixo - 1 && anoAltera == anoFixo) {
                        d15.setForeground(Color.green);
                    } else {
                        d15.setForeground(Color.red);
                    }
                    break;

                case 16:
                    d16.setText("" + i);
                    if (i == diaFixo && mesAltera == mesFixo - 1 && anoAltera == anoFixo) {
                        d16.setForeground(Color.red);
                    } else {
                        d16.setForeground(Color.black);
                    }
                    break;

                case 17:
                    d17.setText("" + i);
                    if (i == diaFixo && mesAltera == mesFixo - 1 && anoAltera == anoFixo) {
                        d17.setForeground(Color.red);
                    } else {
                        d17.setForeground(Color.black);
                    }
                    break;

                case 18:
                    d18.setText("" + i);
                    if (i == diaFixo && mesAltera == mesFixo - 1 && anoAltera == anoFixo) {
                        d18.setForeground(Color.red);
                    } else {
                        d18.setForeground(Color.black);
                    }
                    break;

                case 19:
                    d19.setText("" + i);
                    if (i == diaFixo && mesAltera == mesFixo - 1 && anoAltera == anoFixo) {
                        d19.setForeground(Color.red);
                    } else {
                        d19.setForeground(Color.black);
                    }
                    break;

                case 20:
                    d20.setText("" + i);
                    if (i == diaFixo && mesAltera == mesFixo - 1 && anoAltera == anoFixo) {
                        d20.setForeground(Color.red);
                    } else {
                        d20.setForeground(Color.black);
                    }
                    break;
                case 21:
                    d21.setText("" + i);
                    if (i == diaFixo && mesAltera == mesFixo - 1 && anoAltera == anoFixo) {
                        d21.setForeground(Color.red);
                    } else {
                        d21.setForeground(Color.black);
                    }
                    break;

                case 22:
                    d22.setText("" + i);
                    if (i == diaFixo && mesAltera == mesFixo - 1 && anoAltera == anoFixo) {
                        d22.setForeground(Color.green);
                    } else {
                        d22.setForeground(Color.red);
                    }
                    break;

                case 23:
                    d23.setText("" + i);
                    if (i == diaFixo && mesAltera == mesFixo - 1 && anoAltera == anoFixo) {
                        d23.setForeground(Color.red);
                    } else {
                        d23.setForeground(Color.black);
                    }
                    break;

                case 24:
                    d24.setText("" + i);
                    if (i == diaFixo && mesAltera == mesFixo - 1 && anoAltera == anoFixo) {
                        d24.setForeground(Color.red);
                    } else {
                        d24.setForeground(Color.black);
                    }
                    break;

                case 25:
                    d25.setText("" + i);
                    if (i == diaFixo && mesAltera == mesFixo - 1 && anoAltera == anoFixo) {
                        d25.setForeground(Color.red);
                    } else {
                        d25.setForeground(Color.black);
                    }
                    break;

                case 26:
                    d26.setText("" + i);
                    if (i == diaFixo && mesAltera == mesFixo - 1 && anoAltera == anoFixo) {
                        d26.setForeground(Color.red);
                    } else {
                        d26.setForeground(Color.black);
                    }
                    break;

                case 27:
                    d27.setText("" + i);
                    if (i == diaFixo && mesAltera == mesFixo - 1 && anoAltera == anoFixo) {
                        d27.setForeground(Color.red);
                    } else {
                        d27.setForeground(Color.black);
                    }
                    break;

                case 28:
                    d28.setText("" + i);
                    if (i == diaFixo && mesAltera == mesFixo - 1 && anoAltera == anoFixo) {
                        d28.setForeground(Color.red);
                    } else {
                        d28.setForeground(Color.black);
                    }
                    break;

                case 29:
                    d29.setText("" + i);
                    if (i == diaFixo && mesAltera == mesFixo - 1 && anoAltera == anoFixo) {
                        d29.setForeground(Color.green);
                    } else {
                        d29.setForeground(Color.red);
                    }
                    break;

                case 30:
                    d30.setText("" + i);
                    if (i == diaFixo && mesAltera == mesFixo - 1 && anoAltera == anoFixo) {
                        d30.setForeground(Color.red);
                    } else {
                        d30.setForeground(Color.black);
                    }
                    break;
                case 31:
                    d31.setText("" + i);
                    if (i == diaFixo && mesAltera == mesFixo - 1 && anoAltera == anoFixo) {
                        d31.setForeground(Color.red);
                    } else {
                        d31.setForeground(Color.black);
                    }
                    break;

                case 32:
                    d32.setText("" + i);
                    if (i == diaFixo && mesAltera == mesFixo - 1 && anoAltera == anoFixo) {
                        d32.setForeground(Color.red);
                    } else {
                        d32.setForeground(Color.black);
                    }
                    break;

                case 33:
                    d33.setText("" + i);
                    if (i == diaFixo && mesAltera == mesFixo - 1 && anoAltera == anoFixo) {
                        d33.setForeground(Color.red);
                    } else {
                        d33.setForeground(Color.black);
                    }
                    break;

                case 34:
                    d34.setText("" + i);
                    if (i == diaFixo && mesAltera == mesFixo - 1 && anoAltera == anoFixo) {
                        d34.setForeground(Color.red);
                    } else {
                        d34.setForeground(Color.black);
                    }
                    break;

                case 35:
                    d35.setText("" + i);
                    if (i == diaFixo && mesAltera == mesFixo - 1 && anoAltera == anoFixo) {
                        d35.setForeground(Color.red);
                    } else {
                        d35.setForeground(Color.black);
                    }
                    break;

                case 36:
                    d36.setText("" + i);
                    if (i == diaFixo && mesAltera == mesFixo - 1 && anoAltera == anoFixo) {
                        d36.setForeground(Color.green);
                    } else {
                        d36.setForeground(Color.red);
                    }
                    break;

                case 37:
                    d37.setText("" + i);
                    if (i == diaFixo && mesAltera == mesFixo - 1 && anoAltera == anoFixo) {
                        d37.setForeground(Color.red);
                    } else {
                        d37.setForeground(Color.black);
                    }
                    break;

                case 38:
                    d38.setText("" + i);
                    if (i == diaFixo && mesAltera == mesFixo - 1 && anoAltera == anoFixo) {
                        d38.setForeground(Color.red);
                    } else {
                        d38.setForeground(Color.black);
                    }
                    break;

                case 39:
                    d39.setText("" + i);
                    if (i == diaFixo && mesAltera == mesFixo - 1 && anoAltera == anoFixo) {
                        d39.setForeground(Color.red);
                    } else {
                        d39.setForeground(Color.black);
                    }
                    break;

                case 40:
                    d40.setText("" + i);
                    if (i == diaFixo && mesAltera == mesFixo - 1 && anoAltera == anoFixo) {
                        d40.setForeground(Color.red);
                    } else {
                        d40.setForeground(Color.black);
                    }
                    break;

                case 41:
                    d41.setText("" + i);
                    if (i == diaFixo && mesAltera == mesFixo - 1 && anoAltera == anoFixo) {
                        d41.setForeground(Color.red);
                    } else {
                        d41.setForeground(Color.black);
                    }
                    break;

                case 42:
                    d42.setText("" + i);
                    if (i == diaFixo && mesAltera == mesFixo - 1 && anoAltera == anoFixo) {
                        d42.setForeground(Color.red);
                    } else {
                        d42.setForeground(Color.black);
                    }
                    break;

            }
            setaDia++;
        }
       
        for (javax.swing.JLabel l : jldias)
            l.setOpaque(!"".equals(l.getText()));
            
        checarDias();
    }

    // evento nos dias do mes
    public void calendarioEvt() {
        for (javax.swing.JLabel l : jldias) {
            l.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    if (!"".equals(l.getText())) {
                        l.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                    }
                }
    
                @Override
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    l.setBorder(null);
                }
    
                @Override
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    String dia = l.getText();
                    if (dia.length() > 1024) {
                        dia = dia.substring(0, 1023);
                    }
                    String mes = (String) selecionaMes.getSelectedItem();
                    String ano = String.valueOf(selecionaAno.getSelectedItem());
                    anotacaocalendario.visualizarAnotacao(dia, mes, ano);
                }
            });
        }
    }

    public static void checarDias() {
        String mes = (String) selecionaMes.getSelectedItem();
        String ano = String.valueOf(selecionaAno.getSelectedItem());
        for (javax.swing.JLabel l : jldias) {
            if (JSONCalendario.getMensagem(l.getText(), mes, ano) == null) {
                l.setBackground(new Color(255, 255, 255));
            } else {
                l.setBackground(new Color(31, 208, 222));
            }
        }
    }
}
