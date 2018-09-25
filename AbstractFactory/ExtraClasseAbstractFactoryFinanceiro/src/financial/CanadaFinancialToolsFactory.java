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
public class CanadaFinancialToolsFactory extends FinancialToolsFactory{

    @Override
    public TaxProcessor CreateTaxProcessor() {
        return new CanadaTaxProcessor();
    }

    @Override
    public ShipFeeProcessor CreateShipFeeProcessor() {
        return new CanadaShipFeeProcessor();
    }
    
}
