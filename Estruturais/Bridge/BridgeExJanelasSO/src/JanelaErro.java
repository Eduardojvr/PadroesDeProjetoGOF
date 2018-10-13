/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eduardo
 */
public class JanelaErro extends Janela{
    
    public JanelaErro(ImplementaJanela janela){
        super(janela);
    }

    @Override
    public void desenhar() {
        this.desenharJanela("Janela de erro");
        this.desenharBotao("Fechar");
    }
    
}
