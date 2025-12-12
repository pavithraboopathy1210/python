class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> sumPairs = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (sumPairs.containsKey(target - nums[i])) {
                return new int[] { sumPairs.get(target - nums[i]), i };
            }
            sumPairs.put(nums[i], i);
        }
        return new int[] {};
    }
}
