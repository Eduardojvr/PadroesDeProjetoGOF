
package builder;

public class Principal {
    public static void main(String[] args) {
        Montadora montadora = new Montadora(new AppleBuild());
        montadora.montar();
        
        Celular celular = montadora.getCelular();
        System.out.println(celular.fabricante);
        System.out.println(celular.modelo);
        System.out.println(celular.cor);
        System.out.println(celular.anoFab);

    }
          
}
