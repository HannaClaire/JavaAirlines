package com.codeclan;

public class CrewMember extends Passenger {


    private Rank rank;


    public CrewMember(String name, int noOfBags, int weight, Rank rank){
        super(name, noOfBags, weight);
        this.rank = rank;
    }

    public Rank getRank() {
        return this.rank;
    }
}
