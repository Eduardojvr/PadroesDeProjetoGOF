/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eduardo
 */
public abstract class Pizza {
    private float valor;
    
    public Pizza(float valor){
        this.valor = valor;
    }
    
    public float getValor(){
        return this.valor;
    }
    public abstract float valor();
    public abstract String descricao();
}
