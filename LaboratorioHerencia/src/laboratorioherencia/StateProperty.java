/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorioherencia;

/**
 * this class represents a wildlife refuge that is owned by the state
 * 
 *@version 4/11/2018
 * @author Kevin Trejos/Ignacio Zamora
 */
public class StateProperty extends WildlifeRefuge implements State{
    private double fuelTaxes;
    private static final double TAX = 0.005;
    private double finalAmount;
    
    public StateProperty() {
        this("","", 0.0);
    }

    public StateProperty(String name, String province, double fuelTaxes) {
        super(name, province);
        this.fuelTaxes = fuelTaxes;
    }

    public double getFuelTaxes() {
        return fuelTaxes;
    }

    public void setFuelTaxes(double fuelTaxes) {
        this.fuelTaxes = fuelTaxes;
    }
    
    @Override
    public String toString() {
        return  super.toString() + "PropiedadEstado{" + "amount income = " + calculateAmount() + '}';
    }
    /**
    * Calculate the amount you pay for the grant
    * @return total amount
    */
    public double subvention() {
        double result = fuelTaxes * TAX;
        return result;
    }
    /**
    * this method calculates the total amount of tickets sold
    * @return total amount
    */
    public double calculateAmount() {
        double finalResult = subvention();
        return finalAmount = finalResult;
    }

        
}
