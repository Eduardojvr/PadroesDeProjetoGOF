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
public class EuropeFinancialToolsFactory extends FinancialToolsFactory {

    @Override
    public TaxProcessor CreateTaxProcessor() {
        return new EuropeTaxProcessor();
    }

    @Override
    public ShipFeeProcessor CreateShipFeeProcessor() {
        return new EuropeShipFeeProcessor();
    }
    
}
