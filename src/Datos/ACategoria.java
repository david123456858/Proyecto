/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Entidades.Categoria;
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
public class ACategoria implements ICategorias {

    private File manejadoArchivo;
    private FileWriter modoEscritarua;
    private Scanner modoLectura;

    public ACategoria() {
        this("Categorias.dat");
    }

    public ACategoria(String name) {
        this.manejadoArchivo = new File(name);
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
    public void registarCategoria(Categoria c) throws IOException {
        PrintWriter pw = null;
        try {
           this.modoEscritarua = new FileWriter(this.manejadoArchivo, true);
            pw = new PrintWriter(this.modoEscritarua);
            pw.printf("%s;%s;%.3f",
                    c.getNum(),
                    c.getNombre(),
                    c.getFactura());
            
            
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

    private Categoria cargarCategoria(String dato[]) {
        String num = dato[0];
        String nombre = dato[1];
        double factura = Double.valueOf(dato[2].replace(",", "."));
        Categoria categoria = new Categoria(num, nombre, factura);
        return categoria;
    }

    @Override
    public ArrayList<Categoria> leercategorias() throws IOException {
        ArrayList<Categoria> lista;
        if (!this.manejadoArchivo.exists()) {
            lista = new ArrayList();
            return lista;
        }
        try {
            this.modoLectura = new Scanner(this.manejadoArchivo);
            lista = new ArrayList();
            while (this.modoLectura.hasNext()) {
                String dato[] = this.modoLectura.nextLine().split(";");
                Categoria s = this.cargarCategoria(dato);
                lista.add(s);
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
    public Categoria BuscarCategoria(String n) throws IOException {
        Categoria buscada = null;
        try {
            this.modoLectura = new Scanner(this.manejadoArchivo);
            while (this.modoLectura.hasNext()) {
                String dato[] = this.modoLectura.nextLine().split(";");
                Categoria c = this.cargarCategoria(dato);
                if (c.getNum().equalsIgnoreCase(n)) {
                    buscada = c;
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
