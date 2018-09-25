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
public class KdeGuiFactory extends GuiFactory {

    @Override
    public Botao criarBotao() {
        return new BotaoKde();
    }

    @Override
    public Janela criarJanela() {
        return new JanelaKde();
    }
    
}
