package CaseStudy.Controller;

import CaseStudy.Commons.FuncFileCSVHouse;
import CaseStudy.Commons.FuncFileCSVRoom;
import CaseStudy.Commons.FuncFileCSVVilla;
import CaseStudy.Models.House;
import CaseStudy.Models.Room;
import CaseStudy.Models.Service;
import CaseStudy.Models.Villa;

import java.util.ArrayList;
import java.util.Scanner;

public class MainController {

    protected static ArrayList<Villa> listVilla = new ArrayList<Villa>();
    protected static ArrayList<Room> listRoom = new ArrayList<Room>();
    protected static ArrayList<House> listHouse = new ArrayList<House>();

    private static Scanner scanner;

    public static void displayMainMenu() {
        scanner = new Scanner(System.in);
        System.out.println("\n1. Add new service. " +
                "\n2. Show service. " +
                "\n3. Add New Customer. " +
                "\n4. Show Information of Customer. " +
                "\n5. Add New Booking. " +
                "\n6. Show Information of Employee. " +
                "\n7. Exit . "
        );
        switch (scanner.nextLine()) {
            case "1":
                addNewService();
                break;
            case "2":
                showService();
                break;
            case "3":
                break;
            case "4":
                break;
            case "5":
                break;
            case "6":
                break;
            case "7":
                System.exit(0);
            default:
                System.out.println("\nError.Press Enter To Back to menu");
                scanner.nextLine();
                backToMenu();

        }

    }

    private static void addNewService() {
        System.out.println("\n-------------------");
        System.out.println("\n1. Add new villa. " +
                "\n2. Add new house. " +
                "\n3. Add new room . " +
                "\n4. Back to menu . " +
                "\n5. Exit . "
        );
        switch (scanner.nextLine()) {
            case "1":
                addNewVilla();
                break;
            case "2":
                addNewHouse();
                break;
            case "3":
                addNewRoom();
                break;
            case "4":
                displayMainMenu();
                System.out.println("\n-------------------");
                break;
            case "5":
                System.exit(0);
            default:
                System.out.println("\nError.Enter To Back to menu");
                scanner.nextLine();
                backToMenu();
        }
    }

