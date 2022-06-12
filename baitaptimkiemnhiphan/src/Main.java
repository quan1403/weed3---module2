import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = {1, 2, 4, 15, 6};
        System.out.println("nhập 1 số");
        int a = sc.nextInt();
        System.out.println("Nhap vi tri");
        int b= sc.nextInt();
        int[] arr = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            if (i < b) {
                arr[i] = array[i];

            } else arr[i + 1] = array[i];
            arr[b] = a;


        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }

    }


}
