
package floricultura;


public class FlorFactory {
    public static FlorIf gerarFlor(String tFlor){
        switch(tFlor){
            case "margarida":
                return new Margarida();
            case "rosa":
                return new Rosa();
            case "orquidea":
                return new Orquidea();
            default:
                return null;
               
        }
    }
}
