package builder;

public class ConcessionariaDirector {
    protected CarroBuilder montadora;
 
    public ConcessionariaDirector(CarroBuilder montadora) {
        this.montadora = montadora;
    }
 
    public void construirCarro() {
        montadora.builderPreco();
        montadora.buiderAnoDeFabricacao();
        montadora.builderdscMotor();
        montadora.builderModelo();
        montadora.builderMontadora();
    }
 
    public CarroProduct getCarro() {
        return montadora.getCarro();
    }
}