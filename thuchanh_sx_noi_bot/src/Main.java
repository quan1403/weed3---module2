import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng");
        int size = sc.nextInt();
        int [] list  = new int[size];
        System.out.println("Enter"+list.length+"value");
        for (int i = 0; i < list.length ; i++) {
            list[i]=sc.nextInt();

        }
        System.out.println("Your input list");
        for (int i = 0; i < list.length ; i++) {
            System.out.println(list[i]+"\t");

        }
        System.out.println("\nBegin sort processing...");
        bubbleSortByStep(list);

    }
    public static void bubbleSortByStep(int[]list){
        boolean check = true;
        for (int k = 1; k < list.length && check; k++) {
            check = false;
            for (int i = 0; i < list.length - k ; i++) {
                if (list[i] > list[i + 1]) {
                    System.out.println("Swap" + list[i] + "with" + list[i + 1]);
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    check = true;
                }
            }
                if (check==false){
                    System.out.println("Mảng đã được sắp xếp");
                    break;
                }
                System.out.println();
                for (int j = 0; j < list.length ; j++) {
                    System.out.println(list[j]+"\t");

                }




            }

        }


        }



