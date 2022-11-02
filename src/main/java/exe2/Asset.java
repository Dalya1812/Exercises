package exe2;

public class Asset implements ObjectsToExport {

    int serialNumber;
    String owner;
    double rating;

    @Override
    public void accept(Visitor visitor) {

    }
    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

}
