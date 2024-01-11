package view;

import controller.ManageCar;
import model.car.Cars;
import model.car.Mazda;
import model.car.Mercedes;
import model.car.Toyota;
import view.CarMethod;

import java.util.List;
import java.util.Scanner;

public class MenuCar {
    public static List<Cars> carList = ManageCar.carList;
    public static void displayMenuCar(){
        String outSystem = "`";
        while (outSystem.equals("`")) {
            Scanner sc11 = new Scanner(System.in);
            System.out.println("1. Add new car");
            System.out.println("2. Delete car");
            System.out.println("3. Update car");
            System.out.println("4. Display list of car");
            int choiceMethodCar = sc11.nextInt();
            switch (choiceMethodCar) {
                case 1:
                    Cars cars = CarMethod.addCar();
                    ManageCar.addCar(cars);
                    System.out.println(ManageCar.carList);
                    break;
                case 2:
                    String id = CarMethod.deleteByID();
                    ManageCar.deleteCar(id);
                    System.out.println(ManageCar.carList);
                    break;
            }
        }
    }


}
