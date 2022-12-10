/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Datos.AUsuario;
import Datos.IUsuario;
import Entidades.Usuario;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author dulfu
 */
public class GestioUsuario {

    private IUsuario archivo;
    
    public GestioUsuario() {
        this.archivo = new AUsuario();
    }

    public void agregarUsuario(Usuario U) throws IOException {
        this.archivo.agregarUsuario(U);
    }

    public ArrayList<Usuario> leerUsuarios() throws IOException {
        return this.archivo.leerUsuarios();
    }

    public Usuario BuscarUsuario(String usuario) throws IOException {
        return this.archivo.BuscarUsuario(usuario);
    }

    public boolean BuscarAdmin(String tipo) throws IOException {
        return this.archivo.BuscarAdmin(tipo);
    }

    public Usuario Buscar(String user) throws IOException {
        ArrayList<Usuario> lista = this.archivo.leerUsuarios();
        System.out.println(lista);
        for (Usuario g: lista) {
            if (g.getUsuario().equalsIgnoreCase(user)) {
                return g;
            }            
        }
        
        return null;
        
    }
    
    public boolean Autentificar(String usuario, String contra) throws IOException {
        if (Buscar(usuario) != null) {
            Usuario Consulta = Buscar(usuario);
            return Consulta.getUsuario().equalsIgnoreCase(usuario) && Consulta.getContra().equalsIgnoreCase(contra);
        } else {
            
            return false;
        }
        
    }

    public Usuario obtener(String usuario) throws IOException {
        return archivo.obtener(usuario);
    }
}
