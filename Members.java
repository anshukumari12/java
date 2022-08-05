package com.mycompany;


public class Members {
     private String Name,Address;
     private int age;
     private double salary,Phonenumber;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        this.Address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getPhonenumber() {
        return Phonenumber;
    }

    public void setPhoneNumber(double Phonenumber) {
        this.Phonenumber = Phonenumber;
    }
    public void printSalary()
     {
         System.out.println("salary=+salary");
         
     }
    
}
