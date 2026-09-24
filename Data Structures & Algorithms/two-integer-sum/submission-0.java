class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        if(n<2){
            return new int[0];
        }

        for(int first = 0; first < n-1; first++){
            for(int second = first + 1; second < n; second++){
                int sum = nums[first] + nums[second];
                if( target == sum){
                    return new int[] {first, second};
                }
            }
        }
        return new int[0];
        
    }
}
