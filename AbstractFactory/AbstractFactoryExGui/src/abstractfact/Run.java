/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfact;
import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Run {
    public static void main(String[] args) {
        String str;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite a interface: ");
        str = entrada.nextLine();
      
        GuiFactory op = GuiFactory.obterfactory(str);
        Janela janela = op.criarJanela();
        Botao botao = op.criarBotao();
        
        janela.paint();
        botao.paint();
        
        
        
    }
}
