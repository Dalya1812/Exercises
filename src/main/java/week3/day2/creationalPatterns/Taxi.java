package week3.day2.creationalPatterns;

public class Taxi extends AbsVeichle implements Vehicle{
    @Override
    public void transport(Passenger passenger) {

    }

    @Override
    public AbsVeichle getTypeOfVehicle() {
        return this;
    }

    @Override
    public String toString() {
        return "Taxi";
    }

    @Override
    public AbsVeichle creatVeichleUsingType(Enum type) {
        return this;
    }
}
