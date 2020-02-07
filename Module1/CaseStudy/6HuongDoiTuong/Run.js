let listCustomers = [];
let checkEditCustomer = false;
let checkDeleteCustomer = false;
let checkDisplayTotalPay = false;


// let validateBirthday1 =/^(?:(?:31(\/|-|\.)(?:0?[13578]|1[02]))\1|(?:(?:29|30)(\/|-|\.)(?:0?[1,3-9]|1[0-2])\2))(?:(?:1[6-9]|[2-9]\d)?\d{2})$|^(?:29(\/|-|\.)0?2\3(?:(?:(?:1[6-9]|[2-9]\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\d|2[0-8])(\/|-|\.)(?:(?:0?[1-9])|(?:1[0-2]))\4(?:(?:1[6-9]|[2-9]\d)?\d{2})$/;
let validateBirthday = /^([0-2]\d|(3)[0-1])(\/)(((0)\d)|((1)[0-2]))(\/)[1]{1}[9]{1}[3-9]{1}\d{1}|[2]{1}[0]{1}[0-1]{1}\d{1}$/;
let validateEmail = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
let validateIdCard = /^\d{9}$/;
let validateRentDay = /^\d{1,3}$/;
let validateDiscount = /^\d{1,2}$/;
let validateNumberOfCompany = /^\d{1,2}$/;
let validateTypeCustomer = /^(diamond|platinium|gold|silver|member)$/;
let validateTypeRoom = /^(vip|business|normal)$/;
let validateTypeService = /^(villa|room|house)$/;
let validateAddressCustomer = /^(danang|hue|quangnam)$/;


function displayMainMenu() {
    let choose = prompt("" +
        "1. Add new customer" +
        "\n2. Display information customer " +
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
            alert("Faillll cmnr :(");
            displayMainMenu();
            break;
    }

}


function addNewCustomer() {
    let checkBirthday = false;
    let checkEmail = false;
    let checkIdCard = false;
    let checkRentDay = false;
    let checkDiscount = false;
    let checkNumberOfCompany = false;
    let checkTypeCustomer = false;
    let checkTypeRoom = false;
    let checkTypeService = false;
    let checkAddressCustomer = false;

    let cus = new Customer();

    let nameStd = " ";

    cus.setNameCustomer(prompt("Enter Name Customer"));
    cus.setNameCustomer(cus.getNameCustomer().trim().toLocaleLowerCase());
    for (let i = 0; i < cus.getNameCustomer().length; i++) {
        if (cus.getNameCustomer().charAt(i) === " " && cus.getNameCustomer().charAt(i + 1) === " ") {
            continue;
        }
        if (i === 0 || cus.getNameCustomer().charAt(i - 1) === " ") {
            nameStd += cus.getNameCustomer().charAt(i).toLocaleUpperCase();
            continue;
        }
        nameStd += cus.getNameCustomer().charAt(i);

    }
    cus.setNameCustomer(nameStd);

    do {
        cus.setIdCard(prompt("Enter Id Card Customer: "));
        if (validateIdCard.test(cus.getIdCard())) {
            checkIdCard = true;
        } else {
            alert("vui long nhap lai");
        }

    } while (!checkIdCard);


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

    do {
        cus.setAddressCustomer(prompt("Enter Address Customer(Da nang,Hue,Quang Nam): "));
        if (validateAddressCustomer.test(cus.getAddressCustomer().toLowerCase().replace(/ /g,''))) {
            checkAddressCustomer = true;
        } else {
            alert("vui long nhap lai");
        }
    } while (!checkAddressCustomer);

    do {
        cus.setTypeCustomer(prompt("Enter Type Customer(Diamond,Platinium,Gold,Silver,Member): "));
        if (validateTypeCustomer.test(cus.getTypeCustomer().toLowerCase())) {
            checkTypeCustomer = true;
        } else {
            alert("vui long nhap lai");
        }
    } while (!checkTypeCustomer) ;


    do {
        cus.setDiscount(prompt("Enter Discount: "));
        if (validateDiscount.test(cus.getDiscount())) {
            checkDiscount = true;
        } else {
            alert("vui long nhap lai");
        }
    }
    while (!checkDiscount);

    do {
        cus.setNumberOfAccompanying(prompt("Enter Number of Accompanying: "));
        if (validateNumberOfCompany.test(cus.getNumberOfAccompanying())) {
            checkNumberOfCompany = true;
        } else {
            alert("vui long nhap lai");
        }
    }
    while (!checkNumberOfCompany);

    do {
        cus.setTypeRoom(prompt("Enter Type Room(Vip,Business,Normal): "));
        if (validateTypeRoom.test(cus.getTypeRoom().toLowerCase())) {
            checkTypeRoom = true;
        } else {
            alert("vui long nhap lai");
        }
    } while (!checkTypeRoom) ;


    do {
        cus.setRentDays(prompt("Enter Rent Days: "));
        if (validateRentDay.test(cus.getRentDays())) {
            checkRentDay = true;
        } else {
            alert("vui long nhap lai");
        }
    }
    while (!checkRentDay);

    do {
        cus.setTypeService(prompt("Enter Type Service(Villa,Room,House): "));
        if (validateTypeService.test(cus.getTypeService().toLowerCase())) {
            checkTypeService = true;
        } else {
            alert("vui long nhap lai");
        }
    } while (!checkTypeService) ;




    listCustomers.push(cus);
    displayMainMenu();
}

