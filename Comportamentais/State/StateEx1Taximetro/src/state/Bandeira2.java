/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

/**
 *
 * @author eduardo
 */
public class Bandeira2 implements Bandeira {

    @Override
    public float calcularcorrida(float distancia, float tempo) {
        return 5.0f + tempo * 3.0f + distancia * 4.0f;
    }
    
}
