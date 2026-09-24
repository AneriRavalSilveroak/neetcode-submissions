class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;
        int cnt = 0;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(nums[i] == nums[j] & i!=j){
                    cnt++;
                }
            }        }
        if(cnt!=0){
            return true;
        }
    return false;
    }
}