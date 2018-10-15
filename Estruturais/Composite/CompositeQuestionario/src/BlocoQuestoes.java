
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
public class BlocoQuestoes extends QuestionarioComponentes {
    private String identificador;
    private ArrayList<QuestionarioComponentes> questionario;
    
    public BlocoQuestoes(String id){
        this.questionario = new ArrayList<QuestionarioComponentes>();
        this.identificador = id;
    }
    
    @Override
    public void exibir() {
        System.out.println(this.identificador);
        for(QuestionarioComponentes bloco : this.questionario){
            bloco.exibir();
        }
    }
    
    public void adicionar(QuestionarioComponentes bloco){
        this.questionario.add(bloco);
       
    }
    
    public void remover(QuestionarioComponentes bloco){
        this.questionario.remove(bloco);
    }
}
