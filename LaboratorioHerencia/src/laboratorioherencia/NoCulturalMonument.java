/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorioherencia;

/**
 * 
 * 
 *@version 4/11/2018
 * @author Ignacio Zamora/Kevin Trejos
 */
public class NoCulturalMonument extends MonumentoNacional implements EntriesIncome{
    private static final int TAX_COSTA_RICAN = 5000;
    private static final int TAX_FOREIGN = 6000;
    
    private int costaRicanVisitors;
    private int foreignVisitors;
    private double finalAmount;
     
    public NoCulturalMonument() {
    }

    public NoCulturalMonument(String name, String province, int costaRicanVisitors,int foreignVisitors) {
        super(name, province);
        this.costaRicanVisitors = costaRicanVisitors;
        this.foreignVisitors = foreignVisitors; 
    }

    @Override
    public String toString() {
        return super.toString() + " NoCulturalMonument " + "Amount Income = " + calculateAmount();
    }
 
    
    public  double Costarican(){
        double result = TAX_COSTA_RICAN * costaRicanVisitors;
        return result;
    }
    
    public  double Foreign(){
        double result = TAX_FOREIGN * foreignVisitors;
        return result;
    }
    
    public double calculateAmount(){
        double result = Costarican() + Foreign();
        return finalAmount = result;
    }
    
    
}
