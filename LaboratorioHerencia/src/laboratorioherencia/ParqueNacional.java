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
 * @author Kevin Trejos/Ignacio Zamora
 */
public class ParqueNacional extends ZonasProtegidas implements State, EntriesIncome{
    private static final int TAX = 1200;
    private static final int TAX_COSTA_RICAN = 5000;
    private static final int TAX_FOREIGN = 6000;
    
    private int electricClients;
    private int costaRicanVisitors;
    private int foreignVisitors;
    private double finalAmount;
    
    public ParqueNacional() {
        this("","",0,0,0);
    }

    public ParqueNacional(String name, String province, int electricClients, int costaRicanVisitors,int foreignVisitors) {
        super(name, province);
        this.electricClients = electricClients;
        this.costaRicanVisitors = costaRicanVisitors;
        this.foreignVisitors = foreignVisitors;
    }

    @Override
    public String toString() {
        return "ParqueNacional{" + super.toString() + "monto final = " + calculateAmount() + '}';
    }   

    public double subvention(){
        double result = TAX * electricClients;
        return result;
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
        double finalResult = subvention() + Costarican() + Foreign();
        return finalAmount = finalResult;
    }    
}
