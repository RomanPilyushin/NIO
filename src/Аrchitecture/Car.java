package Аrchitecture;

public class Car extends Vehicle{

    public Car(int speed, double cost, double carrying) {
        super(speed, cost, carrying);
    }

    public Car(int speed, double cost, int seating, double carrying) {
        super(speed, cost, seating, carrying);
    }
}
