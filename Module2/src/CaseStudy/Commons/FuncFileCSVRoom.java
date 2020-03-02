package CaseStudy.Commons;

import CaseStudy.Models.Room;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FuncFileCSVRoom {
    public static final String COMMA_DELIMITER = ",";
    public static final String NEW_LINE_SEPARATOR = "\n";
    public static final String fileNameRoom = "src/CaseStudy/Data/Room.csv";

    //CSV file header
    public static final String FILE_HEADER_ROOM = "id,nameService,areaUsed,rentalCosts,maxNumberOfPeople,typeRent,freeService";

    public static void writeRoomToFileCSV(ArrayList<Room> listRoom) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileNameRoom);
            fileWriter.append(FILE_HEADER_ROOM);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (Room room : listRoom) {
                fileWriter.append(room.getId());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(room.getNameService());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(room.getAreaUsed()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(room.getRentalCosts()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(room.getMaxNumberOfPeople()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(room.getTypeRent());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(room.getFreeService());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }


        } catch (Exception ex) {
            System.out.println("Error in CSV Room file Writer");
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception ex) {
                System.out.println("Error when flush or close ");
            }
        }

    }

    public static ArrayList<Room> getFileCSVToListRoom() {
        BufferedReader bufferedReader = null;
        ArrayList<Room> listRoom = new ArrayList<Room>();
        //kiem tra duong dan ton tai chua
        Path path = Paths.get(fileNameRoom);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(fileNameRoom);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        try {
            String line;
            bufferedReader = new BufferedReader(new FileReader(fileNameRoom));
            while ((line = bufferedReader.readLine()) != null) {
                String[] splitData = line.split(",");
                if (splitData[0].equals("id")) {
                    continue;
                }
                Room room = new Room();
                room.setId(splitData[0]);
                room.setNameService(splitData[1]);
                room.setAreaUsed(Double.parseDouble(splitData[2]));
                room.setRentalCosts(Double.parseDouble(splitData[3]));
                room.setMaxNumberOfPeople(Integer.parseInt(splitData[4]));
                room.setTypeRent(splitData[5]);
                room.setFreeService(splitData[6]);
                listRoom.add(room);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            try {
                bufferedReader.close();
            } catch (Exception e1) {
                System.out.println(e1.getMessage());
            }
        }
        return listRoom;
    }
}
