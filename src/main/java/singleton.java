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
public class singleton {
    public static singleton singletonobj;
    private int size;
    private String name;
    
    private singleton(){
        size =100;
        name="saman";
    }
    
    
    
    
    public static singleton singletonInstance(){
        return (singletonobj ==null)? new singleton(): singletonobj;
    }
    
    public int getIntVal(){
        return size;
    }
    
    public String getName(){
        return name;
    }
    
}

class SingletonRun{
    public static void main(String[] args) {
        System.out.println(singleton.singletonInstance().getIntVal());
        System.out.println(singleton.singletonInstance().getName());
    }
}