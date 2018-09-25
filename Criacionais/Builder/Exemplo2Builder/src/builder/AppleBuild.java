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
public class AppleBuild extends CelularBuild{

        @Override
    public void buildCor() {
        cel.cor = "Azul";
    }

    @Override
    public void buildFabricante() {
        cel.fabricante = "Apple";
    }

    @Override
    public void buildModelo() {
        cel.modelo = "Iphone 8";
    }

    @Override
    public void buildAnoFabri() {
        cel.anoFab = 2018;
    }
    
}
