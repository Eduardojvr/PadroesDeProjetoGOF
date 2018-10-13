
package teste;
import concretas.*;
import templatemethod.*;


public class Principal {
    public static void main(String[] args) {
        Processamento prBase = new ProcessamentoBaseDados();
        Processamento prArquivos = new ProcessamentoSistemaArquivos();

        prBase.templateProcess();
        System.out.println("===============================");
        prArquivos.templateProcess();
        
    }
}
