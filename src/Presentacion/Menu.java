package Presentacion;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import javax.swing.JOptionPane;
import Presentacion.VistaConsola;

/**
 *
 * @author dulfu
 */
public class Menu {
public static int imprimirMenu(String titulo, String opciones[]){
        Menu.tituloVista(titulo);
        for(int i=0; i<opciones.length; i++){
            System.out.printf("| %-35s |%n", opciones[i]);
        }
        System.out.println("---------------------------------------");
        int opc = Teclado.leerInt("Seleccione una opcion:");
        return opc;
    }
     public static void tituloVista(String titulo){
        System.out.println("\n---------------------------------------");
        System.out.printf("| %-35s |%n", titulo.toUpperCase());
        System.out.println("---------------------------------------");
    }
    
    public static void msgExito(){
        System.out.println("!! Operacion realizada con exito ¡¡");
    }
    
    public static void msgNoEncontrada(){
        System.out.println("!! La cuenta no se encuentra registrada ¡¡");
    }
    
    public static int msgConfirmacion(){
        int opc;
        do{
            opc = Teclado.leerInt("¿Desea confirmar ? [1->si] [2->no]","");
        }while(opc!=1 && opc!=2);
        return opc;
    }
    
    public static void printTexto(String dato){
        System.out.printf("%s %-15s:",">>",dato);
    }
    
    public static void printTexto(String dato, String marcador){
        System.out.printf("%s %-15s:",marcador,dato);
    }
}
