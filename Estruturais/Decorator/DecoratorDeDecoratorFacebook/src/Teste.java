/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eduardo
 */
public class Teste {
    public static void main(String[] args) {
        Perfil base = new PerfilBasico();
        DecoratorPerfil perfilcomfoto = new FotoPerfil(base);
        DecoraComponente perfilcomfotoemoticon = new Emoticon(perfilcomfoto);
        perfilcomfotoemoticon.visualizar();
        
        System.out.println("----------");
        
        Perfil base2 = new PerfilBasico();
        DecoratorPerfil perfilcomfoto2 = new FotoPerfil(base);
        DecoraComponente perfilcomfotoemoticonfiltrorgb = new Emoticon(new FiltroRGB(perfilcomfoto));
        perfilcomfotoemoticonfiltrorgb.visualizar();
    }
}
