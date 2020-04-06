package WS.Work.models;

import WS.Work.commons.Validation;

import java.util.ArrayList;
import java.util.Scanner;

public class MainController {
    static ArrayList<Laptop> listLaptop = new ArrayList<>();

    public static void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1,2,3");
        switch (scanner.nextInt()) {
            case 1:
                addNewLaptop();
                displayMainMenu();
                break;
            case 2:

        }
    }


    public static void addNewLaptop() {
        Scanner scanner = new Scanner(System.in);


        Laptop laptop = new Laptop();


        System.out.println("Nhap id");
        laptop.setId(Validation.checkAndGetNumber("so khong hop le"));
        System.out.println("Nhap price");
        laptop.setPrice(Validation.checkAndGetNumber("so khong hop le"));
        scanner.nextLine();
        System.out.println("nhap url");
        laptop.setUrl(scanner.nextLine());
        System.out.println("nhap ram");
        laptop.setRam(Validation.checkAndGetNumber("so khong hop le"));
        int index = 0;
        listLaptop.add(index, laptop);
        index++;


    }

}
