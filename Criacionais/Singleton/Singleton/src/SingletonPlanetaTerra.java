/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eduardo
 */
public final class SingletonPlanetaTerra {
    private String nome;
    private static SingletonPlanetaTerra terra;
    
    private SingletonPlanetaTerra(){
    }
    
    public static SingletonPlanetaTerra getInstance(){
        if(terra == null){
            terra = new SingletonPlanetaTerra();
            terra.nome = "Terra";
        }
        return terra;
    }

    public String getNome() {
        return nome;
    }
    
    
}
