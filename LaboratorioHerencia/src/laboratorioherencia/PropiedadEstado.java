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
public class PropiedadEstado extends RefugioVidaSilvestre implements State{
    private double fuelTaxes;
    private static final double TAX = 0.005;
    
    public PropiedadEstado() {
        this("","",0, 0.0);
    }

    public PropiedadEstado(String name, String province, int income, double fuelTaxes) {
        super(name, province, income);
    }

    public double getFuelTaxes() {
        return fuelTaxes;
    }

    public void setFuelTaxes(double fuelTaxes) {
        this.fuelTaxes = fuelTaxes;
    }
    
    @Override
    public String toString() {
        return "PropiedadEstado{"+ super.toString() + "fuelTaxes:" + fuelTaxes +'}';
    }

    @Override
    public double subvention() {
        double result = fuelTaxes * TAX;
        return result;
    }

    @Override
    public void calculateAmount() {
        double finalResult = subvention();
        super.setMontoFinal(finalResult);
    }

        
}
