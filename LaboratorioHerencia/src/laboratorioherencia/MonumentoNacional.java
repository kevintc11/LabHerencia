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
public abstract class MonumentoNacional extends ZonasProtegidas{

    public MonumentoNacional() {
    }

    public MonumentoNacional(String name, String province, double montoFinal) {
        super(name, province, montoFinal);
    }

    @Override
    public String toString() {
        return super.toString() + "MonumentoNacional{" + '}';
    }

    
    

    
}