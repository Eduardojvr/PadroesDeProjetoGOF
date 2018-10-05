
package main;

import fabricasConcretas.BrContaFactory;
import fabricasConcretas.EuaContaFactory;
import produtoAbstrato.ContaFacebook;


public class Test {
    public static void main(String[] args) {
        BrContaFactory fabricabr = new BrContaFactory();
        ContaFacebook contabr = fabricabr.criarConta();
        System.out.println(contabr.infoConta());
        
        
        ContaFacebook contaeua = new EuaContaFactory().criarConta();
        System.out.println(contaeua.infoConta());

    }
}
