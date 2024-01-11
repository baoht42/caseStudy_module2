package view;

import controller.ManageCar;
import model.car.Cars;
import model.car.Mazda;
import model.car.Mercedes;
import model.car.Toyota;
import view.MenuCar;

import java.util.List;
import java.util.Scanner;


public class Main {
    public static List<Cars> carList = ManageCar.carList;

    public static void main(String[] args) {

        //menu dang nhap
        String user;
        String password;
        Scanner sc = new Scanner(System.in);
        int countLogin = 0;
        while (countLogin < 3) {
            System.out.println("Enter id: ");
            user = sc.nextLine();
            System.out.println("Enter password: ");
            password = sc.nextLine();
            if (user.equals("admin") && password.equals("123456")) {
                displayMenu();
                break;
            } else {
                countLogin++;
                System.out.println("Wrong ID or Password, please try again! ");
            }
        }
        if (countLogin == 3) {
            System.out.println("Too many times login failed. Exit!");
            System.exit(0);
        }

    }
    public static void displayMenu(){
        Scanner sc9 = new Scanner(System.in);
        System.out.println("1. Manage Car");
        System.out.println("2. Manage Customer");
        System.out.println("3. Exit");
        int choiceManage = sc9.nextInt();
        switch (choiceManage){
            case 1:
                MenuCar.displayMenuCar();
                break;
            case 2:
                break;
            case 3:
                System.exit(0);
            default:
                System.out.println("Invalid choice!");
        }
    }
    private static Cars addCar() {
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
                Toyota a = new Toyota(idCar,nameCar,cost,seat,dayRent);

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
}