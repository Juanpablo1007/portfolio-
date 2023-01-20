/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package controlador;

import Models.VectorialApp;
import static Models.VectorialApp.Cono;
import static Models.VectorialApp.Elipsoide;
import static Models.VectorialApp.Esfera;
import static Models.VectorialApp.H1;
import static Models.VectorialApp.H2;
import static Models.VectorialApp.Silla;
import static Models.VectorialApp.XY;
import static Models.VectorialApp.XZ;
import static Models.VectorialApp.YZ;
import static Models.VectorialApp.ecuacion;
import static Models.VectorialApp.ecuacion1;
import static Models.VectorialApp.figura;
import static Models.VectorialApp.i;
import static Models.VectorialApp.isCono;
import static Models.VectorialApp.isElipsoide;
import static Models.VectorialApp.isH1;
import static Models.VectorialApp.isH2;
import static Models.VectorialApp.isPara;
import static Models.VectorialApp.isSilla;
import static Models.VectorialApp.isproducto;
import static Models.VectorialApp.paraboloideHeliptico;
import static Models.VectorialApp.sacarTrazasEsferaXZ;
import static Models.VectorialApp.sacarTrazasEsferaYZ;
import static Models.VectorialApp.sacarTrazasEsferaxy;
import static Models.VectorialApp.trazaXYH1;
import static Models.VectorialApp.trazaXYH2;
import static Models.VectorialApp.trazaXYPara;
import static Models.VectorialApp.trazaXYSillaMontarPo;
import static Models.VectorialApp.trazaXYcono;
import static Models.VectorialApp.trazaXZH1;
import static Models.VectorialApp.trazaXZH2;
import static Models.VectorialApp.trazaXZPara;
import static Models.VectorialApp.trazaXZSillaMontar;
import static Models.VectorialApp.trazaXZcono;
import static Models.VectorialApp.trazaYZH1;
import static Models.VectorialApp.trazaYZH2;
import static Models.VectorialApp.trazaYZPara;
import static Models.VectorialApp.trazaYZSillaMontar;
import static Models.VectorialApp.trazaYZcono;
import static Models.VectorialApp.trazasEliXY;
import static Models.VectorialApp.trazasEliXZ;
import static Models.VectorialApp.trazasEliYZ;
import static Models.VectorialApp.x;
import static Models.VectorialApp.y;
import static Models.VectorialApp.z;
import java.awt.HeadlessException;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author crist
 */
