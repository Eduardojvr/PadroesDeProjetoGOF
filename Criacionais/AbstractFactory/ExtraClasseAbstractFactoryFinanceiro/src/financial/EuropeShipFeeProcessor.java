/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package financial;

/**
 *
 * @author eduardo
 */
public class EuropeShipFeeProcessor extends ShipFeeProcessor {

    @Override
    public String calculateShippingFee() {
        return "Frete para a Europa calculado!!";
    }
    
}
