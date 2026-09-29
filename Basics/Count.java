import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n ");
        int n = input.nextInt();
        int count = 0;
        System.out.println("enter the the number that u want to check for no of occurences");
        int value = input.nextInt();

        while(n > 0) {
            int rem = n % 10;
            if (rem == value) {
                count++;
            }
            n = n / 10;             
        }
        System.out.println(count);    
    }
}