import java.util.Scanner;
import java.lang.Math;

public class Armstrong {
    public static void main(String[] args) {
        for(int i = 1;i<= 10000;i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

    static boolean isArmstrong(int n) {
        Scanner input = new Scanner(System.in);
        int num = n;
        int count_nums = n;
        int ans = 0;
        int count = 0;

        while (count_nums > 0) {
            int rem = count_nums % 10;
            count_nums = count_nums / 10;
            count++;
        }
        while (n > 0) {
            int rem = n % 10;
            ans += (int)(Math.pow(rem , count));
            n = n / 10;
        }
        return ans == num;
    }
} 