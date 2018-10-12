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
public abstract class DecoradorArvore extends ArvoreNatal{
    private ArvoreNatal arvorebase;
    
    public DecoradorArvore(ArvoreNatal base){
        this.arvorebase = base;
    }
    
    public abstract void info();
    
}
