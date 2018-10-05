
package Composite;
import Abstrata.*;
import java.util.ArrayList;

public class Caminho extends Trecho{
    private ArrayList<Trecho> tr;

    public Caminho() {
        this.tr = new ArrayList<Trecho>();
    }
    
    @Override
    public void info() {
        System.out.println("Sou um trecho!");
    }
    public void adiciona(Trecho trecho){
        this.tr.add(trecho);
    }
    public void remove(Trecho trecho){
        this.tr.remove(trecho);
    }    
    public void getCaminho(){
        for(Trecho trecho : this.tr){
            trecho.info();
        }
    }
}
