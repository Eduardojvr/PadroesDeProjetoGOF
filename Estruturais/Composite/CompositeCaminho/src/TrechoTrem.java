/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eduardo
 */
public class TrechoTrem extends Trecho{

    

    @Override
    public void percorrerTrecho() {
        System.out.println("Percorrendo trecho de trem!");
        System.out.println("Distancia percorrida: "+this.getDistancia());
    }
    
}
