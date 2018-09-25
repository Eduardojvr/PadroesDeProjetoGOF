
package proxy;


public class Principal {
    public static void main(String[] args) {
        System.out.println("----- Login com sucesso ------");
        ProxyBanco consulta1 = new ProxyBanco("admin", "admin");
        System.out.println(consulta1.getCadastrados()); 
        System.out.println(consulta1.getConexoes());
        
        System.out.println("----- Login sem sucesso ------");
        ProxyBanco consulta2 = new ProxyBanco("admin", "");
        System.out.println(consulta2.getCadastrados()); 
        System.out.println(consulta2.getConexoes());
        
        
        
    }
}
