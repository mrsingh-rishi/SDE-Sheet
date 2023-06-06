class Solution {
    public int findDuplicate(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            int idx = Math.abs(nums[i]) - 1;
            if(nums[idx] < 0){
                return idx+1;
            }
            else
                nums[idx] *= -1;
        }
        return -1;
    }
}
