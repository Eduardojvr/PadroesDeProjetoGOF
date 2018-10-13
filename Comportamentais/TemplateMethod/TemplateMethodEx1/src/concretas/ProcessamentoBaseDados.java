
package concretas;
import templatemethod.*;

public class ProcessamentoBaseDados extends Processamento{

    @Override
    public void processarDados() {
        System.out.println("Dados da base de dados processados!");
    }

    @Override
    public void consultarDados() {
        System.out.println("Dados da base de dados processada consultados!");
    }

    @Override
    public void exibirResultados() {
        System.out.println("Exibindo dados consultados!");
    }
    
}
