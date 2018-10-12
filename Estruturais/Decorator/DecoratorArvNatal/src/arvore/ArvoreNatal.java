/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvore;

/**
 *
 * @author eduardo
 */
public abstract class ArvoreNatal {
    private String material;
    private float altura;
    
    public abstract void info();
    
    public String getMaterial(){
        return this.material;
    }
    public float getAltura(){
        return this.altura;
    }
    
    public void setAltura(float altura){
        this.altura = altura;
    }
    public void setMaterial(String material){
        this.material = material;
    }
}
