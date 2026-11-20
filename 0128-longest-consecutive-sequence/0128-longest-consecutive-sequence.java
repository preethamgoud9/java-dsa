import java.util.HashSet;
class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        int longest = 1;
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        for (int current : set) {
            if (!set.contains(current - 1)) {
                int count = 1;
                while(set.contains(current + 1)) {
                    current++;
                    count++;
                }
                longest = Math.max(longest,count);
            }
        } 
        return longest;
    }
}