package org.example;

import java.util.HashMap;
import java.util.Map;
public class TravelAgency {
    enum vehicleType{BOAT,BUS,PLANE,TEXI}
    static Map<vehicleType, Integer> VehiclesStock = new HashMap<>(vehicleType.values().length);
    private static TravelAgency instance;
    public static TravelAgency getInstance(){
        if(instance==null){
            instance = new TravelAgency();
        }
        generateMapOfVeichle();
        return instance;
    }

    private static void generateMapOfVeichle() {
        for (int i = 0; i < vehicleType.values().length; i++) {
            countOfVehicle.put(vehicleType.BOAT,3);
            countOfVehicle.put(vehicleType.BUS,4);
            countOfVehicle.put(vehicleType.TEXI,8);
            countOfVehicle.put(vehicleType.PLANE,1);
        }

    }

    private TravelAgency(){
    }

    public class vehicleFactory {
        public Vehicle createVehicle(vehicleType type){
            switch (type){
                case BOAT:
                    return new Boat();
                case BUS:
                    return new Bus();
                case PLANE:
                    return new Plane();
                case TEXI:
                    return new Taxi();
                default:
                    throw new IllegalArgumentException(String.format("Vehicle type not supported: %s", type));
            }
        }
    }


   public void assignPessengers(Passenger passenger){
       if(isAvailable(passenger.getFavorite()))
       {
           useVeicle(vehicleType);
       }
       else useVehicleRandomly();
   }
    private void useVehicleRandomly() {

    }
    private void useVeicle() {

    }
    private boolean isAvailable(vehicleType favorite){
        if (VehiclesStock.get(favorite) > 0)
            return true;
        return false;
        }
    }


}
