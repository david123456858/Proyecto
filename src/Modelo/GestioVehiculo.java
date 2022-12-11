/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Datos.AVehiculo;
import Datos.IVehiculo;
import Entidades.Vehiculo;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author dulfu
 */
public class GestioVehiculo {

    private IVehiculo archivo;

    public GestioVehiculo() {
        this.archivo = new AVehiculo();
    }

    public void registrarVehiculo(Vehiculo v) throws IOException {
        this.archivo.registrarVehiculo(v);
    }

    public ArrayList<Vehiculo> leetVehiculos() throws IOException {
        return this.archivo.leetVehiculos();

    }

    public Vehiculo BuscarVehiculo(String v) throws IOException {
        return this.archivo.BuscarVehiculo(v);
    }

    public boolean Buscar(String p) throws IOException {
        ArrayList<Vehiculo> lista = this.archivo.leetVehiculos();
        for (Vehiculo v : lista) {
            if (v.getPlaca().equalsIgnoreCase(p)) {
                return true;
            }
        }
        return false;
    }

    public int buscar(String p) throws IOException {
        ArrayList<Vehiculo> lista = this.archivo.leetVehiculos();
        int cont = 0;
        for (Vehiculo v : lista) {
            if (v.getPlaca().equalsIgnoreCase(p)) {
                cont++;
            }
        }
        return cont;
    }
}
