/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eduardo
 */
public class Emoticon extends DecoraComponente{

    public Emoticon(DecoratorPerfil decora) {
        super(decora);
    }

    @Override
    public void visualizar() {
        System.out.println("Emoticon");
        this.getDecoratorPerfil().visualizar();
    }
    
}
