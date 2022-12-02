
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
    public ArrayList<Vehiculo> InformePeaje(){
        return this.libroelectronico.InformePeaje();
    }
    public Vehiculo cosultarVehiculo(String placa){
        return this.libroelectronico.ConsultarVehiculo(placa);
    }
   
}