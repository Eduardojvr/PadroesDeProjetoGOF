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
public class Celular extends Produtos {

    public Celular(String marca, double valor){
        this.valor = valor;
        this.marca = marca;
        
    }
    @Override
    public void info(){
        System.out.println("Celular "+ this.marca);
        System.out.println("Valor "+this.valor);
    }
}
