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
public class Suco extends CoquetelDecorator {
    
    public Suco(Coquetel base) {
        super(base);
        nome  = "Suco";
        valor = 5.0;
    }
    
}
