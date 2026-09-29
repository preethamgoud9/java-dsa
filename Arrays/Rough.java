public class Rough {
    public static void main(String[] args) {
        int[] nums = {70,80,60};
        System.out.println(maxMarks(nums));
    }

    static int maxMarks(int[] arr) {
        int maxMarks = arr[0];
        for (int i = 0;i < arr.length;i++) {
            if (arr[i] > maxMarks) {
                maxMarks = arr[i];
            }
        }
        return maxMarks;
    }
}