/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorioherencia;

/**
 *
 * @author Kevin Trejos
 */
public class ParqueNacional extends ZonasProtegidas implements State, EntriesIncome{
    private static final int TAX = 1200;
    private static final int TAX_COSTA_RICAN = 5000;
    private static final int TAX_FOREIGN = 6000;
    
    private int electricClients;
    private int costaRicanVisitors;
    private int foreignVisitors;
    
    public ParqueNacional() {
        this("","",0,0,0,0);
    }

    public ParqueNacional(String name, String province, double montoFinal, int electricClients, int costaRicanVisitors,int foreignVisitors) {
        super(name, province, montoFinal);
        this.electricClients = electricClients;
        this.costaRicanVisitors = costaRicanVisitors;
        this.foreignVisitors = foreignVisitors;
    }

    @Override
    public String toString() {
        return super.toString() + "ParqueNacional{" + "electricClients=" + electricClients + ", costaRicanVisitors=" + costaRicanVisitors + ", foreignVisitors=" + foreignVisitors + '}';
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
    
    public void calculateAmount(){
        double finalResult = subvention() + Costarican() + Foreign();
        super.setMontoFinal(finalResult);
    }    
}
