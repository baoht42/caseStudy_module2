package controller;

import model.car.Cars;
import view.CarMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

    public static void updateCar(String idCar) {
        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i).getIdCar().equals(idCar)) {
                // Hiển thị thông tin hiện tại của xe
                System.out.println("Thong tin hien tai cua xe:");
                CarMethod.displayCarDetails(carList.get(i));

                // Nhập thông tin mới cho xe
                Cars updatedCar = CarMethod.addCar();

                // Cập nhật thông tin cho xe trong danh sách
                carList.set(i, updatedCar);

                System.out.println("Cap nhat thong tin xe thanh cong.");
            }
        }
    }
}