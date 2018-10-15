/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eduardo
 */
public class TrechoNavio extends Trecho {

 
    @Override
    public void percorrerTrecho() {
        System.out.println("Percorrendo trecho de navio!");
        System.out.println("Distancia percorrida: "+this.getDistancia());
    }   
}