public class Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form interfaz
     */
    public Interfaz() {

        initComponents();
        this.setLocationRelativeTo(null);
        logo();    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextTrazas = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        JtextFIGURA = new javax.swing.JTextArea();
        IngresoEcuacionText = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        BottonEsfera = new javax.swing.JButton();
        BottonElipsoide = new javax.swing.JButton();
        BottonCono = new javax.swing.JButton();
        BottonParaboloideElip = new javax.swing.JButton();
        BottonH2 = new javax.swing.JButton();
        BottonH1 = new javax.swing.JButton();
        BottonParaboloideHiper = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        trazaYZ = new javax.swing.JButton();
        trazaXZ = new javax.swing.JButton();
        trazaXY = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        BotonAnalizar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        GraficaLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1356, 700));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1356, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextTrazas.setBackground(new java.awt.Color(209, 209, 209));
        jTextTrazas.setColumns(20);
        jTextTrazas.setRows(5);
        jScrollPane2.setViewportView(jTextTrazas);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 630, 410));

        JtextFIGURA.setBackground(new java.awt.Color(209, 209, 209));
        JtextFIGURA.setColumns(20);
        JtextFIGURA.setRows(5);
        jScrollPane1.setViewportView(JtextFIGURA);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 630, 210));

        IngresoEcuacionText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresoEcuacionTextActionPerformed(evt);
            }
        });
        getContentPane().add(IngresoEcuacionText, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 330, 50));

        jLabel26.setBackground(new java.awt.Color(51, 255, 0));
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título.png"))); // NOI18N
        jLabel26.setToolTipText("ECUACIONES");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 120, -1));

        jLabel7.setText("((x-h)^2)+((y-k)^2)+((z-l)^2)=r^2");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 200, 20));

        jLabel8.setText("((x-h)^2)/a^2)+((y-k)^2)/b^2)+((z-l)^2)/c^2)=1");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 260, -1));

        jLabel9.setText("((x-h)^2)/a^2)+((y-k)^2)/b^2)=((z-l)^2)/c^2");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, -1));

        jLabel10.setText("((x-h)^2)/a^2)+((y-k)^2)/b^2)-((z-l)^2)/c^2)=1");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, -1, -1));

        jLabel11.setText("-((x-h)^2)/a^2)+((y-k)^2)/b^2)-((z-l)^2)/c^2)=1");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, -1, -1));

        jLabel12.setText("((x-h)^2)/a^2)+((y-k)^2)/b^2)=(z-l)*c");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 600, -1, -1));

        jLabel13.setText("((x-h)^2)/a^2)-((y-k)^2)/b^2)=(z-l)*c");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 650, -1, -1));

        BottonEsfera.setBackground(new java.awt.Color(218, 44, 7));
        BottonEsfera.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BottonEsfera.setForeground(new java.awt.Color(255, 255, 255));
        BottonEsfera.setText("Usar");
        BottonEsfera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BottonEsferaActionPerformed(evt);
            }
        });
        getContentPane().add(BottonEsfera, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 70, -1));

        BottonElipsoide.setBackground(new java.awt.Color(218, 44, 7));
        BottonElipsoide.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BottonElipsoide.setForeground(new java.awt.Color(255, 255, 255));
        BottonElipsoide.setText("Usar");
        BottonElipsoide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BottonElipsoideActionPerformed(evt);
            }
        });
        getContentPane().add(BottonElipsoide, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 70, -1));

        BottonCono.setBackground(new java.awt.Color(218, 44, 7));
        BottonCono.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BottonCono.setForeground(new java.awt.Color(255, 255, 255));
        BottonCono.setText("Usar");
        BottonCono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BottonConoActionPerformed(evt);
            }
        });
        getContentPane().add(BottonCono, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, 70, -1));

        BottonParaboloideElip.setBackground(new java.awt.Color(218, 44, 7));
        BottonParaboloideElip.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BottonParaboloideElip.setForeground(new java.awt.Color(255, 255, 255));
        BottonParaboloideElip.setText("Usar ");
        BottonParaboloideElip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BottonParaboloideElipActionPerformed(evt);
            }
        });
        getContentPane().add(BottonParaboloideElip, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 580, 70, -1));

        BottonH2.setBackground(new java.awt.Color(218, 44, 7));
        BottonH2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BottonH2.setForeground(new java.awt.Color(255, 255, 255));
        BottonH2.setText("Usar");
        BottonH2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BottonH2ActionPerformed(evt);
            }
        });
        getContentPane().add(BottonH2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 520, 70, -1));

        BottonH1.setBackground(new java.awt.Color(218, 44, 7));
        BottonH1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BottonH1.setForeground(new java.awt.Color(255, 255, 255));
        BottonH1.setText("Usar");
        BottonH1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BottonH1ActionPerformed(evt);
            }
        });
        getContentPane().add(BottonH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 460, 70, -1));

        BottonParaboloideHiper.setBackground(new java.awt.Color(218, 44, 7));
        BottonParaboloideHiper.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BottonParaboloideHiper.setForeground(new java.awt.Color(255, 255, 255));
        BottonParaboloideHiper.setText("Usar");
        BottonParaboloideHiper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BottonParaboloideHiperActionPerformed(evt);
            }
        });
        getContentPane().add(BottonParaboloideHiper, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 640, 70, -1));

        jLabel16.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("ECUACIONES ");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 140, 20));

        jLabel17.setFont(new java.awt.Font("Consolas", 1, 13)); // NOI18N
        jLabel17.setText("ELIPSOIDE");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 140, 20));

        jLabel18.setFont(new java.awt.Font("Consolas", 1, 13)); // NOI18N
        jLabel18.setText("CONO");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, 140, 20));

        jLabel19.setFont(new java.awt.Font("Consolas", 1, 13)); // NOI18N
        jLabel19.setText("HIPERBOLOIDE DE UNA HOJA ");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, 220, 20));

        jLabel20.setFont(new java.awt.Font("Consolas", 1, 13)); // NOI18N
        jLabel20.setText("HIPERBOLOIDE DE DOS HOJAS ");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, 220, 20));

        jLabel21.setFont(new java.awt.Font("Consolas", 1, 13)); // NOI18N
        jLabel21.setText("PARABOLOIDE ELIPTICO");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 560, 170, 20));

        jLabel22.setFont(new java.awt.Font("Consolas", 1, 13)); // NOI18N
        jLabel22.setText("PARABOLOIDE HIPERBOLICO(SILLA DE MONTAR)");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 620, 350, 20));

        jLabel23.setFont(new java.awt.Font("Consolas", 1, 13)); // NOI18N
        jLabel23.setText("ESFERA");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 140, 20));

        jLabel6.setBackground(new java.awt.Color(51, 255, 0));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dsBuffer.bmp.png"))); // NOI18N
        jLabel6.setToolTipText("ECUACIONES");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-8, 680, 1360, 20));

        trazaYZ.setBackground(new java.awt.Color(218, 44, 7));
        trazaYZ.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        trazaYZ.setForeground(new java.awt.Color(255, 255, 255));
        trazaYZ.setText("YZ");
        trazaYZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trazaYZActionPerformed(evt);
            }
        });
        getContentPane().add(trazaYZ, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 50, 20));

        trazaXZ.setBackground(new java.awt.Color(218, 44, 7));
        trazaXZ.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        trazaXZ.setForeground(new java.awt.Color(255, 255, 255));
        trazaXZ.setText("XZ");
        trazaXZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trazaXZActionPerformed(evt);
            }
        });
        getContentPane().add(trazaXZ, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 50, 20));

        trazaXY.setBackground(new java.awt.Color(218, 44, 7));
        trazaXY.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        trazaXY.setForeground(new java.awt.Color(255, 255, 255));
        trazaXY.setText("XY");
        trazaXY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trazaXYActionPerformed(evt);
            }
        });
        getContentPane().add(trazaXY, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 50, 20));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 20, 659));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 380, 10));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 380, 20));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 380, 30));
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 617, 380, 10));
        getContentPane().add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 497, 380, 10));
        getContentPane().add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 380, 30));
        getContentPane().add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 670, 380, 30));
        getContentPane().add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 380, 30));

        BotonAnalizar.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        BotonAnalizar.setText("Analizar");
        BotonAnalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAnalizarActionPerformed(evt);
            }
        });
        getContentPane().add(BotonAnalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 130, -1));

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 12)); // NOI18N
        jLabel2.setText("GRAFICA ECUACION ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 50, 200, 30));

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        jLabel1.setText("ingrese la ecuación( a,b,c) y ( h,k,l) ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 370, 20));

        jLabel15.setBackground(new java.awt.Color(51, 255, 0));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dsBuffer.bmp.png"))); // NOI18N
        jLabel15.setToolTipText("ECUACIONES");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 380, 20));

        jButton1.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 0, 80, 40));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Consolas", 1, 50)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("VECTORIAL APP");
        jLabel3.setAlignmentY(1.0F);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, -20, 430, 90));

        jLabel5.setBackground(new java.awt.Color(0, 255, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dsBuffer.bmp.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 40));

        GraficaLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Figuras/imagen inical.png"))); // NOI18N
        getContentPane().add(GraficaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 90, 300, 250));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/v.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jLabel4.setAutoscrolls(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonAnalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAnalizarActionPerformed

         jTextTrazas.setText("");
        JtextFIGURA.setText("");
        ecuacion = "";
        ecuacion1 = "";
        ecuacion = IngresoEcuacionText.getText();
        ecuacion1 = VectorialApp.organizar(ecuacion, 0, 0);
        if(VectorialApp.verificarVariables('x', 0,ecuacion)||VectorialApp.verificarVariables('y', 0,ecuacion)||VectorialApp.verificarVariables('z', 0,ecuacion)){
            JOptionPane.showMessageDialog(null, "Ingrese las variables de forma correcta porfavor",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        }else{
            if(ecuacion1.contains("((((")||ecuacion1.contains("(((((")||ecuacion1.contains("((((((")||ecuacion1.contains("))))")||ecuacion1.contains(")))))")){
                JOptionPane.showMessageDialog(null, "La formula escrita no esta correcta, revise los parentesis",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
            }else{
        if (VectorialApp.verificar(ecuacion1)) {
            JOptionPane.showMessageDialog(null, "La formula escrita no esta correcta, revise los parentesis",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            VectorialApp.Posicion(ecuacion1, 0);

            try {
                if (VectorialApp.tieneLetra(ecuacion, 0, 0) || VectorialApp.Repeticiones(ecuacion1, 0, 0)) {
                    JOptionPane.showMessageDialog(null, "Porfavor ingrese una ecuacion valida ",
                            "INFORMATIVO", JOptionPane.WARNING_MESSAGE);
                } else {
                    VectorialApp.separarVariables(ecuacion1, 0, 0, 0);
                    VectorialApp.calcularHKJ(0);
                    VectorialApp.determinarForma();
                    forma = VectorialApp.getFigura();
                    JtextFIGURA.setText(forma);
                    darImagen();

                    forma = "";
                    ecuacion = "";
                    ecuacion1 = "";

                }

            } catch (HeadlessException e) {
                JOptionPane.showMessageDialog(null, "Ecuacion invalida",
                        "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
            }
        }
    }//GEN-LAST:event_BotonAnalizarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void IngresoEcuacionTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresoEcuacionTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IngresoEcuacionTextActionPerformed

    private void BottonElipsoideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BottonElipsoideActionPerformed
        // TODO add your handling code here:
        IngresoEcuacionText.setText("((x-h)^2)/a^2)+((y-k)^2)/b^2)+((z-l)^2)/c^2)=1");
    }//GEN-LAST:event_BottonElipsoideActionPerformed

    private void BottonParaboloideHiperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BottonParaboloideHiperActionPerformed
        // TODO add your handling code here:
        IngresoEcuacionText.setText("((x-h)^2)/a^2)-((y-k)^2)/b^2)=(z-l)*c");
    }//GEN-LAST:event_BottonParaboloideHiperActionPerformed

    private void trazaXZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trazaXZActionPerformed
        // TODO add your handling code here:
         ecuacion = IngresoEcuacionText.getText();
        ecuacion1 = VectorialApp.organizar(ecuacion, 0, 0);
        VectorialApp.organizar(ecuacion1, 0, 0);

        if (JtextFIGURA.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Porfavor analice la ecuacion primero ",
                    "INFORMATIVO", JOptionPane.WARNING_MESSAGE);
        } else {
            VectorialApp.separarVariables(ecuacion1, 0, 0, 0);
            VectorialApp.calcularHKJ(0);
            VectorialApp.determinarForma();
            xz = VectorialApp.getXZ();
            jTextTrazas.setText(xz);
            
        }
    }//GEN-LAST:event_trazaXZActionPerformed

    private void BottonEsferaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BottonEsferaActionPerformed
        // TODO add your handling code here:
        IngresoEcuacionText.setText("((x-h)^2)+((y-k)^2)+((z-l)^2)=r^2");
    }//GEN-LAST:event_BottonEsferaActionPerformed

    private void BottonConoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BottonConoActionPerformed
        // TODO add your handling code here:
        IngresoEcuacionText.setText("((x-h)^2)/a^2)+((y-k)^2)/b^2)=((z-l)^2)/c^2");
    }//GEN-LAST:event_BottonConoActionPerformed

    private void BottonH1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BottonH1ActionPerformed
        // TODO add your handling code here:
        IngresoEcuacionText.setText("((x-h)^2)/a^2)+((y-k)^2)/b^2)-((z-l)^2)/c^2)=1");
    }//GEN-LAST:event_BottonH1ActionPerformed

    private void BottonH2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BottonH2ActionPerformed
        // TODO add your handling code here:
        IngresoEcuacionText.setText("-((x-h)^2)/a^2)+((y-k)^2)/b^2)-((z-l)^2)/c^2)=1");
    }//GEN-LAST:event_BottonH2ActionPerformed

    private void BottonParaboloideElipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BottonParaboloideElipActionPerformed
        // TODO add your handling code here:
        IngresoEcuacionText.setText("((x-h)^2)/a^2)+((y-k)^2)/b^2)=(z-l)*c");
    }//GEN-LAST:event_BottonParaboloideElipActionPerformed

    private void trazaXYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trazaXYActionPerformed
        // TODO add your handling code here:
          ecuacion = IngresoEcuacionText.getText();
        ecuacion1 = VectorialApp.organizar(ecuacion, 0, 0);
        VectorialApp.organizar(ecuacion1, 0, 0);

        if (JtextFIGURA.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Porfavor analice la ecuacion primero ",
                    "INFORMATIVO", JOptionPane.WARNING_MESSAGE);
        } else {
            VectorialApp.separarVariables(ecuacion1, 0, 0, 0);
            VectorialApp.calcularHKJ(0);
            VectorialApp.determinarForma();
            xy = VectorialApp.getXY();
            jTextTrazas.setText(xy);
        }
    }//GEN-LAST:event_trazaXYActionPerformed

    public void logo(){
        ImageIcon imagn;

        Icon figura;
        imagn = new ImageIcon(getClass().getResource("/imagenes/Figuras/icono.png"));
            figura= new ImageIcon(imagn.getImage().getScaledInstance(jLabel26.getWidth(), jLabel26.getHeight(), Image.SCALE_SMOOTH));
            jLabel26.setIcon(figura);
    }
    public void darImagen(){
    
        ImageIcon imagen;

        Icon figuraT;
        if (VectorialApp.isCircu()) {
            imagen = new ImageIcon(getClass().getResource("/imagenes/Figuras/esfera.jpg"));
            figuraT= new ImageIcon(imagen.getImage().getScaledInstance(GraficaLabel.getWidth(), GraficaLabel.getHeight(), Image.SCALE_SMOOTH));
            GraficaLabel.setIcon(figuraT);
        } else if (isH1()) {
            imagen = new ImageIcon(getClass().getResource("/imagenes/Figuras/H1.png"));
            figuraT= new ImageIcon(imagen.getImage().getScaledInstance(GraficaLabel.getWidth(), GraficaLabel.getHeight(), Image.SCALE_SMOOTH));
            GraficaLabel.setIcon(figuraT);
           

        } else if (isH2() && (!isproducto(x) && !isproducto(y) && !isproducto(z))) {

         imagen = new ImageIcon(getClass().getResource("/imagenes/Figuras/H2.png"));
            figuraT= new ImageIcon(imagen.getImage().getScaledInstance(GraficaLabel.getWidth(), GraficaLabel.getHeight(), Image.SCALE_SMOOTH));
            GraficaLabel.setIcon(figuraT);
           

        } else if (isCono() && (!isproducto(x) && !isproducto(y) && !isproducto(z))) {
           
imagen = new ImageIcon(getClass().getResource("/imagenes/Figuras/cono.jpg"));
            figuraT= new ImageIcon(imagen.getImage().getScaledInstance(GraficaLabel.getWidth(), GraficaLabel.getHeight(), Image.SCALE_SMOOTH));
            GraficaLabel.setIcon(figuraT);
           
        } else if (isElipsoide()) {
imagen = new ImageIcon(getClass().getResource("/imagenes/Figuras/elipsoide.png"));
            figuraT= new ImageIcon(imagen.getImage().getScaledInstance(GraficaLabel.getWidth(), GraficaLabel.getHeight(), Image.SCALE_SMOOTH));
            GraficaLabel.setIcon(figuraT);
           
          

        } else if (isPara()) {

          imagen = new ImageIcon(getClass().getResource("/imagenes/Figuras/eliptico.jpg"));
            figuraT= new ImageIcon(imagen.getImage().getScaledInstance(GraficaLabel.getWidth(), GraficaLabel.getHeight(), Image.SCALE_SMOOTH));
            GraficaLabel.setIcon(figuraT);
           

        } else if (isSilla()) {
           
imagen = new ImageIcon(getClass().getResource("/imagenes/Figuras/sillad.png"));
            figuraT= new ImageIcon(imagen.getImage().getScaledInstance(GraficaLabel.getWidth(), GraficaLabel.getHeight(), Image.SCALE_SMOOTH));
            GraficaLabel.setIcon(figuraT);
           
        } else {
            JOptionPane.showMessageDialog(null, "Ecuiacion incorrecta, porfavor revise los parentecis o signos. ",
                    "INFOMATIVO", JOptionPane.WARNING_MESSAGE);

        }

    }
    
    
    private void trazaYZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trazaYZActionPerformed
        // TODO add your handling code here:
        ecuacion = IngresoEcuacionText.getText();
        ecuacion1 = VectorialApp.organizar(ecuacion, 0, 0);
        VectorialApp.organizar(ecuacion1, 0, 0);

        if (JtextFIGURA.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Porfavor analice la ecuacion primero ",
                    "INFORMATIVO", JOptionPane.WARNING_MESSAGE);
        } else {
            VectorialApp.separarVariables(ecuacion1, 0, 0, 0);
            VectorialApp.calcularHKJ(0);
            VectorialApp.determinarForma();
            yz = VectorialApp.getYZ();
            jTextTrazas.setText(yz);
        }
    }//GEN-LAST:event_trazaYZActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAnalizar;
    private javax.swing.JButton BottonCono;
    private javax.swing.JButton BottonElipsoide;
    private javax.swing.JButton BottonEsfera;
    private javax.swing.JButton BottonH1;
    private javax.swing.JButton BottonH2;
    private javax.swing.JButton BottonParaboloideElip;
    private javax.swing.JButton BottonParaboloideHiper;
    private javax.swing.JLabel GraficaLabel;
    private javax.swing.JTextField IngresoEcuacionText;
    private javax.swing.JTextArea JtextFIGURA;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextArea jTextTrazas;
    private javax.swing.JButton trazaXY;
    private javax.swing.JButton trazaXZ;
    private javax.swing.JButton trazaYZ;
    // End of variables declaration//GEN-END:variables
String ecuacion = new String();
    String ecuacion1 = new String();
    String forma = new String();
    String xy = new String();
    String xz = new String();
    String yz = new String();
}
