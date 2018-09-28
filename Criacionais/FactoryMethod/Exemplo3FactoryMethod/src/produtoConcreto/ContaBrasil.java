/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produtoConcreto;

import produtoAbstrato.ContaFacebook;

/**
 *
 * @author eduardo
 */
public class ContaBrasil extends ContaFacebook{

    @Override
    public String infoConta() {
        return "Conta Brasileira!!";
    }
    
}
