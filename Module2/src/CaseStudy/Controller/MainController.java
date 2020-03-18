package CaseStudy.Controller;

import CaseStudy.Commons.*;
import CaseStudy.Models.*;

import java.util.*;

public class MainController {

    protected static List<Villa> listVilla = new ArrayList<Villa>();
    protected static List<Room> listRoom = new ArrayList<Room>();
    protected static List<House> listHouse = new ArrayList<House>();
    protected static List<Customer> listCustomer = new ArrayList<Customer>();
    protected static List<Employee> listEmployee = new ArrayList<Employee>();
    protected static final int CASE_INSENSITIVE = 0x02;


    protected static String regexConvenientDescription = "^massage|karaoke|food|drink|car$";
    protected static String regexNameException = "^([A-Z][a-z]+)( [A-Z][a-z]+)*$";
    protected static String regexEmailException = "^\\w+@\\w+.\\w+$";
    protected static String regexGenderException = "^(male)|(female)|(unknown)$";
    protected static String regexIDException = "^[0-9]{9}$";
    protected static String regexPhoneNumberException = "^[0-9]{10}$";
    protected static String regexBirthDayException = "^([0-2][0-9]|(3)[0-1])(\\/)((0)[0-9]|((1)[0-2]))(\\/)[1]{1}[9]{1}[3-9]{1}[0-9]{1}|[2]{1}[0]{1}[0-1]{1}[0-9]{1}$";


    private static Scanner scanner;

    public static void displayMainMenu() {
        scanner = new Scanner(System.in);
        System.out.println("\n1. Add new service. " +
                "\n2. Show service. " +
                "\n3. Add New Customer. " +
                "\n4. Show Information of Customer. " +
                "\n5. Add New Booking. " +
                "\n6. Add New Employee. " +
                "\n7. Show Information of Employee. " +
                "\n8. Cinema 4D. " +
                "\n9. File Cabinet Employee. " +
                "\n10. Exit . "
        );
        switch (scanner.nextLine()) {
            case "1":
                addNewService();
                break;
            case "2":
                showService();
                break;
            case "3":
                addNewCustomer();
                break;
            case "4":
                System.out.println(showInformationCustomer());
                System.out.println("Enter to continue...");
                scanner.nextLine();
                displayMainMenu();
                break;
            case "5":
                addNewBooking();
                break;
            case "6":
                addNewEmployee();
                break;
            case "7":
                showInfomationEmployee();
                break;
            case "8":
                cinema4D();
                break;
            case "9":
                fileCabinetEmployee();
                break;
            case "10":
                System.exit(0);
            default:
                System.out.println("\nError.Press Enter To Back to menu");
                scanner.nextLine();
                backToMenu();

        }

    }

    private static void fileCabinetEmployee() {
        Stack<Employee> stackEmployee = new Stack<Employee>();
        ArrayList<Employee> listEmployee;

        listEmployee = FuncFileCSVEmployee.getFileCSVToListEmployee();
        for (Employee employee : listEmployee) {
            stackEmployee.push(employee);
        }
        System.out.println("Tim kiem theo :" +
                "\n1. Name" +
                "\n2. Id");
        String choose;
        choose = scanner.nextLine();
        switch (choose) {
            case "1":
                System.out.println("Nhap ten nhan vien can tim");
                String inputName;
                inputName = scanner.nextLine();
                boolean checkName = false;
                for (int i = 0; i < stackEmployee.size(); i++) {
                    if (inputName.equals(stackEmployee.get(i).getNameEmployee())) {
                        System.out.println("Tim thay : ");
                        System.out.println(stackEmployee.get(i).toString());
                        checkName = true;
                    }
                }
                if (!checkName) {
                    System.out.println("Khong tim thay");
                }
                System.out.println("Enter to continue");
                scanner.nextLine();

                break;
            case "2":
                boolean checkID = false;

                System.out.println("Nhap ID nhan vien can tim");
                String inputID;
                inputID = scanner.nextLine();
                for (int i = 0; i < stackEmployee.size(); i++) {
                    if (inputID.equals(stackEmployee.get(i).getIdEmployee())) {
                        System.out.println("Tim thay : ");
                        System.out.println(stackEmployee.get(i).toString());
                        checkID = true;
                    }
                }
                if (!checkID) {
                    System.out.println("Khong tim thay");
                }
                System.out.println("Enter to continue");
                scanner.nextLine();

                break;
            default:
                System.out.println("Nhap khong hop le,enter to back to menu...");
                scanner.nextLine();
        }
        displayMainMenu();

    }

