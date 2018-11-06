/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorioherencia;

/**
 * this class represents a biological reserve
 * 
 *@version 4/11/2018
 * @author Kevin Trejos/Ignacio Zamora
 */
public class BiologicalReserve extends ProtectedAreas implements State{
    private double anualAmount;
    private double finalAmount;
    
    public BiologicalReserve() {
        this("","", 0.0);
    }

    public BiologicalReserve(String name, String province, double anualAmount) {
        super(name, province);
        this.anualAmount = anualAmount;
    }

    @Override
    public String toString() {
        return  "ReservaBiologica{" + super.toString() + "Amount Income = " + calculateAmount() ;
    }
 
    /**
    * Calculate the amount you pay for the grant
    * @return total amount
    */
    public double subvention() {
        return anualAmount;
    }
    /**
    * this method calculates the total amount of tickets sold
    * @return total amount
    */
    public double calculateAmount(){
        double finalResult = subvention();
        return finalAmount = finalResult;
    }
    
}
