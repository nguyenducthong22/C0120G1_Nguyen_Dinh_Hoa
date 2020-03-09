package CaseStudy.Commons;

import CaseStudy.Models.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FuncFileCSVEmployee {
    public static final String COMMA_DELIMITER = ",";
    public static final String NEW_LINE_SEPARATOR = "\n";
    public static final String fileNameEmployee = "src/CaseStudy/Data/Employee.csv";
    public static final String FILE_HEADER_EMPLOYEE = "idEmployee,nameEmployee,ageEmployee,addressEmployee";
    //nothing

    public static void writeEmployeeToFileCSV(ArrayList<Employee> listEmployee) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileNameEmployee);
            fileWriter.append(FILE_HEADER_EMPLOYEE);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (Employee employee : listEmployee) {
                fileWriter.append(employee.getIdEmployee());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(employee.getNameEmployee());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(employee.getAgeEmployee()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(employee.getAddressEmployee()));
                fileWriter.append(NEW_LINE_SEPARATOR);
            }


        } catch (Exception ex) {
            System.out.println("Error in CSV Employee file Writer");
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception ex) {
                System.out.println("Error when flush or close ");
            }
        }

    }

    public static ArrayList<Employee> getFileCSVToListEmployee() {
        BufferedReader bufferedReader = null;
        ArrayList<Employee> listEmployee = new ArrayList<Employee>();
        //kiem tra duong dan ton tai chua
        Path path = Paths.get(fileNameEmployee);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(fileNameEmployee);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        try {
            String line;
            bufferedReader = new BufferedReader(new FileReader(fileNameEmployee));
            while ((line = bufferedReader.readLine()) != null) {
                String[] splitData = line.split(",");
                if (splitData[0].equals("idEmployee")) {
                    continue;
                }
                Employee employee = new Employee();
                employee.setIdEmployee(splitData[0]);
                employee.setNameEmployee(splitData[1]);
                employee.setAgeEmployee(Integer.parseInt(splitData[2]));
                employee.setAddressEmployee(splitData[3]);
                listEmployee.add(employee);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            try {
                bufferedReader.close();
            } catch (Exception e1) {
                System.out.println(e1.getMessage());
            }
        }
        return listEmployee;
    }

}
