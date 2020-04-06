package CaseStudy.Models;



public class Villa extends Service {
    private String roomStandard;
    private String convenientDescription;
    private int areaPool;
    private int numberOfFloor;

    public Villa() {
    }


    public Villa(String id, String nameService, double areaUsed, double rentalCosts, int maxNumberOfPeople, String typeRent, String roomStandard, String convenientDescription, int areaPool, int numberOfFloor) {
        super(id, nameService, areaUsed, rentalCosts, maxNumberOfPeople, typeRent);
        this.roomStandard = roomStandard;
        this.convenientDescription = convenientDescription;
        this.areaPool = areaPool;
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

    public int getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(int areaPool) {
        this.areaPool = areaPool;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public String showInfo() {
        return super.showInfo()+
                "\n Room Standard : " + this.roomStandard +
                "\n Convenient Description: " + this.convenientDescription +
                "\n Area Pool : " + this.areaPool +
                "\n Number Of Floor : " + this.numberOfFloor;
    }


}
