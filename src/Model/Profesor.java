/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Anna
 */
public class Profesor extends Persona{
    //Atributos
    private int codigo;
    private String departamento;
    private ArrayList<String> modulos;
    private String horario;
    
    //Constructor
    public Profesor(String nombre, String dni, String dire, int telefono, int cod, String dpt, String horario){
        super(nombre, dni, dire, telefono);
        this.codigo = cod;
        this.departamento = dpt;
        this.modulos = new ArrayList();
        this.horario = horario;
    }
    
    //MÃ©todos set y get
    public int getCodigo(){
        return codigo;
    }
    public void setCodigo(int cod){
        this.codigo = cod;
    }
    public String getDepartamento(){
        return departamento;
    }
    public void setDepartamento(String dpt){
        this.departamento = dpt;
    }
    public ArrayList getModulos(){
        return modulos;
    }
    public void setModulos(ArrayList modulos){
        this.modulos = modulos;
    }
    public String getHorario(){
        return horario;
    }
    public void setHorario(String horario){
        this.horario = horario;
    }
    public String mostrarPersona(){
        String texto = super.mostrarPersona();
        texto = texto + ", "+ this.codigo+ ", " + this.departamento+ ", " + this.horario;
        return texto;
    }
}
