
package floricultura;

/**
 *
 * @author eduardo
 */
public class Principal {
    public static void main(String[] args){
        String tFlor = "rosa";
        FlorIf flor = FlorFactory.gerarFlor(tFlor);
        flor.criarFlor();
        
        
    }

}
