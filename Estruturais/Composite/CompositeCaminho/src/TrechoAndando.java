/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eduardo
 */
public class TrechoAndando extends Trecho {

   

    @Override
    public void percorrerTrecho() {
        System.out.println("Percorrendo trecho andando!");
        System.out.println("Distancia percorrida: "+this.getDistancia());
    }

    
}
