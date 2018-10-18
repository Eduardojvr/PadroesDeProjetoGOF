/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eduardo
 */
public abstract class Arquivo {
    private String nome;
    public Arquivo(String nome){
        this.nome = nome;
    }
    public abstract void visualizar();
    private void setNome(String nome){
        this.nome=nome;
    }
    public void renomear(String nome){
        this.setNome(nome);
    }
    public String getNome(){
        return this.nome;
    }
}
