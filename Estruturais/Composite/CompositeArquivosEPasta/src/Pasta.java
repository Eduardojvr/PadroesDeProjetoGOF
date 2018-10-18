import java.util.ArrayList;

public class Pasta extends Arquivo {
    private ArrayList<Arquivo> arquivos;
    
    public Pasta(String nome) {
        super(nome);
        this.arquivos = new ArrayList<Arquivo>();
    }

    public void adicionarArquivo(Arquivo arquivo){
        this.arquivos.add(arquivo);
    }
    
    public void removerArquivo(Arquivo arquivo){
        this.arquivos.remove(arquivo);
    }
    
    @Override
    public void visualizar() {
        System.out.println("Arquivos da pasta "+this.getNome());
        for(Arquivo a : this.arquivos){
            System.out.println(a.getNome());
        }
    }
    
   public void UpdateArquivo(Arquivo a, String novonome){
       for(Arquivo b : this.arquivos){
           if(b.getNome().equals(a.getNome())){
               b.renomear(novonome);
               break;
           }
       }
   }
    
}
