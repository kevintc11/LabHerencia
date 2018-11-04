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
public class ReservaBiologica extends ZonasProtegidas implements State{
    private double anualAmount;
    
    public ReservaBiologica() {
        this("","",0, 0.0);
    }

    public ReservaBiologica(String name, String province, double montoFinal, double anualAmount) {
        super(name, province, montoFinal);
        this.anualAmount = anualAmount;
    }

    @Override
    public String toString() {
        return "ReservaBiologica{"+ super.toString() + "anual amount:" + anualAmount + '}';
    }

    @Override
    public double subvention() {
        return anualAmount;
    }
    
    public void calculateAmount(){
        super.setMontoFinal(anualAmount);
    }
    
}
