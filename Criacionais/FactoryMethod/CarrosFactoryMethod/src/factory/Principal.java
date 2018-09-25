/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

/**
 *
 * @author eduardo
 */
public class Principal {
    public static void main(String[] args) {
        String car = "fiesta";
        Carro carro = CarroFactory.constroiCarro(car);
        carro.infoCarro();
    }
}
