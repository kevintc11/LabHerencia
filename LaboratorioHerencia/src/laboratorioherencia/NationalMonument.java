/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorioherencia;

/**
 * this class represents a national monument
 * 
 *@version 4/11/2018
 * @author Kevin Trejos/Ignacio Zamora
 */
public abstract class NationalMonument extends ProtectedAreas{

    public NationalMonument() {
        this("","");
    }

    public NationalMonument(String name, String province) {
        super(name, province);
    }

    @Override
    public String toString() {
        return "MonumentoNacional " + super.toString() ;
    }

    
    

    
}