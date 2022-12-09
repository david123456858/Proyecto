
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author dulfu
 */
public class Categoria {
    private String num;
    private String Nombre;
    private double factura;

    public Categoria() {
    }

    public Categoria(String num, String Nombre, double factura) {
        this.num = num;
        this.Nombre = Nombre;
        this.factura = factura;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getFactura() {
        return factura;
    }

    public void setFactura(double factura) {
        this.factura = factura;
    }

    @Override
    public String toString() {
        return "Categoria{" + "num=" + num + ", Nombre=" + Nombre + ", factura=" + factura + '}';
    }
    
}
