/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

/**
 *
 * @author Anshu
 */
public class Manager extends Employe {
 private String department ;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public static void main(String args[])
    {
        Manager manager=new Manager();
        Employe employe=new Employe();
        manager.setName("Anshu");
        manager.setAddress("Jalandhar");
        manager.setPhoneNumber(95678);
        
        System.out.println(manager.getName());
        System.out.println (manager.getAddress());
        System.out.println(manager.getPhonenumber());
            
    }
}
