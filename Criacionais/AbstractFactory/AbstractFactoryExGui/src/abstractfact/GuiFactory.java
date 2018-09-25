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
public abstract class GuiFactory {
    
public static GuiFactory obterfactory(String str)  {
      
        switch(str){
            case "kde":
                return new KdeGuiFactory();
           
            case "gnome":
                return new GnomeGuiFactory();
            default:
                return null;
              
        }
    } 
    public abstract Botao criarBotao();
    public abstract Janela criarJanela();
}
