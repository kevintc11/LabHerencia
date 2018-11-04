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
    private ZonasProtegidas[] listZonasProtegidas;

    public List() {
    }

    public List(ZonasProtegidas[] listZonasProtegidas) {
        this.listZonasProtegidas = listZonasProtegidas;
    }

    public ZonasProtegidas[] getListZonasProtegidas() {
        return listZonasProtegidas;
    }

    public void setListZonasProtegidas(ZonasProtegidas[] listZonasProtegidas) {
        this.listZonasProtegidas = listZonasProtegidas;
    }

    @Override
    public String toString() {
        return "List{" + "listZonasProtegidas=" + listZonasProtegidas + '}';
    }
    
    public void crecimiento(){
        
    }
    
    public void reporte1(){
        
    }
    
    public void reporte2(){
        
    }
}
