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
public class ReservaBiologica extends ZonasProtegidas implements State{
    private double anualAmount;
    private double finalAmount;
    
    public ReservaBiologica() {
        this("","", 0.0);
    }

    public ReservaBiologica(String name, String province, double anualAmount) {
        super(name, province);
        this.anualAmount = anualAmount;
    }

    @Override
    public String toString() {
        return  "ReservaBiologica{" + super.toString() + "Amount Income = " + calculateAmount() ;
    }

    @Override
    public double subvention() {
        return anualAmount;
    }
    
    public double calculateAmount(){
        double finalResult = subvention();
        return finalAmount = finalResult;
    }
    
}
