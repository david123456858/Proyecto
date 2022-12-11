/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Entidades.Categoria;
import Modelo.GestioCategorias;
import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author dulfu
 */
public class GestionCategorias extends javax.swing.JFrame {

    private GestioCategorias modeloCategoria;

    /**
     * Creates new form GestionCategorias
     */
    public GestionCategorias() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.modeloCategoria = new GestioCategorias();
    }
    public void limpiarCampos(){
        this.Nom.setText("Ingrese Categoria");
        this.Num.setText("Ingrese Numero");
        this.Tarifa.setText("Ingrese Tarifa");
        Num.setForeground(Color.gray);
        Tarifa.setForeground(Color.gray);
        Nom.setForeground(Color.gray);
    }
    public void guardar() throws IOException {
        try {
            String numero = this.Num.getText();
            String nombre = this.Nom.getText();
            double tf = Double.valueOf(this.Tarifa.getText());
            Categoria categoria = new Categoria(numero, nombre, tf);
            this.modeloCategoria.registrarCategoria(categoria);
        } catch (IOException ex) {

        } catch (IllegalArgumentException ie) {
            JOptionPane.showMessageDialog(this, ie, "Error de validacion", JOptionPane.ERROR_MESSAGE);
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

        Atras = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        Tarifa = new javax.swing.JTextField();
        Nom = new javax.swing.JTextField();
        Num = new javax.swing.JTextField();
        Guardar = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        Descuento = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Atras.setBackground(new java.awt.Color(255, 255, 255));
        Atras.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(193, 211, 1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/descarga (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addComponent(jLabel2)
                .addContainerGap(254, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        Atras.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 110));

        jLabel1.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Gestion de Categorias");
        Atras.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("NUMERO DE CATEGORIA");
        Atras.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));
        Atras.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 220, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("TARIFA");
        Atras.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, -1, -1));
        Atras.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 220, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("NOMBRE DE CATEGORIA");
        Atras.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));
        Atras.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 220, -1));

        Tarifa.setBackground(new java.awt.Color(255, 255, 255));
        Tarifa.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Tarifa.setForeground(new java.awt.Color(102, 102, 102));
        Tarifa.setText("Ingrese Tarifa");
        Tarifa.setBorder(null);
        Tarifa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TarifaMousePressed(evt);
            }
        });
        Tarifa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TarifaKeyTyped(evt);
            }
        });
        Atras.add(Tarifa, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 210, 20));

        Nom.setBackground(new java.awt.Color(255, 255, 255));
        Nom.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Nom.setForeground(new java.awt.Color(102, 102, 102));
        Nom.setText("Ingrese Categoria");
        Nom.setBorder(null);
        Nom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NomMousePressed(evt);
            }
        });
        Nom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NomKeyTyped(evt);
            }
        });
        Atras.add(Nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 210, 20));

        Num.setBackground(new java.awt.Color(255, 255, 255));
        Num.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Num.setForeground(new java.awt.Color(102, 102, 102));
        Num.setText("Ingrese Numero");
        Num.setBorder(null);
        Num.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NumMousePressed(evt);
            }
        });
        Num.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NumKeyTyped(evt);
            }
        });
        Atras.add(Num, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 210, 20));

        Guardar.setBackground(new java.awt.Color(193, 211, 1));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("GUARDAR");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel7MousePressed(evt);
            }
        });

        javax.swing.GroupLayout GuardarLayout = new javax.swing.GroupLayout(Guardar);
        Guardar.setLayout(GuardarLayout);
        GuardarLayout.setHorizontalGroup(
            GuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GuardarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        GuardarLayout.setVerticalGroup(
            GuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GuardarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Atras.add(Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 130, 40));

        Descuento.setBackground(new java.awt.Color(193, 211, 1));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("DESCUENTO");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel6MousePressed(evt);
            }
        });

        javax.swing.GroupLayout DescuentoLayout = new javax.swing.GroupLayout(Descuento);
        Descuento.setLayout(DescuentoLayout);
        DescuentoLayout.setHorizontalGroup(
            DescuentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        DescuentoLayout.setVerticalGroup(
            DescuentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DescuentoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Atras.add(Descuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, 130, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Atras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Atras, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NomMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NomMousePressed
        if (Nom.getText().equals("Ingrese Categoria")) {
            Nom.setText("");
            Nom.setForeground(Color.black);
        }
        if (Num.getText().isEmpty()) {
            Num.setText("Ingrese Numero");
            Num.setForeground(Color.gray);
        }
        if (Tarifa.getText().isEmpty()) {
            Tarifa.setText("Ingrese Tarifa");
            Tarifa.setForeground(Color.gray);
        }


    }//GEN-LAST:event_NomMousePressed

    private void TarifaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TarifaMousePressed
        if (Tarifa.getText().equals("Ingrese Tarifa")) {
            Tarifa.setText("");
            Tarifa.setForeground(Color.black);
        }
        if (Num.getText().isEmpty()) {
            Num.setText("Ingrese Numero");
            Num.setForeground(Color.gray);
        }
        if (Nom.getText().isEmpty()) {
            Nom.setText("Ingrese Categoria");
            Nom.setForeground(Color.gray);
        }
    }//GEN-LAST:event_TarifaMousePressed

    private void NumMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NumMousePressed
        if (Num.getText().equals("Ingrese Numero")) {
            Num.setText("");
            Num.setForeground(Color.black);
        }
        if (Nom.getText().isEmpty()) {
            Nom.setText("Ingrese Categoria");
            Nom.setForeground(Color.gray);
        }
        if (Tarifa.getText().isEmpty()) {
            Tarifa.setText("Ingrese Tarifa");
            Tarifa.setForeground(Color.gray);
        }
    }//GEN-LAST:event_NumMousePressed

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        Guardar.setBackground(new Color(232, 255, 1));
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        Guardar.setBackground(new Color(198, 225, 0));
    }//GEN-LAST:event_jLabel7MouseExited

    private void jLabel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MousePressed
        if (Num.getText().isEmpty()
                || Num.getText().equals("")
                || Nom.getText().isEmpty()
                || Nom.getText().equals("")
                || Tarifa.getText().isEmpty()
                || Tarifa.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Algun campo vacio", "IMPORTANTE", JOptionPane.NO_OPTION);
        } else {
            try {
                this.guardar();
                JOptionPane.showMessageDialog(this, "Datos guardados con exito", "Confirmacion", JOptionPane.INFORMATION_MESSAGE);
                this.limpiarCampos();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, ex, "Error de archivo", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jLabel7MousePressed

    private void jLabel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MousePressed
        new GestionDescuento().setVisible(true);
    }//GEN-LAST:event_jLabel6MousePressed

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        Descuento.setBackground(new Color(232, 255, 1));
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        Descuento.setBackground(new Color(198, 225, 0));
    }//GEN-LAST:event_jLabel6MouseExited

    private void NumKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NumKeyTyped
        char C = evt.getKeyChar();
        if (Character.isLetter(C)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "No se puede digitar letras", "IMPORTANTE", JOptionPane.NO_OPTION);
            Num.setCursor(null);
        } else if ((int) evt.getKeyChar() > 32 && (int) evt.getKeyChar() <= 47
                || (int) evt.getKeyChar() >= 58 && (int) evt.getKeyChar() <= 64
                || (int) evt.getKeyChar() >= 91 && (int) evt.getKeyChar() <= 96
                || (int) evt.getKeyChar() >= 123 && (int) evt.getKeyChar() <= 255) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "No se puede digitar Simbolos", "IMPORTANTE", JOptionPane.NO_OPTION);
            Num.setCursor(null);
        }
    }//GEN-LAST:event_NumKeyTyped

    private void NomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NomKeyTyped
        char C = evt.getKeyChar();
        if (Character.isDigit(C)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "No se puede digitar numeros", "IMPORTANTE", JOptionPane.NO_OPTION);
            Nom.setCursor(null);
        } else if ((int) evt.getKeyChar() > 32 && (int) evt.getKeyChar() <= 47
                || (int) evt.getKeyChar() >= 58 && (int) evt.getKeyChar() <= 64
                || (int) evt.getKeyChar() >= 91 && (int) evt.getKeyChar() <= 96
                || (int) evt.getKeyChar() >= 123 && (int) evt.getKeyChar() <= 255) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "No se puede digitar Simbolos", "IMPORTANTE", JOptionPane.NO_OPTION);
            Nom.setCursor(null);
        }
    }//GEN-LAST:event_NomKeyTyped

    private void TarifaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TarifaKeyTyped
        char C = evt.getKeyChar();
        if (Character.isLetter(C)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "No se puede digitar letras", "IMPORTANTE", JOptionPane.NO_OPTION);
            Tarifa.setCursor(null);
        } else if ((int) evt.getKeyChar() > 32 && (int) evt.getKeyChar() <= 47
                || (int) evt.getKeyChar() >= 58 && (int) evt.getKeyChar() <= 64
                || (int) evt.getKeyChar() >= 91 && (int) evt.getKeyChar() <= 96
                || (int) evt.getKeyChar() >= 123 && (int) evt.getKeyChar() <= 255) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "No se puede digitar Simbolos", "IMPORTANTE", JOptionPane.NO_OPTION);
            Tarifa.setCursor(null);
        }
    }//GEN-LAST:event_TarifaKeyTyped

    /**
     * @param args the command line argumens
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Atras;
    private javax.swing.JPanel Descuento;
    private javax.swing.JPanel Guardar;
    private javax.swing.JTextField Nom;
    private javax.swing.JTextField Num;
    private javax.swing.JTextField Tarifa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
