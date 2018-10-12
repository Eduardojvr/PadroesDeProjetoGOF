
package teste;


public class EmissorBase implements Emissor {

    @Override
    public void enviamensagem(String mensagem){
        System.out.println("Mensagem plaintext sendo enviada...");
        System.out.println(mensagem);
    }
    
}
