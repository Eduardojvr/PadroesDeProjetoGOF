/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvore;

/**
 *
 * @author eduardo
 */
public class Principal {
    public static void main(String[] args){
        
        ArvoreNatal base = new ArvoreBase();
        
        ArvoreNatal decorada = new DecoratorArvoreComSino(new DecoratorArvoreComLuz(base));
        System.out.println("OU");
        DecoratorArvoreComLuz arvorecomluz = new DecoratorArvoreComLuz(base);
        DecoratorArvoreComSino arvorecomsino = new DecoratorArvoreComSino(base); 

        
        
    }
}
