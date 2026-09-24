class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        if (n < 2) {
            return new int[0];
        }

        int[][] valueToIndexPair = new int[n][2];

        for (int i = 0; i < n; i++) {
            valueToIndexPair[i][0] = nums[i];
            valueToIndexPair[i][1] = i;
        }

        Arrays.sort(valueToIndexPair, Comparator.comparingLong(a -> a[0]));

        int left = 0;
        int right = n - 1;

        while (left < right) {
            int sum = valueToIndexPair[left][0] + valueToIndexPair[right][0];

            if (target == sum) {
                return new int[] {
    Math.min(valueToIndexPair[left][1], valueToIndexPair[right][1]),
    Math.max(valueToIndexPair[left][1], valueToIndexPair[right][1])
};
                
            }

            if (sum < target) {
                left++;
            }

            if (sum > target) {
                right--;
            }
        }

        return new int[0];
    }
}
