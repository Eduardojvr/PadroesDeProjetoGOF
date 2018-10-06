
package observadoresconcretos;
import observerabstract.Interessados;
import sujeitosabstract.Sujeitos;

public class Empresa extends Interessados {

    @Override
    public void update(Sujeitos suj) {
        System.out.println("Empresa, o valor atualizado é: "+suj.getvalor());
    }
  
 
}