    private static void cinema4D() {
        ArrayList<Customer> listCustomer = FuncFileCSVCustomer.getFileCSVToListCustomer();
        int i = 1;
        for (Customer cus : listCustomer) {
            System.out.println("No: " + i);
            System.out.println(cus.showInfo());
            System.out.println("\n----------------------------------");
            i++;
        }

        Queue<Customer> queue = new LinkedList<>();
        int choose;
        int soLuongVe = 5;
        try {
            do {
                System.out.println("Con " + soLuongVe + " ve.");
                System.out.println("Choose Customer Booking, 0 to stop");
                choose = scanner.nextInt();
                if (choose == 0) {
                    break;
                }

                soLuongVe--;
                queue.add(listCustomer.get(choose - 1));

                if (soLuongVe == 0) {
                    System.out.println("Het ve!!!!");
                    break;
                }
            } while (true);
        } catch (Exception e) {
            System.out.println("Nhap khong hop le,Enter to back to menu...");
            scanner.nextLine();
            scanner.nextLine();
            displayMainMenu();
        }

        System.out.println("-------------------------------------");
        System.out.println("Enter to Show information of Customer bought ticket");
        scanner.nextLine();
        scanner.nextLine();
        for (Customer item : queue) {
            System.out.println(item.showInfo());
        }
        System.out.println("Enter to back to menu...");
        scanner.nextLine();
        displayMainMenu();

    }

    private static void addNewEmployee() {
        String content = "";
        String errMes = "";

        listEmployee = FuncFileCSVEmployee.getFileCSVToListEmployee();
        Employee employee = new Employee();
        content = "Enter ID Employee";
        errMes = "Nhap so";
        String regexIDEmployee = "^[0-9]+$";
        employee.setIdEmployee(FuncValidation.checkValidate(content, errMes, regexIDEmployee, 0));

        content = "Enter Name Employee";
        errMes = "Nhap Chu Dau Ghi Hoa";
        String regexNameEmployee = "^.+$";
        employee.setNameEmployee(FuncValidation.checkValidate(content, errMes, regexNameEmployee, 0));

        content = "Enter Age Employee";
        errMes = "Nhap so";
        String regexAgeEmployee = "^[0-9]+$";
        employee.setAgeEmployee(Integer.parseInt(FuncValidation.checkValidate(content, errMes, regexAgeEmployee)));

        content = "Enter Address Employee";
        errMes = "Nhap sai";
        String regexAddressEmployee = "^.+$";
        employee.setAddressEmployee(FuncValidation.checkValidate(content, errMes, regexAddressEmployee));
        listEmployee.add(employee);

        FuncFileCSVEmployee.writeEmployeeToFileCSV((ArrayList<Employee>) listEmployee);
        System.out.println("----------------------");
        System.out.println("Add new Employee complete. Enter to continue. ");
        scanner.nextLine();
        displayMainMenu();
    }

    private static void showInfomationEmployee() {
        Map mapEmployee = new HashMap();
        ArrayList<Employee> listEmployee = FuncFileCSVEmployee.getFileCSVToListEmployee();
        for (Employee employee : listEmployee) {
            mapEmployee.put(employee.getIdEmployee(), employee.getNameEmployee());
        }
        Set set = mapEmployee.keySet();
        for (Object key : set) {
            System.out.println(key + " " + mapEmployee.get(key));
        }
        System.out.println("Enter to back to menu...");
        scanner.nextLine();
        displayMainMenu();
    }

