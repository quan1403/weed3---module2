import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer>arrayList=new ArrayList<Integer>();
        for (int i = 0; i <5 ; i++) {
            System.out.println("nhập từ bàn phím");
            int b = Integer.parseInt(sc.nextLine());
            arrayList.add(b);
        }

        System.out.println(a(arrayList));

    }

    public static int a (List < Integer > list) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 5 == 0) {
                count++;
            }
        }
        return count;

    }
}


