/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Entidades.Categoria;
import Entidades.Descuento;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author dulfu
 */
public class ADescuento implements IDescuento {

    private File manejosArchivo;
    private FileWriter modoEscritura;
    private Scanner modolectura;

    public ADescuento() {
        this("ADescuento.dat");
    }

    public ADescuento(String N) {
        this.manejosArchivo = new File(N);
    }

    public File getManejosArchivo() {
        return manejosArchivo;
    }

    public void setManejosArchivo(File manejosArchivo) {
        this.manejosArchivo = manejosArchivo;
    }

    public FileWriter getModoEscritura() {
        return modoEscritura;
    }

    public void setModoEscritura(FileWriter modoEscritura) {
        this.modoEscritura = modoEscritura;
    }

    public Scanner getModolectura() {
        return modolectura;
    }

    public void setModolectura(Scanner modolectura) {
        this.modolectura = modolectura;
    }
    
    

    @Override
    public void registrarDescuentos(Descuento d) throws IOException {
            PrintWriter pw = null;
        try {
            this.modoEscritura = new FileWriter(this.manejosArchivo, true);
            pw = new PrintWriter(this.modoEscritura);
           pw.printf("%.2f;%.2f;%d;%d;%s",
                    d.getParticular(),
                    d.getServicio(),
                    d.getNumpasespublic(),
                    d.getNumpasesparti(),
                    d.getCategoria().getNombre());
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

    @Override
    public ArrayList<Descuento> leerDescuentos() throws IOException {
      ArrayList<Descuento> lista ;
        if(!this.manejosArchivo.exists()){
           lista = new ArrayList();
           return lista;
        }
        try {
            this.modolectura = new Scanner(this.manejosArchivo);
            lista = new ArrayList();
            while (this.modolectura.hasNext()) {
                String dato[] = this.modolectura.nextLine().split(";");
                Descuento s = this.cargarDescuento(dato);
                lista.add(s);
            }
            return lista;
        } catch (FileNotFoundException fne) {
            throw new IOException("Error al abrir archivo en modo lectura");
        } catch (SecurityException se) {
            throw new IOException("No tiene privilegios para leer el archivo");
        }
        finally{
            if(this.modolectura!=null)
                this.modolectura.close();
        }  
    }
    private Descuento cargarDescuento(String dato[])throws IOException{
      double particula = Double.valueOf(dato[0].replace(',', '.'));
      double servicio = Double.valueOf(dato[1].replace(',', '.'));
      int nump = Integer.valueOf(dato[2]);
      int nums = Integer.valueOf(dato[3]);
      String nombre = dato[4];
      ACategoria acategoria = new ACategoria();
      Categoria categoria = acategoria.BuscarCategoria(nombre);
      Descuento d = new Descuento(particula,servicio,nump,nums,categoria);
      return d;
    }

    @Override
    public void ModificarDescuento(Descuento d) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
