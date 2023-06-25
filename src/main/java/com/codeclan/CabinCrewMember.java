package com.codeclan;

public class CabinCrewMember extends CrewMember {


    public CabinCrewMember(String name, int noOfBags, int weight, Rank rank) {
        super(name, noOfBags, weight, rank);

    }


    public String relayMessage() {
        return "Fasten yer seatbelts, folks!";

    }
}







