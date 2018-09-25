/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author eduardo
 */
public class Principal {
    public static void main(String[] args) {
        ConcessionariaDirector concessionaria = new ConcessionariaDirector(new FiatBuilder());
        concessionaria.construirCarro();
        
         CarroProduct carro = concessionaria.getCarro();
    System.out.println("Carro: " + carro.modelo + "/" + carro.montadora
            + "\nAno: " + carro.anoDeFabricacao + "\nMotor: "
            + carro.dscMotor + "\nValor: " + carro.preco);
        
       
    }
}
