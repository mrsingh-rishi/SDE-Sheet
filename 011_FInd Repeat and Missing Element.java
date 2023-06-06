public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] repeatedNumber(final int[] arr) {
        int rep = -1;
        int mis = -1;
        
        for(int i = 0; i < arr.length; i++){
            int idx = Math.abs(arr[i]) - 1;
            
            if(arr[idx] < 0)
                rep = idx+1;
            else
                arr[idx] = -arr[idx];
        }
        
        for(int i = 0; i < arr.length; i++)
            if(arr[i] > 0)
                mis = i+1;
        return new int[]{rep, mis};
    }
}
