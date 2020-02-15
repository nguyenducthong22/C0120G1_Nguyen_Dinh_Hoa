let Customer = function () {

    this.setNameCustomer = function (nameCustomer) {
        this.nameCustomer = nameCustomer;
    };
    this.getNameCustomer = function () {
        return this.nameCustomer;
    };

    this.setIdCard = function (idCard) {
        this.idCard = idCard;
    };
    this.getIdCard = function () {
        return this.idCard;
    };

    this.setBirthdayCustomer = function (birthdayCustomer) {
        this.birthdayCustomer = birthdayCustomer;
    };
    this.getBirthdayCustomer = function () {
        return this.birthdayCustomer;
    };

    this.setEmailCustomer = function (emailCustomer) {
        this.emailCustomer = emailCustomer;
    };
    this.getEmailCustomer = function () {
        return this.emailCustomer;
    };

    this.setAddressCustomer = function (addressCustomer) {
        this.addressCustomer = addressCustomer;
    };
    this.getAddressCustomer = function () {
        return this.addressCustomer;
    };

    this.setTypeCustomer = function (typeCustomer) {
        this.typeCustomer = typeCustomer;
    };
    this.getTypeCustomer = function () {
        return this.typeCustomer;
    };
    this.setDiscount = function (discount) {
        this.discount = discount;
    };
    this.getDiscount = function () {
        return this.discount;
    };

    this.setNumberOfAccompanying = function (numberOfAccompanying) {
        this.numberOfAccompanying = numberOfAccompanying;
    };
    this.getNumberOfAccompanying = function () {
        return this.numberOfAccompanying;
    };

    this.setTypeRoom = function (typeRoom) {
        this.typeRoom = typeRoom;
    };
    this.getTypeRoom = function () {
        return this.typeRoom;
    };

    this.setRentDays = function (rentDays) {
        this.rentDays = rentDays;
    };
    this.getRentDays = function () {
        return this.rentDays;
    };

    this.setTypeService = function (typeService) {
        this.typeService = typeService;
    };
    this.getTypeService = function () {
        return this.typeService;
    };

    // this.accompaniedService = function () {
    //     let accompaniedService = 0;
    //
    // };


    this.totalPays = function () {
        let moneyPerDays = 0;
        if (this.getTypeService().trim().toLowerCase() === "villa") {
            moneyPerDays = 500;
        } else if (this.getTypeService().trim().toLowerCase() === "house") {
            moneyPerDays = 300;
        } else if (this.getTypeService().trim().toLowerCase() === "room") {
            moneyPerDays = 100;
        }

        let result = 0;

        result = moneyPerDays * parseFloat(this.getRentDays()) * (1 - parseFloat(this.getDiscount()) / 100);

        if (this.getAddressCustomer().toLowerCase().replace(/ /g,"")  === "danang") {
            result -= 20;
        } else if (this.getAddressCustomer().toLowerCase().replace(/ /g,"")  === "hue") {
            result -= 10;
        } else if (this.getAddressCustomer().toLowerCase().replace(/ /g,"")  === "quangnam") {
            result -= 5;
        }

        if (parseInt(this.getRentDays()) >= 7) {
            result -= 30;
        } else if (parseInt(this.getRentDays()) >= 5) {
            result -= 20;
        } else if (parseInt(this.getRentDays()) >= 2) {
            result -= 10;
        }

        if (this.getTypeCustomer().trim().toLowerCase() === "diamond") {
            result -= 15;
        } else if (this.getTypeCustomer().trim().toLowerCase() === "platinum") {
            result -= 10;
        } else if (this.getTypeCustomer().trim().toLowerCase() === "gold") {
            result -= 5;
        } else if (this.getTypeCustomer().trim().toLowerCase() === "silver") {
            result -= 2;
        }

        let currentYear = new Date().getFullYear();
        let birthday = new Date(this.getBirthdayCustomer()).getFullYear();
        let ageCustomer = currentYear - birthday;

        if (ageCustomer >= 30 && this.getAddressCustomer().toLowerCase().replace(/ /,'') === "danang") {
            result -= 2;
        } else if (ageCustomer >= 20 && this.getAddressCustomer().toLowerCase().replace(/ /,"") === "danang") {
            result -= 1;
        }

        return result;


    }


};