/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Datos.ACategoria;
import Datos.ICategorias;
import Entidades.Categoria;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author dulfu
 */
public class GestioCategorias {
    private ICategorias archivo;

    public GestioCategorias() {
        this.archivo = new ACategoria();
    }
    public void registrarCategoria(Categoria c)throws IOException{
        this.archivo.registarCategoria(c);
    }
    public ArrayList<Categoria> leercategorias() throws IOException{
        return this.archivo.leercategorias();
    }
     public Categoria BuscarCategoria(String n) throws IOException{
         return this.archivo.BuscarCategoria(n);
     }
}
