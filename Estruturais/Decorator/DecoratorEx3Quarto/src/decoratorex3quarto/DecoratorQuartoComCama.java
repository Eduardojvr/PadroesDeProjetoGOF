
package decoratorex3quarto;

public class DecoratorQuartoComCama extends DecoratorQuarto{
    public DecoratorQuartoComCama(Quarto base){
        super(base);
        this.montar();
    }
    public void montar(){
        System.out.println("Cama montada no quarto!");
    }
}
