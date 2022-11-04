package week3.day2.creationalPatterns;

import com.fasterxml.jackson.core.sym.Name;

import static week3.day2.creationalPatterns.TravelAgency.vehicleType.*;

public abstract class AbsVeichle implements Vehicle{

    public AbsVeichle getTypeOfVehicle(){
        return this;
    }

    public AbsVeichle creatVeichleUsingType(TravelAgency.vehicleType type){
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

    public String toString() {
        return " "+getClass();
    }




}
