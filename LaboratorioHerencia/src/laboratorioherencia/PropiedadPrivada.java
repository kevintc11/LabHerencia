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
public class PropiedadPrivada extends RefugioVidaSilvestre implements InternationalEntities{
    private double noGovernmentalAid;
    private double finalAmount;
            
    public PropiedadPrivada() {
        this("","", 0.0);
    }

    public PropiedadPrivada(String name, String province, double noGovernamentalAid) {
        super(name, province);
        this.noGovernmentalAid = noGovernamentalAid;
    }

    public double getNoGovernmentalAid() {
        return noGovernmentalAid;
    }

    public void setNoGovernmentalAid(double noGovernmentalAid) {
        this.noGovernmentalAid = noGovernmentalAid;
    }
    
    @Override
    public String toString() {
        return "PropiedadPrivada{" + super.toString() + "noGovernamentalAid" + noGovernmentalAid + '}';
    }

    @Override
    public double foreignContribution() {
        return noGovernmentalAid;
    }

    @Override
    public double calculateAmount() {
        double finalResult = foreignContribution();
        return finalAmount = finalResult;
    }   
}
