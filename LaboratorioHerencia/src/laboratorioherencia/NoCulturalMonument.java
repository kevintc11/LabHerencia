/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorioherencia;

/**
 *
 * @author Nacho
 */
public class NoCulturalMonument extends MonumentoNacional{
    private static final int TAX_COSTA_RICAN = 5000;
    private static final int TAX_FOREIGN = 6000;
    
    private int costaRicanVisitors;
    private int foreignVisitors;
     
    public NoCulturalMonument() {
    }

    public NoCulturalMonument(String name, String province, double montoFinal, int costaRicanVisitors,int foreignVisitors) {
        super(name, province,  montoFinal);
        this.costaRicanVisitors = costaRicanVisitors;
        this.foreignVisitors = foreignVisitors; 
    }

    @Override
    public String toString() {
        return super.toString() + "NoCulturalMonument{" + "costaRicanVisitors=" + costaRicanVisitors + ", foreignVisitors=" + foreignVisitors + '}';
    }

    
    
    
    
    public  double Costarican(){
        double result = TAX_COSTA_RICAN * costaRicanVisitors;
        return result;
    }
    
    public  double Foreign(){
        double result = TAX_FOREIGN * foreignVisitors;
        return result;
    }
    
    public void calculateAmount(){
        double result = Costarican() + Foreign();
        super.setMontoFinal(result);
    }
    
    
}
