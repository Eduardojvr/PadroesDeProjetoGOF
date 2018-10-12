
package facade;

public class Estoque {
    public void envia(Pedido pedido){
        System.out.println("******* Informações de Envio *******");
        System.out.println("Enviando para: "+ pedido.getCliente().getEndereco());
        System.out.println("Produto: "+pedido.getProduto().getNome());
    }
}
