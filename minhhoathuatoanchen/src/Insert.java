
public class Insert {

    public static void insertionSort(int[] array){
        int pos, x;
        for(int i = 1; i < array.length; i++){ //đoạn array[0] đã sắp xếp
            x = array[i];
            pos = i;
            while(pos > 0 && x < array[pos-1]){
                array[pos] = array[pos-1]; // đổi chỗ
                pos--;
            }
            array[pos] = x;
        }
    }

    public static void main(String[] args) {
        int [] list = {1,12,6,5,2,4};
        System.out.println("mảng ban đầu");
        for (int a :list
             ) {
            System.out.println(a);
        }

       insertionSort(list);
        System.out.println("mảng sắp xếp");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);


        }




    }


}