    private static void addNewRoom() {
        String content = "";
        String errMes = "";

        listRoom = FuncFileCSVRoom.getFileCSVToListRoom();
        Room room = new Room();

        System.out.println("Enter id : ");
        room.setId(scanner.nextLine());
        System.out.println("Enter name service : ");
        room.setNameService(scanner.nextLine());
        System.out.println("Enter Area Used : ");
        room.setAreaUsed(scanner.nextInt());
        System.out.println("Enter Rental Cost : ");
        room.setRentalCosts(scanner.nextInt());
        System.out.println("Enter Max Number Of People : ");
        room.setMaxNumberOfPeople(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Enter Type Rent : ");
        room.setTypeRent(scanner.nextLine());
        System.out.println("Enter Free Service : ");
        room.setFreeService(scanner.nextLine());
        listRoom.add(room);
        FuncFileCSVRoom.writeRoomToFileCSV(listRoom);

        System.out.println("----------------------");
        System.out.println("Add new Villa complete. Enter to continue. ");
        scanner.nextLine();
        displayMainMenu();

    }

    private static void addNewHouse() {

        String content = "";
        String errMes = "";

        listHouse = FuncFileCSVHouse.getFileCSVToListHouse();
        House house = new House();
        System.out.println("Enter id : ");
        house.setId(scanner.nextLine());
        System.out.println("Enter name service : ");
        house.setNameService(scanner.nextLine());
        System.out.println("Enter Area Used : ");
        house.setAreaUsed(scanner.nextInt());
        System.out.println("Enter Rental Cost : ");
        house.setRentalCosts(scanner.nextInt());
        System.out.println("Enter Max Number Of People : ");
        house.setMaxNumberOfPeople(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Enter Type Rent : ");
        house.setTypeRent(scanner.nextLine());
        System.out.println("Enter Room Standard : ");
        house.setRoomStandard(scanner.nextLine());
        System.out.println("Enter Convenient Description : ");
        house.setConvenientDescription(scanner.nextLine());
        System.out.println("Enter Number Of Floor : ");
        house.setNumberOfFloor(scanner.nextInt());
        listHouse.add(house);
        FuncFileCSVHouse.writeHouseToFileCSV(listHouse);

        System.out.println("----------------------");
        System.out.println("Add new House complete. Enter to continue. ");
        scanner.nextLine();
        displayMainMenu();
    }

    private static void addNewVilla() {
        // id,nameService,areaUsed,rentalCosts,maxNumberOfPeople,typeRent,roomStandard,
        // convenientDescription,areaPool,numberOfFloor

        String content = "";
        String errMes = "";
        listVilla = FuncFileCSVVilla.getFileCSVToListVilla();
        Villa villa = new Villa();

        System.out.println("Enter id : ");
        villa.setId(scanner.nextLine());
        System.out.println("Enter name service : ");
        villa.setNameService(scanner.nextLine());
        System.out.println("Enter Area Used : ");
        villa.setAreaUsed(scanner.nextInt());
        System.out.println("Enter Rental Cost : ");
        villa.setRentalCosts(scanner.nextInt());
        System.out.println("Enter Max Number Of People : ");
        villa.setMaxNumberOfPeople(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Enter Type Rent : ");
        villa.setTypeRent(scanner.nextLine());
        System.out.println("Enter Room Standard : ");
        villa.setRoomStandard(scanner.nextLine());
        System.out.println("Enter Convenient Description : ");
        villa.setConvenientDescription(scanner.nextLine());
        System.out.println("Enter Area Pool : ");
        villa.setAreaPool(scanner.nextInt());
        System.out.println("Enter Number Of Floor : ");
        villa.setNumberOfFloor(scanner.nextInt());
        listVilla.add(villa);
        FuncFileCSVVilla.writeVillaToFileCSV(listVilla);


        System.out.println("----------------------");
        System.out.println("Add new Villa complete. Enter to continue. ");
        scanner.nextLine();
        displayMainMenu();
    }


    private static void showService() {

        scanner = new Scanner(System.in);
        System.out.println("\n1. Show All Villa. " +
                "\n2. Show All Room. " +
                "\n3. Show All House. " +
                "\n4. Show All Name Villa Not Duplicate. " +
                "\n5. Show All Name House Not Duplicate. " +
                "\n6. Show All Name Name Not Duplicate. " +
                "\n7. Back to menu. " +
                "\n8. Exit . "
        );
        switch (scanner.nextLine()) {
            case "1":
                listVilla = FuncFileCSVVilla.getFileCSVToListVilla();

//                listVilla.get(0).showInfo();

                for (Villa villas : listVilla) {
                    System.out.println("\n-------------------");
                    System.out.println(villas.showInfo());
//                    System.out.println("\n-------------------");
//                    System.out.println("Id : " + villas.getId() +
//                            "\nName Service : " + villas.getNameService()
//                    );
                }
                System.out.println("\n-------------------");
                System.out.println("Enter to back to menu...");
                scanner.nextLine();
                displayMainMenu();
                break;
            case "2":
                listRoom = FuncFileCSVRoom.getFileCSVToListRoom();
                for (Room room : listRoom) {
                    System.out.println("\n-------------------");
                    System.out.println(room.showInfo());
                }
                System.out.println("\n-------------------");
                System.out.println("Enter to back to menu...");
                scanner.nextLine();
                displayMainMenu();
                break;
            case "3":
                listHouse = FuncFileCSVHouse.getFileCSVToListHouse();
                for (House house : listHouse) {
                    System.out.println("\n-------------------");
                    System.out.println(house.showInfo());
                }
                System.out.println("\n-------------------");
                System.out.println("Enter to back to menu...");
                scanner.nextLine();
                displayMainMenu();
                break;
            case "4":
                break;
            case "5":
                break;
            case "6":
                break;
            case "7":
                displayMainMenu();
                break;
            case "8":
                System.exit(0);
            default:
                System.out.println("\nError.Press Enter To Back to menu");
                scanner.nextLine();
                backToMenu();

        }
    }


    private static void backToMenu() {
        System.out.println("\n-------------------");
        displayMainMenu();
    }

    private static Service addNewService(Service service) {
        String content = "";
        String errMes = "";

        System.out.println("Enter id : ");
        service.setId(scanner.nextLine());
        System.out.println("Enter name service : ");
        service.setNameService(scanner.nextLine());
        System.out.println("Enter Area Used : ");
        service.setAreaUsed(scanner.nextInt());
        System.out.println("Enter Rental Cost : ");
        service.setRentalCosts(scanner.nextInt());
        System.out.println("Enter Max Number Of People : ");
        service.setMaxNumberOfPeople(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Enter Type Rent : ");
        service.setTypeRent(scanner.nextLine());
        return service;

    }


}
