/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eduardo
 */
public class Questao extends QuestionarioComponentes {
    private String questão;
    private String resposta;
    
    
    public Questao(String questao, String resposta){
        this.questão = questao;
        this.resposta = resposta;
    }
    
    @Override
    public void exibir() {
        System.out.println("Pergunta: "+this.questão);
    }
    
}
