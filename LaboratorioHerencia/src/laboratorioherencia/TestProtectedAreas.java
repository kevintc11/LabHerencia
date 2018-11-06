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
        NationalPark parque = new NationalPark("Carrillo", "Guanacaste",10, 15, 20);
        parque.calculateAmount();
        System.out.println(parque);
        NoCulturalMonument monumentoNoCultural = new NoCulturalMonument("No cultural", "San Pepe",15, 5);
        monumentoNoCultural.calculateAmount();
        System.out.println(monumentoNoCultural.toString());
        CulturalHeritage patrimonio = new CulturalHeritage("Guayabo", "No sé", 20, 12, 2010000000);
        patrimonio.calculateAmount();
        System.out.println(patrimonio);
        StateProperty estado = new StateProperty("jsndd", "Alajuela", 149898);
        estado.calculateAmount();
        System.out.println(estado);
        PrivateProperty privada = new PrivateProperty("privado", "Guanacaste", 105060);
        privada.calculateAmount();
        System.out.println(privada);
        
        List list1 = new List();
        list1.add(monumentoNoCultural);
        list1.add(parque);

        
    }
}
