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
public class DecoratorArvoreComLuz extends DecoradorArvore{
    public DecoratorArvoreComLuz(ArvoreNatal arvbase){
        super(arvbase);
        this.info();
    }
    
    public void info(){
        System.out.println("Adicionando luz à arvore!");
    }
    public void ligarluz(){
        System.out.println("Luz ligada!");
    }
}
