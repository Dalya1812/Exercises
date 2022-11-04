package week3.day2.creationalPatterns;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Bus bus = new Bus();
        Boat boat = new Boat();
        ArrayList<Passenger> passengers = new ArrayList<>(2);
        Passenger passenger1 = new Passenger("dalia", boat);
        Passenger passenger2 = new Passenger("dali", bus);
        passengers.add(passenger1);
        passengers.add(passenger2);


        System.out.println(boat.getTypeOfVehicle());
        TravelAgency.getInstance().assignPessengers(passenger1);


    }

}