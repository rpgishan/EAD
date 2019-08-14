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
public class SecurityTypeOne implements SystemSecurity {

    @Override
    public void verifySecurity() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("This is the type one security");
    }
    
    public void testing(){
        System.out.println("Only belongs to this class");
    }
    
}
