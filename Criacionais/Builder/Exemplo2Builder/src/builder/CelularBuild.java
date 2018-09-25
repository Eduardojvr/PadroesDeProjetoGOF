/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author eduardo
 */
public abstract class CelularBuild {
    protected Celular cel;
    
    public CelularBuild(){
       cel = new Celular();
    }
    
    public abstract void buildCor();
    public abstract void buildFabricante();
    public abstract void buildModelo();
    public abstract void buildAnoFabri();
    
    
}
