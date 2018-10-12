
package decoratorex3quarto;

public class QuartoBase implements Quarto {
    
    public QuartoBase(){
        this.montar();
    }
    
    public void montar(){
        System.out.println("Quarto base montado!");
    }
}
