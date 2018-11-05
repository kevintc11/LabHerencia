/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorioherencia;

/**
 * this class represents a wildlife refuge
 * 
 *@version 4/11/2018
 * @author Kevin Trejos/Ignacio Zamora
 */
public abstract class RefugioVidaSilvestre extends ZonasProtegidas{

    public RefugioVidaSilvestre() {
        this("","");
    }

    public RefugioVidaSilvestre(String name, String province) {
        super(name, province);
    }

    @Override
    public String toString() {
        return "RefugioVidaSilvestre{" + super.toString() +'}';
    }
    
    
}
