let listCustomers = [];
let listEmployee = [];
let checkEditCustomer = false;
let checkDeleteCustomer = false;
let checkDisplayTotalPay = false;


let validateBirthday = /^([0-2]\d|(3)[0-1])(\/)(((0)\d)|((1)[0-2]))(\/)[1]{1}[9]{1}[3-9]{1}\d{1}|[2]{1}[0]{1}[0-1]{1}\d{1}$/;
let validateEmail = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
let validateIdCard = /^\d{9}$/;
let validateRentDay = /^\d{1,3}$/;
let validateDiscount = /^\d{1,3}$/;
let validateNumberOfCompany = /^\d{1,2}$/;
let validateTypeCustomer = /^(diamond|platinium|gold|silver|member)$/;
let validateTypeRoom = /^(vip|business|normal)$/;
let validateTypeService = /^(villa|room|house)$/;
let validateAddressCustomer = /^(danang|hue|quangnam)$/;
let validatePhoneNumber = /^([0-9]{1}[0-9]{9})|(\+84[1-9]{1}[0-9]{8})$/;
let validateLevelEmployee = /^trungcap|caodang|daihoc$/;
let validateLocationEmployee = /^letan|phucvu|giamsat|giamdoc$/;
let validateSalary = /^\d+$/;
let validateWorkEmployee = /^manager|sale|marketing$/;

function displayMainMenu() {
    let choose = prompt("" +
        "1. Add new customer" +
        "\n2. Display information customer " +
        "\n3. Display total pays of customer " +
        "\n4. Edit information customer" +
        "\n5. Delete customer" +
        "\n6. Add new employee" +
        "\n7. Display information employee" +
        "\n8. Exit ");
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
            addNewEmployee();
            break;
        case "7":
            displayEmployee();
            break;
        case "8":
            return;
        default:
            alert("Faillll cmnr :(");
            displayMainMenu();
            break;
    }

}

function addNewEmployee() {
    let checkPhoneNumber = false;
    let checkIdCard = false;
    let checkBirthday = false;
    let checkEmail = false;
    let checkLevel = false;
    let checkLocation = false;
    let checkWork = false;
    let checkSalary = false;


    let emp = new Employee();

    let nameStd = " ";

    emp.setNameEmployee(prompt("Enter Name Employee: "));
    emp.setNameEmployee(emp.getNameEmployee().trim().toLocaleLowerCase());
    for (let i = 0; i < emp.getNameEmployee().length; i++) {
        if (emp.getNameEmployee().charAt(i) === " " && emp.getNameEmployee().charAt(i + 1) === " ") {
            continue;
        }
        if (i === 0 || emp.getNameEmployee().charAt(i - 1) === " ") {
            nameStd += emp.getNameEmployee().charAt(i).toLocaleUpperCase();
            continue;
        }
        nameStd += emp.getNameEmployee().charAt(i);

    }
    emp.setNameEmployee(nameStd);

    do {
        emp.setPhoneNumberEmployee(prompt("Enter Phone Number Employee: "));
        if (validatePhoneNumber.test(emp.getPhoneNumberEmployee())) {
            checkPhoneNumber = true;
        } else {
            alert("vui long nhap lai");
        }

    } while (!checkPhoneNumber);

    do {
        emp.setIdCardEmployee(prompt("Enter Id Card Employee: "));
        if (validateIdCard.test(emp.getIdCardEmployee())) {
            checkIdCard = true;
        } else {
            alert("vui long nhap lai");
        }

    } while (!checkIdCard);

    do {
        emp.setBirthdayEmployee(prompt("Enter Birthday Employee: "));
        if (validateBirthday.test(emp.getBirthdayEmployee())) {
            checkBirthday = true;
        } else {
            alert("vui long nhap lai");
        }

    } while (!checkBirthday);

    do {
        emp.setEmailEmployee(prompt("Enter Email Employee: "));
        if (validateEmail.test(emp.getEmailEmployee())) {
            checkEmail = true;
        } else {
            alert("vui long nhap lai");
        }

    } while (!checkEmail);

    do {
        emp.setLevelEmployee(prompt("Enter Level Employee(Trung Cap,Cao Dang,Dai Hoc) : "));
        if (validateLevelEmployee.test(emp.getLevelEmployee().toLowerCase().replace(/ /g, ''))) {
            checkLevel = true;
        } else {
            alert("vui long nhap lai");
        }

    } while (!checkLevel);

    do {
        emp.setLocationEmployee(prompt("Enter Location Employee(Le Tan,Phuc Vu,Giam Sat,Giam Doc) : "));
        if (validateLocationEmployee.test(emp.getLocationEmployee().toLowerCase().replace(/ /g, ''))) {
            checkLocation = true;
        } else {
            alert("vui long nhap lai");
        }

    } while (!checkLocation);

    do {
        emp.setSalaryEmployee(prompt("Enter Salary Employee: "));
        if (validateSalary.test(emp.getSalaryEmployee())) {
            checkSalary = true;
        } else {
            alert("vui long nhap lai");
        }

    } while (!checkSalary);

    do {
        emp.setWorkEmployee(prompt("Enter Work Employee(Manager,Sale,Marketing): "));
        if (validateWorkEmployee.test(emp.getWorkEmployee().toLowerCase().replace(/ /g, ''))) {
            checkWork = true;
        } else {
            alert("vui long nhap lai");
        }

    } while (!checkWork);


    listEmployee.push(emp);
    displayMainMenu();

}

