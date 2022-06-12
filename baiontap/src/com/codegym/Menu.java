package com.codegym;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("1.Tạo Phòng Mới");
        System.out.println("2.Tạo Khách Mới");
        System.out.println("3.Hiển Thị Các Phòng");
        System.out.println("4.Hiển Thị Khách Hàng");
        System.out.println("5.Tìm Kiếm Khách Hàng");
        int choice = sc.nextInt();

        Hotel hotel;
        ArrayList<Hotel>arrHoTel = new ArrayList<>();
    while (choice<0){
        System.out.println("Nhập Lại");
    }
        switch (choice){
            case 1:
                System.out.println("1.Chọn Phòng Vip");
                System.out.println("2.Chọn Phòng Normal");
                break;
            case 2:


                System.out.println("Nhập số lượng khách trọ:");
                int n = Integer.parseInt(sc.nextLine());
                for (int i = 0; i < n; i++) {
                    hotel = new Hotel();
                    System.out.println("Nhập thông tin khách thứ "+(i+1)+":");
                    hotel.nhapThongTinCanQl();
                    arrHoTel.add(hotel);
                }
                break;
            case 3:

            case 4:
                for (int i = 0; arrHoTel.size() > i; i++) {
                    System.out.println("Thông tin khách hàng"+(i+1)+":");
                    arrHoTel.get(i).hienThiThongTinCanQL();
                }
                break;
            case 5:
                System.out.println("Nhập tên khách hàng trả phòng:");
                String search = sc.nextLine();
                for (int i = 0; i < arrHoTel.size(); i++) {
                    if (arrHoTel.get(i).getKhach().getName().equalsIgnoreCase(search)){
                        System.out.println("số tiền phòng = "+ arrHoTel.get(i).TinhTien());
                    }
                }
                break;


        }
    }






}
