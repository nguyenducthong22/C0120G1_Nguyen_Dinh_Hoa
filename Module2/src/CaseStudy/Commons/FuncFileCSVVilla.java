package CaseStudy.Commons;

import CaseStudy.Models.Villa;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FuncFileCSVVilla {
    public static final String COMMA_DELIMITER = ",";
    public static final String NEW_LINE_SEPARATOR = "\n";
    public static final String fileNameVilla = "src/CaseStudy/Data/Villa.csv";

    //CSV file header
    public static final String FILE_HEADER_VILLA = "id,nameService,areaUsed,rentalCosts,maxNumberOfPeople,typeRent,roomStandard,convenientDescription,areaPool,numberOfFloor";

    public static void writeVillaToFileCSV(ArrayList<Villa> listVilla) {
        FileWriter fileWriter;
        fileWriter = null;
        try {
            fileWriter = new FileWriter(fileNameVilla);
            fileWriter.append(FILE_HEADER_VILLA);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (Villa villa : listVilla) {

                fileWriter.append(villa.getId());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villa.getNameService());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getAreaUsed()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getRentalCosts()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getMaxNumberOfPeople()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villa.getTypeRent());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villa.getRoomStandard());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villa.getConvenientDescription());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getAreaPool()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getNumberOfFloor()));
                fileWriter.append(NEW_LINE_SEPARATOR);
            }


        } catch (Exception ex) {
            System.out.println("Error in CSV Villa file Writer");
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception ex) {
                System.out.println("Error when flush or close ");
            }
        }
    }

    public static ArrayList<Villa> getFileCSVToListVilla() {
        BufferedReader bufferedReader;
        bufferedReader = null;
        ArrayList<Villa> listVilla = new ArrayList<Villa>();
        //kiem tra duong dan ton tai chua
        Path path = Paths.get(fileNameVilla);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(fileNameVilla);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        try {
            String line;
            bufferedReader = new BufferedReader(new FileReader(fileNameVilla));
            while ((line = bufferedReader.readLine()) != null) {
                String[] splitData = line.split(",");
                if (splitData[0].equals("id")) {
                    continue;
                }
                Villa villa = new Villa();
                villa.setId(splitData[0]);
                villa.setNameService(splitData[1]);
                villa.setAreaUsed(Double.parseDouble(splitData[2]));
                villa.setRentalCosts(Double.parseDouble(splitData[3]));
                villa.setMaxNumberOfPeople(Integer.parseInt(splitData[4]));
                villa.setTypeRent(splitData[5]);
                villa.setRoomStandard(splitData[6]);
                villa.setConvenientDescription(splitData[7]);
                villa.setAreaPool(Integer.parseInt(splitData[8]));
                villa.setNumberOfFloor(Integer.parseInt(splitData[9]));
                listVilla.add(villa);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            try {
                bufferedReader.close();
            } catch (Exception e1) {
                System.out.println(e1.getMessage());
            }
        }
        return listVilla;
    }
}
