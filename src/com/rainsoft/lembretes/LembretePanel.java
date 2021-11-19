package com.rainsoft.lembretes;

public class LembretePanel extends javax.swing.JPanel {
    Lembrete lembrete;

    public LembretePanel() {
        initComponents();
    }
    
    public void setLembrete(Lembrete l) {
        this.lembrete = l;
    }
    
    public void setTitle(String title) {
        jLabelTitle.setText(title);
    }
    
    public void setTime(String time) {
        jLabelTime.setText(time);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTime = new javax.swing.JLabel();
        jLabelTitle = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTime.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabelTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTime.setText("hh:mm");
        add(jLabelTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 100, 60));

        jLabelTitle.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 22)); // NOI18N
        jLabelTitle.setText("Materia 10");
        add(jLabelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 260, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/PanelHora.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 360, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rainsoft/images/PanelPrincipal.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelTime;
    private javax.swing.JLabel jLabelTitle;
    // End of variables declaration//GEN-END:variables
}
