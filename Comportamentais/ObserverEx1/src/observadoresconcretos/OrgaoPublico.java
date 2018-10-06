
package observadoresconcretos;
import observerabstract.Interessados;
import sujeitosabstract.*;

public class OrgaoPublico extends Interessados {
    
    @Override
    public void update(Sujeitos suj) {
        System.out.println("Organização, valor atualizado é: "+suj.getvalor());
    }
    
}