package sujeitosconcretos;
import observerabstract.*;
import sujeitosabstract.*;

public class Acao extends Sujeitos {
    double valor;
    
    @Override
    public double getvalor(){
        return this.valor;
    }
    
    public void setvalor(double val){
        this.valor = val;
        for(Interessados intere : this.interessados){
            intere.update(this);
        }
    }
    @Override
    public void anexar(Interessados inte) {
        this.interessados.add(inte);
    }

    @Override
    public void desanexar(Interessados inte) {
        this.interessados.remove(inte);
    }
 
    
   
}
