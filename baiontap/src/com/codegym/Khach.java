package com.codegym;

import java.util.Scanner;

public class Khach {
    private String Name;
    private String NgaySinh;
    private int CMT;

    public Khach() {
    }

    public Khach(String name, String ngaySinh, int CMT) {
        Name = name;
        NgaySinh = ngaySinh;
        this.CMT = CMT;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        NgaySinh = ngaySinh;
    }

    public int getCMT() {
        return CMT;
    }

    public void setCMT(int CMT) {
        this.CMT = CMT;
    }
    public void nhapThongTinKhach(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ tên khách hàng");
        Name = sc.next();
        System.out.println("Nhập Ngày Sinh");
        NgaySinh = sc.next();
        System.out.println("Nhập CMT");
        CMT = Integer.parseInt(sc.next());

    }
    public void hienThiThongTinKhach(){
        System.out.println("Họ và tên Khách:"+Name);
        System.out.println("Ngày Sinh:"+NgaySinh);
        System.out.println("CMT:"+CMT);
    }
}
