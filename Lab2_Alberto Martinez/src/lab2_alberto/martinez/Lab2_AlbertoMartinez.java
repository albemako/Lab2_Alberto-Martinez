
package lab2_alberto.martinez;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Lab2_AlbertoMartinez {


    public static void main(String[] args) {
        ArrayList <Maestro> maestros=new ArrayList();
        ArrayList <Clase> clases=new ArrayList();
        ArrayList <Alumno> alumnos=new ArrayList();
        String op="";
        while ( !op.equals("s") ) {  
            if(!maestros.isEmpty()){
                for (int i = 0; i < maestros.size(); i++) {
                    for (int j = 0; j < maestros.get(i).clases.size(); j++) {
                        for (int k = 0; k < clases.size(); k++) {
                            if (maestros.get(i).clases.get(j).equals(clases.get(k).getSeccion())){
                                if(clases.get(k).getMaestro()==null){
                                    clases.get(k).setMaestro(maestros.get(i));  
                                }
                            }
                        }
                    }
                }
            }
            op=JOptionPane.showInputDialog(""
                    + "a-Administracion\n"
                    + "b-Matricula\n"
                    + "c-LOGIN\n"
                    + "d-listar clases\n"
                    + "e-listar maestros\n"
                    + "f-listar alumnos\n"
                    + "s-salir");
            if(op==null){
                op="s";
            }
            if (op.equals("a")) {
                if(clases.isEmpty()){
                    JOptionPane.showMessageDialog(null, "No Hay clases Hechas asi que cree una!");
                    String nombre, seccion;
                    int  max, unidades;
                    double precio;
                    nombre=JOptionPane.showInputDialog("Nombre");
                    seccion=JOptionPane.showInputDialog("Seccion");
                    max=Integer.parseInt(JOptionPane.showInputDialog("Maxima cantidad de alumnos"));
                    unidades=Integer.parseInt(JOptionPane.showInputDialog("Unidades valorativas"));
                    precio=Integer.parseInt(JOptionPane.showInputDialog("Precio"));
                    
                    clases.add(new Clase(nombre,seccion, max,  null, unidades, precio));
                    JOptionPane.showMessageDialog(null, "Clase agregada con exito!");
                }else{
                    String op2="";
                    op2=JOptionPane.showInputDialog(""
                    + "a-Agregar Maestro\n"
                    + "b-Agregar Clase\n"
                    + "s-Salir\n");
                    
                    if (op2.equals("a")) {
                        String nombre, titulo, maestria, usuario, contra;
                        int max, numclases;
                        Maestro maestro;
                        nombre=JOptionPane.showInputDialog("Nombre");
                        max=Integer.parseInt(JOptionPane.showInputDialog("Maxima cantidad de clases que puede impartir"));
                        titulo=JOptionPane.showInputDialog("Titulo");
                        maestria=JOptionPane.showInputDialog("Maestria");
                        usuario=JOptionPane.showInputDialog("Usuario");
                        contra=JOptionPane.showInputDialog("Contraseña");
                        
                        maestro=new Maestro(nombre,titulo, maestria, usuario, contra, max);
                        numclases=Integer.parseInt(JOptionPane.showInputDialog("Cuantas clases imparte?"));
                        if(numclases>max){
                            JOptionPane.showMessageDialog(null, "Excede el maximo de clases que puede impartir");
                        }else{
                            for (int i = 0; i < numclases; i++) {
                                String seccion;
                                seccion=JOptionPane.showInputDialog("Numero de seccion de la clase que imparte");
                                maestro.clases.add(seccion);
                                
                            }
                        maestros.add(maestro);
                        JOptionPane.showMessageDialog(null, "Maestro agregado con exito!");
                        }
                        
                    }
                    if (op2.equals("b")) {
                        String nombre, seccion;
                        int  max, unidades;
                        double precio;
                        nombre=JOptionPane.showInputDialog("Nombre");
                        seccion=JOptionPane.showInputDialog("Seccion");
                        max=Integer.parseInt(JOptionPane.showInputDialog("Maxima cantidad de alumnos"));
                        unidades=Integer.parseInt(JOptionPane.showInputDialog("Unidades valorativas"));
                        precio=Integer.parseInt(JOptionPane.showInputDialog("Precio"));

                        clases.add(new Clase(nombre,seccion, max,  null, unidades, precio));
                        JOptionPane.showMessageDialog(null, "Clase agregada con exito!");
                    }
                }
                
            }
            if (op.equals("b")) {
                String nombre, carrera, usuario, contra;
                int  cuenta, edad;
                double dinero;
                JOptionPane.showMessageDialog(null, "Registrar Usuario");
                
                nombre=JOptionPane.showInputDialog("Nombre");
                cuenta=Integer.parseInt(JOptionPane.showInputDialog("Numero de cuenta"));
                carrera=JOptionPane.showInputDialog("Carrera");
                edad=Integer.parseInt(JOptionPane.showInputDialog("Edad"));
                dinero=Double.parseDouble(JOptionPane.showInputDialog("Edad"));
                usuario=JOptionPane.showInputDialog("Usuario");
                contra=JOptionPane.showInputDialog("Contra");

                alumnos.add(new Alumno(nombre,cuenta, carrera,  edad, dinero, usuario, contra));
                JOptionPane.showMessageDialog(null, "Registrado con exito!");
               
            }
            if (op.equals("c")) {
               
            }
            if (op.equals("d")) {
                String s="";
                for (Clase t : clases) {
                    if (t instanceof Clase) {
                       s+= ""+(clases.indexOf(t)+1)+"- "+t+"\n" ;
                    }
                }
                JOptionPane.showMessageDialog(null, s);
            }
            if (op.equals("e")) {
                String s="";
                for (Maestro t : maestros) {
                    if (t instanceof Maestro) {
                       s+= ""+(maestros.indexOf(t)+1)+"- "+t+"\n" ;
                    }
                }
                JOptionPane.showMessageDialog(null, s);
               
            }
            if (op.equals("f")) {
                String s="";
                for (Alumno t : alumnos) {
                    if (t instanceof Alumno) {
                       s+= ""+(alumnos.indexOf(t)+1)+"- "+t+"\n" ;
                    }
                }
                JOptionPane.showMessageDialog(null, s);
               
            }
            
        }
    }
}
