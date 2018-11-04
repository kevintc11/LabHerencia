/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorioherencia;

import java.util.logging.Logger;

/**
 *
 * @author Kevin Trejos
 */
public class PatrimonioCultural extends MonumentoNacional implements EntriesIncome,InternationalEntities{
    private static final int TAX_COSTA_RICAN = 5000;
    private static final int TAX_FOREIGN = 6000;
    private static final double TAX_PIB = 0.002;
    
    private int pib;
    private int costaRicanVisitors;
    private int foreignVisitors;
    
    public PatrimonioCultural() {
    }

    public PatrimonioCultural(String name, String province, double montoFinal, int costaRicanVisitors,int foreignVisitors,int pib ) {
        super(name, province, montoFinal);
        this.costaRicanVisitors = costaRicanVisitors;
        this.foreignVisitors = foreignVisitors; 
        this.pib = pib;
                
    }

    @Override
    public String toString() {
        return super.toString() + "PatrimonioCultural{" + "pib=" + pib + ", costaRicanVisitors=" + costaRicanVisitors + ", foreignVisitors=" + foreignVisitors + '}';
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
    
    public void calculateAmount(){
        double result = Costarican() + Foreign() + foreignContribution();
        super.setMontoFinal(result);
    }
    
}
