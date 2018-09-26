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
public class Limao extends CoquetelDecorator  {
    
    public Limao(Coquetel base) {
        super(base);
        nome  = "Limão!";
        valor = 1.0;
    }
    
}
