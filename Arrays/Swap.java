public class Swap {
    public static void main(String[] args) {
        int[] arr = {29,17,21,9,11};
        swap(arr,0,4);
        for (int i = 0; i < arr.length; i++ ) {
            System.out.println(arr[i]);
        }
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}