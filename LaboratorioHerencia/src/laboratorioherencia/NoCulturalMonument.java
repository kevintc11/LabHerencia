/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorioherencia;

/**
 *
 * @author Nacho
 */
public class NoCulturalMonument extends MonumentoNacional{

    public NoCulturalMonument() {
    }

    public NoCulturalMonument(String name, String province, int income) {
        super(name, province, income);
    }

    @Override
    public String toString() {
        return "NoCulturalMonument{"  + super.toString() + '}';
    }
    
    
}
