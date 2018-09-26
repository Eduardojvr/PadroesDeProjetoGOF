
package decorator;

public abstract class CoquetelDecorator extends Coquetel{
    Coquetel base;
    
    public CoquetelDecorator(Coquetel base){
        this.base = base;
    }
    
    @Override
    public String getNome(){
        return base.nome+ " " + nome;
    }
    
    public double getPreco(){
        return base.getValor() + valor;
    }
}
