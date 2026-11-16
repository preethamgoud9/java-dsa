import java.util.HashSet;
import java.util.TreeSet;
class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        TreeSet<Integer> unique = new TreeSet<>();
        for (int i = 0;i < n;i++) {
            unique.add(nums[i]);
        }
        int j = 0;
        for (int num : unique) {
            nums[j] = num;
            j++;
        }  
           return j;
    }
}