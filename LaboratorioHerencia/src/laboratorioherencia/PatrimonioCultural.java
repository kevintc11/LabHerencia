/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorioherencia;

import java.util.logging.Logger;

/**
 *
 * @author Kevin Trejos
 */
public class PatrimonioCultural extends MonumentoNacional{

    public PatrimonioCultural() {
    }

    public PatrimonioCultural(String name, String province, int income) {
        super(name, province, income);
    }

    @Override
    public String toString() {
        return "PatrimonioCultural{" + super.toString() + '}';
    }

    @Override
    public int totalRevenues() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String information() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
