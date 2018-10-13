
package templatemethod;


public abstract class Processamento {
    public final void templateProcess(){
        processarDados();
        consultarDados();
        exibirResultados();
    }
    public abstract void processarDados();
    public abstract void consultarDados();
    public abstract void exibirResultados();
}
