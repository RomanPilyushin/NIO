package Аrchitecture;

public class Bicycle  extends Vehicle{
    public Bicycle(int speed, double cost, double carrying) {
        super(speed, cost, carrying);
    }

    public Bicycle(int speed, double cost, int seating, double carrying) {
        super(speed, cost, seating, carrying);
    }
}
