/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eduardo
 */
public class Funcionario extends ComponenteEmpresa{
    private String nome;
    private float salario;
    
    public Funcionario(String nome ,float salario){
        this.nome = nome;
        this.salario = salario;
    }
    
    @Override
    public float custoTotal() {
        return this.salario;
    }
    
}
