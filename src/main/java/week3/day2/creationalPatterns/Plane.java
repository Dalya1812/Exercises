package week3.day2.creationalPatterns;

public class Plane extends AbsVeichle implements Vehicle {
    @Override
    public void transport(Passenger passenger) {
        System.out.println(passenger.name + "");
    }

    @Override
    public AbsVeichle getTypeOfVehicle() {
        return this;
    }

    @Override
    public AbsVeichle creatVeichleUsingType(Enum type) {
        return this;
    }


    @Override
    public String toString() {
        return "Plane";
    }
}
