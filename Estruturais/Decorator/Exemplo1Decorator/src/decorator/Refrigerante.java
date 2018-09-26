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
public class Refrigerante extends CoquetelDecorator {
    
    public Refrigerante(Coquetel base) {
        super(base);
        nome  = "Refrigerante!";
        valor = 8.0;
    }
    
}
