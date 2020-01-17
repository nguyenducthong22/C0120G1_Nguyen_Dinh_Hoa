let listCostomers = [];

function addNewCustomer() {
    let cus = new Cuscomer();
    cus.setNameCustomer(prompt("Enter Name Customer"));
    cus.setIdCard(prompt("Enter Id Card Customer: "));
    cus.setBirthdayCustomer(prompt("Enter Birthday Customer (dd/MM/YYYY): "));
    cus.setEmailCustomer(prompt("Enter Email Customer: "));
    cus.setAddressCustomer(prompt("Enter Address Customer: "));
    cus.setTypeCustomer(prompt("Enter Type Customer: "));
    cus.setDiscount(prompt("Enter Discout: "));
    cus.setNumberOfAccompanying(prompt("Enter Number of Accompanying: "));
    cus.setTypeRoom(prompt("Enter Type Room: "));
    cus.setRentDays(prompt("Enter Rent Days: "));
    cus.setTypeService(prompt("Enter Type Service: "));
    listCostomers.push(cus);




}