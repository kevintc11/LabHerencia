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
public abstract class ZonasProtegidas {
    private String name;
    private String province;
    private int income;

    public ZonasProtegidas() {
        this("","",0);
    }

    public ZonasProtegidas(String name, String province, int income) {
        this.name = name;
        this.province = province;
        this.income = income;
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

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    @Override
    public String toString() {
        return "ZonasProtegidas{" + "name=" + name + ", province=" + province + ", income=" + income + '}';
    }
        
    public abstract String information();
    public abstract int totalRevenues();
}
