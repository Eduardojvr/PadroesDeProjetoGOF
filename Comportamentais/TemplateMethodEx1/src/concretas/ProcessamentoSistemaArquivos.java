
package concretas;
import templatemethod.*;

public class ProcessamentoSistemaArquivos extends  Processamento{

    @Override
    public void processarDados() {
        System.out.println("Dados do sistema de arquivos processados!");
    }

    @Override
    public void consultarDados() {
        System.out.println("Consultando dados do sistema de arquivos processado!");
    }

    @Override
    public void exibirResultados() {
        System.out.println("Exibindo resultados da consulta!");
    }
    
}
