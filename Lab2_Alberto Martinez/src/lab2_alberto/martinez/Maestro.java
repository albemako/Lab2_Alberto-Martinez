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
public class Maestro {

    public String nomrbe;
    public String titulo;
    public String maestria;
    public String usuario;
    public String contra;
    public int max;
    public ArrayList<String>clases=new ArrayList();

    public Maestro(String nomrbe, String titulo, String maestria, String usuario, String contra, int max) {
        this.nomrbe = nomrbe;
        this.titulo = titulo;
        this.maestria = maestria;
        this.usuario = usuario;
        this.contra = contra;
        this.max = max;
    }

    public String getNomrbe() {
        return nomrbe;
    }

    public void setNomrbe(String nomrbe) {
        this.nomrbe = nomrbe;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMaestria() {
        return maestria;
    }

    public void setMaestria(String maestria) {
        this.maestria = maestria;
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

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public ArrayList<String> getClases() {
        return clases;
    }

    public void setClases(ArrayList<String> clases) {
        this.clases = clases;
    }

    @Override
    public String toString() {
        return nomrbe ;
    }
    
    
    
}
