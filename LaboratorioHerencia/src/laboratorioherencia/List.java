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
public class List {
    private ZonasProtegidas[] protectedAreas;
    private static final int INICIAL_POSITIONS = 4;
    
    public List() {
        protectedAreas = new ZonasProtegidas[INICIAL_POSITIONS];
    }

    public List(ZonasProtegidas[] listZonasProtegidas) {
        this.protectedAreas = listZonasProtegidas;
    }

    public ZonasProtegidas[] getProtectedAreas() {
        return protectedAreas;
    }

    public void setProtectedAreas(ZonasProtegidas[] protectedAreas) {
        this.protectedAreas = protectedAreas;
    }

    @Override
    public String toString() {
        return "List{" + "listZonasProtegidas=" + protectedAreas + '}';
    }
    
    public void crecimiento(){
        
    }
    
    public void reporte1(){
        
    }
    
    public void reporte2(){
        
    }
}
