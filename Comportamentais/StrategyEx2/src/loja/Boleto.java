
package loja;

public class Boleto extends FormaPagamento{
    private double valor;
    private String pagante;
    
    public Boleto(String pag, double val){
        this.pagante = pag;
        this.valor = val;
    }
    
    @Override
    public void pagar() {
        System.out.println("Pagamento via boleto realizado com sucesso!");
        System.out.println("Valor: "+this.valor);
        System.out.println("Nome pagante: "+this.pagante);
    }
    
}
