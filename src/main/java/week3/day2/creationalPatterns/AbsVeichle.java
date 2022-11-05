package week3.day2.creationalPatterns;

import com.fasterxml.jackson.core.sym.Name;

import static week3.day2.creationalPatterns.TravelAgency.vehicleType.*;

public abstract class AbsVeichle implements Vehicle{

    public AbsVeichle getTypeOfVehicle(){
        return this;
    }


    public String toString() {
        return " "+getClass();
    }




}
