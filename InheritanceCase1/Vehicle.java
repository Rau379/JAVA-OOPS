package com.InheritanceCase1;

public class Vehicle {
    //features of bike
    private String model;
    private  int cc;
    private String color;

    public Vehicle(String model, int cc, String color) {
        this.model = model;
        this.cc = cc;
        this.color = color;
    }
    //Getters

    public String getModel() {
        return model;
    }

    public int getCc() {
        return cc;
    }

    public String getColor() {
        return color;
    }

    public void displayDetails(){
        System.out.println("Model :"+ model);
        System.out.println("CC: "+ cc);
        System.out.println("Color: "+ color);
    }

}
