
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
                    String nombre;
                    int seccion, max, unidades;
                    double precio;
                    Maestro maestro;
                    nombre=JOptionPane.showInputDialog("Nombre");
                    seccion=Integer.parseInt(JOptionPane.showInputDialog("Seccion"));
                    max=Integer.parseInt(JOptionPane.showInputDialog("Maxima cantidad de alumnos"));
                    unidades=Integer.parseInt(JOptionPane.showInputDialog("Unidades valorativas"));
                    precio=Integer.parseInt(JOptionPane.showInputDialog("Precio"));
                    
                    clases.add(new Clase(nombre,seccion, max,  null, unidades, precio));
                    JOptionPane.showMessageDialog(null, "Clase agregada con exito!");
                }
                
               
            }
            if (op.equals("b")) {
               
            }
            if (op.equals("c")) {
               
            }
        }
    }
}
