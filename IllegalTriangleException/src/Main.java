import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IllegalTriangleCheck check = new IllegalTriangleCheck();
        try {
            System.out.println("Nhập cạnh a,b,c :");
            System.out.println("Giá trị của a :");
            int a = sc.nextInt();
            System.out.println("Giá trị của b :");
            int b = sc.nextInt();
            System.out.println("Giá trị của c :");
            int c = sc.nextInt();

            try {
                check.checkIllegalTriangle(a,b,c);
            }catch (IllegalTriangleException ex){
                System.out.println(ex.getMessage());
            }
        }

        catch (Exception e){
            System.out.println("Nhập giá trị không đúng");
        }
        sc.close();


    }

    public static class IllegalTriangleException extends Exception {
        public IllegalTriangleException (String str){
            super(str);
        }
    }
}




