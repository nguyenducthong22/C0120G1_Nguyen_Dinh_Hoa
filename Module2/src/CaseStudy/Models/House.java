package CaseStudy.Models;

public class House extends Service {

    private String roomStandard;
    private String convenientDescription;
    private int numberOfFloor;

    public House() {
    }

    public House(String roomStandard, String convenientDescription, int numberOfFloor) {
        this.roomStandard = roomStandard;
        this.convenientDescription = convenientDescription;
        this.numberOfFloor = numberOfFloor;
    }

    public House(String id, String nameService, double areaUsed, double rentalCosts, int maxNumberOfPeople, String typeRent, String roomStandard, String convenientDescription, int numberOfFloor) {
        super(id, nameService, areaUsed, rentalCosts, maxNumberOfPeople, typeRent);
        this.roomStandard = roomStandard;
        this.convenientDescription = convenientDescription;
        this.numberOfFloor = numberOfFloor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getConvenientDescription() {
        return convenientDescription;
    }

    public void setConvenientDescription(String convenientDescription) {
        this.convenientDescription = convenientDescription;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public String showInfo() {
        return super.showInfo() +
                "\n Room Standard : " + this.roomStandard +
                "\n Convenient Description: " + this.convenientDescription +
                "\n Number Of Floor : " + this.numberOfFloor;
    }






    //    @Override
//    public String showInfo() {
//        return "\n Id Service : " + super.getId() +
//                "\n Name Service : " + super.getNameService() +
//                "\n Area Used : " + super.getAreaUsed() +
//                "\n Rental Cost : " + super.getRentalCosts() +
//                "\n Max Number Of People : " + super.getMaxNumberOfPeople() +
//                "\n Type Rent : " + super.getTypeRent() +
//                "\n Room Standard : " + this.roomStandard +
//                "\n Convenient Description: " + this.convenientDescription +
//                "\n Number Of Floor : " + this.numberOfFloor
//
//                ;
//    }

}
