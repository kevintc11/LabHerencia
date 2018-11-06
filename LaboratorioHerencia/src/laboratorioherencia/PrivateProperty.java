/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorioherencia;

/**
 * this class represents a wildlife refuge that is privately owned
 * 
 *@version 4/11/2018
 * @author Kevin Trejos/Ignacio Zamora
 */
public class PrivateProperty extends WildlifeRefuge implements InternationalEntities{
    private double noGovernmentalAid;
    private double finalAmount;
            
    public PrivateProperty() {
        this("","", 0.0);
    }

    public PrivateProperty(String name, String province, double noGovernamentalAid) {
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
        return super.toString() + "PropiedadPrivada{" + ", Amount income" + calculateAmount() + '}';
    }
    /**
    * This method calculates the contribution by private companies
    * @return total amount
    */
    public double foreignContribution() {
        return noGovernmentalAid;
    }
    /**
    * this method calculates the total amount of tickets sold
    * @return total amount
    */
    public double calculateAmount() {
        double finalResult = foreignContribution();
        return finalAmount = finalResult;
    }   
}
