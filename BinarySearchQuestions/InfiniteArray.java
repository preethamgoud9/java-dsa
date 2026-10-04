public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3,7,9,11,13,16,17,19,21,22,23,27,29,42,47,67};
        System.out.println(ans(arr,21));
    }

    static int ans(int[] arr, int target) {
        int start = 0;
        int end = 1;

        while(target > arr[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return binarySearch(arr,target,start,end);

    }


    static int binarySearch(int[] arr,int target,int start,int end) {
        int mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (target > arr[mid]) {
              start = mid + 1;  
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}