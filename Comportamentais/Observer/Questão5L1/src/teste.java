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
        ObservaConta ob1 = new ModuloEnvioEmail();
                
        ContaBlizzard conta = new ContaBlizzard("Eduardo", "12345","eduardo@gmail.com");
        conta.adicionarobservador(ob1);
        
        conta.logar("eduardo@gmail.com", "12345");
        
        
    }
}
