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
        ZonasProtegidas[] newArray = new ZonasProtegidas[INICIAL_POSITIONS * 2];
        for (int i = 0; i < protectedAreas.length; i++) {
            newArray[i] = protectedAreas[i];
        }
        protectedAreas = newArray;
    }
    
    
    public void reporte1(){
        
    }
    
    public void reporte2(){
        
    }

    public void agregar(ZonasProtegidas agregar){
        int ingresados = 0;
        if (protectedAreas.length-1 != ingresados) {
            if (agregar != null) {
                protectedAreas[ingresados] = agregar;
                ingresados += 1;
            }
        }else{
            crecimiento();
            if (agregar != null) {
                protectedAreas[ingresados] = agregar;
                ingresados += 1;
            }
        }
    }

}
