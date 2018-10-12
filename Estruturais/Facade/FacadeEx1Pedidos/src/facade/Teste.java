
package facade;


public class Teste {
    public static void main(String[] args) {
        Financeiro financeiro = new Financeiro();
        Estoque estoque = new Estoque();
        PosVenda posvenda = new PosVenda();
        
        FacadePedido facadepedido = new FacadePedido(estoque, financeiro,posvenda);

        
        Cliente cliente = new Cliente("Eduardo","123456789", "Vicente Pires");
        Produto produto = new Produto("MacBook pro", 56000.00f);
        
        Pedido pedido = new Pedido(cliente, produto);
        
        facadepedido.realizarpedido(pedido);
        
    }
}
