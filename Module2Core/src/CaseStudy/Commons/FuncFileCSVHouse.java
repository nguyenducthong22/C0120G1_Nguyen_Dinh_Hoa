package CaseStudy.Commons;

import CaseStudy.Models.House;
import CaseStudy.Models.Villa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FuncFileCSVHouse {
    public static final String COMMA_DELIMITER = ",";
    public static final String NEW_LINE_SEPARATOR = "\n";
    public static final String fileNameHouse = "src/CaseStudy/Data/House.csv";
    //CSV file header
    public static final String FILE_HEADER_HOUSE = "id,nameService,areaUsed,rentalCosts,maxNumberOfPeople,typeRent,roomStandard,convenientDescription,numberOfFloor";

    public static void writeHouseToFileCSV(ArrayList<House> listHouse) {
        FileWriter fileWriter;
        fileWriter = null;
        try {
            fileWriter = new FileWriter(fileNameHouse);
            fileWriter.append(FILE_HEADER_HOUSE);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (House house : listHouse) {
                fileWriter.append(house.getId());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(house.getNameService());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(house.getAreaUsed()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(house.getRentalCosts()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(house.getMaxNumberOfPeople()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(house.getTypeRent());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(house.getRoomStandard());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(house.getConvenientDescription());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(house.getNumberOfFloor()));
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
        } catch (Exception ex) {
            System.out.println("Error in CSV House file Writer");
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception ex) {
                System.out.println("Error when flush or close ");
            }
        }
    }

    public static ArrayList<House> getFileCSVToListHouse() {
        BufferedReader bufferedReader;
        bufferedReader = null;
        ArrayList<House> listHouse = new ArrayList<House>();
        Path path = Paths.get(fileNameHouse);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(fileNameHouse);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        try {
            String line;
            bufferedReader = new BufferedReader(new FileReader(fileNameHouse));
            while ((line = bufferedReader.readLine()) != null) {
                String[] splitData = line.split(",");
                if (splitData[0].equals("id")) {
                    continue;
                }
                House house = new House();
                house.setId(splitData[0]);
                house.setNameService(splitData[1]);
                house.setAreaUsed(Double.parseDouble(splitData[2]));
                house.setRentalCosts(Double.parseDouble(splitData[3]));
                house.setMaxNumberOfPeople(Integer.parseInt(splitData[4]));
                house.setTypeRent(splitData[5]);
                house.setRoomStandard(splitData[6]);
                house.setConvenientDescription(splitData[7]);
                house.setNumberOfFloor(Integer.parseInt(splitData[8]));
                listHouse.add(house );
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            try {
                bufferedReader.close();
            } catch (Exception e1) {
                System.out.println(e1.getMessage());
            }
        }
        return listHouse;
    }
}
