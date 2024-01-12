package view;

import controller.ManageCar;
import model.car.Cars;
import model.car.Mazda;
import model.car.Mercedes;
import model.car.Toyota;

import java.util.Scanner;

public class CarMethod {
    public static Cars addCar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap id cua xe: ");
        String idCar = sc.nextLine();
        System.out.println("Nhap ten cua xe: ");
        String nameCar = sc.nextLine();
        System.out.println("Nhap gia tien de thue xe: ");
        int cost = sc.nextInt();
        System.out.println("Nhap so cho cua xe: ");
        int seat = sc.nextInt();
        System.out.println("1. Xe hang Toyota");
        System.out.println("2. Xe hang Mazda");
        System.out.println("3. Xe hang Mercedes");
        int choiceCar = sc.nextInt();
        switch (choiceCar){
            case 1:
                Scanner sc1 = new Scanner(System.in);
                System.out.println("Nhap so ngay xe duoc thue: ");
                int dayRent = sc1.nextInt();
                return new Toyota(idCar, nameCar, cost, seat, dayRent);
            case 2:
                Scanner sc2 = new Scanner(System.in);
                System.out.println("Nhap so ngay xe duoc thue: ");
                int dayRent2 = sc2.nextInt();
                return new Mazda(idCar,nameCar,cost,seat,dayRent2);

            case 3:
                Scanner sc3 = new Scanner(System.in);
                System.out.println("Nhap so ngay xe duoc thue: ");
                int dayRent3 = sc3.nextInt();
                return new Mercedes(idCar, nameCar, cost,seat,dayRent3);
            default:
                return null;
        }

    }

    public static String deleteByID(){
        Scanner sc12= new Scanner(System.in);
        System.out.println("Nhap id muon xoa: ");
        String idToDelete = sc12.nextLine();
        return idToDelete;

    }
    public static String updateByID() {
        Scanner sc14 = new Scanner(System.in);
        System.out.println("Nhap id xe muon sua thong tin: ");
        String idToUpdate = sc14.nextLine();
        return idToUpdate;
    }
    public static void displayCarDetails(Cars car) {
        System.out.println("Thong tin xe:");
        System.out.println("ID: " + car.getIdCar());
        System.out.println("Ten: " + car.getNameCar());
        System.out.println("Gia thue: " + car.getCost());
        System.out.println("So cho: " + car.getSeatOfCar());
        if (car instanceof Toyota) {
            System.out.println("So ngay thue (Toyota): " + ((Toyota) car).getDayRent());
        } else if (car instanceof Mazda) {
            System.out.println("So ngay thue (Mazda): " + ((Mazda) car).getDayRent());
        } else if (car instanceof Mercedes) {
            System.out.println("So ngay thue (Mercedes): " + ((Mercedes) car).getDayRent());
        }
    }



}
