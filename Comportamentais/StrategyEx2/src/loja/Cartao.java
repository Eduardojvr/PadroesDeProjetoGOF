/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja;

/**
 *
 * @author eduardo
 */
public class Cartao extends FormaPagamento{
    private double valor;
    private double ncartao;
    private int senha;
    
    public Cartao(double valor, double ncartao, int senha){
        this.valor = valor;
        this.senha = senha;
        this.ncartao = ncartao;
    }

    @Override
    public void pagar() {
        System.out.println("Pagamento realizado com cartão!");
        System.out.println("Valor: "+this.valor);
        System.out.println("Senha: "+this.senha);
        System.out.println("Número do cartão: "+this.ncartao);
        
    }
    
}
