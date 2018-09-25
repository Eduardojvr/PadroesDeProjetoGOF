
package factory;


public class CarroFactory {
    public static Carro constroiCarro(String carro){
        switch(carro){
            case "celta":
                return new Celta();
            case "Palio":
                return new Palio();
            case "fiesta":
                return new Fiesta();
            case "Gol":
                return new Gol();
            default:
                return null;
        }
    }
}
