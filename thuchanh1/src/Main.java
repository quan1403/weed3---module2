import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.sql.Date;
import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);
    ArrayList<Student>arrayList = new ArrayList<>();
     public void Menu() {
         System.out.println("Menu");
         System.out.println("1.Nhập thông tin học sinh");
         System.out.println("2.Hiển thị thông tin");
         System.out.println("3.Hiển thị các hs 1985 ở Thái Nguyên");
         System.out.println("4.Hiển thị ra màn hình tất cả những hs lớp 10A1");
         System.out.println("5.Exit");

         int choise = Integer.parseInt(sc.nextLine());
         switch (choise){
             case 1:
                 creat();
                 break;
             case 2:
                 show();
                 break;
             case 3:
                 show1();
                 break;
             case 4:
                 show2();
                 break;
             case 5:
                 System.exit(0);
     }




    }
    public void creat() {
        while (true) {
            try {
                System.out.println("Nhập họ tên học sinh:");
                String name = sc.nextLine();
                System.out.println("Nhập ngày sinh");
                int ngay = Integer.parseInt(sc.nextLine());
                System.out.println("Nhap thang sinh");
                int thang = Integer.parseInt(sc.nextLine());
                System.out.println("Nhap nam sinh");
                int nam = Integer.parseInt(sc.nextLine());
                System.out.println("Nhập nơi ở:");
                String address = sc.nextLine();
                System.out.println("nhập lớp");
                String lop = sc.nextLine();
                System.out.println("Nhập khóa học:");
                String khoahoc = sc.nextLine();
                System.out.println("Nhập kỳ học :");
                int kyhoc = Integer.parseInt(sc.nextLine());

                Student student = new Student( lop,  khoahoc, kyhoc,  name, new Date(nam-1900, thang-1, ngay),  address);
                arrayList.add(student);
                break;
            } catch (Exception e) {
                System.out.println("Lỗi mẹ rồi");
            }
        }
    }
    public void show(){
        for (Student ele:arrayList
             ) {
            System.out.println(ele + " ");

        }


    }
    public void show1(){
//         ArrayList<Student> newarray = new ArrayList<>();
//        for (int i = 0; i < arrayList.size(); i++) {
//          if ( 85==arrayList.get(i).getBirthday().getYear() && (arrayList.get(i).getAddress()).equals("Thái Nguyên")){
//              newarray.add(arrayList.get(i));
//          }
//        }
//        for (Student x:newarray) {
//            System.out.println(x);
//        }
        for (int i = 0; i < arrayList.size(); i++) {
            if ( 85==arrayList.get(i).getBirthday().getYear() && (arrayList.get(i).getAddress()).equals("Thái Nguyên"))
            {
                System.out.println(arrayList.get(i).toString());
            }
        }
    }
    public void show2() {
        ArrayList<Student> arr = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getLop().equals("10A1")) {
                arr.add(arrayList.get(i));
            }
        }
            for (Student k : arr
            ) {
                System.out.println(k);

            }

    }
}
