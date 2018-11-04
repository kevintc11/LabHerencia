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
    private double montoFinal;

    public ZonasProtegidas() {
        this("","",0);
    }

    public ZonasProtegidas(String name, String province, double montoFinal) {
        this.name = name;
        this.province = province;
        this.montoFinal = montoFinal;
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

    public double getMontoFinal() {
        return montoFinal;
    }

    public void setMontoFinal(double montoFinal) {
        this.montoFinal = montoFinal;
    }

    @Override
    public String toString() {
        return "ZonasProtegidas{" + "name=" + name + ", province=" + province + ", montoFinal=" + montoFinal + '}';
    }
        
    public abstract String information();
    public abstract int totalRevenues();
}
