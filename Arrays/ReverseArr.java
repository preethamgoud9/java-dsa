public class ReverseArr {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        reverse(arr);
        for (int i = 0;i < arr.length;i++) {
            System.out.println(arr[i]);
        }
    }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while(start < end) {
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}