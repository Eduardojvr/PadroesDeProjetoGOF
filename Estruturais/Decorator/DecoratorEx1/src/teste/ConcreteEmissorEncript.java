
package teste;

public class ConcreteEmissorEncript extends EmissorDecorator {
    
    public ConcreteEmissorEncript(Emissor emissor){
        super(emissor);
    }
    
    @Override
    public void enviamensagem(String mensagem){
        System.out.println("Enviando mensagem criptografada!");
    }
}
