/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Anna
 */
public class Persona {
    //Atributos
    private String nombre;
    private String dni;
    private String direccion;
    private int telefono;
    
    //Constructor
    public Persona(String nombre, String dni, String dire, int telefono){
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = dire;
        this.telefono = telefono;
    }
    //MÃ©todos set y get
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getDni(){
        return dni;
    }
    public void setDni(String dni){
        this.dni = dni;
    }
    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String dire){
        this.direccion = dire;
    }
    public int getTelefono(){
        return telefono;
    }
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    //mÃ©todo mostrar
    public String mostrarPersona(){
        return this.nombre + ", " + this.dni + ", " + this.direccion + ", " + this.telefono;
    }
}
