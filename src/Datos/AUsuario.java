/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Entidades.Usuario;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class AUsuario implements IUsuario {

    private File manejosArchivo;
    private FileWriter modoEscritura;
    private Scanner modolectura;

    public AUsuario() {
        this("AUsuario.dat");
    }

    public AUsuario(String N) {
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
    public void agregarUsuario(Usuario U) throws IOException {
        PrintWriter pw = null;
        try {
            
            this.modoEscritura = new FileWriter(this.manejosArchivo, true);
            pw = new PrintWriter(this.modoEscritura);
            pw.printf("%d;%s;%s;%s;%s;%s;\n",
                    U.getCC(),
                    U.getNombre(),
                    U.getCorreo(),
                    U.getUsuario(),
                    U.getTipo(),
                    U.getContra());
            
        } catch (FileNotFoundException F) {
            throw new IOException("Error al escribir en el archivo");
        } catch (IOException ioe) {
            throw new IOException("Error al abrir archvio en modo escritura");
        } catch (SecurityException se) {
            throw new IOException("No tiene privilegios para abrir el archivo");
        } catch (NullPointerException n) {
            throw new IOException("elemento null");
        } finally {
            if (pw != null) {
                pw.close();
            }
        }
    }

    private Usuario cargarUsuario(String dato[])  {
        int CC = Integer.valueOf(dato[0]);
        String nombre = dato[1];
        String correo = dato[2];
        String usuario = dato[3];
        String tipo = dato[4];
        String contra = dato[5];
        Usuario U = new Usuario(CC, nombre, correo, usuario, contra, tipo);
        return U;
    }

    @Override
    public ArrayList<Usuario> leerUsuarios() throws IOException {
        ArrayList<Usuario> lista ;
        if (!this.manejosArchivo.exists()) {
            lista = new ArrayList();
            return lista;
        }
        try {
            this.modolectura = new Scanner(this.manejosArchivo);
            lista = new ArrayList();
            while (this.modolectura.hasNext()) {
                String dato[] = this.modolectura.nextLine().split(";");
                Usuario U = this.cargarUsuario(dato);
                lista.add(U);
            }
            return lista;
        } catch (FileNotFoundException fne) {
            throw new IOException("Error al abrir archivo en modo lectura");
        } catch (SecurityException se) {
            throw new IOException("No tiene privilegios para leer el archivo");
        } finally {
            if (this.modolectura != null) {
                this.modolectura.close();
            }
        }
    }

    @Override
    public boolean BuscarAdmin(String tipo) throws IOException {
        boolean encontrado = false;
        try {
            
            this.modolectura = new Scanner(this.manejosArchivo);
            while (this.modolectura.hasNext()) {
                String dato[] = this.modolectura.nextLine().split(";");
                Usuario U = this.cargarUsuario(dato);
                if (U.getTipo().equalsIgnoreCase(tipo)) {
                    encontrado = true;
                    break;
                } else {
                     encontrado =false;
                }
            }
            return encontrado;
        } catch (FileNotFoundException fne) {
            throw new IOException("Error al abrir archivo en modo lectura");
        } catch (SecurityException se) {
            throw new IOException("No tiene privilegios para leer el archivo");
        } finally {
            if (this.modolectura != null) {
                this.modolectura.close();
            }
        }
    }

    @Override
    public Usuario BuscarUsuario(String usuario) throws IOException {
        Usuario buscada = null;
        try {
            this.modolectura = new Scanner(this.manejosArchivo);
            while (this.modolectura.hasNext()) {
                String dato[] = this.modolectura.nextLine().split(";");
                Usuario U = this.cargarUsuario(dato);
                if (U.getUsuario().equalsIgnoreCase(usuario)) {
                    buscada = U;
                    break;
                }
            }
            if (buscada == null) {
                throw new NoSuchElementException("Usuario No registrado");
            }

            return buscada;
        } catch (FileNotFoundException fne) {
            throw new IOException("Error al abrir archivo en modo lectura");
        } catch (SecurityException se) {
            throw new IOException("No tiene privilegios para leer el archivo");
        } finally {
            if (this.modolectura != null) {
                this.modolectura.close();
            }
        }
    }

    /**
     *
     * @param CC
     * @return
     * @throws java.io.IOException
     */
    @Override
    public Usuario obtener(String usuario) throws IOException {
        if (BuscarUsuario(usuario) != null) {
            return BuscarUsuario(usuario);
        } else {
            return null;
        }
    }



}
