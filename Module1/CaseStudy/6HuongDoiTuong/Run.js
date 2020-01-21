let listCustomers = [];
let checkEditCustomer = false;
let checkDeleteCustomer = false;
let checkDisplayTotalPay = false;
let validateBirthday = /^([0-2][0-9]|(3)[0-1])(\/)(((0)[0-9])|((1)[0-2]))(\/)\d{4}$/;
let validateEmail = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;

function displayMainMenu() {
    let choose = prompt("" +
        "1. Add new customer" +
        "\n2. Display infomation customer " +
        "\n3. Display total pays of customer " +
        "\n4. Edit information customer" +
        "\n5. Delete customer" +
        "\n6. Exit ");
    switch (choose) {
        case "1":
            addNewCustomer();
            break;
        case "2":
            displayCustomers();
            break;
        case "3":
            chooseDisplayTotalPay();
            break;
        case "4":
            chooseCustomerEdit();
            break;
        case "5":
            chooseDeleteCustomer();
            break;
        case "6":
            return;
        default:
            alert("faillll");
            displayMainMenu();
            break;
    }

}


function addNewCustomer() {
    let checkBirthday = false;
    let checkEmail = false;
    let cus = new Customer();
    cus.setNameCustomer(prompt("Enter Name Customer"));
    cus.setIdCard(prompt("Enter Id Card Customer: "));
    do {
        cus.setBirthdayCustomer(prompt("Enter Birthday Customer (dd/MM/YYYY): "));
        if (validateBirthday.test(cus.getBirthdayCustomer())) {
            checkBirthday = true;
        } else {
            alert("vui long nhap lai");
        }

    }
    while (!checkBirthday);

    do {
        cus.setEmailCustomer(prompt("Enter Email Customer: "));
        if (validateEmail.test(cus.getEmailCustomer())) {
            checkEmail = true;
        } else {
            alert("vui long nhap lai");
        }

    } while (!checkEmail);
    cus.setAddressCustomer(prompt("Enter Address Customer: "));
    cus.setTypeCustomer(prompt("Enter Type Customer: "));
    cus.setDiscount(prompt("Enter Discout: "));
    cus.setNumberOfAccompanying(prompt("Enter Number of Accompanying: "));
    cus.setTypeRoom(prompt("Enter Type Room: "));
    cus.setRentDays(prompt("Enter Rent Days: "));
    cus.setTypeService(prompt("Enter Type Service: "));
    listCustomers.push(cus);
    displayMainMenu();
}
function displayCustomers() {
    let result = "";
    for (var i = 0; i < listCustomers.length; i++) {
        result += "\n" + (i + 1) + ". " + "Name: " + listCustomers[i].getNameCustomer() + "; ID Card" + listCustomers[i].getIdCard();
    }
    result += "\n" + (listCustomers.length + 1) + ".Back to menu";
    let chooseDisplayInfo = prompt(result);
    if (chooseDisplayInfo.toString() !== (listCustomers.length + 1).toString()) { //k chon back
        if (!checkDeleteCustomer) {
            displayInformationCustomer(Number.parseInt(chooseDisplayInfo) - 1);
        } else {
            deleteCustomer(Number.parseInt(chooseDisplayInfo) - 1);
        }

    } else {
        checkDeleteCustomer = false;
        checkEditCustomer = false;
        displayMainMenu();
    }
}

function displayInformationCustomer(index) {
    if (checkEditCustomer) {
        let chooseInfoEdit = prompt(
            "1.Name :" + listCustomers[index].getNameCustomer() +
            "\n2.ID Card :" + listCustomers[index].getIdCard() +
            "\n3.Birthday :" + listCustomers[index].getBirthdayCustomer() +
            "\n4.Email :" + listCustomers[index].getEmailCustomer() +
            "\n5.Address :" + listCustomers[index].getAddressCustomer() +
            "\n6.Type Customer :" + listCustomers[index].getTypeCustomer() +
            "\n7.Discount :" + listCustomers[index].getDiscount() +
            "\n8.Number Of Accomanying :" + listCustomers[index].getNumberOfAccompanying() +
            "\n9.Type Room :" + listCustomers[index].getTypeRoom() +
            "\n10.Rent Day :" + listCustomers[index].getRentDays() +
            "\n11.Type Service :" + listCustomers[index].getTypeService() +
            "\n12.Back. ");
        if (chooseInfoEdit.toString() !== "12") { //ko chon back
            editInformationCustomer(Number.parseInt(chooseInfoEdit) - 1);

        } else {
            checkEditCustomer = false;
            displayCustomers();
        }
    } else {
        alert("Information of customers : " +
            "\nName :" + listCustomers[index].getNameCustomer() +
            "\nID Card :" + listCustomers[index].getIdCard() +
            "\nBirthday :" + listCustomers[index].getBirthdayCustomer() +
            "\nEmail :" + listCustomers[index].getEmailCustomer() +
            "\nAddress :" + listCustomers[index].getAddressCustomer() +
            "\nType Customer :" + listCustomers[index].getTypeCustomer() +
            "\nDiscount :" + listCustomers[index].getDiscount() +
            "\nNumber Of Accomanying :" + listCustomers[index].getNumberOfAccompanying() +
            "\nType Room :" + listCustomers[index].getTypeRoom() +
            "\nRent Day :" + listCustomers[index].getRentDays() +
            "\nType Service :" +listCustomers[index].getTypeService()
        );
        displayMainMenu();
    }
}


displayMainMenu();