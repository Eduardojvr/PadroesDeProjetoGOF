
package produtoConcreto;

import produtoAbstrato.ContaFacebook;


public class ContaEua extends ContaFacebook{

    @Override
    public String infoConta() {
        return "Conta americana!";
    }
    
}
