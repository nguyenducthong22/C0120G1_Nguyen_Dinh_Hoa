package CaseStudy.Commons;

import CaseStudy.Models.Customer;
import CaseStudy.Models.Villa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FuncFileCSVBooking {
    public static final String COMMA_DELIMITER = ",";
    public static final String NEW_LINE_SEPARATOR = "\n";
    public static final String fileNameBooking = "src/CaseStudy/Data/Booking.csv";
    public static final String FILE_HEADER_BOOKING = "nameCustomer,birthdayCustomer,genderCustomer,idCustomer,phoneNumberCustomer,emailCustomer,typeCustomer,addressCustomer,id,nameService,areaUsed,rentalCosts,maxNumberOfPeople,typeRent";

    public static void writeBookingToFileCSV(ArrayList<Customer> listCustomer) {
        FileWriter fileWriter;
        fileWriter = null;
        try {
            fileWriter = new FileWriter(fileNameBooking);
            fileWriter.append(FILE_HEADER_BOOKING);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (Customer customer : listCustomer) {
                fileWriter.append(customer.getNameCustomer());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getBirthdayCustomer());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getGenderCustomer());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(customer.getIdCustomer()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(customer.getPhoneNumberCustomer()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getEmailCustomer());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getTypeCustomer());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getAddressCustomer());
                //???????
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getService().getId());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getService().getNameService());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(customer.getService().getAreaUsed()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(customer.getService().getRentalCosts()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(customer.getService().getMaxNumberOfPeople()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getService().getTypeRent());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
        } catch (Exception ex) {
            System.out.println("Error in CSV Booking file Writer");
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception ex) {
                System.out.println("Error when flush or close ");
            }
        }

    }
    public static ArrayList<Customer> getFileCSVToListBooking() {
        BufferedReader bufferedReader;
        bufferedReader = null;
        ArrayList<Customer> listCustomerBooking = new ArrayList<Customer>();
        //kiem tra duong dan ton tai chua
        Path path = Paths.get(fileNameBooking);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(fileNameBooking);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        try {
            String line;
            bufferedReader = new BufferedReader(new FileReader(fileNameBooking));
            while ((line = bufferedReader.readLine()) != null) {
                String[] splitData = line.split(",");
                if (splitData[0].equals("nameCustomer")) {
                    continue;
                }
                Customer customer = new Customer();
                customer.setNameCustomer(splitData[0]);
                customer.setBirthdayCustomer(splitData[1]);
                customer.setGenderCustomer(splitData[2]);
                customer.setIdCustomer(Integer.parseInt(splitData[3]));
                customer.setPhoneNumberCustomer(Integer.parseInt(splitData[4]));
                customer.setEmailCustomer(splitData[5]);
                customer.setTypeCustomer(splitData[6]);
                customer.setAddressCustomer(splitData[7]);
                Villa villa = new Villa();
                villa.setId(splitData[8]);
                villa.setNameService(splitData[9]);
                villa.setAreaUsed(Double.parseDouble(splitData[10]));
                villa.setRentalCosts(Double.parseDouble(splitData[11]));
                villa.setMaxNumberOfPeople(Integer.parseInt(splitData[12]));
                villa.setTypeRent(splitData[13]);
                customer.setService(villa);
                listCustomerBooking.add(customer);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            try {
                bufferedReader.close();
            } catch (Exception e1) {
                System.out.println(e1.getMessage());
            }
        }
        return listCustomerBooking;
    }
}
