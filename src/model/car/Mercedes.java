package model.car;

public class Mercedes extends Cars implements getRealPrice {
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

    public int getDayRent() {
        return dayRent;
    }

    public void setDayRent(int dayRent) {
        this.dayRent = dayRent;
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
                " dayRent=" + dayRent +
                " idCar= " + getIdCar() +
                " nameCar= " + getNameCar()+
                " cost= " + getCost() + "$"+
                " seat= " + getSeatOfCar()+
                '}'+"\n";
    }

    @Override
    public double getRealPrice() {
        if(dayRent>10){
            return getPrice()*0.02;
        }else {
            return getPrice();
        }
    }
}
