let listCanBo = [];


function displayMainMenu() {
    let choose = prompt("1. Them can bo"
        + "\n 2. Hien thi can bo"
        + "\n 3. Danh sach can bo den thoi diem nang luong"
        + "\n 4. Dem so can bo nu trong co quan"
        + "\n 5. Hien thi luong can bo"
        + "\n 6. Tong thu nhap can bo toan danh sach"
        + "\n 7. Liet ke cac can bo co chuyen mon CNTT"
        + "\n 8. Exit");

    switch (choose) {
        case "1":
            addNewCanBo();
            break;
        case "2":
            displayCanBo();
            break;
        case "3":
            displayNangLuong();
        case "4":
            demCanBoNu();
        case "5":
            displayLuongCanBo();
        case "6":
            displayTongLuong();
        case "7":
            displayCanBoCNTT();
        case 8:
            return;
        default:
            alert("Faill");
            displayMainMenu();
    }
}


function addNewCanBo() {
    let canbo = new CanBo();
    canbo.setMaCanBo(prompt("Nhap ma can bo"));
    canbo.setHoTen(prompt("nhap ten can bo"));
    canbo.setGioiTinh(prompt("nhap gioi tinh (Nam - Nu)"));
    canbo.setQueQuan(prompt("nhap que quan"));
    canbo.setNamSinh(prompt("nhap nam sinh"));
    canbo.setChuyenMon(prompt("nhap chuyen mon (CNTT)"));
    canbo.setTrinhDo(prompt("nhap trinh do"));
    canbo.setPhuCap(prompt("nhap phu cap (so)"));
    canbo.setHeSoLuong(prompt("nhap he so luong (so)"));


    listCanBo.push(canbo);
    displayMainMenu();
}

function displayCanBo() {
    let result = "";
    for (let i = 0; i < listCanBo.length; i++) {
        result += "\n" + (i + 1) + ". " + "Ten : " + listCanBo[i].getHoTen() +
            "; Ma can bo : " + listCanBo[i].getMaCanBo();
    }
    result += "\n" + (listCanBo.length + 1) + ". Enter de tro ve";
    alert(result);

    displayMainMenu();
}

function displayNangLuong() {
    let result = "";
    for (let i = 0; i < listCanBo.length; i++) {
        let currentYear = new Date().getFullYear();
        if ((currentYear - listCanBo[i].getNamSinh()) > 50) {
            result += "\n" + (i + 1) + ". " + "Ten : " + listCanBo[i].getHoTen() +
                "; Ma can bo : " + listCanBo[i].getMaCanBo();
        }
    }

    alert(result);
    displayMainMenu();

}

function demCanBoNu() {
    let count = 0;
    for (let i = 0; i < listCanBo.length; i++) {
        if (listCanBo[i].getGioiTinh().toLowerCase().replace(/ /g, "") == "nu") {
            count++
        }
    }
    alert("co " + count + " can bo gioi tinh nu");
    displayMainMenu();
}

function displayLuongCanBo() {
    let result = "";
    for (let i = 0; i < listCanBo.length; i++) {
        result += "\n" + (i + 1) + ". " + "Ten : " + listCanBo[i].getHoTen() +
            "; Luong can bo : " + listCanBo[i].thucLinh();

    }
    alert(result);
    displayMainMenu();

}

function displayTongLuong() {
    let result = 0;
    for (let i = 0; i < listCanBo.length; i++) {
        result += listCanBo[i].thucLinh();
    }

    alert(result);
    displayMainMenu();
}

function displayCanBoCNTT() {
    let result = "Cac can bo chuyen mon CNTT la : ";
    for (let i = 0; i < listCanBo.length; i++) {
        if (listCanBo[i].getChuyenMon().toLowerCase().replace(/ /g, "") == "cntt") {

            result += "\n" + (i + 1) + ". " + "Ten : " + listCanBo[i].getHoTen() +
                "; Ma can bo : " + listCanBo[i].getMaCanBo();
        }
    }
    alert(result);


    displayMainMenu();
}

displayMainMenu();