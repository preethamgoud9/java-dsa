public class MaxElement {
    public static void main(String[] args) {
        int[] arr = {11,17,29,21,9,31};
        System.out.println(maxRange(arr,0,4));
    }

    static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1;i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; 
           }
        }
        return max;
    }

    static int maxRange(int[] arr, int start, int end) {
        int maxValue = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

}