function displayEmployee() {
    let result = "";
    for (let i = 0; i < listEmployee.length; i++) {
        result += "\n" + (i + 1) + ". " + "Name: " + listEmployee[i].getNameEmployee() +
            "; ID Card" + listEmployee[i].getIdCardEmployee();
    }
    result += "\n" + (listEmployee.length + 1) + ".Back to menu";
    let chooseDisplayInfoEmployee = prompt(result);

    arrCheck = [];
    for (let i = 1; i < listEmployee.length + 2; i++) {
        arrCheck.push(i);
    }
    if (arrCheck.indexOf(parseInt(chooseDisplayInfoEmployee)) == -1) {
        alert("vui long nhap lai");
        displayEmployee()
    } else {
        if (chooseDisplayInfoEmployee.toString() !== (listEmployee.length + 1).toString()) { //k chon back
            displayInformationEmployee(Number.parseInt(chooseDisplayInfoEmployee) - 1);
        } else {
            displayMainMenu();
        }

    }



}

function displayInformationEmployee(index) {
    alert("Information of employee : " +
        "\nName : " + listEmployee[index].getNameEmployee() +
        "\nPhone Number Card : " + listEmployee[index].getPhoneNumberEmployee() +
        "\nID Card : " + listEmployee[index].getIdCardEmployee() +
        "\nBirthday : " + listEmployee[index].getBirthdayEmployee() +
        "\nEmail : " + listEmployee[index].getEmailEmployee() +
        "\nLevel Employee : " + listEmployee[index].getLevelEmployee() +
        "\nLocation Employee :" + listEmployee[index].getLocationEmployee() +
        "\nSalary : " + listEmployee[index].getSalaryEmployee() +
        "\nWork Employee : " + listEmployee[index].getWorkEmployee() +
        "\nTotal Salary : " + listEmployee[index].totalSalaryEmployee() +
        "\nEnter to exit."
    );
    displayMainMenu();
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
        if (validateAddressCustomer.test(cus.getAddressCustomer().toLowerCase().replace(/ /g, ''))) {
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

    arrCheck = [];
    for (let i = 1; i < listCustomers.length + 2; i++) {
        arrCheck.push(i);
    }
    if (arrCheck.indexOf(parseInt(chooseDisplayInfo)) == -1) {
        alert("vui long nhap lai");
        displayCustomers()
    } else {
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
}

function displayInformationCustomer(index) {
    if (checkEditCustomer) {
        let chooseInfoEdit = prompt(
            "1.Name : " + listCustomers[index].getNameCustomer() +
            "\n2.ID Card : " + listCustomers[index].getIdCard() +
            "\n3.Birthday : " + listCustomers[index].getBirthdayCustomer() +
            "\n4.Email :" + listCustomers[index].getEmailCustomer() +
            "\n5.Address : " + listCustomers[index].getAddressCustomer() +
            "\n6.Type Customer : " + listCustomers[index].getTypeCustomer() +
            "\n7.Discount : " + listCustomers[index].getDiscount() +
            "\n8.Number Of Accomanying : " + listCustomers[index].getNumberOfAccompanying() +
            "\n9.Type Room : " + listCustomers[index].getTypeRoom() +
            "\n10.Rent Day : " + listCustomers[index].getRentDays() +
            "\n11.Type Service : " + listCustomers[index].getTypeService() +
            "\n12.Back. ");

        let arrCheck = [1,2,3,4,5,6,7,8,9,10,11,12];

        if (arrCheck.indexOf(parseInt(chooseInfoEdit)) == -1) {
            alert("vui long nhap lai");
            displayCustomers();
        } else {
            if (chooseInfoEdit.toString() !== "12") { //ko chon back
                editInformationCustomer(index, Number.parseInt(chooseInfoEdit) - 1); //

            } else {
                checkEditCustomer = false;
                displayCustomers();
            }
        }

    } else {
        alert("Information of customers : " +
            "\nName : " + listCustomers[index].getNameCustomer() +
            "\nID Card : " + listCustomers[index].getIdCard() +
            "\nBirthday : " + listCustomers[index].getBirthdayCustomer() +
            "\nEmail : " + listCustomers[index].getEmailCustomer() +
            "\nAddress : " + listCustomers[index].getAddressCustomer() +
            "\nType Customer : " + listCustomers[index].getTypeCustomer() +
            "\nDiscount : " + listCustomers[index].getDiscount() +
            "\nNumber Of Accompanying : " + listCustomers[index].getNumberOfAccompanying() +
            "\nType Room : " + listCustomers[index].getTypeRoom() +
            "\nRent Day : " + listCustomers[index].getRentDays() +
            "\nType Service : " + listCustomers[index].getTypeService()
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
        ",ID card " + listCustomers[index].getIdCard() +
        "\n1.Yes\n2.No"
    );
    if (chooseConfirm === "1") {
        listCustomers.splice(index, 1);
        alert("Delete complete");
    }
    checkDeleteCustomer = false;
    displayMainMenu();

}

function chooseDisplayTotalPay() {
    checkDisplayTotalPay = true;
    displayCustomers();
}

function displayTotalPay(index) {
    alert("Tổng tiền của " + listCustomers[index].getNameCustomer() + " là : " + listCustomers[index].totalPays() + " lúa Trump");
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



// cus.setBirthdayCustomer(checkValid("Birthday",validateBirthday));
// cus.setEmailCustomer(checkValid("Email",validateEmail));
// //function validation
// function checkValid(property,funcValid) {
//     while (true) {
//         let val = prompt("Enter " + property);
//         if (funcValid.test(val)){
//             return val;
//         }
//         alert(property + " is invalid. Please try again!!!");
//     }
// }