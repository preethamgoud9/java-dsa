import java.util.Scanner;

public class Searchinstring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = "preetham";
        System.out.println("enter the char u want to search");
        System.out.println(search(str,input.next().charAt(0)));
    }

    static int search(String str , char target) {
        if (str.length() == 0) {
            return -1;
        }

        for (int i = 0;i < str.length();i++) {
            if (target == str.charAt(i)) {
                return i;
            }
        }
        return -1;
    }
}