/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eduardo
 */
public class Video extends Arquivo{

    public Video(String nome) {
        super(nome);
    }

    @Override
       public void visualizar() {
        //Implementação complexa
        System.out.println("Mostrando arquivo de video "+this.getNome());
    }
    
}
