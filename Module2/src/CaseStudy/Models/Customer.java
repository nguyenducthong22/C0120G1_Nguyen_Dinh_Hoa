package CaseStudy.Models;

public class Customer {
    private String nameCustomer;
    private String birthdayCustomer;
    private String genderCustomer;
    private int idCustomer;
    private int phoneNumberCustomer;
    private String emailCustomer;
    private String typeCustomer;
    private String addressCustomer;
    private Service service;



    public String showInfo() {
        return "Customer{" +
                "nameCustomer='" + nameCustomer + '\'' +
                ", birthdayCustomer='" + birthdayCustomer + '\'' +
                ", genderCustomer='" + genderCustomer + '\'' +
                ", idCustomer=" + idCustomer +
                ", phoneNumberCustomer=" + phoneNumberCustomer +
                ", emailCustomer='" + emailCustomer + '\'' +
                ", typeCustomer='" + typeCustomer + '\'' +
                ", typeAddressCustomer='" + addressCustomer + '\'' +
                ", service=" + service +
                '}';
    }



    public Customer() {
    }

    public Customer(String nameCustomer, String birthdayCustomer, String genderCustomer, int idCustomer, int phoneNumberCustomer, String emailCustomer, String typeCustomer, String addressCustomer, Service service) {
        this.nameCustomer = nameCustomer;
        this.birthdayCustomer = birthdayCustomer;
        this.genderCustomer = genderCustomer;
        this.idCustomer = idCustomer;
        this.phoneNumberCustomer = phoneNumberCustomer;
        this.emailCustomer = emailCustomer;
        this.typeCustomer = typeCustomer;
        this.addressCustomer = addressCustomer;
        this.service = service;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getBirthdayCustomer() {
        return birthdayCustomer;
    }

    public void setBirthdayCustomer(String birthdayCustomer) {
        this.birthdayCustomer = birthdayCustomer;
    }

    public String getGenderCustomer() {
        return genderCustomer;
    }

    public void setGenderCustomer(String genderCustomer) {
        this.genderCustomer = genderCustomer;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public int getPhoneNumberCustomer() {
        return phoneNumberCustomer;
    }

    public void setPhoneNumberCustomer(int phoneNumberCustomer) {
        this.phoneNumberCustomer = phoneNumberCustomer;
    }

    public String getEmailCustomer() {
        return emailCustomer;
    }

    public void setEmailCustomer(String emailCustomer) {
        this.emailCustomer = emailCustomer;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getAddressCustomer() {
        return addressCustomer;
    }

    public void setAddressCustomer(String addressCustomer) {
        this.addressCustomer = addressCustomer;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

}
