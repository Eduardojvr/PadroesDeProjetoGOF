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
public class DecoratorArvoreComSino extends DecoradorArvore{
    
    public DecoratorArvoreComSino(ArvoreNatal arvorebase){
        super(arvorebase);
        this.info();
    }
    
    public void info(){
        System.out.println("Adicionando sino à base!");
    }
}
