
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eduardo
 */
public final class MultitonCarrosUnicos {
    private String dono;
    private String corCarro;
    private static Map<String, MultitonCarrosUnicos> unicos;
    public static final String CARROBATMAN = "Batman";
    public static final  String CARRODEVOLTAPARAOFUTURO = "Emmet";
        
    private MultitonCarrosUnicos(String cor, String dono){
        this.corCarro = cor;
        this.dono = dono;
        
    }
    
    public static MultitonCarrosUnicos getInstance(String carro){
        if(unicos == null){
            unicos = new HashMap<String, MultitonCarrosUnicos>();
            unicos.put(CARROBATMAN,new MultitonCarrosUnicos("Preto", CARROBATMAN ));
            unicos.put(CARRODEVOLTAPARAOFUTURO,new MultitonCarrosUnicos("Prata", CARRODEVOLTAPARAOFUTURO));
        }
        return unicos.get(carro);
    }

    public String getDono() {
        return dono;
    }

    public String getCorCarro() {
        return corCarro;
    }
    
}
