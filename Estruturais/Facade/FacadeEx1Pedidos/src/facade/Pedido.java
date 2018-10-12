
package facade;


public class Pedido {
    private Cliente cliente;
    private Produto produto;
    
    public Pedido(Cliente cliente, Produto produto){
        this.cliente = cliente;
        this.produto = produto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
}
