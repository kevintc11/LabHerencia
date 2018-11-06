/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorioherencia;

/**
 * this class represents all the protected areas and what they have in common
 * 
 *@version 4/11/2018
 * @author Kevin Trejos/Ignacio Zamora
 */
public abstract class ProtectedAreas {
    private String name;
    private String province;


    public ProtectedAreas() {
        this("","");
    }

    public ProtectedAreas(String name, String province) {
        this.name = name;
        this.province = province;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public String toString() {
        return "{" + "Name=" + name + ", Province=" + province + '}';
    }


    public abstract double calculateAmount();
       
}
