/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Vista;

import Entidades.Categoria;
import Entidades.Descuento;
import Entidades.Vehiculo;
import Modelo.GestioDescuento;
import Modelo.GestioVehiculo;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.awt.Color;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author dulfu
 */
public class GestionVehiculo extends javax.swing.JDialog {

    private GestioDescuento modeloDescuento;
    private GestioVehiculo modeloVehiculo;

    /**
     * Creates new form GestionVehiculo
     */
    public GestionVehiculo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.modeloDescuento = new GestioDescuento();
        this.modeloVehiculo = new GestioVehiculo();
        this.cargarDescuentos();
    }

    public void Generar() throws IOException {
        DateFormat dateFormat = new SimpleDateFormat("EEE, MMM d, yyyy '@' HH:mm:ss");
        String date = dateFormat.format(Calendar.getInstance().getTime());
        String tipo = "";
        String placa = this.PC.getText();
        String modelo = this.Modelo.getText();
        String color = this.Colo.getText();
        if (PAR.isSelected()) {
            tipo = "Particular";
        } else {
            if (SER.isSelected()) {
                tipo = "Servicio";
            }
        }
        String Nombre = this.NOM.getText();
        double Descuento;
        int c = this.modeloVehiculo.buscar(placa);
        String d = this.Descuentos.getSelectedItem().toString();
        Descuento descuento = this.modeloDescuento.BuscaCategoria(d);
        double total = 0;
        if (descuento != null) {
            double pp = descuento.getParticular();
            double ps = descuento.getServicio();
            int np = descuento.getNumpasesparti();
            int ns = descuento.getNumpasespublic();
            Categoria cate = descuento.getCategoria();
            double tarifa = cate.getFactura();

            if (tipo.equalsIgnoreCase("Particular")) {

                if (c >= np) {
                    double subtolal = pp * tarifa;
                    total = tarifa - subtolal;
                } else {
                    total = tarifa;
                }
            } else {
                if (tipo.equalsIgnoreCase("Servicio")) {
                    if (c >= ns) {
                        double subtotal = ps * tarifa;
                        total = tarifa - subtotal;
                    } else {
                        total = tarifa;
                    }
                }
            }
            JOptionPane.showMessageDialog(this,"           --------TARIFA---------           "+"\n"
                    +" \n---------------------------------------------------------\n "
                    +"Placa del vehiculo : " + placa+"\n"+
                    " \n---------------------------------------------------------\n "
                    + "Conductor : " + Nombre +"\n"+
                    " \n---------------------------------------------------------\n "
                    + " Modelo : " + modelo +"\n"+
                    " \n---------------------------------------------------------\n "
                    + "Fecha/Hora : " + date+"\n"+
                    " \n---------------------------------------------------------\n "
                    + "TOTAL : " + total + "\n"+
                    " \n---------------------------------------------------------\n "
                    + " ", "FACTURA", JOptionPane.INFORMATION_MESSAGE);
        } else {
           JOptionPane.showMessageDialog(this, "No se encontro", "COnfirmacion", JOptionPane.INFORMATION_MESSAGE);
        }

    }

    private Vehiculo leerDatos() throws IOException {
        String tipo = "";
        String placa = this.PC.getText();
        String modelo = this.Modelo.getText();
        String color = this.Colo.getText();
        if (PAR.isSelected()) {
            tipo = "Particular";
        } else {
            if (SER.isSelected()) {
                tipo = "Servicio";
            }
        }
        String Nombre = this.NOM.getText();
        return new Vehiculo(placa, modelo, color, tipo, Nombre);
    }

    public void cargarDescuentos() {
        try {
            ArrayList<Descuento> lista = this.modeloDescuento.leerDescuentos();
            for (Descuento d : lista) {
                this.Descuentos.addItem(d.getCategoria().getNombre());
            }
        } catch (IOException io) {
            JOptionPane.showMessageDialog(this, io, "Error de archivo", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void Guardar() throws IOException {
        Vehiculo v = this.leerDatos();
        this.modeloVehiculo.registrarVehiculo(v);
        JOptionPane.showMessageDialog(this, "Datos guardados con exito", "COnfirmacion", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Botones = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Placa = new javax.swing.JLabel();
        PC = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        Modelo = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        Colo = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        PAR = new javax.swing.JRadioButton();
        SER = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        Descuentos = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        GE = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        CO = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        NOM = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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
                .addGap(301, 301, 301)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(348, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 745, 110));

        Placa.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        Placa.setForeground(new java.awt.Color(0, 0, 0));
        Placa.setText("PLACA");
        jPanel1.add(Placa, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        PC.setBackground(new java.awt.Color(255, 255, 255));
        PC.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        PC.setForeground(new java.awt.Color(102, 102, 102));
        PC.setText("Ingrese Placa");
        PC.setToolTipText("");
        PC.setBorder(null);
        PC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PCMousePressed(evt);
            }
        });
        jPanel1.add(PC, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 200, 20));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 210, 10));

        jLabel2.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("MODELO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 60, -1));

        Modelo.setBackground(new java.awt.Color(255, 255, 255));
        Modelo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Modelo.setForeground(new java.awt.Color(102, 102, 102));
        Modelo.setText("Ingrese Modelo");
        Modelo.setBorder(null);
        Modelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ModeloMousePressed(evt);
            }
        });
        jPanel1.add(Modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 180, 20));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 220, 10));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("COLOR");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));

        Colo.setBackground(new java.awt.Color(255, 255, 255));
        Colo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Colo.setForeground(new java.awt.Color(102, 102, 102));
        Colo.setText("Ingrese Color");
        Colo.setBorder(null);
        Colo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ColoMousePressed(evt);
            }
        });
        jPanel1.add(Colo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 140, 20));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 210, 10));

        Botones.add(PAR);
        PAR.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        PAR.setForeground(new java.awt.Color(0, 0, 0));
        PAR.setText("Particular");
        jPanel1.add(PAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, -1, -1));

        Botones.add(SER);
        SER.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        SER.setForeground(new java.awt.Color(0, 0, 0));
        SER.setText("Servicio Publico");
        jPanel1.add(SER, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("TIPO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, -1, -1));

        Descuentos.setBackground(new java.awt.Color(255, 255, 255));
        Descuentos.setForeground(new java.awt.Color(0, 0, 0));
        Descuentos.setToolTipText("");
        jPanel1.add(Descuentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 580, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Categoria");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 140, -1));

        GE.setBackground(new java.awt.Color(193, 211, 1));
        GE.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("GENERAR");
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
        GE.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 40));

        jPanel1.add(GE, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 170, 40));

        CO.setBackground(new java.awt.Color(193, 211, 1));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("CONSULTAR");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });

        javax.swing.GroupLayout COLayout = new javax.swing.GroupLayout(CO);
        CO.setLayout(COLayout);
        COLayout.setHorizontalGroup(
            COLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        COLayout.setVerticalGroup(
            COLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(CO, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 410, -1, -1));

        jLabel8.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("PROPIETARIO");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        NOM.setBackground(new java.awt.Color(255, 255, 255));
        NOM.setForeground(new java.awt.Color(102, 102, 102));
        NOM.setText("Ingrese Nombre");
        NOM.setBorder(null);
        NOM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NOMMousePressed(evt);
            }
        });
        jPanel1.add(NOM, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 140, -1));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 210, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PCMousePressed
        if (PC.getText().equals("Ingrese Placa")) {
            PC.setText("");
            PC.setForeground(Color.black);
        }
        if (Colo.getText().isEmpty()) {
            Colo.setText("Ingrese Color");
            Colo.setForeground(Color.gray);
        }
        if (Modelo.getText().isEmpty()) {
            Modelo.setText("Ingrese Modelo");
            Modelo.setForeground(Color.gray);
        }
        if (NOM.getText().isEmpty()) {
            NOM.setText("Ingrese Nombre");
            NOM.setForeground(Color.gray);
        }

    }//GEN-LAST:event_PCMousePressed

    private void ModeloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModeloMousePressed
        if (Modelo.getText().equals("Ingrese Modelo")) {
            Modelo.setText("");
            Modelo.setForeground(Color.black);
        }
        if (Colo.getText().isEmpty()) {
            Colo.setText("Ingrese Color");
            Colo.setForeground(Color.gray);
        }
        if (PC.getText().isEmpty()) {
            PC.setText("Ingrese Placa");
            PC.setForeground(Color.gray);
        }
        if (NOM.getText().isEmpty()) {
            NOM.setText("Ingrese Nombre");
            NOM.setForeground(Color.gray);
        }
    }//GEN-LAST:event_ModeloMousePressed

    private void ColoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ColoMousePressed
        if (Colo.getText().equals("Ingrese Color")) {
            Colo.setText("");
            Colo.setForeground(Color.black);
        }
        if (PC.getText().isEmpty()) {
            PC.setText("Ingrese Placa");
            PC.setForeground(Color.gray);
        }
        if (Modelo.getText().isEmpty()) {
            Modelo.setText("Ingrese Modelo");
            Modelo.setForeground(Color.gray);
        }
        if (NOM.getText().isEmpty()) {
            NOM.setText("Ingrese Nombre");
            NOM.setForeground(Color.gray);
        }
    }//GEN-LAST:event_ColoMousePressed

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        GE.setBackground(new Color(232, 255, 1));
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        GE.setBackground(new Color(198, 225, 0));
    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        CO.setBackground(new Color(232, 255, 1));
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        CO.setBackground(new Color(198, 225, 0));
    }//GEN-LAST:event_jLabel7MouseExited

    private void jLabel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MousePressed

        try {
            this.Guardar();
            this.Generar();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex, "Error de archivo", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_jLabel6MousePressed

    private void NOMMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NOMMousePressed
        if (NOM.getText().equals("Ingrese Nombre")) {
            NOM.setText("");
            NOM.setForeground(Color.black);
        }
        if (Modelo.getText().isEmpty()) {
            Modelo.setText("Ingrese Modelo");
            Modelo.setForeground(Color.gray);
        }
        if (PC.getText().isEmpty()) {
            PC.setText("Ingrese Placa");
            PC.setForeground(Color.gray);
        }
        if (Colo.getText().isEmpty()) {
            Colo.setText("Ingrese Color");
            Colo.setForeground(Color.gray);
        }
    }//GEN-LAST:event_NOMMousePressed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Botones;
    private javax.swing.JPanel CO;
    private javax.swing.JTextField Colo;
    private javax.swing.JComboBox<String> Descuentos;
    private javax.swing.JPanel GE;
    private javax.swing.JTextField Modelo;
    private javax.swing.JTextField NOM;
    private javax.swing.JRadioButton PAR;
    private javax.swing.JTextField PC;
    private javax.swing.JLabel Placa;
    private javax.swing.JRadioButton SER;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables
}
