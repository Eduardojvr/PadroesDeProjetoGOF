/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eduardo
 */
public class Main {
    public static void main(String[] args) {
  
        
//        Pizza pcalabresa = new PizzaComCalabresa(psimples,20f);
//        
//        System.out.println(pcalabresa.descricao());

          Pizza calabresacatupiri = new PizzaComCalabresa(new PizzaComCatupiri( new PizzaSimples(3f), 10f), 15f);
          System.out.println("Pizza de: "+calabresacatupiri.descricao());
          System.out.println("Valor total: "+calabresacatupiri.valor());

          Pizza calabresa = new PizzaComCalabresa(new PizzaSimples(3f), 10f);
          System.out.println("Pizza de: "+calabresacatupiri.descricao());
          System.out.println("Valor total: "+calabresa.valor());
          
          
          Pizza catupiri = new PizzaComCatupiri(new PizzaSimples(3f), 8f);
          System.out.println("Pizza de: "+catupiri.descricao());
          System.out.println("Valor total: "+catupiri.valor());

          Pizza simples = new PizzaSimples(3f);
          System.out.println("Pizza de: "+simples.descricao());
          System.out.println("Valor total: "+simples.valor());
    }
}
