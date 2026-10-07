public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[] nums = {7,8,9,1,2,3,4,5,6};
        int target = 2;
        System.out.println(search(nums,target));
        
    }

     static int search(int[] nums,int target)  {
        int pivot = FindPeak(nums);

        if (pivot == -1) {
            return BinarySearch(nums,target,0,nums.length -1);
        }
        if (target == nums[pivot]) {
            return pivot;
        }

        if (target >= nums[0]) {
            return BinarySearch(nums,target,0,pivot - 1);
        } else{
            return BinarySearch(nums,target,pivot + 1,nums.length-1);
        }
     }
     static int FindPeak(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid -1]) {
                return mid -1;
            }

            if (nums[start] > nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
        }

        static int BinarySearch(int[] arr,int target,int start,int end)
         {

            while(start <= end) {
                int mid = start + (end - start) / 2;

                if (target == arr[mid]) {
                    return mid;
                }

                if(target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            return -1;
        }
}

   