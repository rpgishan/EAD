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
public class FactorySecurity {
    public static SystemSecurity createSecurity(int type){
        if(type == 1){
            return new SecurityTypeOne();
        }else if(type ==2){
            return new SecurityTypeTwo();
        }
        return null;
    }
}
