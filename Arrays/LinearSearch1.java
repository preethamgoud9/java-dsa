import java.util.Scanner;

public class LinearSearch1 {
    public static void main(String[] args) {
        int[] arr = {18,12,9,14,77,50};
        Scanner input = new Scanner(System.in);
        System.out.println("enter the value of target element to search");
        System.out.println(lsearch(arr,input.nextInt()));
        }

    static int lsearch(int[] arr,int target) {
        for(int i = 0;i < arr.length;i++) {
            if (target == arr[i]) {
                return i;
            } 
        }
        return -1;
    }
}