
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
public class ContaBlizzard extends ContaSubject{
    private String nome;
    private String senha;
    private String email;
    
    private ArrayList<ObservaConta> observadores = new ArrayList<ObservaConta>();
    
    public ContaBlizzard(String nome, String senha, String email){
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    @Override
    public void adicionarobservador(ObservaConta ob) {
        this.observadores.add(ob);
    }

    @Override
    public void removeobservador(ObservaConta ob) {
        this.observadores.remove(ob);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
   public void notificar(){
        for(ObservaConta obs : this.observadores){
            obs.update(this);
        }
   }
 
    public void logar(String email, String senha){
        if(this.email.equals(email) && this.senha.endsWith(senha)){
            System.out.println("Login realizado com sucesso!");
            this.notificar();
        } else {
            System.out.println("Senha ou email errados!");
        }
    }
    
}
