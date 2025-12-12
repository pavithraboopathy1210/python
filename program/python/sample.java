class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] freq = new int[101]; // frequency array for numbers 0-100
        
        // count frequency of each number
        for (int num : nums) {
            freq[num]++;
        }
        
        // convert to prefix sum array: freq[i] = count of numbers < i
        for (int i = 1; i < 101; i++) {
            freq[i] += freq[i - 1];
        }
        
        int[] result = new int[nums.length];
        
        // build result
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num == 0) {
                result[i] = 0; // nothing smaller than 0
            } else {
                result[i] = freq[num - 1]; // numbers smaller than num
            }
        }
        
        return result;
    }
}
