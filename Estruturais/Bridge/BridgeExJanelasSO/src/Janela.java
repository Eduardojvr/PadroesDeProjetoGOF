/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eduardo
 */
public abstract class Janela {
    private ImplementaJanela janela;
    
    public Janela(ImplementaJanela janela){
        this.janela = janela;
    }
    
    public void desenharBotao(String titulo){
        this.janela.desenharBotao(titulo);
    }
    
    public void desenharJanela(String titulo){
        this.janela.desenharJanela(titulo);
    }
    
    public abstract void desenhar();
}
