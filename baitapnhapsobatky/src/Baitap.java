import java.util.Scanner;

public class Baitap {
    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 7};
        System.out.println("nhập 1 số ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean check = false;

        for (int i = 0; i < arr.length; i++) {
            if (n == arr[i]) {
                check = true;
            }
        }
        System.out.println(check);
    }
    }



