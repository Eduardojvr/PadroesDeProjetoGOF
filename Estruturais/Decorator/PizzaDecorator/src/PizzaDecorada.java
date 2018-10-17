/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eduardo
 */
public abstract class PizzaDecorada extends Pizza{
    private Pizza base;
    
    public PizzaDecorada(Pizza base, float valor){
        super(valor);
        this.base = base;
    }
    
    public Pizza getBase(){
        return this.base;
    }
    
    public abstract String descricao();    
    public abstract float valor();
    
}
