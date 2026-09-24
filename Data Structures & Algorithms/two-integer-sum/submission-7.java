class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        if (n < 2) {
            return new int[0];
        }

        Map<Long, Integer> pair = new HashMap<Long, Integer>();

        for (int i = 0; i < n; i++) {
            long complement = target - nums[i];

            if (pair.containsKey(complement)) {
                return new int[] {
                    pair.get(complement), i
                };
            }

            pair.put((long)nums[i], i);
        }
        return new int[0];
    }
}
