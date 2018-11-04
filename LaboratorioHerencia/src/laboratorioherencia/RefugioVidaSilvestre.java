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
public abstract class RefugioVidaSilvestre extends ZonasProtegidas{

    public RefugioVidaSilvestre() {
        this("","");
    }

    public RefugioVidaSilvestre(String name, String province) {
        super(name, province);
    }

    @Override
    public String toString() {
        return super.toString() + "RefugioVidaSilvestre{" + '}';
    }
    
    
}
