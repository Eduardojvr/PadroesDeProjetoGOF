
package facade;


public class Financeiro {
 
   public void notafiscal(Pedido pedido){
       System.out.println("******** Nota Fiscal ***********");
       System.out.println("Cliente: "+pedido.getCliente().getNome());
       System.out.println("Cpf: "+pedido.getCliente().getCpf());
       System.out.println("Endereco: "+pedido.getCliente().getEndereco());
       System.out.println("Produto: "+pedido.getProduto().getNome());
       System.out.println("Valor: "+pedido.getProduto().getValor());
   }
}
