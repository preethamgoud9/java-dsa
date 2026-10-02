import java.util.Scanner;

public class CeilingElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {3,7,9,11,13,16,17,19,21,22,23,27,29,42,47,67};
        System.out.println("Enter the value of the element to search for");
        System.out.println(ceiling(arr,input.nextInt()));
    }

    static int ceiling(int[] arr,int target) {
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
        if (target < arr[arr.length - 1]) {
            return arr[start];
        }
        else {
            return -1;
        }
    }

}