/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorioherencia;

import javax.swing.JOptionPane;

/**
 *
 * @author Kevin Trejos
 */
public class ReservaBiologica extends ZonasProtegidas implements State{

    public ReservaBiologica() {
        this("","",0);
    }

    public ReservaBiologica(String name, String province, int income) {
        super(name, province, income);
    }

    @Override
    public String toString() {
        return "ReservaBiologica{"+ super.toString() + '}';
    }
    
    public double calculateAmount(){
        
    }
    
}
