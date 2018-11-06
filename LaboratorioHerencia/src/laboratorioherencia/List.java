/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorioherencia;

/**
 * this class represents a list where you store the different protected areas
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
        for (int i = 0; i < protectedAreas.length; i++) {
            if (protectedAreas[i] != null) {
                if(protectedAreas[i] instanceof ParqueNacional){
                    ParqueNacional parque = (ParqueNacional)protectedAreas[i];
                    parque.Costarican();
                    parque.Foreign();
                    parque.subvention();
                        
                }else if(protectedAreas[i] instanceof ReservaBiologica){
                    ReservaBiologica reserva = (ReservaBiologica)protectedAreas[i];
                    reserva.subvention();
                }else if(protectedAreas[i] instanceof PropiedadEstado){
                    PropiedadEstado propiedad = (PropiedadEstado)protectedAreas[i];
                    propiedad.subvention();
                }else if(protectedAreas[i] instanceof PropiedadPrivada){
                    PropiedadPrivada propiedad = (PropiedadPrivada)protectedAreas[i];
                    propiedad.foreignContribution();
                }else if(protectedAreas[i] instanceof NoCulturalMonument){
                    NoCulturalMonument noCultural = (NoCulturalMonument)protectedAreas[i];
                    noCultural.Costarican();
                    noCultural.Foreign();
                }else if(protectedAreas[i] instanceof PatrimonioCultural){
                    PatrimonioCultural cultural = (PatrimonioCultural)protectedAreas[i];
                    cultural.Costarican();
                    cultural.Foreign();
                    cultural.foreignContribution();
                }
               
                            
                   /*if (person instanceof Student) {
                        Student student = (Student)person;
                        System.out.println(student.getStudentId());
                        //System.out.println(((Student)person).getStudentId());
                    }*/
             
                
            }
        }
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
