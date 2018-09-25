
package factory;


public abstract class CarroFactory {
    
    public static CarroFactory tipoCarro(String carro){
        switch(carro){
            case "comum":
                return new CarroComumFactory();
            case "corrida":
                return new CarroCorridaFactory();
            default:
                return null;
        }
    }
    
    public abstract Roda criarRoda();
    public abstract Motor criarMotor();
}
