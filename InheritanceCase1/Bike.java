package com.InheritanceCase1;

public class Bike extends Vehicle{
    private  int maxspeed;
    public Bike(String model, int cc, String color, int maxspeed) {
        super(model, cc, color);
        this.maxspeed=maxspeed;
    }

    //Getter
    public int getMaxspeed(){
        return maxspeed;
    }
//    //Method to display bike details
    @Override
    public void displayDetails()
    {
        super.displayDetails();
        System.out.println("Max Speed :"+ maxspeed);
    }


}
