/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eduardo
 */
public class PizzaComCatupiri extends PizzaDecorada {
    public PizzaComCatupiri(Pizza base, float valor){
        super(base, valor);
    }
    
    public float valor(){
        return this.getBase().valor()+this.getValor();
    }
    
    public String descricao(){
        this.getBase().descricao();
        return "Catupiri! "+"com "+this.getBase().descricao();

    }
    
}
