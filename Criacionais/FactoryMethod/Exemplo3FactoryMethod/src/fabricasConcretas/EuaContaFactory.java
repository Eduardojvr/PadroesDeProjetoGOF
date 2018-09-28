
package fabricasConcretas;

import fabricaAbstrata.ContaFactory;
import produtoConcreto.ContaEua;
import produtoAbstrato.ContaFacebook;


public class EuaContaFactory extends ContaFactory {
    @Override
    public ContaFacebook criarConta() {
        return new ContaEua();
    }
}