    private static void addNewBooking() {

        //chu y cho listCustomer
        ArrayList<Customer> listCustomer = FuncFileCSVCustomer.getFileCSVToListCustomer();
        listCustomer.sort(new CustomerSort());
        int i = 1;
        for (Customer customer : listCustomer) {
            System.out.println("-------------------------");
            System.out.println("Customer " + i + " : ");
            System.out.println(customer.showInfo());
            System.out.println("-------------------------");
            i++;
        }
        System.out.println("Choose Customer Booking");
        Customer customer = listCustomer.get(scanner.nextInt() - 1);
        scanner.nextLine();
        System.out.println("\n1. Booking Villa." +
                "\n2. Booking House." +
                "\n3. Booking Room.");
        System.out.println("Choose Service Booking");
        String choose = scanner.nextLine();
        switch (choose) {
            case "1":
                i = 1;
                ArrayList<Villa> listVilla = FuncFileCSVVilla.getFileCSVToListVilla();
                for (Villa villa : listVilla) {
                    System.out.println("-------------------------");
                    System.out.println("No : " + i);
                    System.out.println(villa.showInfo());
                    System.out.println("-------------------------");
                    i++;
                }
                System.out.println("Choose Villa Booking");
                int chooseVillaBooking;
                chooseVillaBooking = scanner.nextInt();
                Villa villa = listVilla.get(chooseVillaBooking - 1);
                customer.setService(villa);
                break;
            case "2":
                i = 1;
                ArrayList<House> listHouse = FuncFileCSVHouse.getFileCSVToListHouse();
                for (House house : listHouse) {
                    System.out.println("-------------------------");
                    System.out.println("No : " + i);
                    System.out.println(house.showInfo());
                    System.out.println("-------------------------");
                    i++;
                }
                System.out.println("Choose House Booking");
                int chooseHouseBooking;
                chooseHouseBooking = scanner.nextInt();
                House house = listHouse.get(chooseHouseBooking - 1);
                customer.setService(house);
                break;
            case "3":
                i = 1;
                ArrayList<Room> listRoom = FuncFileCSVRoom.getFileCSVToListRoom();
                for (Room room : listRoom) {
                    System.out.println("-------------------------");
                    System.out.println("No : " + i);
                    System.out.println(room.showInfo());
                    System.out.println("-------------------------");
                    i++;
                }
                System.out.println("Choose Room Booking");
                int chooseRoomBooking;
                chooseRoomBooking = scanner.nextInt();
                Room room = listRoom.get(chooseRoomBooking - 1);
                customer.setService(room);
                break;
            default:
                System.out.println("Nhap sai, quay ve menu.");
                backToMenu();
                break;

        }
        //bi ghi de do get ra khong duoc
        ArrayList<Customer> listCustomerBooking = FuncFileCSVBooking.getFileCSVToListBooking();
        //???????????????????? get tu file ra khong duoc
        listCustomerBooking.add(customer);
        FuncFileCSVBooking.writeBookingToFileCSV(listCustomerBooking);
        displayMainMenu();
    }

    private static String showInformationCustomer() {

        Customer customer = new Customer();
        ArrayList<Customer> customers = FuncFileCSVCustomer.getFileCSVToListCustomer();
        String customerInfo = "";

        Collections.sort(customers, new CustomerSort());

        for (Customer item : customers) {

            customerInfo += item.showInfo() + "\n";
        }
        return customerInfo;
    }

