/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eduardo
 */
public class teste {
    public static void main(String[] args) {
        ImplementaJanela jmac = new MacJanela();
        ImplementaJanela jLinux = new LinuxJanela();
        
        Janela jerro = new JanelaErro(jmac);
        jerro.desenhar();
        System.out.println("********");
        Janela jerro2 = new JanelaErro(jLinux);
        jerro2.desenhar();
    }
}
