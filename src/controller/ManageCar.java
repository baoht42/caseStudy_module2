package controller;

import model.Car.Cars;

import java.util.ArrayList;

public class ManageCar {
    private ArrayList<Cars> carsList;
    public ManageCar(){
        this.carsList = new ArrayList<Cars>();
    }
    public ManageCar(ArrayList<Cars> carsList){
        this.carsList = carsList;
    }

    public ArrayList<Cars> getCarsList() {
        return carsList;
    }

    public void setCarsList(ArrayList<Cars> carsList) {
        this.carsList = carsList;
    }
    public void addCar(Cars car){
        this.carsList.add(car);
    }
    public void deleteCar(Cars car){
        this.carsList.remove(car);
    }
    public void updateCar(Cars car){
        this.carsList.remove(car);
        this.carsList.add(car);
    }

}
