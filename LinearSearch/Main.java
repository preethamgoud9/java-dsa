import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {18,12,9,14,77,50};
        Scanner input = new Scanner(System.in);
        System.out.println("enter the value of target element to search");
        System.out.println(linearsearch(arr,input.nextInt()));
    }

    static int linearsearch(int[] arr,int target) {
        for (int index = 0;index < arr.length;index++) {
            if (target == arr[index]) {
                return index;
            }
        }
        return -1;
    }
}