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
    private ProtectedAreas[] protectedAreas;
    private static final int INICIAL_POSITIONS = 4;
    private int admitted = 0;
    
    public List() {
        protectedAreas = new ProtectedAreas[INICIAL_POSITIONS];
    }

    public List(ProtectedAreas[] listZonasProtegidas) {
        this.protectedAreas = listZonasProtegidas;
    }

    public ProtectedAreas[] getProtectedAreas() {
        return protectedAreas;
    }

    public void setProtectedAreas(ProtectedAreas[] protectedAreas) {
        this.protectedAreas = protectedAreas;
    }

    @Override
    public String toString() {
        return "List{" + "listZonasProtegidas=" + protectedAreas + '}';
    }
    /**
     * this method increases the size of the vector
     */
    private void growthVector(){
        ProtectedAreas[] newArray = new ProtectedAreas[INICIAL_POSITIONS * 2];
        for (int i = 0; i < protectedAreas.length; i++) {
            newArray[i] = protectedAreas[i];
        }
        protectedAreas = newArray;
    }
    /**
     * This method generates a report of the different protected areas
     * @return a string with the information
     */
    public String report1(){
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
    /**
     * generates a report with the grant, the tickets and the non-governmental aid
     * @return a string with the information
     */
    public String report2(){
        double subventionTotal = 0.0;
        double entrieTotal = 0.0;
        double noGubernamentalTotal = 0.0;
        for (int i = 0; i < protectedAreas.length; i++) {
            if (protectedAreas[i] != null) {
                if(protectedAreas[i] instanceof NationalPark){
                    NationalPark parque = (NationalPark)protectedAreas[i];
                    entrieTotal += parque.Costarican() +parque.Foreign();
                    subventionTotal += parque.subvention();
                }else if(protectedAreas[i] instanceof BiologicalReserve){
                    BiologicalReserve reserva = (BiologicalReserve)protectedAreas[i];
                    subventionTotal += reserva.subvention();
                }else if(protectedAreas[i] instanceof StateProperty){
                    StateProperty propiedad = (StateProperty)protectedAreas[i];
                    subventionTotal+= propiedad.subvention();
                }else if(protectedAreas[i] instanceof PrivateProperty){
                    PrivateProperty propiedad = (PrivateProperty)protectedAreas[i];
                    noGubernamentalTotal += propiedad.foreignContribution();
                }else if(protectedAreas[i] instanceof NoCulturalMonument){
                    NoCulturalMonument noCultural = (NoCulturalMonument)protectedAreas[i];
                    entrieTotal += noCultural.Costarican() + noCultural.Foreign();
                }else if(protectedAreas[i] instanceof CulturalHeritage){
                    CulturalHeritage cultural = (CulturalHeritage)protectedAreas[i];
                    entrieTotal += cultural.Foreign() + cultural.Costarican();
                    noGubernamentalTotal += cultural.foreignContribution();
                }   
            }
        }
        return "Total subvention = " + subventionTotal + ", Entrie total = "+ entrieTotal + ", Non-governmental aid = " + noGubernamentalTotal;
    }
    /**
     * Enter the protected areas to the vector
     * @param agregar the protected area to add
     */
    public void add(ProtectedAreas agregar){
        if (protectedAreas.length-1 != admitted) {
            if (agregar != null) {
                protectedAreas[admitted] = agregar;
                admitted += 1;
            }
        }else{
            growthVector();
            if (agregar != null) {
                protectedAreas[admitted] = agregar;
                admitted += 1;
            }
        }
    }

}
