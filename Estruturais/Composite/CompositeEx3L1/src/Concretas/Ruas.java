
package Concretas;
import Abstrata.*;

public class Ruas extends Trecho{
    private String infoTrecho;

    public Ruas(String infoRuas){
        this.infoTrecho = infoRuas;
    }
    @Override
    public void info() {
        System.out.println("Siga na rua "+this.infoTrecho);
    }
    
}
