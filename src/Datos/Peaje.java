/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Entidades.Vehiculo;
import Modelo.*;
import java.util.ArrayList;

/**
 *
 * @author dulfu
 */
public class Peaje implements ILibroVehiculo {

    private ArrayList<Vehiculo> Vehiculos;

    public Peaje() {
        this.Vehiculos = new ArrayList();
    }

    @Override
    public void gregarVehiculo(Vehiculo V) {
        try {
            this.Vehiculos.add(V);

        } catch (Exception e) {

        }
    }

    @Override
    public Vehiculo ConsultarVehiculo(String n) {
        Vehiculo buscar = null;
        for (Vehiculo c : this.Vehiculos) {
            if (c.getPlaca() == n) {
                buscar = c;
                break;
            }
        }
        return buscar;
    }

    @Override
    public ArrayList<Vehiculo> InformePeaje() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void SetVehiculo(ArrayList<Vehiculo> Vehiculos) {
        this.Vehiculos = Vehiculos;
    }

}
