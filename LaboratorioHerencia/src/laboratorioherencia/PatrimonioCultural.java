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
 * @author Kevin Trejos
 */
public class PatrimonioCultural extends MonumentoNacional implements EntriesIncome,InternationalEntities{
    private static final int TAX_COSTA_RICAN = 5000;
    private static final int TAX_FOREIGN = 6000;
    private static final double TAX_PIB = 0.002;
    
    private int pib;
    private int costaRicanVisitors;
    private int foreignVisitors;
    private double finalAmount;
    
    public PatrimonioCultural() {
    }

    public PatrimonioCultural(String name, String province, int costaRicanVisitors,int foreignVisitors,int pib ) {
        super(name, province);
        this.costaRicanVisitors = costaRicanVisitors;
        this.foreignVisitors = foreignVisitors; 
        this.pib = pib;
                
    }

    @Override
    public String toString() {
        return super.toString() + "PatrimonioCultural" + "Amount Income = " + calculateAmount();
    }

    
    public  double Costarican(){
        double result = TAX_COSTA_RICAN * costaRicanVisitors;
        return result;
    }
    
    public  double Foreign(){
        double result = TAX_FOREIGN * foreignVisitors;
        return result;
    }
    
    public double foreignContribution(){
        double result = TAX_PIB * pib;
        return result;
    }
    
    public double calculateAmount(){
        double result = Costarican() + Foreign() + foreignContribution();
        return finalAmount = result;
    }
    
}
