package Аrchitecture;

public class Cart extends Vehicle{

    public Cart(int speed, double cost, double carrying) {
        super(speed, cost, carrying);
    }

    public Cart(int speed, double cost, int seating, double carrying) {
        super(speed, cost, seating, carrying);
    }
}
