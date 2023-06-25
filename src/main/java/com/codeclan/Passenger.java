package com.codeclan;

public class Passenger {


    private String name;
    private int noOfBags;
    private int weight;


    public Passenger(String name, int noOfBags, int weight){
        this.name = name;
        this.noOfBags = noOfBags;
        this.weight = weight;
    }

    public String getName(){
        return this.name;
    }

    public int getNoOfBags(){
        return this.noOfBags;
    }

    public int getWeight(){
        return this.weight;
    }




    private boolean passengerAngry() {
        return false;
    }

    public String passengerHasTemper(){
            if (passengerAngry()){
                return "Its too cramped in here n' i'm hungry";
            }else{
                return "Looking forward to a cheeky vodders in the air like i just don't care, woo";
            }
        }

}


