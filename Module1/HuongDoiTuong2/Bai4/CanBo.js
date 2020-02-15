var CanBo = function () {
    this.setMaCanBo = function (maCanBo) {
        this.maCanBo = maCanBo;
    };
    this.getMaCanBo = function () {
        return this.maCanBo;
    };

    this.setHoTen = function (hoTen) {
        this.hoTen = hoTen;
    };
    this.getHoTen = function () {
        return this.hoTen;
    };

    this.setGioiTinh = function (gioiTinh) {
        this.gioiTinh = gioiTinh;
    };
    this.getGioiTinh = function () {
        return this.gioiTinh;
    };

    this.setQueQuan = function (queQuan) {
        this.queQuan = queQuan;
    };
    this.getQueQuan = function () {
        return this.queQuan;
    };

    this.setNamSinh = function (namSinh) {
        this.namSinh = namSinh;
    };
    this.getNamSinh = function () {
        return this.namSinh;
    };

    this.setChuyenMon = function (chuyenMon) {
        this.chuyenMon = chuyenMon;
    };
    this.getChuyenMon = function () {
        return this.chuyenMon;
    };

    this.setTrinhDo = function (trinhDo) {
        this.trinhDo = trinhDo;
    };
    this.getTrinhDo = function () {
        return this.trinhDo;
    };

    this.setHeSoLuong = function (heSoLuong) {
        this.heSoLuong = heSoLuong;
    };
    this.getHeSoLuong = function () {
        return this.heSoLuong;
    };

    this.setPhuCap = function (phuCap) {
        this.phuCap = phuCap;
    };
    this.getPhuCap = function () {
        return this.phuCap;
    };

    this.thucLinh = function () {
        return ((this.getHeSoLuong() * 1 + this.getPhuCap() * 1) * 450000);
    }
};

