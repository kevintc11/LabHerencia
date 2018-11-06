/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorioherencia;

/**
 * This is the test class
 * 
 *@version 4/11/2018
 * @author Kevin Trejos/Ignacio Zamora
 */
public class TestProtectedAreas {
    public static void main(String[] args) {
        NationalPark park = new NationalPark("Carrillo", "Guanacaste",10, 15, 20);
        
        NoCulturalMonument monumentNoCultural = new NoCulturalMonument("A los presentes", "San Jose",15, 5);
        
        CulturalHeritage monumentCultural = new CulturalHeritage("Guayabo", "Cartago", 20, 12, 2010000000);
        
        StateProperty stateRefuge = new StateProperty("Caño negro", "Alajuela", 149898);
        
        PrivateProperty privateRefuge = new PrivateProperty("Ostional", "Guanacaste", 105060);
       
        BiologicalReserve reserve = new BiologicalReserve("Alberto Manuel Brenes", "Alajuela", 50000);
       
        
        
        List list1 = new List();
        list1.add(park);
        list1.add(monumentNoCultural);
        list1.add(monumentCultural);
        list1.add(stateRefuge);
        list1.add(privateRefuge);
        list1.add(reserve);
        System.out.println(list1.report1());
        System.out.println(list1.report2());
        
    }
}
