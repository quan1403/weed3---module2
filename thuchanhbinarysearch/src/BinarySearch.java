public class BinarySearch {
    static int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
    static int binarySearch(int[] list, int key) {
        int low = 0;
        int hight = list.length -1;
        while(hight >= low){
            int mid = (hight+low)/2;
            if (key < list[mid] ){
                hight = mid -1;
            }else if(key > list[mid]){
                low = mid +1;
            }else if (key == list[mid]){
                return mid;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(list,2));
        System.out.println(binarySearch(list,10));
        System.out.println(binarySearch(list,80));
    }
}
