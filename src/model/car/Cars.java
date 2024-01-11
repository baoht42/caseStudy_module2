package model.car;

public abstract class Cars {
    private String idCar;
    private String nameCar;
    private double cost;
    private int seatOfCar;

    public Cars(String idCar, String nameCar, double cost, int seatOfCar) {
        this.idCar = idCar;
        this.nameCar = nameCar;
        this.cost = cost;
        this.seatOfCar = seatOfCar;
    }

    public Cars() {
    }

    public String getIdCar() {
        return idCar;
    }

    public void setIdCar(String idCar) {
        this.idCar = idCar;
    }

    public String getNameCar() {
        return nameCar;
    }

    public void setNameCar(String nameCar) {
        this.nameCar = nameCar;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getSeatOfCar() {
        return seatOfCar;
    }

    public void setSeatOfCar(int seatOfCar) {
        this.seatOfCar = seatOfCar;
    }
    public abstract double getPrice();

    @Override
    public String toString() {
        return "Cars{" +
                "idCar='" + idCar + '\'' +
                ", nameCar='" + nameCar + '\'' +
                ", cost=" + cost +
                ", seatOfCar=" + seatOfCar +
                '}';
    }
}
