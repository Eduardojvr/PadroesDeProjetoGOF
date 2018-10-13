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
        MultitonCarrosUnicos c1 = MultitonCarrosUnicos.getInstance(MultitonCarrosUnicos.CARROBATMAN);     
        System.out.println("Carro raro 1: "+"\nCor: "+c1.getCorCarro()+"\nDono: "+c1.getDono());
        
        System.out.println("*************************");
        
        MultitonCarrosUnicos c2 = MultitonCarrosUnicos.getInstance(MultitonCarrosUnicos.CARRODEVOLTAPARAOFUTURO);
        System.out.println("Carro raro 2: "+"\nCor: "+c2.getCorCarro()+"\nDono: "+c2.getDono());    }
                
}
