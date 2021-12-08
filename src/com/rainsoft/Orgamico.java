package com.rainsoft;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.fathzer.soft.javaluator.DoubleEvaluator;

import com.rainsoft.calendario.AnotacaoCalendario;
import com.rainsoft.calendario.JSONCalendario;
import com.rainsoft.lembretes.GerenciaLembretes;
import com.rainsoft.renderers.RendererAnotacoes;
import com.rainsoft.renderers.RendererMaterias;

public class Orgamico extends javax.swing.JFrame {

    public static final String ORGAMICODATA_PATH = System.getenv("APPDATA") + "\\OrgamicoData";
    public static final String MATERIAS_JSON_PATH = ORGAMICODATA_PATH + "\\materias.json";
    public static final String CALENDARIO_JSON_PATH = ORGAMICODATA_PATH + "\\calendario.json";

    public static final AddMateria addMateria = new AddMateria();
    public static final MostrarMateria mostrarMateria = new MostrarMateria();
    public static final EditarMateria editarMateria = new EditarMateria();
    public static final AddAnotacao addAnotacao = new AddAnotacao();
    public static final EditarAnotacao editarAnotacao = new EditarAnotacao();
    public static final MostrarAnotacao mostrarAnotacao = new MostrarAnotacao();
    public static final GerenciaLembretes gerenciaLembretes = new GerenciaLembretes();
    public static final AnotacaoCalendario anotacaoCalendario = new AnotacaoCalendario();

    // Declaração das Variáveis do Calendário
    static int anoFixo = 0;
    static int mesFixo = 0;
    static int diaFixo = 0;
    static int anoAltera = 0;
    static int mesAltera = 0;
    static int diaAltera = 0;
    static int valorselecao = 0;

