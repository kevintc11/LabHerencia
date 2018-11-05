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
public class TestZonasProtegidas {
    public static void main(String[] args) {
        ParqueNacional parque = new ParqueNacional("Carrillo", "Guanacaste",10, 15, 20);
        parque.calculateAmount();
        System.out.println(parque);
        NoCulturalMonument monumentoNoCultural = new NoCulturalMonument("No cultural", "San Pepe",15, 5);
        monumentoNoCultural.calculateAmount();
        System.out.println(monumentoNoCultural.toString());
        PatrimonioCultural patrimonio = new PatrimonioCultural("Guayabo", "No sé", 20, 12, 2010000000);
        patrimonio.calculateAmount();
        System.out.println(patrimonio);
        PropiedadEstado estado = new PropiedadEstado("jsndd", "Alajuela", 149898);
        estado.calculateAmount();
        System.out.println(estado);
        PropiedadPrivada privada = new PropiedadPrivada("privado", "Guanacaste", 105060);
        privada.calculateAmount();
        System.out.println(privada);
        
        List list1 = new List();
        list1.agregar(monumentoNoCultural);
        list1.agregar(parque);
        System.out.println(list1.reporte1());
        
        
    }
}
