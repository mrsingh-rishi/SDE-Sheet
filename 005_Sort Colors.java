class Solution {
    public void sortColors(int[] nums) {
        int freq[] = new int[3];
        for(int i = 0; i < nums.length; i++){
            freq[nums[i]]++;
        }
        int i = 0;
        int idx = 0;
        while(i < 3){
            if(freq[i] >= 1){
                nums[idx++] = i;
                freq[i]--;
            }
            else{
                i++;
            }
        }
    }
}
