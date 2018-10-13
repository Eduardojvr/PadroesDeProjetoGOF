
package sujeitosabstract;
import java.util.ArrayList;
import observerabstract.Interessados;

public abstract class Sujeitos {
    public ArrayList<Interessados> interessados = new ArrayList<Interessados>();
    
    public abstract double getvalor();
    public abstract void anexar(Interessados inte);
    public abstract void desanexar(Interessados inte);
  
}
