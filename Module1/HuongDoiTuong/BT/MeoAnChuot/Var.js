let Mouse = function (nameMouse, weightsMouse, speedMouse, statusMouse) {

    this.nameMouse = nameMouse;
    this.weightsMouse = weightsMouse;
    this.speedMouse = speedMouse;
    this.statusMouse = statusMouse;


    this.setNameMouse = function (nameMouse) {
        this.nameMouse = nameMouse;
    };
    this.getNameMouse = function () {
        return this.nameMouse;
    };

    this.setWeightsMouse = function (weightsMouse) {
        this.weightsMouse = weightsMouse;
    };
    this.getWeightsMouse = function () {
        return this.weightsMouse;
    };

    this.setSpeedMouse = function (speedMouse) {
        this.speedMouse = speedMouse;
    };
    this.getSpeedMouse = function () {
        return this.speedMouse;
    };

    this.setStatusMouse = function (statusMouse) {
        this.statusMouse = statusMouse;
    };
    this.getStatusMouse = function () {
        return this.statusMouse;
    };


    this.soundMouse = function () {
        if (this.getStatusMouse() == true) {
            console.log("chit chit");
        } else console.log("et et");

    };
};


let Cat = function (nameCat, weightsCat, speedCat) {

    this.nameCat = nameCat;
    this.weightsCat = weightsCat;
    this.speedCat = speedCat;



    this.setNameCat = function (nameCat) {
        this.nameCat = nameCat;
    };
    this.getNameCat = function () {
        return this.nameCat;
    };

    this.setWeightsCat = function (weightsCat) {
        this.weightsCat = weightsCat;
    };
    this.getWeightsCat = function () {
        return this.weightsCat;
    };

    this.setSpeedCat = function (speedCat) {
        this.speedCat = speedCat;
    };
    this.getSpeedCat = function () {
        return this.speedCat;
    };

    this.soundCat = function () {
        console.log("meo meo");
    };


    this.catchMouse = function (speedMouse) {
        if (this.getSpeedCat() >= speedMouse) {
            return false;
        } else return true;
    };


    this.eatMouse = function (weightsMouse,statusMouse) {
        if (statusMouse == false) {
            this.weightsCat = this.weightsCat + weightsMouse;
        }
    }


};

//
// let mouse1 = new Mouse("Jerry1",20,20,true);
// let mouse2 = new Mouse("Jerry2",25,25,true);
// let mouse3 = new Mouse("Jerry3",30,30,true);
// let mouse4 = new Mouse("Jerry4",10,50,true);
// let cat1 = new Cat("tom",30,30);
//
// mouse1.setStatusMouse(cat1.catchMouse(mouse1.getSpeedMouse()));
// mouse2.setStatusMouse(cat1.catchMouse(mouse2.getSpeedMouse()));
// mouse3.setStatusMouse(cat1.catchMouse(mouse3.getSpeedMouse()));
// mouse4.setStatusMouse(cat1.catchMouse(mouse4.getSpeedMouse()));
//
//
// cat1.eatMouse(mouse1.getWeightsMouse(),mouse1.statusMouse);
// cat1.eatMouse(mouse2.getWeightsMouse(),mouse2.statusMouse);
// cat1.eatMouse(mouse3.getWeightsMouse(),mouse3.statusMouse);
// cat1.eatMouse(mouse4.getWeightsMouse(),mouse4.statusMouse);
//
//
// console.log(mouse1);
// console.log(mouse2);
// console.log(mouse3);
// console.log(mouse4);
// console.log(cat1);
// console.log(cat1.soundCat());
// console.log(mouse1.soundMouse());
// console.log(mouse4.soundMouse());
