
package teste;
import observadoresconcretos.*;
import observerabstract.*;
import sujeitosconcretos.*;

public class Principal {
    public static void main(String[] args) {
        Interessados p1 = new PessoaFisica();
        Interessados emp = new Empresa();
        Interessados op = new OrgaoPublico();
        
        Acao acao = new Acao();
        acao.anexar(p1);
        acao.anexar(emp);
        acao.anexar(op);
        
        
        System.out.println("====== Modificação de objeto e atualização/notificação de interessados ======");
        acao.setvalor(10.0);
        
        
        
      
    }
}
