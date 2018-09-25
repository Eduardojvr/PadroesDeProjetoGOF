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
public class OrderProcessor {
    public static void main(String[] args) {
        String local = "europa";
        
        FinancialToolsFactory financial = FinancialToolsFactory.localidade(local);
        
        TaxProcessor imposto = financial.CreateTaxProcessor();
        ShipFeeProcessor frete = financial.CreateShipFeeProcessor();
        
        System.out.println(imposto.calculateTaxes());
        System.out.println(frete.calculateShippingFee());
        
    }
    
}
