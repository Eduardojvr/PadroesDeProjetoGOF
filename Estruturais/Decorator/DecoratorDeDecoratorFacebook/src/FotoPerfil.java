/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eduardo
 */
public class FotoPerfil extends DecoratorPerfil{

    public FotoPerfil(Perfil base) {
        super(base);
    }

    @Override
    public void visualizar() {
        System.out.println("Foto perfil!");
        this.getPerfil().visualizar();
    }
    
}
