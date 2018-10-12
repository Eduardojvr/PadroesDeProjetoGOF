
package teste;

public abstract class EmissorDecorator implements Emissor {
    private Emissor emissor;
    
    public EmissorDecorator(Emissor emissor){
        this.emissor = emissor;
    }
    
    public abstract void enviamensagem(String mensagem);
    
    public Emissor getEmissor(){
        return this.emissor;
    }
}
