/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author jairo
 */
public class Teclado {
    private static Scanner entrada = new Scanner(System.in);
    
    public static int leerInt(String dato){
        Menu.printTexto(dato);
        return entrada.nextInt();
    }
    public static int leerInt(String dato, String marcador){
        Menu.printTexto(dato, marcador);
        return entrada.nextInt();
    }
    
    public static double leerDouble(String dato){
        Menu.printTexto(dato);
        return entrada.nextDouble();
    }
    
    public static String leerLinea(String dato){
       Menu.printTexto(dato);
        entrada = new Scanner(System.in);
        return entrada.nextLine();
    }
    
    public static String leerString(String dato){
       Menu.printTexto(dato);
        entrada = new Scanner(System.in);
        return entrada.nextLine();
    }
    
    
    
//    public static LocalDate leerFecha(String titulo) {
//        System.out.println(titulo);
//        int dia = Teclado.leerInt("  Dia[dd] ");
//        int mes = Teclado.leerInt("  Mes[mm] ");
//        int año = Teclado.leerInt("  Año[aaaa] ");
//        return LocalDate.of(año, mes, dia);
//    }
    
}
