/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eduardo
 */
public class ControleDePontoNovo {
    public void registra(String codigo, boolean isEntrada){
        if(isEntrada){
            System.out.println("Funcionario de codigo "+codigo+" sua entrada foi registrada!");
            //Lógica de registro de entrada
        } else {
            System.out.println("Funcionario de codigo "+codigo+" sua saída foi registrada!");
        }
    }
}
