let listEmployee = [];
let validateEmail = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;


function displayMainMenu() {
    let choose = prompt(
        "1. Login" +
        "\n2. Register Employee" +
        "\n3. Exit");
    switch (choose) {
        case "1":
            loginEmployee();
            break;
        case "2":
            addNewEmployee();
            break;
        case "3":
            return;
        default:
            alert("Failed !!!! Try again");
            displayMainMenu();
            break;
    }
}

function addNewEmployee() {
    let employee = new Employee();
    let checkEmail = false;
    employee.setTenDangNhap(prompt("Nhập tên đăng nhập : "));
    employee.setTenNhanVien(prompt("Nhập tên nhân viên : "));
    employee.setMatKhau(prompt("Nhập mật khẩu : "));
    employee.setNgaySinh(prompt("Nhập ngày sinh : "));
    employee.setSoChungMinhNhanDan(prompt("Nhập số chứng minh nhân dân : "));
    employee.setGioiTinh(prompt("Nhập giới tính : "));
    employee.setDiaChi(prompt("Nhập địa chỉ : "));
    employee.setSoDienThoai(prompt("Nhập số điện thoại : "));

    do {
        employee.setEmail(prompt("Nhập Email : "));
        if (validateEmail.test(employee.getEmail())) {
            checkEmail = true;
        } else {
            alert("Vui lòng nhập email hợp lệ");
        }
    }
    while (!checkEmail);

    listEmployee.push(employee);
    alert("Register thành công");
    displayMainMenu();

}

function loginEmployee() {
    let flag = true;
    while (flag) {
        flag = true;
        let tenDangNhap;
        let matKhau;
        tenDangNhap = prompt("Nhập vào UserName");
        matKhau = prompt("Nhập vào mật khẩu");
        if (listEmployee.length == 0) {
            alert("Chưa có Employee nào");
            displayMainMenu();
        } else {
            for (let i = 0; i < listEmployee.length; i++) {
                if ((listEmployee[i].getTenDangNhap() == tenDangNhap) && (listEmployee[i].getMatKhau() == matKhau)) {
                    flag = false;
                    alert("Login thành công");
                    displayMainMenu();
                    break;
                } else if ((i==listEmployee.length-1)&&(listEmployee[i].getTenDangNhap() != tenDangNhap) && (listEmployee[i].getMatKhau() == matKhau)) {
                    alert("Sai tên đăng nhập");
                    continue;
                } else if ((i==listEmployee.length-1)&&(listEmployee[i].getTenDangNhap() == tenDangNhap) && (listEmployee[i].getMatKhau() != matKhau)) {
                    alert("Sai mật khẩu");
                    continue;
                } else if ((i==listEmployee.length-1)&&(listEmployee[i].getTenDangNhap() != tenDangNhap) && (listEmployee[i].getMatKhau() != matKhau)) {
                    alert("Vui lòng nhập lại");
                    continue;
                }
            }
            flag = true;
        }


    }


}


displayMainMenu();