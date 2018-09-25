
package builder;

public class SonyBuild extends CelularBuild{

    @Override
    public void buildCor() {
        cel.cor = "Dourado";
    }

    @Override
    public void buildFabricante() {
        cel.fabricante = "Sony";
    }

    @Override
    public void buildModelo() {
        cel.modelo = "Xperia";
    }

    @Override
    public void buildAnoFabri() {
        cel.anoFab = 2018;
    }
    
}