    public Orgamico() {
        initComponents();
        GerenciadorMaterias.loadMaterias();
        iniciarCalendario();
    }

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
        jSeg = new javax.swing.JLabel();
        jTer = new javax.swing.JLabel();
        jQua = new javax.swing.JLabel();
        jQui = new javax.swing.JLabel();
        jSex = new javax.swing.JLabel();
        jSab = new javax.swing.JLabel();

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
        jListMaterias.setModel(GerenciadorMaterias.getModelMaterias());
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
        jListAnotacoes.setModel(GerenciadorMaterias.getModelAnotacoes());
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
        jPanelMenuBarra.add(jLabelLembrete, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, -1, -1));

        jLabelHora
                .setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/AbaCalculadora.png"))); // NOI18N
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

        jSeg.setBackground(new java.awt.Color(255, 255, 255));
        jSeg.setFont(new java.awt.Font(arialFont, 0, 13)); // NOI18N
        jSeg.setForeground(new java.awt.Color(45, 43, 43));
        jSeg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jSeg.setText("Seg");
        jPanelMenuBarra.add(jSeg, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 260, 30, -1));

        jTer.setBackground(new java.awt.Color(255, 255, 255));
        jTer.setFont(new java.awt.Font(arialFont, 0, 13)); // NOI18N
        jTer.setForeground(new java.awt.Color(45, 43, 43));
        jTer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTer.setText("Ter");
        jPanelMenuBarra.add(jTer, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 260, 30, -1));

        jQua.setBackground(new java.awt.Color(255, 255, 255));
        jQua.setFont(new java.awt.Font(arialFont, 0, 13)); // NOI18N
        jQua.setForeground(new java.awt.Color(45, 43, 43));
        jQua.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jQua.setText("Qua");
        jPanelMenuBarra.add(jQua, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 260, 30, -1));

        jQui.setBackground(new java.awt.Color(255, 255, 255));
        jQui.setFont(new java.awt.Font(arialFont, 0, 13)); // NOI18N
        jQui.setForeground(new java.awt.Color(45, 43, 43));
        jQui.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jQui.setText("Qui");
        jPanelMenuBarra.add(jQui, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 260, 30, -1));

        jSex.setBackground(new java.awt.Color(255, 255, 255));
        jSex.setFont(new java.awt.Font(arialFont, 0, 13)); // NOI18N
        jSex.setForeground(new java.awt.Color(45, 43, 43));
        jSex.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jSex.setText("Sex");
        jPanelMenuBarra.add(jSex, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 260, 30, -1));

        jSab.setBackground(new java.awt.Color(255, 255, 255));
        jSab.setFont(new java.awt.Font(arialFont, 0, 13)); // NOI18N
        jSab.setForeground(new java.awt.Color(45, 43, 43));
        jSab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jSab.setText("Sáb");
        jPanelMenuBarra.add(jSab, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 260, 30, -1));

        jldias = new javax.swing.JLabel[42];
        int diaI = 0;
        for (int coluna = 0; coluna < 6; coluna++) {
            for (int linha = 0; linha < 7; linha++) {
                javax.swing.JLabel dia = new javax.swing.JLabel();

                dia.setBackground(new java.awt.Color(255, 255, 255));
                dia.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14));
                dia.setForeground(new java.awt.Color(255, 0, 0));
                dia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                dia.setText("0");
                jPanelMenuBarra.add(dia,
                        new org.netbeans.lib.awtextra.AbsoluteConstraints(930 + (40 * linha), 290 + (20 * coluna), 30,
                                -1));
                jldias[diaI] = dia;
                diaI++;
            }
        }

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/abaCalendario.png"))); // NOI18N
        jPanelMenuBarra.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 220, -1, 210));

        getContentPane().add(jPanelMenuBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1240, 660));

        jPanelBarraAzul.setBackground(new java.awt.Color(51, 153, 255));
        jPanelBarraAzul.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanelBarraAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGerenciarLembreteActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonGerenciarLembreteActionPerformed
        gerenciaLembretes.setVisible(true);
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

    private void jButtonAddMateriaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonAddMateriaActionPerformed
        addMateria.setVisible(true);
    }

    private void jButtonCriarAnotacaoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonCriarAnotacaoActionPerformed
        addAnotacao.jTextAnotacao.setText("");
        addAnotacao.setVisible(true);
    }

    private void jListMateriasMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jListMateriasMouseClicked
        // Se não houver matérias, não faça nada
        try {
            GerenciadorMaterias.getMateriaSelecionada();
        } catch (ArrayIndexOutOfBoundsException e) {
            return;
        }

        // Se apertou o botão direito
        if (evt.getButton() == 3) {
            mostrarMateria.mostrarMateria(GerenciadorMaterias.getMateriaSelecionada());
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

        mostrarAnotacao.mostrarAnotacao(GerenciadorMaterias.getMateriaSelecionada(), jListAnotacoes.getSelectedIndex());

    }

    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                | javax.swing.UnsupportedLookAndFeelException ex) {
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
    public void iniciarCalendario() {
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
        for (int i = 2000; i < anoMaximo; i++)
            selecionaAno.addItem("" + i);

        selecionaAno.setSelectedItem(anoFixo);
        selecionaMes.setSelectedIndex(mesFixo - 1);

        organizaCalendario();
        calendarioEvt();
    }

    // Organização dos dias do Calendário
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

        // Mostrar em qual dia da Semana será o dia 1 do mês
        Calendar c = Calendar.getInstance();
        c.set(anoAltera, mesAltera, 1);
        int setaDia = 0;

        int semana = c.get(Calendar.DAY_OF_WEEK);
        setaDia = semana;

        // setar os dias da semana
        for (int i = 1; i <= totalDiaMes; i++) {
            javax.swing.JLabel l = jldias[setaDia - 1];
            l.setText("" + i);

            if (setaDia % 7 == 1) // Se for domingo
                l.setForeground(Color.red);
            else
                l.setForeground(Color.black);

            if (i == diaFixo && mesAltera == mesFixo - 1 && anoAltera == anoFixo)
                l.setForeground(Color.green);

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
                    anotacaoCalendario.visualizarAnotacao(dia, mes, ano);
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
