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
        this.archivo = new AUsuario() ;
    }
    public  void agregarUsuario(Usuario U)throws IOException{
        this.archivo.agregarUsuario(U);
    }
    public ArrayList<Usuario> leerUsuarios()throws IOException{
        return this.archivo.leerUsuarios();
    }
    public Usuario BuscarUsuario(String usuario)throws IOException{
        return this.archivo.BuscarUsuario(usuario);
    }
    public boolean BuscarAdmin() throws IOException{
        return this.archivo.BuscarAdmin();
    }
    public boolean Autentificar (String usuario, String contra)throws IOException{
        if(obtener(usuario)!=null){
            Usuario Consulta = obtener(usuario);
            if(Consulta.getUsuario().equals(usuario)&&Consulta.getContra().equals(contra)){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
        
    }
    public Usuario obtener(String usuario) throws IOException{
        return archivo.obtener(usuario);
    }
}