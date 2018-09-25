
package builder;

public abstract class CarroBuilder {
        
    protected CarroProduct carro;
    
    public CarroBuilder(){
        carro = new CarroProduct();
        
    }
    
    public abstract void builderPreco();
    public abstract void builderdscMotor();
    public abstract void buiderAnoDeFabricacao();
    public abstract void builderModelo();
    public abstract void builderMontadora();
    
    public CarroProduct getCarro(){
        return carro;
    }
}
