/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eduardo
 */
public class AdaptadorControlePonto extends ControleDePonto {
    private ControleDePontoNovo novoControle;
    
    public AdaptadorControlePonto(){
        this.novoControle = new ControleDePontoNovo();
    }
    
    @Override
    public void registrarEntrada(Funcionario func){
        this.novoControle.registra(func.getCodigo(), true);
    }
    
    @Override
    public void registrarSaida(Funcionario func){
        this.novoControle.registra(func.getCodigo(), false);
    }
    
}
