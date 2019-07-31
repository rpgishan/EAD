/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ead;

/**
 *
 * @author Gishan
 */
public class FactoryExecution {
    public static void main(String[] args) {
        
        SystemSecurity security1 = FactorySecurity.createSecurity(1);
        security1.verifySecurity();
        
        SystemSecurity security2 = FactorySecurity.createSecurity(2);
        security2.verifySecurity();
    }
}
