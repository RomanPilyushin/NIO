package Аrchitecture;

/*
1. Создать суперкласс Транспортное средство
        и подклассы Автомобиль,Велосипед, Повозка.
        Подсчитать время, стоимость перевозки пассажиров и грузов
        каждым транспортным средством.
        */

public class Vehicle {

    private int speed;
    private int seating;
    private double cost;
    private double costBaggage;

    public Vehicle(int speed, double cost, double carrying) {
        this.speed = speed;
        this.cost = cost;
        this.costBaggage = carrying;
        this.seating = 1;
    }

    public Vehicle(int speed, double cost, int seating, double carrying) {
        this.speed = speed;
        this.cost = cost;
        this.seating = seating;
        this.costBaggage = carrying;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getSeating() {
        return seating;
    }

    public void setSeating(int seating) {
        this.seating = seating;
    }

    public double getCostBaggage() {
        return costBaggage;
    }

    public void setCostBaggage(double costBaggage) {
        this.costBaggage = costBaggage;
    }

    public int calcTime(int dist) {
        return dist / this.speed;
    }

    public double costTrip(int pasNum) {
        return this.cost * this.seating;
    }

    public double costWeight(int bagNum) {
        return this.costBaggage * bagNum;
    }
}
