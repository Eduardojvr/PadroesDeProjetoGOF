/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eduardo
 */
public class teste {
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario("Funcionario 1", "12345");
        
        ControleDePonto controle = new AdaptadorControlePonto();
        
        controle.registrarEntrada(func1);
        controle.registrarSaida(func1);
    }
}
