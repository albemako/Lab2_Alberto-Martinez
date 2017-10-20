
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
                Alumno alumno;
                JOptionPane.showMessageDialog(null, "Registrar Usuario");
                
                nombre=JOptionPane.showInputDialog("Nombre");
                cuenta=Integer.parseInt(JOptionPane.showInputDialog("Numero de cuenta"));
                carrera=JOptionPane.showInputDialog("Carrera");
                edad=Integer.parseInt(JOptionPane.showInputDialog("Edad"));
                dinero=Double.parseDouble(JOptionPane.showInputDialog("Dinero disponible"));
                usuario=JOptionPane.showInputDialog("Usuario");
                contra=JOptionPane.showInputDialog("Contra");
                
                alumno=new Alumno(nombre,cuenta, carrera,  edad, dinero, usuario, contra);
                alumnos.add(alumno);
                JOptionPane.showMessageDialog(null, "Registrado con exito!");
                
                int opc;
                double dineroactual=dinero;
                do{
                double precio=0;
                String s="";
                for (Clase t : clases) {
                    if (t instanceof Clase) {
                       s+= ""+(clases.indexOf(t)+1)+"- "+t+"\n" ;
                    }
                }
                opc=Integer.parseInt(JOptionPane.showInputDialog(s))-1;
                
                if(clases.get(opc).alumnos.size()<clases.get(opc).max){
                  precio=clases.get(opc).getPrecio();
                for (int i = 0; i < 5; i++) {
                        precio+=clases.get(opc).getPrecio()*0.20;
                        alumno.setDinero(alumno.getDinero()-precio);
                    }
                if(precio>alumno.getDinero()){
                    JOptionPane.showMessageDialog(null, "No tiene el dinero suficiente!");
                    opc=1;
                    alumno.setDinero(dineroactual);
                }else{
                clases.get(opc).alumnos.add(alumno);
                alumno.clases.add(clases.get(opc).getSeccion());
                dineroactual=alumno.getDinero();
                JOptionPane.showMessageDialog(null, "Usted cuenta con: L."+dineroactual);
                opc=Integer.parseInt(JOptionPane.showInputDialog("Desea Ingresar otra? si=0/no=1"));
                }  
                }else{
                    JOptionPane.showMessageDialog(null, "La seccion esta llena!");
                    opc=0;
                }
                
                
                }while(opc==0);
                
                
            }
            if (op.equals("c")) {
               String usuario, contra;
               int opc;
               int valid=3;
               opc=Integer.parseInt(JOptionPane.showInputDialog("Desea Login como maestro o como estudiante? maestro=0/estudiante=1"));
               if(opc==0){
                    usuario=JOptionPane.showInputDialog("Usuario");
                    contra=JOptionPane.showInputDialog("Contrasenia");
                    for (int j = 0; j < maestros.size(); j++) {
                        if(maestros.get(j).getUsuario().equalsIgnoreCase(usuario) && maestros.get(j).getContra().equalsIgnoreCase(contra)){
                            
                            System.out.println("hola");
                            
                            valid=1;
                        }else{
                            if(valid!=1){
                                valid=3;
                            }
                        }
                    }
                    if(valid==3){
                        JOptionPane.showMessageDialog(null, "Usuario o contrasenia incorrecta");
                    }
               }
               if(opc==1){
                    usuario=JOptionPane.showInputDialog("Usuario");
                    contra=JOptionPane.showInputDialog("Contrasenia");
                    for (int j = 0; j < alumnos.size(); j++) {
                        if(alumnos.get(j).getUsuario().equalsIgnoreCase(usuario) && alumnos.get(j).getContra().equalsIgnoreCase(contra)){

                            System.out.println("hola");

                            valid=1;
                        }else{
                            if(valid!=1){
                                valid=3;
                            }
                        }
                    }
                    if(valid==3){
                        JOptionPane.showMessageDialog(null, "Usuario o contrasenia incorrecta");
                    }
                }
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
