
public class Findmin {
    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);
        int[] nums = {21,90,87,67,69,47,42,29,21,13,16,5,17,11,200,1091,712,13,31};
        System.out.println(minimum(nums));
    }

    static int minimum(int[] arr) {
        int min = arr[0];
        for(int i = 0;i < arr.length;i++) {
            if (arr[i] < min) {
                min = arr[i];
            } 
        }
        return min;
    }
}