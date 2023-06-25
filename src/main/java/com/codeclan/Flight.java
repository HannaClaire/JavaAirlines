package com.codeclan;



import java.util.ArrayList;


public class Flight {

    public int available_seats;
    private Boolean pilot;
    private ArrayList<CabinCrewMember> cabinCrewMembers;

    private ArrayList<Passenger> passengers;

    private String flightNumber;

    private String destination;

    private String departureAirport;

    private String departureTime;

    private int totalWeightAllowance;

    private static final int seatCapacity = 300;

         public Flight(Boolean pilot, ArrayList<CabinCrewMember>crewMembers, ArrayList<Passenger>passengers, String flightNumber, String destination, String departureAirport, String departureTime, int totalWeightAllowance){
            this.pilot = pilot;
            this.cabinCrewMembers = crewMembers;
            this.passengers = passengers;
            this.flightNumber = flightNumber;
            this.destination = destination;
            this.departureAirport = departureAirport;
            this.departureTime = departureTime;
            this.totalWeightAllowance = totalWeightAllowance;
         }


    public String getFlightNum() {
             return this.flightNumber;
    }

    public void setFlightNum(String newFlightNumber) {
             this.flightNumber = newFlightNumber;
    }

    public String getDestination(){
             return this.destination;
    }


    public int returnAvailableSeats() {
        return seatCapacity - passengers.size();
    }

    public int bookPassengersIfAvailableSeats() {
             if (returnAvailableSeats() > 0){
                 passengers.add(new Passenger("Claire", 3, 80));
             }
        return returnAvailableSeats();
    }


    public int getBookedPassengersCount() {
             return this.passengers.size();
    }

    public String getDepAirport() {
             return this.departureAirport;
    }

    public String getDepTime() {
             return this.departureTime;
    }

    public int getTotalWeightAllowance() {
             return this.totalWeightAllowance;
    }

//    public int getRemainingCargo(){
//             totalCargo = totalWeightAllowance - pas
//    }
}






