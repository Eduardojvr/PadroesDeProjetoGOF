
package facade;


public class FacadePedido {
    private Estoque estoque;
    private Financeiro financeiro;
    private PosVenda posvenda;
    
    public FacadePedido(Estoque estoque, Financeiro financeiro, PosVenda posvenda){
        this.estoque = estoque;
        this.posvenda = posvenda;
        this.financeiro = financeiro;
    }
    public void realizarpedido(Pedido pedido){
        this.estoque.envia(pedido);
        this.financeiro.notafiscal(pedido);
        this.posvenda.agendarcontato(pedido);
    }
    
}
