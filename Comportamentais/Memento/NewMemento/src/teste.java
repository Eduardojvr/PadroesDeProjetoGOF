/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eduardo
 */
public class teste {
    public static void main(String[] args) {
        Texto t1 = new Texto("Ola mundo!");
        
        t1.escreverTexto("Isso é um texto 1!");
        
        t1.mostrarTexto();
  
        t1.desfazer();
        
        t1.mostrarTexto();
        
        t1.escreverTexto("Novo texto!");
        t1.mostrarTexto();
        
   


    }
}
