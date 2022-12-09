/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Datos;

import Entidades.Descuento;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author dulfu
 */
public interface IDescuento {
    void registrarDescuentos(Descuento d)throws IOException;
    ArrayList<Descuento> leerDescuentos()throws IOException;
    void ModificarDescuento(Descuento d)throws IOException;
}
