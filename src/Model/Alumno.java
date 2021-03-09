/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Anna
 */
public class Alumno extends Persona{
    //Atributos
    
    private int nia;
    private String ciclo;
    private int curso;
    private ArrayList notas;
    
    //Constructor
    public Alumno(String nombre, String dni, String direccion, int telefono, int nia, String ciclo, int curso){
        super(nombre, dni, direccion, telefono);
        
        this.nia= nia;
        this.ciclo = ciclo;
        this.curso = curso;
        this.notas = new ArrayList();
    }
    //MÃ©todos set y get
    public int getNia(){
        return nia;
    }
    public void setNia(int nia){
        this.nia = nia;
    }
    public String getCiclo(){
        return ciclo;
    }
    public void setCiclo(String ciclo){
        this.ciclo = ciclo;
    }
    public int getCurso(){
        return curso;
    }
    public void setCurso(int curso){
        this.curso = curso;
    }
    public ArrayList getNotas(){
        return notas;
    }
    public void setNotas(ArrayList notas){
        this.notas = notas;
    }
    public String mostrarPersona(){
        String texto = super.mostrarPersona();
        texto = texto + ", " + nia + ", " + ciclo + ", " + curso;
        return texto;
    }
    public String mostrarNotas(){
        String texto="";
        for(Iterator iter = this.notas.iterator(); iter.hasNext();){
            texto = texto  + iter.next() + " - ";
        }
        return texto;
    } 
}