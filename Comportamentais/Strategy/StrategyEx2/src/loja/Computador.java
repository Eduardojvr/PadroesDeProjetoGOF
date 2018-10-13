
package loja;


public class Computador extends Produtos {

    public Computador(String marca, double valor){
        this.valor = valor;
        this.marca = marca;
    }
    @Override
    public void info() {
        System.out.println("Computador "+this.marca);
        System.out.println("Valor: "+this.valor);
    }
    
}
