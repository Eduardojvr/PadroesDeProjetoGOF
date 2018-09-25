
package factory;
import java.util.Scanner;

public class Principal {
  
    public static void main(String[] args) {
        String tipoCarro;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Tipo de carro: ");
        tipoCarro = entrada.nextLine();
        
        CarroFactory carro = CarroFactory.tipoCarro(tipoCarro);
        
        Motor motor = carro.criarMotor();
        Roda roda = carro.criarRoda();
       
        motor.tipoMotor();
        roda.tipoRoda();
      
        
       
    }
}
