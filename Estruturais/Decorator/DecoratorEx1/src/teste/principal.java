
package teste;


public class principal {
    public static void main(String[] args) {
        String mensagem = "Olá mundo!";
                
        Emissor em = new ConcreteEmissorEncript(new ConcreteEmissorComp(new EmissorBase()));
        
        em.enviamensagem(mensagem);
    }
}
