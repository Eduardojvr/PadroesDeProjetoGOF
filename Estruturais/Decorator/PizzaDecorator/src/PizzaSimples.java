/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eduardo
 */
public class PizzaSimples extends Pizza{
    
    public PizzaSimples(float valor){
        super(valor);
    }
    
    @Override
    public float valor() {
        return this.getValor();
    }

    @Override
    public String descricao() {
        return "pizza simples!";

    }
    
}
