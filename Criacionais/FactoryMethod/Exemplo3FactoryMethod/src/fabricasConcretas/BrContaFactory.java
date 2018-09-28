
package fabricasConcretas;

import produtoConcreto.ContaBrasil;
import produtoAbstrato.ContaFacebook;
import fabricaAbstrata.ContaFactory;

public class BrContaFactory extends ContaFactory {

    @Override
    public ContaFacebook criarConta() {
        return new ContaBrasil();
    }
    
}
