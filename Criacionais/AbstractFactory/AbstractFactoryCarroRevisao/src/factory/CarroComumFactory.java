/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

/**
 *
 * @author eduardo
 */
public class CarroComumFactory extends CarroFactory {

    @Override
    public Roda criarRoda() {
        return new RodaFerro();
    }

    @Override
    public Motor criarMotor() {
        return new MotorComum();
    }
    
}
