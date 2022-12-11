package Presentacion;
//
//import Datos.Peaje;
//import Entidades.Vehiculo;
//import Modelo.Servico;
import java.io.PrintStream;
import javax.swing.JOptionPane;
import java.util.ArrayList;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author dulfu
 */
//public class VistaConsola {
//
//    private Servico servicio;
//    private String menuGeneral[] = {"1. Registro de Vehiculo",
//        "2. Consulta de vehiculo",
//        "3. Informe de vehiculo",
//        "4. Salir",
//        "0. Salir"};
//    private int opcMenuGeneral;
//    public VistaConsola() {
//        this.servicio = new Servico();
//    }
//    private void BuscarVehiculo(){
//        String placa = Teclado.leerString("Seleccione placa: ");
//        Vehiculo v = this.servicio.cosultarVehiculo(placa);
//    }
//    private void InformePeaje(){
//        System.out.println("");
//        ArrayList<Vehiculo> disponibles = this.servicio.InformePeaje();
//        int i = disponibles.size();
//        System.out.printf("Vehiculos Registrados en el peaje:[ %d ]%n", i);
//        System.out.println("-------------------------------------------------------------");
//         if (disponibles.size() > 0) {
//            PrintStream printf = System.out.printf("%s\t\t%s\t\t%s\t\t%s\t\t%s\t\t%i\t\t%i\n", "Placa", "Marca", "Propietario", "Modelo","Cedula","Nmejes","Categoria");
//          for (Vehiculo v : disponibles) {
//            System.out.print(v.INFO());
//        }  
//        }
//    }
//    private void VistaRegistarVehiculo() {
//        Vehiculo vehiculoadd;
//        Menu.tituloVista(this.menuGeneral[this.opcMenuGeneral - 1]);
//        int Numeje = 0;
//        int Categoria = 0;
//        String Placa = Teclado.leerString("Ingrese la placa del vehiculo: ");
//        String Marca = Teclado.leerString("Ingrese la marca del vehiculo:");
//        String Propietario = Teclado.leerString("Ingrese el nombre del propietario");
//        String Modelo = Teclado.leerString("Ingrese el modelo del vehiculo");
//        String Cedula = Teclado.leerString("Ingrese la cedula del propietario");
//        boolean seguir = false;
//        while (seguir) {
//            try {
//
//                Numeje = Teclado.leerInt("Ingrese el numero de ejes del vehiculo: ");
//                if (Numeje >= 2 && Numeje <= 8) {
//                    seguir = true;
//                }
//            } catch (Exception e) {
//
//            }
//        }
//        if (Numeje == 2 || Numeje == 3) {
//            Categoria = 1;
//        } else {
//            if (Numeje == 4 || Numeje == 6) {
//                Categoria = 2;
//            } else {
//                if (Numeje == 7 || Numeje == 8) {
//                    Categoria = 3;
//                }
//            }
//        }
//        vehiculoadd = new Vehiculo(Placa, Marca, Propietario, Modelo, Cedula, Numeje, Categoria);
//        if (Menu.msgConfirmacion() == 1) {
//            this.servicio.registrarVehiculo(vehiculoadd);
//            Menu.msgExito();
//        }
//    }
//    public void menuGeneral() {
//        do {
//            this.opcMenuGeneral = Menu.imprimirMenu("MENU GENERAL", this.menuGeneral);
//            switch (this.opcMenuGeneral) {
//                case 1:
//                    this.VistaRegistarVehiculo();
//                    break;
//                case 2:
//                    this.BuscarVehiculo();
//                    break;
//                case 3:
//                    this.InformePeaje();
//                    break;
//                case 4:
//                    
//                    break;
//                case 5:
//                    
//                    break;
//                case 0:
//                    this.vistaSalir();
//            }
//        } while (this.opcMenuGeneral != 0);
//    }
//    private void vistaSalir() {
//        Menu.tituloVista("** Fin de la ejecucion del programa **");
//    }
//}
