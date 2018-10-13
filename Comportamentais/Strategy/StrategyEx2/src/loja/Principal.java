
package loja;


public class Principal {
    public static void main(String[] args) {
        CarrinhoCompra carrinho = new CarrinhoCompra();
        
        Produtos celular = new Celular("Apple", 3000.0);
        Produtos computador = new Computador("Apple macbook", 10000.0);
        
        carrinho.addItem(celular);
        carrinho.addItem(computador);
        
        FormaPagamento cartao = new Cartao(carrinho.total(), 123456, 9090);
        FormaPagamento Boleto = new Boleto("Eduardo", carrinho.total());
        
        System.out.println("******* Pagamentos ********");
        
        System.out.println();
        System.out.println("===> Cartão");
        carrinho.pagar(cartao); 
        
        System.out.println("===> Boleto");
        carrinho.pagar(Boleto);
        
         
    }
}
