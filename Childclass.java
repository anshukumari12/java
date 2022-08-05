/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

/**
 *
 * @author Anshu
 */
public class Childclass extends Parentclass {
    public void Childmethod()
    {
        System.out.println("This is Child class");
        
    }
    

public static void main(String args[])
{
Parentclass parent=new Parentclass();
Childclass child=new Childclass();
parent.Parentmethod();
child.Childmethod();
child.Parentmethod();

}
}
