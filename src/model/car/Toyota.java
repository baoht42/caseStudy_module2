package model.car;

public class Toyota extends Cars implements getRealPrice {
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
                "dayRent= " + dayRent +
                "idCar= " + getIdCar() +
                "nameCar= " + getNameCar()+
                "cost= " + getCost() +
                "seat= " + getSeatOfCar()+
                '}';
    }

    @Override
    public double getRealPrice() {
        if (dayRent>10){
            return getPrice()*0.05;
        }else
            return getPrice();
    }
}
