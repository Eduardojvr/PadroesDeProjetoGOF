
package Concretas;
import Abstrata.*;

public class Rodovias extends Trecho {
    private String infoTrecho;

    public Rodovias(String infoRodovias) {
        this.infoTrecho = infoRodovias;
    }
    public void info(){
        System.out.println("Siga na Rodovia "+this.infoTrecho);
    }
}
