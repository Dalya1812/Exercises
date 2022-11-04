package week3.day2.creationalPatterns;

public class Boat extends AbsVeichle implements Vehicle{
    @Override
    public void transport(Passenger passenger) {

    }

    @Override
    public AbsVeichle creatVeichleUsingType(Enum type) {
        return this;
    }

    @Override
    public String toString() {
        return "Boat";
    }
}
