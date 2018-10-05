
package Concretas;
import Abstrata.*;

public class Avenidas extends Trecho{
    private String infoTrecho;

    public Avenidas(String infoAvenida){
        this.infoTrecho = infoAvenida;
    }
    
    @Override
    public void info() {
        System.out.println("Entre na avenida "+this.infoTrecho);
    }
   
    
}
