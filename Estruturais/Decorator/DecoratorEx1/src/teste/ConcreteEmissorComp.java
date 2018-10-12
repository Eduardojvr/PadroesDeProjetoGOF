/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

/**
 *
 * @author eduardo
 */
public class ConcreteEmissorComp extends EmissorDecorator{

    public ConcreteEmissorComp(Emissor emissor) {
        super(emissor);
    }

    @Override
    public void enviamensagem(String mensagem) {
        System.out.println("Enviando mensagem comprimida!");
    }
    
}
