
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eduardo
 */
public class ModuloEnvioEmail implements ObservaConta{


    @Override
    public void update(ContaBlizzard conta) {
        this.enviaemail(conta);
    }
    
    public void enviaemail(ContaBlizzard conta){
        System.out.println(conta.getNome()+" sua conta na blizzard foi acessada!");
        //Lógica de envio de email para usuário

    }
    
    
}
