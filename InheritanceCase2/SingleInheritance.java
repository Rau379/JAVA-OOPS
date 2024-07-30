package com.InheritanceCase2;

// make a parent class
class Parents {
    Parents()
    {
        System.out.println("Parent Class default Constructor");
    }
    Parents(int salary)
    {
        System.out.println("Parent class Parameterised constructor");
    }
}

// make  a child class
// extends keyword inherit property from parent class
class Child extends Parents{
    Child(){
        //super took default constructor from Parent class
        //super();
        super(45000);
        System.out.println("Child Class Constructor");
    }
}
public class SingleInheritance {
    public static void main(String [] args){
       // Child child= new Child();
        Parents parents= new Parents();
        Parents parents1= new Parents(500);



    }
}
