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
                System.out.println(ManageCar.carList);
                break;
            case 2:
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }

}