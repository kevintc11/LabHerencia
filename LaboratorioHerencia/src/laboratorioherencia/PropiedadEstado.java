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
public class PropiedadEstado extends RefugioVidaSilvestre implements State{
    private double fuelTaxes;
    private static final double TAX = 0.005;
    private double finalAmount;
    
    public PropiedadEstado() {
        this("","", 0.0);
    }

    public PropiedadEstado(String name, String province, double fuelTaxes) {
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

    @Override
    public double subvention() {
        double result = fuelTaxes * TAX;
        return result;
    }

    @Override
    public double calculateAmount() {
        double finalResult = subvention();
        return finalAmount = finalResult;
    }

        
}
