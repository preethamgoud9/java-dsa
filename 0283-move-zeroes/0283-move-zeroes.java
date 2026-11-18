class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int x = 0;
        for (int i = 0;i < n;i++) {
            if (nums[i] != 0) {
                arr[x] = nums[i];
                x++;
            }
        }
        for (int k = 0;k<x;k++) {
            nums[k] = arr[k];
        }
        for (int j = x;j<n;j++) {
            nums[j] = 0;
        }
    }
}