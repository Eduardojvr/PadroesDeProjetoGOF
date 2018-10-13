
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eduardo
 */
public class Armazenador {
    private ArrayList<Memento> momentos;
    
    public Armazenador(){
        this.momentos = new ArrayList<Memento>();
    }
    
    public void adicionaMomento(Memento momento){
        this.momentos.add(momento);
    }
    public Memento getUltimoMomento(){
        if(this.momentos.size() <= 0 ){
            return new Memento(" ");
        }
        Memento ultimoEstadoSalvo = this.momentos.get(this.momentos.size() - 1);
        this.momentos.remove(this.momentos.size()-1);
        
        return ultimoEstadoSalvo;
    }
}
