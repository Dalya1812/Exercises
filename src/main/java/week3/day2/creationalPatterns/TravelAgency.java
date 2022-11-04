package week3.day2.creationalPatterns;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class TravelAgency {

    private static TravelAgency instance;
    public static HashMap<vehicleType, Integer> vehiclesStock = new HashMap<>();

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
        vehiclesStock.put(vehicleType.BOAT, 3);
        vehiclesStock.put(vehicleType.BUS, 4);
        vehiclesStock.put(vehicleType.TEXI, 8);
        vehiclesStock.put(vehicleType.PLANE, 1);
        System.out.println(vehiclesStock);
    }

    private TravelAgency() {
        generateMapOfVeichle();

    }

    public AbsVeichle createVehicle(vehicleType type) {
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


    public void updateMap(vehicleType favorite) {
        vehiclesStock.put(favorite, vehiclesStock.get(favorite) - 1);
    }

    public void useVehicleRandomly() {
        vehicleType randomTypeVehicle = getRandomTypeVehicle();
        if (isAvailable(randomTypeVehicle)) {
            createVehicle(randomTypeVehicle);
        }

    }

    public vehicleType getRandomTypeVehicle() {
        vehicleType[] values = vehicleType.values();
        int index = ThreadLocalRandom.current().nextInt(0, values.length);
        return values[index];
    }

    public boolean isAvailable(vehicleType favorite) {
        System.out.println(vehiclesStock.get(favorite));
        if (vehiclesStock.get(favorite) > 0)
            return true;
        return false;
    }


    public AbsVeichle creatVeichleUsingType(TravelAgency.vehicleType type) {
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





