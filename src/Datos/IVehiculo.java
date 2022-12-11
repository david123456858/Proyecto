/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Datos;

import Entidades.Vehiculo;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author dulfu
 */
public interface IVehiculo {
    void registrarVehiculo(Vehiculo v)throws IOException;
    ArrayList<Vehiculo> leetVehiculos() throws IOException;
    Vehiculo BuscarVehiculo(String v)throws IOException;
}
