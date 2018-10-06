
package observadoresconcretos;
import observerabstract.Interessados;
import sujeitosabstract.*;

public class PessoaFisica extends Interessados {

    @Override
    public void update(Sujeitos suj) {
        System.out.println("Cidadão, o valor atualizado é: "+ suj.getvalor());
    }
  
}
