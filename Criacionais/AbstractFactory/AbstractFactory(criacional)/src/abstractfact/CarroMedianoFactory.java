/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfact;

/**
 *
 * @author eduardo
 */
public class CarroMedianoFactory extends CarroFactory {

    public Roda montarRoda() {
        return new RodaLigaLeve();
    }

    public Som montarSom() {
        return new TocaFitas();
    }
    
}
