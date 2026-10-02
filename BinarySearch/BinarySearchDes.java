import java.util.Scanner;

public class BinarySearchDes {
    public static void main(String[] args) {
        int[] arr = {67,47,42,29,27,23,22,21,19,17,16,13,11,9,7,3};
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
            if (target < arr[mid]) {
                start = mid + 1;
            } else if (target > arr[mid]) {
                end = mid;
            } else {
                return mid;
            }
        }
        return -1;
    }
}