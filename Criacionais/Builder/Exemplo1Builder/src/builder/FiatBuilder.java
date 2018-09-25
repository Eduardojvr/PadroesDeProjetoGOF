
package builder;


public class FiatBuilder extends CarroBuilder {

    @Override
    public void builderPreco() {
        carro.preco = 2500.00;
    }

    @Override
    public void builderdscMotor() {
        carro.dscMotor = "Fire flex 1.0";
    }

    @Override
    public void buiderAnoDeFabricacao() {
        carro.anoDeFabricacao = 2011;
    }

    @Override
    public void builderModelo() {
        carro.modelo = "Palio";
    }

    @Override
    public void builderMontadora() {
        carro.montadora = "Fiat";
    }
    
}
