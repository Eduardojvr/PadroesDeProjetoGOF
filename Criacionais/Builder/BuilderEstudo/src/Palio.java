/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eduardo
 */
public class Palio implements Carro{
    private String cor;
    private String motor;
    
    public Palio(String cor, String motor){
        this.cor = cor;
        this.motor = motor;
    }
    
    @Override
    public void dirigir() {
        System.out.println("Dirigindo o Palio!");
    }
    
}