    private static void addNewCustomer() {
        String content = "";
        String errMess = "";
        listCustomer = FuncFileCSVCustomer.getFileCSVToListCustomer();
        Customer customer = new Customer();

        content = "Enter Name Customer";
        errMess = "Cac ki tu dau tien ghi hoa";
        customer.setNameCustomer(FuncValidation.checkValidate(content, errMess, regexNameException));

        content = "Enter Birthday Customer";
        errMess = "dd/MM/YY,>1900,<18 tuoi";
        customer.setBirthdayCustomer(FuncValidation.checkValidate(content, errMess, regexBirthDayException));

//        System.out.println(Pattern.compile("^(male)|(female)|(unknow)$",Pattern.CASE_INSENSITIVE).matcher("Male").find());
//        System.out.println(Pattern.compile("^(male)|(female)|(unknow)$",Pattern.CASE_INSENSITIVE).matcher("Male").find());
        content = "Enter Gender";
        errMess = "Male,Female,Unknown";
        customer.setGenderCustomer(FuncValidation.checkValidate(content, errMess, regexGenderException, CASE_INSENSITIVE));

        content = "ID Card Customer";
        errMess = "9 chu so";
        customer.setIdCustomer(Integer.parseInt(FuncValidation.checkValidate(content, errMess, regexIDException)));

        content = "Enter Phone Number Customer";
        errMess = "10 chu so";
        customer.setPhoneNumberCustomer(Integer.parseInt(FuncValidation.checkValidate(content, errMess, regexPhoneNumberException)));

        content = "Enter Email Customer";
        errMess = "khong hop le, vui long nhap lai";
        customer.setEmailCustomer(FuncValidation.checkValidate(content, errMess, regexEmailException));

        System.out.println("Enter Type Customer");
        customer.setTypeCustomer(scanner.nextLine());

        System.out.println("Enter Address Customer");
        customer.setAddressCustomer(scanner.nextLine());

        listCustomer.add(customer);
        FuncFileCSVCustomer.writeCustomerToFileCSV((ArrayList<Customer>) listCustomer);
        System.out.println("----------------------");
        System.out.println("Add new Customer complete. Enter to continue. ");
        scanner.nextLine();
        displayMainMenu();


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
        Service room = new Room();
        addNewService(room);
        System.out.println("Enter Free Service : ");
        ((Room) room).setFreeService(scanner.nextLine());
        listRoom.add((Room) room);
        FuncFileCSVRoom.writeRoomToFileCSV((ArrayList<Room>) listRoom);

        System.out.println("----------------------");
        System.out.println("Add new Villa complete. Enter to continue. ");
        scanner.nextLine();
        displayMainMenu();

    }

    private static void addNewHouse() {

        String content = "";
        String errMes = "";

        listHouse = FuncFileCSVHouse.getFileCSVToListHouse();
        Service house = new House();
        addNewService(house);
        System.out.println("Enter Room Standard : ");
        ((House) house).setRoomStandard(scanner.nextLine());
        System.out.println("Enter Convenient Description : ");
        ((House) house).setConvenientDescription(scanner.nextLine());
        ((House) house).setNumberOfFloor(Integer.parseInt(FuncValidation.checkValidate(("Enter Number Of Floor : "), "Vui long nhap so duong", "^[0-9]+$")));
        listHouse.add(((House) house));
        FuncFileCSVHouse.writeHouseToFileCSV((ArrayList<House>) listHouse);
        System.out.println("----------------------");
        System.out.println("Add new House complete. Enter to continue. ");
        scanner.nextLine();
        displayMainMenu();
    }

