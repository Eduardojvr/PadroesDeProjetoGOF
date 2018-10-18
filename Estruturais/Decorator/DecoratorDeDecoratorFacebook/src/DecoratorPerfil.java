/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eduardo
 */
public abstract class DecoratorPerfil extends Perfil{
    private Perfil base;
    public DecoratorPerfil(Perfil base){
        this.base = base;
    }
    public Perfil getPerfil(){
        return this.base;
    }
    
    public abstract void visualizar();
}
