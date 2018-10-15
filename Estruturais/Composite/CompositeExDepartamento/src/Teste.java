/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eduardo
 */
public class Teste {
    public static void main(String[] args) {
        Departamento depbase = new Departamento();

        
        ComponenteEmpresa func1 = new Funcionario("Paulo", 10000.0f);
        ComponenteEmpresa func2 = new Funcionario("Ana", 50000.0f);
        ComponenteEmpresa func3 = new Funcionario("João", 10000.0f);
        ComponenteEmpresa func4 = new Funcionario("Alfredo", 90000.0f);
        
        Departamento dep1 = new Departamento();
        dep1.addComponente(func2);
        
        Departamento dep2 = new Departamento();
        dep2.addComponente(func4);
        
        depbase.addComponente(func1);
        depbase.addComponente(dep1);
        depbase.addComponente(dep2);
        
        System.out.println("Total: "+depbase.custoTotal());

        
    }
        
}
