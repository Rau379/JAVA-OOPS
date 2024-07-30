package com.InheritanceCase1;

public class demoBikeDetails {
    public static void main(String [] args){
        Scooter scooter = new Scooter("Jupiter",160, "Blue", 180);
        scooter.displayDetails();
        Bike bike = new Bike("Apche", 200, "Red", 200);
        bike.displayDetails();
    }
}
