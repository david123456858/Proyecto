/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Datos;

import Entidades.Categoria;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author dulfu
 */
public interface ICategorias {
    void registarCategoria(Categoria c)throws IOException;
    ArrayList<Categoria> leercategorias() throws IOException;
    Categoria BuscarCategoria(String n)throws IOException;
}
