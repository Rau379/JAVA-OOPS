package com.InheritanceCase1;

public class Scooter extends Vehicle{
    private int  maxspeed;
    public Scooter (String model, int cc, String color, int maxspeed)
    {
        super(model, cc, color);
        this.maxspeed=maxspeed;
    }
 //getter
    public int getMaxspeed() {
        return maxspeed;
    }

    //Method to display scooter details
    @Override
    public  void displayDetails()
    {
        super.displayDetails();
        System.out.println("Max Speed: "+ maxspeed);
    }

}
