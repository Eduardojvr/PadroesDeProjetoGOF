/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eduardo
 */
public class Teste {
    public static void main(String[] args) {

        SingletonPlanetaTerra t = SingletonPlanetaTerra.getInstance();
        System.out.println(t.getNome());
        
    }
}
