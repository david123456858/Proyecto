/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

public class Usuario {
    private int CC;
    private String usuario;
    private String contra;
    private String nombre;
    private String correo;
    private String tipo;

    public Usuario() {
    }

    public Usuario(int CC , String nombre, String correo,String usuario,String contra, String tipo) {
        this.usuario = usuario;
        this.contra = contra;
        this.nombre = nombre;
        this.correo = correo;
        this.tipo = tipo;
        this.CC = CC;
        
    }

    public int getCC() {
        return CC;
    }

    public void setCC(int CC) {
        this.CC = CC;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Usuario{" + "CC=" + CC + ", usuario=" + usuario + ", contra=" + contra + ", nombre=" + nombre + ", correo=" + correo + ", tipo=" + tipo + '}';
    }

}
