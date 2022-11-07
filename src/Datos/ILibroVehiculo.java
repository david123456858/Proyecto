/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Datos;

import Entidades.Vehiculo;
import java.util.ArrayList;

/**
 *
 * @author dulfu
 */
public interface ILibroVehiculo {
    void  gregarVehiculo (Vehiculo V);
    Vehiculo ConsultarVehiculo(String n);    
    ArrayList<Vehiculo> InformePeaje();
}
