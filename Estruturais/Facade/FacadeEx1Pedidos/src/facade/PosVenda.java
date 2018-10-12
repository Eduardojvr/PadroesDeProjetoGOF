
package facade;


public class PosVenda {
    public void agendarcontato(Pedido pedido){
        System.out.println("******** Pos Venda **********");
        System.out.println("Entrar em contato com "+pedido.getCliente().getNome()+" em 2019");
    }
}
