
package state;


public class Principal {
    public static void main(String[] args) {
        Bandeira1 bandeira1 = new Bandeira1();
        Bandeira2 bandeira2 = new Bandeira2();
        
        System.out.println("Corrida em bandeira 1: ");
        Taximetro taximetro = new Taximetro(bandeira1);
        taximetro.valortotalcorrida(30, 20);
        
        System.out.println("");
        
        System.out.println("Corrida em bandeira 2: ");
        taximetro.setBandeira(bandeira2);
        taximetro.valortotalcorrida(30, 20);
    }
}
