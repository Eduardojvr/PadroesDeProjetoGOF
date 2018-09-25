/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfact;

/**
 *
 * @author eduardo
 */
public class GnomeGuiFactory extends GuiFactory{

    @Override
    public Botao criarBotao() {
        return new BotaoGnome();
    }

    @Override
    public Janela criarJanela() {
        return new JanelaGnome();
    }
    
}
