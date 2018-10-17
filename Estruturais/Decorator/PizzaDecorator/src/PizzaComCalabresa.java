/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eduardo
 */
public class PizzaComCalabresa extends PizzaDecorada {

    public PizzaComCalabresa(Pizza base, float valor) {
        super(base, valor);
    }

    @Override
    public String descricao() {
        return "Calabresa "+"com "+this.getBase().descricao();

    }

    @Override
    public float valor() {
        return this.getBase().valor()+this.getValor();
    }
    
}
