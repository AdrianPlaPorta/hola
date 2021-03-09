/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Excepciones.DuplicadoException;
import Excepciones.FormatoException;
import Model.Alumno;
import Model.Persona;
import Model.Profesor;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author Anna
 */
public class Control {
    //Atributos
    public static ArrayList<Persona> misPersonas = new ArrayList<Persona>();
    public static ArrayList<Alumno> misAlumnos = new ArrayList<Alumno>();
    public static ArrayList<Profesor> misProfesores = new ArrayList<Profesor>();
    
    public static void addPersona(Persona p) throws DuplicadoException, FormatoException{
        try{
            validaDNI(p.getDni());
            validaTelefono(p.getTelefono());
            isDuplicadoDni(misPersonas, p.getDni());
            misPersonas.add(p);
        }catch(FormatoException e){
            throw e;
        }catch(DuplicadoException e){
            throw e;
        }
    }
    public static void addAlumno(Alumno a) throws DuplicadoException, FormatoException, Exception{
        try{
            validaDNI(a.getDni());
            validaTelefono(a.getTelefono());
            isDuplicadoDni(misAlumnos, a.getDni());
            validaNia(a.getNia());
            isDuplicadoNia(misAlumnos, a.getNia());
            validaCiclo(a.getCiclo());
            if (a.getCurso()!= 1 && a.getCurso()!=2) throw new Exception("Curso incorrecto");
            misAlumnos.add(a);
            JOptionPane.showMessageDialog(null, misAlumnos.size());
        }catch(FormatoException e){
            throw e;
        }catch(DuplicadoException e){
            throw e;
        }
    }
    public static void addProfesor(Profesor p) throws DuplicadoException, FormatoException{
        try{
            validaDNI(p.getDni());
            validaTelefono(p.getTelefono());
            isDuplicadoDni(misProfesores, p.getDni());
            validaCodigo(p.getCodigo());
            isDuplicadoCodigo(misProfesores, p.getCodigo());
            misProfesores.add(p);
            JOptionPane.showMessageDialog(null, misProfesores.size());
        }catch(FormatoException e){
            throw e;
        }catch(DuplicadoException e){
            throw e;
        }
    }
    public static boolean isDuplicadoDni(ArrayList lista, String dni) throws DuplicadoException{
        boolean duplicado = false;
        Persona p;
        for(Iterator iter = lista.iterator(); iter.hasNext();){
            p = (Persona)iter.next();
            if(p.getDni().equals(dni)) {
                duplicado = true;
                throw new DuplicadoException("DNI duplicado: " + dni);
            }
        }
        return duplicado;
    }
    
    public static boolean isDuplicadoNia(ArrayList lista, int nia) throws DuplicadoException{
        boolean duplicado = false;
        Alumno a;
        for(Iterator iter = lista.iterator(); iter.hasNext();){
            a = (Alumno)iter.next();
            if(a.getNia()== nia) {
                duplicado = true;
                throw new DuplicadoException("NIA duplicado: " + nia);
            }
        }
        return duplicado;
    }
    
    public static boolean isDuplicadoCodigo(ArrayList lista, int codigo) throws DuplicadoException{
        boolean duplicado = false;
        Profesor p;
        for(Iterator iter = lista.iterator(); iter.hasNext();){
            p = (Profesor)iter.next();
            if(p.getCodigo() == codigo) {
                duplicado = true;
                throw new DuplicadoException("Codigo duplicado: " + codigo);
            }
        }
        return duplicado;
    }
    
    public static boolean validaDNI(String dni) throws FormatoException{
        boolean valido = false;
        if (dni.matches("^\\d{8}[a-z A-Z]{1}"))
            valido = true;
        else{
            valido = false;
            throw new FormatoException("Formato del DNI incorrecto");
        }
        return valido;
    }
    
    public static boolean validaTelefono(int telefono) throws FormatoException{
        boolean valido = true;
        
        String tel = Integer.toString(telefono);
        if(tel.length()!=9){
            valido = false;
            throw new FormatoException("Formato de telÃ©fono incorrecto");
        }
        return valido;
    }
    
    public static boolean validaNia(int nia) throws FormatoException{
        boolean valido = true;
        
        String cod = Integer.toString(nia);
        if(cod.length()!=8){
            valido = false;
            throw new FormatoException("Formato del NIA incorrecto");
        }
        return valido;
    }
    
    public static boolean validaCiclo(String ciclo) throws FormatoException{
        boolean valido = false;
        
        if(ciclo.matches("[a-z A-Z][4]")) valido = true;
        else{
            valido = false;
            throw new FormatoException("Ciclo incorrecto");
        }
        return valido;
    }
    
    public static boolean validaCodigo(int codigo) throws FormatoException{
        boolean valido = true;
        
        String cod = Integer.toString(codigo);
        if(cod.length()!=4){
            valido = false;
            throw new FormatoException("Formato del CÃ³digo incorrecto");
        }
        return valido;
    }
    
    
    public static void imprimir(){
        Alumno a = null;
        for(Iterator iter = misAlumnos.iterator(); iter.hasNext();){
            a = (Alumno) iter.next();
            System.out.println(a.mostrarPersona() + "");
            System.out.println(a.mostrarNotas() + " \n");
        }
    }
}
