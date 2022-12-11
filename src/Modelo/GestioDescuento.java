/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Datos.ADescuento;
import Datos.IDescuento;
import Entidades.Descuento;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author dulfu
 */
public class GestioDescuento {
    private IDescuento archivo;

    public GestioDescuento() {
        this.archivo = new  ADescuento();
    }
   
   public void registrarDescuentos(Descuento d)throws IOException{
        this.archivo.registrarDescuentos(d);
    }
    public ArrayList<Descuento> leerDescuentos()throws IOException{
         return this.archivo.leerDescuentos();
     }
    public void ModificarDescuento(Descuento d)throws IOException{
         this.archivo.ModificarDescuento(d);
     }
    public Descuento BuscaCategoria(String n)throws IOException{
        ArrayList<Descuento> lista = this.archivo.leerDescuentos();
        for(Descuento d: lista){
            if(d.getCategoria().getNombre().equalsIgnoreCase(n)){
                return d;
            }
        }
        return null;
    }
    
}
