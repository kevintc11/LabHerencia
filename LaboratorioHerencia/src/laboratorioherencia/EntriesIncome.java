/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorioherencia;

/**
 * this class represents people, whether Costa Ricans or foreigners who enter some protected areas
 * 
 *@version 04/11/2018
 * @author Kevin Trejos/Ignacio Zamora
 */
public interface EntriesIncome {
    public abstract double Costarican();
    public abstract double Foreign();
    public abstract double calculateAmount();
}
