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
public class SamsungBuild extends CelularBuild {
        @Override
    public void buildCor() {
        cel.cor = "Preto";
    }

    @Override
    public void buildFabricante() {
        cel.fabricante = "Samsung";
    }

    @Override
    public void buildModelo() {
        cel.modelo = "AAA";
    }

    @Override
    public void buildAnoFabri() {
        cel.anoFab = 2018;
    }
}
