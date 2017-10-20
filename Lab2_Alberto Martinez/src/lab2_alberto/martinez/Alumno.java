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
public class Alumno {

public String nombre;
public int cuenta;
public String carrera;
public int edad;
public double dinero;
public String usuario;
public String contra;
public ArrayList<String>clases=new ArrayList();
public ArrayList<Mensaje>buzon=new ArrayList();

    public Alumno(String nombre, int cuenta, String carrera, int edad, double dinero, String usuario, String contra) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.carrera = carrera;
        this.edad = edad;
        this.dinero = dinero;
        this.usuario = usuario;
        this.contra = contra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
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

    public ArrayList<String> getClases() {
        return clases;
    }

    public void setClases(ArrayList<String> clases) {
        this.clases = clases;
    }

    public ArrayList<Mensaje> getBuzon() {
        return buzon;
    }

    public void setBuzon(ArrayList<Mensaje> buzon) {
        this.buzon = buzon;
    }

    @Override
    public String toString() {
        return nombre ;
    }




    
}
