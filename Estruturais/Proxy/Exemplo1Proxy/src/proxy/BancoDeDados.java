
package proxy;


class BancoDeDados {
    int qtdCadastrados=100;
    int qtdConexoes=8;

   public String getConexoes(){
       return "Quantidade de cadastrados:"+qtdCadastrados;
   }
   public String getCadastrados(){
       return "Quantidade de conexoes ativas:"+qtdConexoes;
   }
    
}
