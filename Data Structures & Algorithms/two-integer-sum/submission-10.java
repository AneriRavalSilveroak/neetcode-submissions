class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        if (n < 2) {
            return new int[0];
        }

        Map<Integer, Integer> pair = new HashMap<Integer, Integer>();

        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];

            if (pair.containsKey(complement)) {
                return new int[] {pair.get(complement), i};
            } else {
                pair.put(nums[i], i);
            }
        }
        return new int[0];
    }
}
