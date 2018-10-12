
package decoratorex3quarto;


public class DecoratorQuartoComGuardaRoupa extends DecoratorQuarto {
    public DecoratorQuartoComGuardaRoupa(Quarto base){
        super(base);
        this.montar();
    }
    
    public void montar(){
        System.out.println("Guarda Roupas montado no quarto!");
    }
}
