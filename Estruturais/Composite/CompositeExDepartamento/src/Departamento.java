
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
public class Departamento extends ComponenteEmpresa {
    private ArrayList<ComponenteEmpresa> componente = new ArrayList<ComponenteEmpresa>();
       
    @Override
    public float custoTotal() {
        float total=0;
        for(ComponenteEmpresa c : this.componente){
            total += c.custoTotal();
        }
        return total;
    }
    public void addComponente(ComponenteEmpresa comp){
        this.componente.add(comp);
    }
    
    public void removeComponente(ComponenteEmpresa comp){
        this.componente.remove(comp);
    }
    
}
