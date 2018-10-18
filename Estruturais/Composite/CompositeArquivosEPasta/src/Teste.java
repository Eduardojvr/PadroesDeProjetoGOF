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
        Arquivo img = new Imagem("Imagem.png");
        Arquivo texto = new Texto("Texto.txt");
        Arquivo video = new Video("Video.mp4");
        
        Pasta pasta1 = new Pasta("Minha_pasta");
        
        pasta1.adicionarArquivo(img);
        pasta1.adicionarArquivo(texto);
        pasta1.adicionarArquivo(video);
        
        System.out.println("===>Pasta sem alteracoes");
        pasta1.visualizar();
        
        System.out.println("===>Renomeando arquivo img da pasta");
        pasta1.UpdateArquivo(img, "minhaImagem.png");       
        pasta1.visualizar();

        
    }
}
