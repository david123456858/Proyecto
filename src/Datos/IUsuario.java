/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Datos;

import Entidades.Usuario;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author dulfu
 */
public interface IUsuario {
    
    
    void agregarUsuario(Usuario U)throws IOException;
    ArrayList<Usuario> leerUsuarios()throws IOException;
    Usuario BuscarUsuario(String usuario)throws IOException;
    public Usuario obtener(String usuario) throws IOException;
    public boolean BuscarAdmin(String tipo) throws IOException;
   
}
