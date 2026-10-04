public class PeakIndexMountainArray {
    public static void main(String[] args) {
        int[] arr =  {3,7,9,11,13,16,17,19,21,22,23,27,29,42,47,67,41,39,24,20,18,8,1};
        System.out.println(PeakIndexInMountainArray(arr));
    }

    static int PeakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid  = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
    
}