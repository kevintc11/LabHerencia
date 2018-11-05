/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorioherencia;

/**
 * 
 * 
 *@version 4/11/2018
 * @author Kevin Trejos/Ignacio Zamora
 */
public class List{
    private ZonasProtegidas[] protectedAreas;
    private static final int INICIAL_POSITIONS = 4;
    private int ingresados = 0;
    
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
    
    
    public String reporte1(){
        double result =0;
        String print = " ";
        for (int i = 0; i < protectedAreas.length; i++) {
            if (protectedAreas[i] != null) {
                print = print +"\n"+ protectedAreas[i];
            }
        }
        
        for (int i = 0; i < protectedAreas.length; i++) {
            if (protectedAreas[i] != null) {
                result = result + protectedAreas[i].calculateAmount();
            }
        }
        return print + "\n"+"La suma total es= "+result;
    }
    
    public void reporte2(){
        
    }

    public void agregar(ZonasProtegidas agregar){
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
