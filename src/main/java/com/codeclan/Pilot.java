package com.codeclan;

public class Pilot extends CrewMember{


    private String licenceNo;


    public Pilot(String name, Rank rank, int noOfBags, int weight, String licenceNo){
      super(name, noOfBags, weight, rank);
        this.licenceNo = licenceNo;

    }


    public String getLicenceNo() {
        return this.licenceNo;
    }


    public boolean pilotDrunk(){
       return false;
    }
    public String canFlyPlane(){
        if (pilotDrunk() != true) {
            return "ooh god, we're takin' off";
        }else{
            return "oh god we're not takin' off";
        }
    }





}
