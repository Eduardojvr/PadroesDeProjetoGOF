
package decoratorex3quarto;

public class Teste {
    public static void main(String[] args) {
//        Quarto quartoBase = new QuartoBase();                
        Quarto quartoComCamaEGuardaRoupas = new DecoratorQuartoComCama(new DecoratorQuartoComGuardaRoupa(new QuartoBase()));
        
    }
}
