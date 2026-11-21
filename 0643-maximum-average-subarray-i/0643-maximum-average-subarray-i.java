class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int l =0;
        int r = k - 1;
        double avg = 0;
        double sum = 0;

        for (int i = 0;i<k;i++) {
            sum = sum + nums[i];
        }
        avg = sum / k;

        while(r < n - 1) {
            sum = sum - nums[l];
            l++;
            
            r++;
            sum = sum + nums[r];
            avg = Math.max(avg,sum/k);
        }
        return avg;
    }
}