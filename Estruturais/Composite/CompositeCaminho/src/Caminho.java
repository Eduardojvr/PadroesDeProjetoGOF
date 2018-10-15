
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eduardo
 */
public class Caminho extends Trecho{
    private float tamanho;
    private ArrayList<Trecho> caminho;
  
    public Caminho(){
        this.caminho = new ArrayList<Trecho>();
        this.tamanho = 0;
    }

    public void adicionarTrecho(Trecho t){
        this.caminho.add(t);
    }
    public void removerTrecho(Trecho t){
        this.caminho.remove(t);
    }
    
    @Override
    public void percorrerTrecho() {
        for(Trecho t : caminho){
            t.percorrerTrecho();
            this.tamanho += t.getDistancia();
            System.out.println("----------------------------------------");
        }
        System.out.println("***********************************");
        System.out.println("Total percorrido: "+this.tamanho+" km");
        System.out.println("***********************************");

    }
    
}
