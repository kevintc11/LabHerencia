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
public class PropiedadPrivada extends RefugioVidaSilvestre{

    public PropiedadPrivada() {
    }

    public PropiedadPrivada(String name, String province, int income) {
        super(name, province, income);
    }

    @Override
    public String toString() {
        return "PropiedadPrivada{" + super.toString() + '}';
    }

    @Override
    public String information() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int totalRevenues() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
