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
        BlocoQuestoes blocoA = new BlocoQuestoes("A");
        BlocoQuestoes blocoB = new BlocoQuestoes("B");
        BlocoQuestoes blocoB1 = new BlocoQuestoes("B1");
        BlocoQuestoes blocoB2 = new BlocoQuestoes("B2");
        BlocoQuestoes questionario = new BlocoQuestoes("");
        
        
        Questao q1 = new Questao("Quanto é 1+1? ","2");
        Questao q2 = new Questao("Quanto é 1+2? ","3");
        Questao q3 = new Questao("Quanto é 1+3? ","4");
        Questao q4 = new Questao("Quanto é 1+4? ","5");
        Questao q5 = new Questao("Quanto é 1+5? ","6");
        Questao q6 = new Questao("Quanto é 1+6? ","7");
        Questao q7 = new Questao("Quanto é 1+8? ","8");
        
        //Bloco A
        blocoA.adicionar(q1);
        blocoA.adicionar(q2);
        blocoA.adicionar(q3);

        //Bloco B1
        blocoB1.adicionar(q4);
        blocoB1.adicionar(q5);
        
        //Bloco B2
        blocoB2.adicionar(q6);
        blocoB2.adicionar(q7);
        
        //Bloco B
        blocoB.adicionar(blocoB1);
        blocoB.adicionar(blocoB2);
        
        questionario.adicionar(blocoA);
        questionario.adicionar(blocoB);
        
        
        System.out.println("Questionário");
        questionario.exibir();
        
    }
}
