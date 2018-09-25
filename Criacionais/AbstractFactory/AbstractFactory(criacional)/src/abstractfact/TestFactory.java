
package abstractfact;

public class TestFactory {
    private static Carro montarCarro(String tipo){
        CarroFactory cf = null;
        switch(tipo){
            case "luxo":
                cf = new CarroLuxoFactory();
                break;
            case "popular":
                cf = new CarroPopularFactory();
                break;
            case "mediano":
                cf = new CarroMedianoFactory();
        } 
        Carro carro = new Carro();
        carro.setRoda(cf.montarRoda());
        carro.setSom(cf.montarSom());
        return carro;
    }
    public static void main(String[] args) {
        Carro c1 = montarCarro("luxo");
        Carro c2 = montarCarro("popular");
        Carro c3 = montarCarro("mediano");
        
    }
  
}
