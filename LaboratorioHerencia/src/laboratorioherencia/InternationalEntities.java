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
public class InternationalEntities {
    private double pib;
    private double amount;

    public InternationalEntities() {
    }

    public InternationalEntities(double pib, double amount) {
        this.pib = pib;
        this.amount = amount;
    }

    public double getPib() {
        return pib;
    }

    public void setPib(double pib) {
        this.pib = pib;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "InternationalEntities{" + "pib=" + pib + ", amount=" + amount + '}';
    }
    
    public void amountOperation(){
        
    }
}
