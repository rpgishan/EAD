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
public class EAD {

    private int Salary = 20000;

    public void setSalary(int sal) {

        if ((sal > 30000)) {
            System.out.println("The salary not accepted");
        } else {

            this.Salary = sal;

        }
    }

    public int getSalary() {

        return Salary;

    }

   public static void main (String arg[]){
       EAD emp =new EAD();
       System.out.println("The salary is"+emp.getSalary());
       emp.setSalary(40000);
       
   }
}
