/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import Modelo.*;

/**
 *
 * @author dulfu
 */
public class Vehiculo {

    private String Placa;
    private String Marca;
    private String Propietario;
    private String Modelo;
    private String Cedula;
    private int Numejes;
    private int categoria;

    public Vehiculo() {
    }

    public Vehiculo(String Placa, String Marca, String Propietario, String Modelo, String Cedula, int Numejes, int categoria) {
        this.Placa = Placa;
        this.Marca = Marca;
        this.Propietario = Propietario;
        this.Modelo = Modelo;
        this.Cedula = Cedula;
        this.Numejes = Numejes;
        this.categoria = categoria;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getPropietario() {
        return Propietario;
    }

    public void setPropietario(String Propietario) {
        this.Propietario = Propietario;
    }

    public String getModelp() {
        return Modelo;
    }

    public void setModelp(String Modelp) {
        this.Modelo= Modelp;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public int getNumejes() {
        return Numejes;
    }

    public void setNumejes(int Numejes) {
        this.Numejes = Numejes;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }
//
//    @Override
//    public String toString() {
//        return Placa+Marca+Propietario+Modelo+Cedula+Numejes+categoria;
//    }
    
    

}
