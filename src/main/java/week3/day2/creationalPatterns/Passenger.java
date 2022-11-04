package week3.day2.creationalPatterns;

public class Passenger {
    String name;
    TravelAgency.vehicleType favorite;

    public TravelAgency.vehicleType getFavorite() {
        return favorite;
    }
    public String getName() {
        return name;
    }

    public Passenger(String name, AbsVeichle favorite) {
        this.name = name;
        this.favorite = favorite;
    }
}
