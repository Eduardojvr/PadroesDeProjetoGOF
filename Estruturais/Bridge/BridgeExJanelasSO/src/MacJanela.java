/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eduardo
 */
public class MacJanela extends ImplementaJanela {

    @Override
    public void desenharJanela(String titulo) {
        System.out.println("Janela Mac - "+titulo);
    }

    @Override
    public void desenharBotao(String titulo) {
        System.out.println("Botão Mac - "+titulo);
    }
    
}
