package model.Car;

public class Mercedes extends Cars implements getPrice{
    private int dayRent = 0;

    public Mercedes(String idCar, String nameCar, double cost, int seatOfCar, int rentDay) {
        super(idCar, nameCar, cost, seatOfCar);
        this.dayRent = rentDay;
    }

    public Mercedes(int rentDay) {
        this.dayRent = rentDay;
    }
    public Mercedes() {

    }

    @Override
    public double getPrice() {
        if (getSeatOfCar()==4){
            return getCost()*dayRent + 400;
        }
        if (getSeatOfCar()>4 && getSeatOfCar()<7){
            return getCost()*dayRent + 700;
        }
        else
            return 0;
    }

    @Override
    public String toString() {
        return "Mercedes{" +
                "dayRent=" + dayRent +
                '}';
    }
}
