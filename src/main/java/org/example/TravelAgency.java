package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class TravelAgency {
    enum vehicleType {BOAT, BUS, PLANE, TEXI}

    static Map<vehicleType, Integer> vehiclesStock = new HashMap<>(vehicleType.values().length);
    private static TravelAgency instance;

    public static TravelAgency getInstance() {
        if (instance == null) {
            instance = new TravelAgency();
        }
        generateMapOfVeichle();
        return instance;
    }

    private static void generateMapOfVeichle() {
        for (int i = 0; i < vehicleType.values().length; i++) {
            vehiclesStock.put(vehicleType.BOAT, 3);
            vehiclesStock.put(vehicleType.BUS, 4);
            vehiclesStock.put(vehicleType.TEXI, 8);
            vehiclesStock.put(vehicleType.PLANE, 1);
        }

    }

    private TravelAgency() {
    }

    public class vehicleFactory {
        public Vehicle createVehicle(vehicleType type) {
            switch (type) {
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


        public void assignPessengers(Passenger passenger) {
            if (isAvailable(passenger.getFavorite())) {
                createVehicle(passenger.getFavorite());
                updateMap(passenger.getFavorite());
            } else useVehicleRandomly();

        }

        private void updateMap(vehicleType favorite) {
            vehiclesStock.put(favorite, vehiclesStock.get(favorite) - 1);
        }


        private void useVehicleRandomly() {
            vehicleType randomTypeVehicle =  getRandomTypeVehicle();
           if(isAvailable(randomTypeVehicle))
           {
               createVehicle(randomTypeVehicle);


           }


        }

        private vehicleType getRandomTypeVehicle() {
            vehicleType[] values = vehicleType.values();
            int index= ThreadLocalRandom.current().nextInt(0,values.length);
            return values[index];
        }

        private boolean isAvailable(vehicleType favorite) {
            if (vehiclesStock.get(favorite) > 0)
                return true;
            return false;
        }
    }

}

