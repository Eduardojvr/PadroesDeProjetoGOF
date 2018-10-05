
package Test;
import Abstrata.*;
import Concretas.*;
import Composite.*;

public class Principal {

    public static void main(String[] args) {
        Caminho caminho1;
        
        System.out.println("######### Exemplo de Composite ##########");

        Trecho rodovias = new Rodovias("021");
        Trecho ruas = new Ruas("23");
        Trecho avenidas = new Avenidas("Principal");
        
        
        caminho1 = new Caminho();
        caminho1.adiciona(rodovias);
        caminho1.adiciona(ruas);
        caminho1.adiciona(avenidas);
        
//        caminho1.info();
        caminho1.getCaminho();
        
        System.out.println("==== Removendo a rua ====");
        caminho1.remove(ruas);
        caminho1.getCaminho();
        
        System.out.println("==== Outro Caminho ====");
        
        Caminho caminho2 = new Caminho();
        
        Trecho av = new Avenidas("Secundária");
        Trecho r = new Ruas("Rua 12");
        Trecho rod = new Rodovias("456");  
        
        caminho2.adiciona(av);
        caminho2.adiciona(r);
        caminho2.adiciona(rod);
        
        caminho2.getCaminho();
    }

}
