package proxy;

public class ProxyBanco extends BancoDeDados{
    private String usuario;
    private String senha;
    
    
    public ProxyBanco(String usuario, String senha){
        this.usuario = usuario;
        this.senha = senha; 
    }
    
    @Override
    public String getConexoes(){
        if(autorizacao()){
            return super.getConexoes();
        }
        return null;
    }
    
    
    @Override
    public String getCadastrados(){
        if(autorizacao()){
            return super.getCadastrados();
        }
        return null;
    }
    
    private boolean autorizacao(){
       return this.usuario.equals("admin") && this.senha.equals("admin");
    } 
}
