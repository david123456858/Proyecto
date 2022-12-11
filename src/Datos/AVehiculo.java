/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;


import Entidades.Vehiculo;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author dulfu
 */
public class AVehiculo implements IVehiculo {
     private File manejadoArchivo;
    private FileWriter modoEscritarua;
    private Scanner modoLectura;

    public AVehiculo() {
        this("Vehiculos.dat");
    }

    public AVehiculo(String n) {
        this.manejadoArchivo = new File(n);
    }

    public File getManejadoArchivo() {
        return manejadoArchivo;
    }

    public void setManejadoArchivo(File manejadoArchivo) {
        this.manejadoArchivo = manejadoArchivo;
    }

    public FileWriter getModoEscritarua() {
        return modoEscritarua;
    }

    public void setModoEscritarua(FileWriter modoEscritarua) {
        this.modoEscritarua = modoEscritarua;
    }

    public Scanner getModoLectura() {
        return modoLectura;
    }

    public void setModoLectura(Scanner modoLectura) {
        this.modoLectura = modoLectura;
    }

    @Override
    public void registrarVehiculo(Vehiculo v) throws IOException {
        PrintWriter pw = null;
        try {
           this.modoEscritarua = new FileWriter(this.manejadoArchivo, true);
            pw = new PrintWriter(this.modoEscritarua);
            pw.printf("%s;%s;%s;%s;%s\n",
                    v.getPlaca(),
                    v.getModelo(),
                    v.getColor(),
                    v.getTipo(),
                    v.getConductor());              
        } catch (FileNotFoundException fne) {
            throw new IOException("Error al escribir en el archivo");
        } catch (IOException ioe) {
            throw new IOException("Error al abrir archvio en modo escritura");
        } catch (SecurityException se) {
            throw new IOException("No tiene privilegios para abrir el archivo");
        } finally {
            if (pw != null) {
                pw.close();
            }
        }
    }
   private Vehiculo cargarVehiculo(String dato[]){
       String placa = dato[0];
       String modelo= dato[1];
       String color = dato [2];
       String tipo = dato [3];
       String nom = dato[4];
       Vehiculo v = new Vehiculo(placa,modelo,color,tipo,nom);
       return v;
   }
    @Override
    public ArrayList<Vehiculo> leetVehiculos() throws IOException {
     ArrayList<Vehiculo> lista;
        if (!this.manejadoArchivo.exists()) {
            lista = new ArrayList();
            return lista;
        }
        try {
            this.modoLectura = new Scanner(this.manejadoArchivo);
            lista = new ArrayList();
            while (this.modoLectura.hasNext()) {
                String dato[] = this.modoLectura.nextLine().split(";");
                Vehiculo v = this.cargarVehiculo(dato);
                lista.add(v);
            }
            return lista;
        } catch (FileNotFoundException fne) {
            throw new IOException("Error al abrir archivo en modo lectura");
        } catch (SecurityException se) {
            throw new IOException("No tiene privilegios para leer el archivo");
        } finally {
            if (this.modoLectura != null) {
                this.modoLectura.close();
            }
        }
    }

    @Override
    public Vehiculo BuscarVehiculo(String v) throws IOException {
        Vehiculo buscada = null;
        try {
            this.modoLectura = new Scanner(this.manejadoArchivo);
            while (this.modoLectura.hasNext()) {
                String dato[] = this.modoLectura.nextLine().split(";");
                Vehiculo f = this.cargarVehiculo(dato);
                if (f.getPlaca().equalsIgnoreCase(v)) {
                    buscada = f;
                    break;
                }
            }
            if (buscada == null) {
                throw new NoSuchElementException("la Categoria  no esta registrada");
            }

            return buscada;

        } catch (FileNotFoundException fne) {
            throw new IOException("Error al abrir archivo en modo lectura");
        } catch (SecurityException se) {
            throw new IOException("No tiene privilegios para leer el archivo");
        } finally {
            if (this.modoLectura != null) {
                this.modoLectura.close();
            }
        }
    }
    }
    
    
    

