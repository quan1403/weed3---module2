import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class QLTV  {
    Scanner sc = new Scanner(System.in);
    ArrayList<Library> arrayList = new ArrayList<>();
    public void menu(){
        System.out.println("Menu");
        System.out.println("1.Nhập thông tin sinh viên mượn sách");
        System.out.println("2.Hiển thị thông tin sinh viên");
        System.out.println("3.In ra danh sách sv , tên sách mượn cần trà cuối tháng");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice){
            case 1:
                creat();
                break;
            case 2:
                show();
                break;
            case 3:


        }
    }

    public void creat(){
        while (true){
            try {
                System.out.println("Nhập tên sv mượn sách :");
               String name = sc.nextLine();
                System.out.println("Nhập mã sv:");
                int MSV = Integer.parseInt(sc.nextLine());
                System.out.println("Nhập ngày sinh:");
                int ngaysinh = Integer.parseInt(sc.nextLine());
                System.out.println("Nhập tháng sinh");
                int thangsinh = Integer.parseInt(sc.nextLine());
                System.out.println("Nhập năm sinh");
                int namsinh = Integer.parseInt(sc.nextLine());
                System.out.println("Nhập tên lớp:");
                String lop = sc.nextLine();
                System.out.println("Nhập số phiếu mượn:");
                int sophieumuon = Integer.parseInt(sc.nextLine());
                System.out.println("Nhập ngày mượn:");
                int ngaymuon = Integer.parseInt(sc.nextLine());
                System.out.println("Nhập tháng mượn");
                int thangmuon = Integer.parseInt(sc.nextLine());
                System.out.println("Nhập ngày trà");
                int ngaytra = Integer.parseInt(sc.nextLine());
                System.out.println("Nhập tháng trả : ");
                int thangtra = Integer.parseInt(sc.nextLine());
                System.out.println("Nhập số hiệu sách:");
                String sohieusacsh = sc.nextLine();

                Library student = new Library( name,  MSV,ngaysinh,thangsinh,namsinh,  sophieumuon,  ngaymuon,thangmuon, ngaytra,thangtra,sohieusacsh );
                arrayList.add(student);
                break;
            }
            catch (Exception e){
                System.out.println("Lỗi rồi");
            }

        }

    }
    public void show(){
        for (Library a:arrayList
             ) {
            System.out.println(a);

        }

    }







}
