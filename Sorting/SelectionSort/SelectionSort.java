import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3,2,1,5,4,8,7,5,4,3,1,0};
        Selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Selection(int[] arr) {
       int n = arr.length;

        for (int i = 0; i < n - 1;i++) {
            int largest = 0;
            for (int j = 0; j < n - i;j++) {
                if (arr[j] > arr[largest]) {
                    largest = j;
                }
            }
            int temp = arr[largest];
            arr[largest] = arr[n - i - 1];
            arr[n - i -1] = temp;
        }
    }
}