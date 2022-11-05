package week3.day4.structuralPatterns.exx2.Farm;

public class CountingCow extends Cow{
    private int counter;

    @Override
    public void move() {
        super.move();
        counter++;
    }
}
