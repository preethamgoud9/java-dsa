import java.util.Scanner;

public class FloorElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {3,7,9,11,13,16,17,19,21,22,23,27,29,42,47,67};
        System.out.println("Enter the value of the element to search for");
        System.out.println(floor(arr,input.nextInt()));
    }

    static int floor(int[] arr,int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid;
        while(start <= end) {
            mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if(target > arr[mid]) {
                start = mid + 1;
            } else {
                return target;
            }
        }
        if (target > arr[0]) {
            return arr[end];
        }
        else {
            return -1;
        }
    }

}