function displayCustomers() {
    let result = "";
    for (let i = 0; i < listCustomers.length; i++) {
        result += "\n" + (i + 1) + ". " + "Name: " + listCustomers[i].getNameCustomer() +
            "; ID Card" + listCustomers[i].getIdCard();
    }
    result += "\n" + (listCustomers.length + 1) + ".Back to menu";
    let chooseDisplayInfo = prompt(result);
    if (chooseDisplayInfo.toString() !== (listCustomers.length + 1).toString()) { //k chon back
        if (!checkDeleteCustomer && !checkDisplayTotalPay) {
            displayInformationCustomer(Number.parseInt(chooseDisplayInfo) - 1);
        } else if (checkDeleteCustomer) {
            deleteCustomer(Number.parseInt(chooseDisplayInfo) - 1);
        } else {
            displayTotalPay(Number.parseInt(chooseDisplayInfo) - 1);
        }

    } else {
        checkDisplayTotalPay = false;
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
            editInformationCustomer(index, Number.parseInt(chooseInfoEdit) - 1); //

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
            "\nType Service :" + listCustomers[index].getTypeService()
        );
        displayMainMenu();
    }
}

function editInformationCustomer(index, editIndex) {  //
    let editInfo;
    editInfo = prompt("Enter Info You Want Change: ").toString();
    switch (editIndex) {
        case 0:
            listCustomers[index].setNameCustomer(editInfo);
            break;
        case 1:
            listCustomers[index].setIdCard(editInfo);
            break;
        case 2:
            listCustomers[index].setBirthdayCustomer(editInfo);
            break;
        case 3:
            listCustomers[index].setEmailCustomer(editInfo);
            break;
        case 4:
            listCustomers[index].setAddressCustomer(editInfo);
            break;
        case 5:
            listCustomers[index].setTypeCustomer(editInfo);
            break;
        case 6:
            listCustomers[index].setDiscount(editInfo);
            break;
        case 7:
            listCustomers[index].setNumberOfAccompanying(editInfo);
            break;
        case 8:
            listCustomers[index].setTypeRoom(editInfo);
            break;
        case 9:
            listCustomers[index].setRentDays(editInfo);
            break;
        case 10:
            listCustomers[index].setTypeService(editInfo);
            break;
        default:
            alert("Fail..");
            return;

    }
    checkEditCustomer = false;
    displayMainMenu();
}

function deleteCustomer(index) {
    let chooseConfirm = prompt(
        "Are you sure delete Customer : Name " + listCustomers[index].getNameCustomer() +
        ",ID card" + listCustomers[index].getIdCard() +
        "\n1.Yes\n2.No"
    );
    if (chooseConfirm === "1") {
        listCustomers.splice(index, 1);
        alert("delete complete");
    }
    checkDeleteCustomer = false;
    displayMainMenu();

}

function chooseDisplayTotalPay() {
    checkDisplayTotalPay = true;
    displayCustomers();
}

function displayTotalPay(index) {
    alert("Tổng tiền của " +listCustomers[index].getNameCustomer() +" là : "+listCustomers[index].totalPays() +" lúa Trump");
    checkDisplayTotalPay = false;
    displayMainMenu();

}

function chooseCustomerEdit() {
    checkEditCustomer = true;
    displayCustomers();
}

function chooseDeleteCustomer() {
    checkDeleteCustomer = true;
    displayCustomers();

}


displayMainMenu();