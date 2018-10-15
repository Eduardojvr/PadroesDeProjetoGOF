/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eduardo
 */
public class Montadora {
    private BuildCarro buildcarro;
    
    public Montadora(BuildCarro fabrica){
        this.buildcarro = fabrica;
    }
    
    public Carro construircarro(String cor, String motor){
        buildcarro.buildCor(cor);
        buildcarro.buildMotor(motor);
        
        return buildcarro.getCarro();
    }
    
}
