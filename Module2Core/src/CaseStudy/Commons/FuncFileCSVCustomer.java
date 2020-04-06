package CaseStudy.Commons;

import CaseStudy.Models.Customer;
import CaseStudy.Models.House;
import CaseStudy.Models.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FuncFileCSVCustomer {
    public static final String COMMA_DELIMITER = ",";
    public static final String NEW_LINE_SEPARATOR = "\n";
    public static final String fileNameCustomer = "src/CaseStudy/Data/Customer.csv";
    public static final String FILE_HEADER_CUSTOMER = "nameCustomer,birthdayCustomer,genderCustomer,idCustomer,phoneNumberCustomer,emailCustomer,typeCustomer,addressCustomer";

    public static void writeCustomerToFileCSV(ArrayList<Customer> listCustomer) {
        FileWriter fileWriter;
        fileWriter = null;
        try {
            fileWriter = new FileWriter(fileNameCustomer);
            fileWriter.append(FILE_HEADER_CUSTOMER);
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
//                fileWriter.append(COMMA_DELIMITER);
//                fileWriter.append(String.valueOf(customer.getService()));
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
        } catch (Exception ex) {
            System.out.println("Error in CSV Customer file Writer");
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception ex) {
                System.out.println("Error when flush or close ");
            }
        }

    }

    public static ArrayList<Customer> getFileCSVToListCustomer() {
        BufferedReader bufferedReader;
        bufferedReader = null;
        ArrayList<Customer> listCustomer = new ArrayList<Customer>();
        Path path = Paths.get(fileNameCustomer);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(fileNameCustomer);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        try {

            String line;
            bufferedReader = new BufferedReader(new FileReader(fileNameCustomer));
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
                listCustomer.add(customer);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            try {
                bufferedReader.close();
            } catch (Exception e1) {
                System.out.println(e1.getMessage());
            }
        }
        return listCustomer;
    }
}
