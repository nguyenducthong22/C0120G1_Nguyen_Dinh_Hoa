package CaseStudy.Models;

public class Room extends Service {
    private String freeService;

    public Room() {
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String id, String nameService, double areaUsed, double rentalCosts, int maxNumberOfPeople, String typeRent, String freeService) {
        super(id, nameService, areaUsed, rentalCosts, maxNumberOfPeople, typeRent);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String showInfo() {
        return super.showInfo() +
                "\n Free Service: " + this.getFreeService();
    }

    //    @Override
//    public String showInfo() {
//        return "\n Id Service : " + super.getId() +
//                "\n Name Service : " + super.getNameService() +
//                "\n Area Used : " + super.getAreaUsed() +
//                "\n Rental Cost : " + super.getRentalCosts() +
//                "\n Max Number Of People : " + super.getMaxNumberOfPeople() +
//                "\n Type Rent : " + super.getTypeRent()+
//                "\n Free Service: " + this.getFreeService()
//                ;
//    }
}
