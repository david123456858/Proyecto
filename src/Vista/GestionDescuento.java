/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Entidades.Categoria;
import Modelo.GestioCategorias;
import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author dulfu
 */
public class GestionDescuento extends javax.swing.JFrame {
    
    private GestioCategorias gestioncate ;
    public GestionDescuento() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.gestioncate = new GestioCategorias();
        this.cargarCategorias();
    }
    
    public void cargarCategorias() {
        try {
            ArrayList<Categoria> lista = this.gestioncate.leercategorias();
            for(Categoria c: lista){
                this.Categorias.addItem(c.getNombre());
            }
        } catch (IOException io) {
            JOptionPane.showMessageDialog(this, io, "Error de archivo", JOptionPane.ERROR_MESSAGE);
        }

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Categorias = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        PP = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        PS = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        DESCUP = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        DESCUS = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        GU = new javax.swing.JPanel();
        Guardar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(193, 211, 1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/descarga (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addComponent(jLabel1)
                .addContainerGap(252, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 110));

        jLabel2.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Gestion de Descuentos");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        Categorias.setBackground(new java.awt.Color(153, 153, 153));
        Categorias.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        Categorias.setForeground(new java.awt.Color(255, 255, 255));
        Categorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CategoriasMousePressed(evt);
            }
        });
        jPanel1.add(Categorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 390, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("PASES DEL DESCUENTO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 230, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("PARTICULARES");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, -1, -1));

        PP.setBackground(new java.awt.Color(255, 255, 255));
        PP.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        PP.setForeground(new java.awt.Color(102, 102, 102));
        PP.setText("Ingrese un numero");
        PP.setBorder(null);
        PP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PPMousePressed(evt);
            }
        });
        jPanel1.add(PP, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 200, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 190, 10));

        jLabel6.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("SERVICIO PUBLICO");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, -1, -1));

        PS.setBackground(new java.awt.Color(255, 255, 255));
        PS.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        PS.setForeground(new java.awt.Color(102, 102, 102));
        PS.setText("Ingrese un numero");
        PS.setBorder(null);
        PS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PSMousePressed(evt);
            }
        });
        PS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PSActionPerformed(evt);
            }
        });
        jPanel1.add(PS, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, 190, 20));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 200, 10));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("DESCUENTOS");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 140, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("PARTICULARES");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        DESCUP.setBackground(new java.awt.Color(255, 255, 255));
        DESCUP.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        DESCUP.setForeground(new java.awt.Color(102, 102, 102));
        DESCUP.setText("Ingrese %");
        DESCUP.setBorder(null);
        DESCUP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DESCUPMousePressed(evt);
            }
        });
        jPanel1.add(DESCUP, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 200, -1));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, 220, 10));

        jLabel9.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("SERVICIO PUBLICO");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        DESCUS.setBackground(new java.awt.Color(255, 255, 255));
        DESCUS.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        DESCUS.setForeground(new java.awt.Color(102, 102, 102));
        DESCUS.setText("Ingrese Descuento %");
        DESCUS.setBorder(null);
        DESCUS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DESCUSMousePressed(evt);
            }
        });
        DESCUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DESCUSActionPerformed(evt);
            }
        });
        jPanel1.add(DESCUS, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 190, 20));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 200, 10));

        GU.setBackground(new java.awt.Color(193, 211, 1));

        Guardar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Guardar.setForeground(new java.awt.Color(0, 0, 0));
        Guardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Guardar.setText("GUARDAR");
        Guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                GuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                GuardarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout GULayout = new javax.swing.GroupLayout(GU);
        GU.setLayout(GULayout);
        GULayout.setHorizontalGroup(
            GULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Guardar, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        GULayout.setVerticalGroup(
            GULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Guardar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(GU, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 140, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PSActionPerformed

    private void DESCUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DESCUSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DESCUSActionPerformed

    private void GuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GuardarMouseEntered
        GU.setBackground(new Color(232, 255, 1));
    }//GEN-LAST:event_GuardarMouseEntered

    private void GuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GuardarMouseExited
        GU.setBackground(new Color(198, 225, 0));
    }//GEN-LAST:event_GuardarMouseExited

    private void DESCUPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DESCUPMousePressed
        if (DESCUP.getText().equals("Ingrese %")) {
            DESCUP.setText("");
            DESCUP.setForeground(Color.black);
        }
        if (PS.getText().isEmpty()) {
            PS.setText("Ingrese un numero");
            PS.setForeground(Color.gray);
        }
        if (PP.getText().isEmpty()) {
            PP.setText("Ingrese un numero");
            PP.setForeground(Color.gray);
        }
        if (DESCUS.getText().isEmpty()) {
            DESCUS.setText("Ingrese Descuento %");
            DESCUS.setForeground(Color.gray);
        }
    }//GEN-LAST:event_DESCUPMousePressed

    private void DESCUSMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DESCUSMousePressed
        if (DESCUS.getText().equals("Ingrese Descuento %")) {
            DESCUS.setText("");
            DESCUS.setForeground(Color.black);
        }
        if (PS.getText().isEmpty()) {
            PS.setText("Ingrese un numero");
            PS.setForeground(Color.gray);
        }
        if (PP.getText().isEmpty()) {
            PP.setText("Ingrese un numero");
            PP.setForeground(Color.gray);
        }
        if (DESCUP.getText().isEmpty()) {
            DESCUP.setText("Ingrese %");
            DESCUP.setForeground(Color.gray);
        }
    }//GEN-LAST:event_DESCUSMousePressed

    private void PPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PPMousePressed
        if (PS.getText().equals("Ingrese un numero")) {
            PS.setText("");
            PS.setForeground(Color.black);
        }
        if (PP.getText().isEmpty()) {
            PP.setText("Ingrese un numero");
            PP.setForeground(Color.gray);
        }
        if (DESCUS.getText().isEmpty()) {
            DESCUS.setText("Ingrese Descuento %");
            DESCUS.setForeground(Color.gray);
        }
        if (DESCUP.getText().isEmpty()) {
            DESCUP.setText("Ingrese %");
            DESCUP.setForeground(Color.gray);
        }
    }//GEN-LAST:event_PPMousePressed

    private void PSMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PSMousePressed
       if (PP.getText().equals("Ingrese un numero")) {
            PP.setText("");
            PP.setForeground(Color.black);
        }
        if (PS.getText().isEmpty()) {
            PS.setText("Ingrese un numero");
            PS.setForeground(Color.gray);
        }
        if (DESCUS.getText().isEmpty()) {
            DESCUS.setText("Ingrese Descuento %");
            DESCUS.setForeground(Color.gray);
        }
        if (DESCUP.getText().isEmpty()) {
            DESCUP.setText("Ingrese %");
            DESCUP.setForeground(Color.gray);
        }
    }//GEN-LAST:event_PSMousePressed

    private void CategoriasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategoriasMousePressed
       
    }//GEN-LAST:event_CategoriasMousePressed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Categorias;
    private javax.swing.JTextField DESCUP;
    private javax.swing.JTextField DESCUS;
    private javax.swing.JPanel GU;
    private javax.swing.JLabel Guardar;
    private javax.swing.JTextField PP;
    private javax.swing.JTextField PS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    // End of variables declaration//GEN-END:variables
}