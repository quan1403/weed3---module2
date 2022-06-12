public class Insert {
    public static void insertionSort(int[] array){
        int pos, x;
        for(int i = 1; i < array.length; i++){ //đoạn array[0] đã sắp xếp
            x = array[i];
            pos = i;
            while(pos > 0 && x < array[pos-1]){
                array[pos] = array[pos-1];

                pos--;
            }
            array[pos] = x;
        }
    }

    public static void main(String[] args) {
        int[]array = {3,6,5,9,1};
        System.out.println("hiển thị mảng");
        for (int a :array
             ) {
            System.out.println(a);

        }
        insertionSort(array);
        System.out.println("mảng đã sắp xếp");
        for (int b :array
             ) {
            System.out.println(b);

        }

        }


    }



