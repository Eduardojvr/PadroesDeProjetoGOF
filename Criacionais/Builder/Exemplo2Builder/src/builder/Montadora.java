
package builder;


public class Montadora {
    
    CelularBuild marca;
            
    public Montadora(CelularBuild marca){
        this.marca = marca;
    }
    
    public void montar(){
        marca.buildAnoFabri();
        marca.buildCor();
        marca.buildFabricante();
        marca.buildModelo();   
    }
    public Celular getCelular(){
        return marca.cel;
    }    
}
