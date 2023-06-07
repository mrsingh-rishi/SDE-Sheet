class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int ele1 = Integer.MIN_VALUE, count1 = 0;
        int ele2 = Integer.MIN_VALUE, count2 = 0; 
        for(int i = 0; i < nums.length; i++){
            if(count1 == 0 && nums[i] != ele2){
                ele1 = nums[i];
                count1++;
            }
            else if(count2 == 0 && nums[i] != ele1){
                ele2 = nums[i];
                count2++;
            }
            else if(ele1 == nums[i]){
                count1++;
            }
            else if(ele2 == nums[i]){
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
        List<Integer> ans = new ArrayList<>();
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(ele1 == nums[i])
                count++;
            if(count > nums.length/3){
                ans.add(ele1);
                break;
            }
        }
        count = 0;
        for(int i = 0; i < nums.length; i++){
            if(ele2 == nums[i])
                count++;
            if(count > nums.length/3){
                ans.add(ele2);
                break;
            }
        }
        return ans;
    }
}
