package week3.day2.creationalPatterns;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

import static week3.day2.creationalPatterns.TravelAgency.vehicleType.*;

public class TravelAgency {

    private static TravelAgency instance;
    public static HashMap<Object, Integer> vehiclesStock = new HashMap<Object, Integer>();

    enum vehicleType {BOAT, BUS, PLANE, TEXI;

        public vehicleType getTypeOfVehicle() {

            return null;
        }
    }

    public static TravelAgency getInstance() {
        if (instance == null) {
            instance = new TravelAgency();
        }
        return instance;
    }
    private static void generateMapOfVeichle() {
        vehiclesStock.put(BOAT, 3);
        vehiclesStock.put(BUS, 4);
        vehiclesStock.put(vehicleType.TEXI, 8);
        vehiclesStock.put(PLANE, 1);
        System.out.println(vehiclesStock);
    }

    private TravelAgency() {
        generateMapOfVeichle();

    }

    public AbsVeichle createVehicle(AbsVeichle type) {
        switch (type) {
            case Boat ignored:
                return new Boat();
            case Bus ignored:
                return new Bus();
            case Plane ignored:
                return new Plane();
            case Taxi ignored:
                return new Taxi();
            default:
                throw new IllegalArgumentException(String.format("Vehicle type not supported: %s", type));

        }
    }


    public void updateMap(AbsVeichle favorite) {
        vehiclesStock.put(favorite, vehiclesStock.get(favorite) - 1);
    }

    public void useVehicleRandomly() {
        AbsVeichle randomTypeVehicle = getRandomTypeVehicle();
        if (isAvailable(randomTypeVehicle)) {
            createVehicle(randomTypeVehicle);
        }

    }

    public AbsVeichle getRandomTypeVehicle() {
        int index = ThreadLocalRandom.current().nextInt(0, 3);
        switch (index) {
            case 0:
                return new Boat();
            case 1:
                return new Bus();
            case 2:
                return new Plane();
            case 3:
                return new Taxi();
            default:
                throw new IllegalArgumentException(String.format("Vehicle type not supported:"));

        }
    }

    public boolean isAvailable(AbsVeichle favorite) {
        System.out.println(vehiclesStock.get(favorite));
        if (vehiclesStock.get(favorite) > 0)
            return true;
        return false;
    }




    public void assignPessengers(Passenger passenger) {
        if (isAvailable(passenger.getFavorite())) {
            createVehicle( passenger.getFavorite());
            updateMap(passenger.getFavorite());
        } else useVehicleRandomly();

    }


    public String getValueByKey(AbsVeichle key) {
        for (Map.Entry<?, ?> entry : vehiclesStock.entrySet()) {
            if (entry.getKey().equals(key))
                return (String) entry.getValue();
        }
        return null;
    }
}





