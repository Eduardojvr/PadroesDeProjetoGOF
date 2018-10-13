
package state;


public class Taximetro {
    private Bandeira bandeira;
    
    public Taximetro(Bandeira bandeira){
        this.bandeira = bandeira;
    }
    
    public void valortotalcorrida(float distancia, float tempo){
        System.out.println("Valor total da corrida: ");
        System.out.println(this.bandeira.calcularcorrida(distancia, tempo));
    }

    public void setBandeira(Bandeira bandeira) {
        this.bandeira = bandeira;
    }
    
    
}
