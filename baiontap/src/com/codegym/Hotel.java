package com.codegym;

import java.util.Scanner;

public class Hotel {
    private String LoaiPhong;
    private double Price;
    private int SoNgayTro;
    private Khach khach;


    public Hotel() {
    }

    public Hotel(String loaiPhong, double price, int soNgayTro, Khach khach) {
        LoaiPhong = loaiPhong;
        Price = price;
        SoNgayTro = soNgayTro;
        this.khach = khach;

    }

    public String getLoaiPhong() {
        return LoaiPhong;
    }

    public void setLoaiPhong(String loaiPhong) {
        LoaiPhong = loaiPhong;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
       this.Price = price;
    }

    

    public Khach getKhach() {
        return khach;
    }

    public void setKhach(Khach khach) {
        this.khach = khach;
    }

    public int getSoNgayTro() {
        return SoNgayTro;
    }

    public void setSoNgayTro(int soNgayTro) {
        SoNgayTro = soNgayTro;
    }

    public void nhapThongTinCanQl() {
        Scanner scanner = new Scanner(System.in);

        // nhập thông tin khách trọ
        khach = new Khach();
        khach.nhapThongTinKhach();

        System.out.print("Nhập số ngày trọ: ");
       SoNgayTro = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập loại phòng: ");
        LoaiPhong = scanner.nextLine();
        System.out.print("Nhập giá phòng: ");
       Price = scanner.nextDouble();
    }

    public void hienThiThongTinCanQL (){

        khach.hienThiThongTinKhach();
        System.out.println("Số Ngày Trọ:"+SoNgayTro);
        System.out.println("Loại Phòng:"+LoaiPhong);
        System.out.println("Giá Phòng:"+Price);

    }
    public double TinhTien(){
        return SoNgayTro * Price;

    }
}
