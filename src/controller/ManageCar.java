package controller;

import model.car.Cars;

import java.util.ArrayList;
import java.util.List;

public class ManageCar {

    public static List<Cars> carList = new ArrayList<>();

    public ManageCar() {
        this.carList = new ArrayList<>();
    }

    public List<Cars> getCarList() {
        return carList;
    }


    public static void addCar(Cars car) {
        carList.add(car);
    }

    public static void deleteCar(String idCar ) {
        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i).getIdCar().equals(idCar)){
                carList.remove(carList.get(i));
            }
        }
    }

    public void updateCar(Cars car) {
        int index = this.carList.indexOf(car);
        if (index != -1) {
            this.carList.set(index, car);
        }
    }
}