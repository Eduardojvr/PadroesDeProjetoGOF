/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eduardo
 */
public class Memento {
    private String estado;
    
    public Memento(String texto){
        this.estado = texto;
    }
    
    public String getTextoSalvo(){
        return this.estado;
    }
    
}
