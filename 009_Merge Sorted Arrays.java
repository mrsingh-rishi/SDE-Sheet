class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1, j= n-1, tail = m+n-1;
        
        while(i>=0 && j>=0){
            if(nums2[j]>=nums1[i]){
                nums1[tail] = nums2[j];
                j--;
            }else{
                nums1[tail] = nums1[i];
                i--;
            }
            tail--;
        }
        
        while (j >= 0) { 
            nums1[tail] = nums2[j];
            tail--;
            j--;
        }
    }
}
