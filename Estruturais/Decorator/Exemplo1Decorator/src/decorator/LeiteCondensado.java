/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author eduardo
 */
public class LeiteCondensado extends CoquetelDecorator  {
    
    public LeiteCondensado(Coquetel base) {
        super(base);
        nome  = "Leite condensado!";
        valor = 2.0;
    }
    
}
