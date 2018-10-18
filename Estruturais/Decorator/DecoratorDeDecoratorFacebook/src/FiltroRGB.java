/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eduardo
 */
public class FiltroRGB extends DecoraComponente{

    public FiltroRGB(DecoratorPerfil decora) {
        super(decora);
    }

    @Override
    public void visualizar() {
        System.out.println("Filtro RGB");
        this.getDecoratorPerfil().visualizar();
    }
    
}
