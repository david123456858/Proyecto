/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author dulfu
 */
public class Vehiculo {

    private String placa;
    private String Modelo;
    private String color;
    private String tipo;
    private String conductor;
    public Vehiculo() {
    }

    public Vehiculo(String placa, String Modelo, String color, String tipo, String conductor) {
        this.placa = placa;
        this.Modelo = Modelo;
        this.color = color;
        this.tipo = tipo;
        this.conductor = conductor;
    }

    public String getConductor() {
        return conductor;
    }

    public void setConductor(String conductor) {
        this.conductor = conductor;
    }
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "placa=" + placa + ", Modelo=" + Modelo + ", color=" + color + ", tipo=" + tipo + '}';
    }

}
