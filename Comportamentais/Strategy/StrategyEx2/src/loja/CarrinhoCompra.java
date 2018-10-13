
package loja;

import java.util.ArrayList;

public class CarrinhoCompra {
    ArrayList<Produtos> prod = new ArrayList<Produtos>();
    FormaPagamento pagm;
    
    public double total(){
        double total=0;
        for(Produtos p : prod){
            total += p.valor;
        }
        return total;
    }
    public void addItem(Produtos prod){
        this.prod.add(prod);
    }
    public void removeItem(Produtos prod){  
        this.prod.remove(prod);
    }
    public void pagar(FormaPagamento pag){
        this.pagm = pag;
        this.pagm.pagar();
    }
}
