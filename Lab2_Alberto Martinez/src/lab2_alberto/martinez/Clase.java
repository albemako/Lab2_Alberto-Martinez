/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_alberto.martinez;

import java.util.ArrayList;

/**
 *
 * @author Alberto
 */
public class Clase {
    public String nombre;
    public String  seccion;
    public int max;
    public Maestro maestro;
    public int unidades;
    public double precio;
    public ArrayList <Alumno>alumnos=new ArrayList();

    public Clase(String nombre, String seccion, int max, Maestro maestro, int unidades, double precio) {
        this.nombre = nombre;
        this.seccion = seccion;
        this.max = max;
        this.maestro = maestro;
        this.unidades = unidades;
        this.precio = precio;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public Maestro getMaestro() {
        return maestro;
    }

    public void setMaestro(Maestro maestro) {
        this.maestro = maestro;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    
    @Override
    public String toString() {
        return nombre;
    }
    
    

}
