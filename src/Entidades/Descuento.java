/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author dulfu
 */
public class Descuento {
    private double particular;
    private double  servicio;
    private int numpasesparti;
    private int numpasespublic;
    private Categoria categoria;

    public Descuento() {
    }

    public Descuento(double particular, double servicio, int numpasesparti, int numpasespublic,Categoria categoria) {
        this.particular = particular;
        this.servicio = servicio;
        this.numpasesparti = numpasesparti;
        this.numpasespublic = numpasespublic;
        this.categoria = categoria;
    }

    public double getParticular() {
        return particular;
    }

    public void setParticular(double particular) {
        this.particular = particular;
    }

    public double getServicio() {
        return servicio;
    }

    public void setServicio(double servicio) {
        this.servicio = servicio;
    }

    public int getNumpasesparti() {
        return numpasesparti;
    }

    public void setNumpasesparti(int numpasesparti) {
        this.numpasesparti = numpasesparti;
    }

    public int getNumpasespublic() {
        return numpasespublic;
    }

    public void setNumpasespublic(int numpasespublic) {
        this.numpasespublic = numpasespublic;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Descuento{" + "particular=" + particular + ", servicio=" + servicio + ", numpasesparti=" + numpasesparti + ", numpasespublic=" + numpasespublic + ", categoria=" + categoria + '}';
    }
    
}
