/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eduardo
 */
public class BuildI30 implements BuildCarro{
    private String cor;
    private String motor;
  
    
    @Override
    public void buildCor(String cor) {
        this.cor = cor;
    }

    @Override
    public void buildMotor(String motor) {
        this.motor = motor;
    }

    @Override
    public Carro getCarro() {
        return new I30(cor, motor);
    }
    
}
