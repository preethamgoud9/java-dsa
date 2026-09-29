import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(10);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
    }
}