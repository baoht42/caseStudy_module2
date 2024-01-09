package model;

public class Toyota extends Cars{
    private int dayRent = 0;

    public Toyota(String idCar, String nameCar, double cost, int seatOfCar, int dayRent) {
        super(idCar, nameCar, cost, seatOfCar);
        this.dayRent = dayRent;
    }

    public Toyota(int dayRent) {
        this.dayRent = dayRent;
    }
    public Toyota() {

    }

    @Override
    public double getPrice() {
        if (getSeatOfCar()==4){
            return getCost()*dayRent;
        }
        if (getSeatOfCar()>4 && getSeatOfCar()<7){
            return getCost()*dayRent + 200;
        }
        else
            return 0;
    }

    @Override
    public String toString() {
        return "Toyota{" +
                "dayRent=" + dayRent +
                '}';
    }
}
