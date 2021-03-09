/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

/**
 *
 * @author Anna
 */
public class FormatoException extends Exception{
    String msg;
    
    public FormatoException(String mensaje){
        this.msg  = mensaje;
    }
    
    public String toString(){
        return msg;
    }
    
}
