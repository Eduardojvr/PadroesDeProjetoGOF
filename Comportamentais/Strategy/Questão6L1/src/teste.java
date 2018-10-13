/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eduardo
 */
public class teste {
    public static void main(String[] args) {
        Monstro mFogo = new MonstroFogo();
        Monstro mAgua = new MonstroAgua();
        
        Personagem p = new Personagem();
        
        p.sofrerdano(mAgua);
        
    }
}
