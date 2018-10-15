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
        Caminho c1 = new Caminho();
        
        Trecho andando = new TrechoAndando();
        andando.setDistancia(10f);
        
        Trecho aviao = new TrechoAviao();
        aviao.setDistancia(500f);
        
        Trecho carro = new TrechoCarro();
        carro.setDistancia(1000f);
        
        Trecho navio = new TrechoNavio();
        navio.setDistancia(200f);
        
        Trecho onibus = new TrechoOnibus();
        onibus.setDistancia(900f);
        
        Trecho trem = new TrechoTrem();
        trem.setDistancia(300f);
        
        c1.adicionarTrecho(andando);
        c1.adicionarTrecho(aviao);
        c1.adicionarTrecho(carro);
        c1.adicionarTrecho(navio);
        c1.adicionarTrecho(onibus);
        c1.adicionarTrecho(trem);
     
        c1.percorrerTrecho();

    }
}
