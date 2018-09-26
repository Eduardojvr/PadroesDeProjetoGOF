package decorator;

public class Principal {
    public static void main(String[] args) {
        Coquetel coq = new Cachaca();
        coq = new Refrigerante(coq);
        
        System.out.println(coq.getNome());
    }
}
