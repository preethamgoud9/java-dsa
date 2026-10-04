public class Leetcode1095 {
    public static void main(String[] args) {
    int[] arr =  {3,7,9,11,13,16,17,19,21,22,23,27,29,42,47,67,41,39,24,21,18,8,1};
    System.out.println(search(arr,21));
    }

    static int search(int[] arr, int target) {
        int peak = PeakIndexInMountainArray(arr);
        int firstTry = OrderAgnosticBinarySearch(arr,target,0,peak);
        if (firstTry != -1) {
            return firstTry;
        } else {
            return OrderAgnosticBinarySearch(arr,target,peak,arr.length - 1);
        }
    }

    static int PeakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    static int OrderAgnosticBinarySearch(int[] arr,int target,int start , int end) {
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            }

            if (isAsc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        } return -1;
    } 
}