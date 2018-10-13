/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eduardo
 */
public class Texto {
    private String texto;
    private Armazenador armazena;
    
    public Texto(String texto){
        this.texto = texto;
        this.armazena = new Armazenador();
    }
    
    public void escreverTexto(String texto){
        this.armazena.adicionaMomento(new Memento(this.texto));
        this.texto = this.texto+" "+texto;
    }

    public void desfazer(){
        this.texto = this.armazena.getUltimoMomento().getTextoSalvo();
    }
    
    public void mostrarTexto(){
        System.out.println(this.texto);
    }
    
}
