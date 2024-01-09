package model;

public class Mazda extends Cars{
    private int dayRent = 0;

    public Mazda(String idCar, String nameCar, double cost, int seatOfCar, int dayRent) {
        super(idCar, nameCar, cost, seatOfCar);
        this.dayRent = dayRent;
    }

    public Mazda(int dayRent) {
        this.dayRent = dayRent;
    }
    public Mazda() {

    }

    public int getDayRent() {
        return dayRent;
    }

    public void setDayRent(int dayRent) {
        this.dayRent = dayRent;
    }

    @Override
    public double getPrice() {
        if (getSeatOfCar()==4){
            return getCost()*dayRent - 100;
        }
        if (getSeatOfCar()>4 && getSeatOfCar()<7){
            return getCost()*dayRent + 100;
        }
        else
            return 0;
    }
}
