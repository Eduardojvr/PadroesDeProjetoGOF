
package decoratorex3quarto;

public abstract class DecoratorQuarto implements Quarto{
    private Quarto quartoBase;
    
    public DecoratorQuarto(Quarto base){
        this.quartoBase = base;
    }
    
    public abstract void montar();
}
