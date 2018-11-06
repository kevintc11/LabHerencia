/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorioherencia;

/**
 * This class represents a national monument that is not cultural heritage
 * 
 *@version 4/11/2018
 * @author Ignacio Zamora/Kevin Trejos
 */
public class NoCulturalMonument extends NationalMonument implements EntriesIncome{
    private static final int TAX_COSTA_RICAN = 5000;
    private static final int TAX_FOREIGN = 6000;
    
    private int costaRicanVisitors;
    private int foreignVisitors;
    private double finalAmount;
     
    public NoCulturalMonument() {
        this("","",0,0);
    }

    public NoCulturalMonument(String name, String province, int costaRicanVisitors,int foreignVisitors) {
        super(name, province);
        this.costaRicanVisitors = costaRicanVisitors;
        this.foreignVisitors = foreignVisitors; 
    }

    public int getCostaRicanVisitors() {
        return costaRicanVisitors;
    }

    public void setCostaRicanVisitors(int costaRicanVisitors) {
        this.costaRicanVisitors = costaRicanVisitors;
    }

    public int getForeignVisitors() {
        return foreignVisitors;
    }

    public void setForeignVisitors(int foreignVisitors) {
        this.foreignVisitors = foreignVisitors;
    }

    public double getFinalAmount() {
        return finalAmount;
    }

    public void setFinalAmount(double finalAmount) {
        this.finalAmount = finalAmount;
    }
    
    @Override
    public String toString() {
        return super.toString() + " NoCulturalMonument " + ", Amount Income = " + calculateAmount();
    }
    /**
     * This method calculates amount in money for tickets sold to Costa Ricans
     * @return total amount
     */
    public  double Costarican(){
        double result = TAX_COSTA_RICAN * costaRicanVisitors;
        return result;
    }
    /**
     * This method calculates amount in money for tickets sold to Foreign
     * @return total amount
     */
    public  double Foreign(){
        double result = TAX_FOREIGN * foreignVisitors;
        return result;
    }
    /**
     * this method calculates the total amount of tickets sold
     * @return total amount
     */
    public double calculateAmount(){
        double result = Costarican() + Foreign();
        return finalAmount = result;
    }
    
    
}
