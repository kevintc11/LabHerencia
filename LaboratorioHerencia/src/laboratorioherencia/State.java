/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorioherencia;

/**
 * this class represents the state which funds the national parks, the state wildlife refuges and the biological reserves
 * 
 *@version 4/11/2018
 * @author Kevin Trejos/Ignacio Zamora
 */
public interface State {
    
   public abstract double subvention();
   public abstract double calculateAmount();
    
}
