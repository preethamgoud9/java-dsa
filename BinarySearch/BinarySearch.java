import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {3,7,9,11,13,16,17,19,21,22,23,27,29,42,47,67};
        Scanner input = new Scanner(System.in);
        System.out.println("enter the target element to search for");
        System.out.println(binarySearch(arr,input.nextInt()));
        input.close();
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length;
        int mid;
        while(start < end) {
            mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid;
            } else {
                return mid;
            }
        }
        return -1;
    }
}