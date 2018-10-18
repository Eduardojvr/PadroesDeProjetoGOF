/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eduardo
 */
public abstract class DecoraComponente extends DecoratorPerfil {
   private DecoratorPerfil decora;
 
    public DecoraComponente(DecoratorPerfil decora) {
        super(decora.getPerfil());
        this.decora = decora;
    }
    public abstract void visualizar();
    
    public DecoratorPerfil getDecoratorPerfil(){
        return this.decora;
    }
    
}
