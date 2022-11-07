
package Modelo;
import Datos.ILibroVehiculo;
import Datos.Peaje;

import Entidades.Vehiculo;
import java.util.ArrayList;


public class Servico {
    private ILibroVehiculo libroelectronico;
    public Servico(){
        this.libroelectronico = new Peaje();
    }
    
    public void registrarVehiculo(Vehiculo v){
        this.libroelectronico.gregarVehiculo(v);
    }
}