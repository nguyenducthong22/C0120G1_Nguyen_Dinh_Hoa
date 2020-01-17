let listCustomers = [];

function displayMainMenu() {
    let choose = prompt("" +
        "1. Add new customer" +
        "\n2. Display infomation customer " +
        "\n3. Display total pays of customer "+
        "\n4. Edit information customer"+
        "\n5. Delete customer"+
        "\n6. Exit ")

}

// switch (choose) {
//     case "1":
//         addNewCustomer();
//         break;
//
//
//
//
//
// }

function addNewCustomer() {
    let cus = new Customer();
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
    listCustomers.push(Customer);


}