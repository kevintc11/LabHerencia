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
public class State {
    private int subvetion;

    public State(int subvetion) {
        this.subvetion = subvetion;
    }

    public State() {
    }

    public int getSubvetion() {
        return subvetion;
    }

    public void setSubvetion(int subvetion) {
        this.subvetion = subvetion;
    }

    @Override
    public String toString() {
        return "State{" + "subvetion=" + subvetion + '}';
    }
    
    
}