    private static void addNewVilla() {
        String content = "";
        String errMes = "";
        listVilla = FuncFileCSVVilla.getFileCSVToListVilla();
        Service villa = new Villa();
        addNewService(villa);
        System.out.println("Enter Room Standard : ");
        ((Villa) villa).setRoomStandard(scanner.nextLine());

        ((Villa) villa).setConvenientDescription(FuncValidation.checkValidate("Enter Convenient Description : ",
                "massage, karaoke, food, drink, car", regexConvenientDescription, CASE_INSENSITIVE).toString());

        ((Villa) villa).setAreaPool(Integer.parseInt(FuncValidation.checkValidate(("Enter Area Pool : "), "Vui long nhap so duong", "^[0-9]+$")));
        ((Villa) villa).setNumberOfFloor(Integer.parseInt(FuncValidation.checkValidate(("Enter Number Of Floor : "), "Vui long nhap so duong", "^[0-9]+$")));

        listVilla.add(((Villa) villa));
        FuncFileCSVVilla.writeVillaToFileCSV((ArrayList<Villa>) listVilla);


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
                for (Villa villas : listVilla) {
                    System.out.println("\n-------------------");
                    System.out.println(villas.showInfo());
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
                showAllNameVillaNotDuplicate();
                break;
            case "5":
                showAllNameHouseNotDuplicate();
                break;
            case "6":
                showAllNameRoomNotDuplicate();
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

    private static void showAllNameRoomNotDuplicate() {
        Set<String> setRoom = new TreeSet<>();
        ArrayList<Room> listRoom = new ArrayList<Room>();
        listRoom = FuncFileCSVRoom.getFileCSVToListRoom();
        for (Room room : listRoom) {
            setRoom.add(room.getNameService());
        }
        int i = 1;
        for (String s : setRoom) {
            System.out.println(i + ". " + s);
            i++;
        }
        System.out.println("Enter to back to menu...");
        scanner.nextLine();
        displayMainMenu();

    }

    private static void showAllNameHouseNotDuplicate() {
        Set<String> setHouse = new TreeSet<>();
        ArrayList<House> listHouse = new ArrayList<House>();
        listHouse = FuncFileCSVHouse.getFileCSVToListHouse();
        for (House house : listHouse) {
            setHouse.add(house.getNameService());
        }
        int i = 1;
        for (String s : setHouse) {
            System.out.println(i + ". " + s);
            i++;
        }
        System.out.println("Enter to back to menu...");
        scanner.nextLine();

        displayMainMenu();
    }

    private static void showAllNameVillaNotDuplicate() {
        Set<String> setVilla = new TreeSet<>();
        ArrayList<Villa> listVilla = new ArrayList<Villa>();
        listVilla = FuncFileCSVVilla.getFileCSVToListVilla();
        for (Villa villa : listVilla) {
            setVilla.add(villa.getNameService());
        }
        int i = 1;
        for (String s : setVilla) {
            System.out.println(i + ". " + s);
            i++;
        }
        System.out.println("Enter to back to menu...");
        scanner.nextLine();
        displayMainMenu();
    }


    private static void backToMenu() {
        System.out.println("\n-------------------");
        displayMainMenu();
    }

    private static Service addNewService(Service service) {
        String content = "";
        String errMes = "";

        service.setId(UUID.randomUUID().toString().replace("-", ""));

        System.out.println("Enter name service : ");
        service.setNameService(scanner.nextLine());
        while (!FuncValidation.checkNameService(service.getNameService())) {
            System.out.println("Name service is Invalid. Please try again ");
            System.out.println("Enter name service : ");
            service.setNameService(scanner.nextLine());
        }

        content = "Enter Area Used : ";
        errMes = "Area Used Is Invalid(Area > 30, Area must be a double)";
        service.setAreaUsed(FuncValidation.checkValidateNumberDouble(content, errMes));
        while (service.getAreaUsed() <= 30) {
            System.out.println(errMes);
            service.setAreaUsed(FuncValidation.checkValidateNumberDouble(content, errMes));
        }

        content = "Enter Rental Cost : ";
        errMes = "Rental Cost Is Invalid(Rental Cost > 0, Rental Cost must be a double)";
        service.setRentalCosts(FuncValidation.checkValidateNumberDouble(content, errMes));
        while (service.getRentalCosts() <= 0) {
            System.out.println(errMes);
            service.setRentalCosts(FuncValidation.checkValidateNumberDouble(content, errMes));
        }

        content = "Enter Max Number Of People : ";
        errMes = "Max Number Of People Is Invalid(Max Number Of People > 0 and <30, Max Number Of People must be a Integer)";

        service.setMaxNumberOfPeople(FuncValidation.checkValidateNumberInt(content, errMes));
        while (service.getMaxNumberOfPeople() < 0 || service.getMaxNumberOfPeople() >= 20) {
            System.out.println(errMes);
            service.setMaxNumberOfPeople(FuncValidation.checkValidateNumberInt(content, errMes));
        }


        service.setTypeRent(FuncValidation.checkValidate("Enter Type Rent : ", "Error, please try again", "^[A-Z][a-z]+$"));


        return service;

    }


}
