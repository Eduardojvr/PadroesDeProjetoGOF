/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eduardo
 */
public abstract class Trecho {
    private float distancia;
    
    public void setDistancia(float dist){
        this.distancia = dist;
    }
    public float getDistancia(){
        return this.distancia;
    }
  
    public abstract void percorrerTrecho();

}
