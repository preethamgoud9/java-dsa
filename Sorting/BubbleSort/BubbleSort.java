public class BubbleSort {

    // we just compare the adjacent element and swap them in process we always get the last element sorted
    public static void main(String[] args) {
        int[] arr = {3,2,1,5,4,8,7,5,4,3,1,0};
        int n = arr.length;

        for(int i = 0;i < n;i++) {
            boolean isSwapped = false;
            for (int j = 0;j < n - 1 - i;j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped) {
                break;
            }
        }
        for (int i = 0; i < n;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}