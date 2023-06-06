class Solution
{
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    static long inversionCount(long arr[], long N)
    {
        return mergeSort(arr, 0 , arr.length - 1);
    }
    
    static long mergeSort(long arr[], int low, int high){
        if(low >= high){
            return 0;
        }
        long inv = 0;
        int mid = low + (high - low)/2;
        
        inv += mergeSort(arr, low, mid);
        inv += mergeSort(arr, mid+1, high);
        inv += merge(arr,low,mid,high);
        return inv;
    }
    
    static long merge(long arr[], int l, int m, int r){
        long[] left = Arrays.copyOfRange(arr, l, m + 1);
  
        // Right subarray
        long[] right = Arrays.copyOfRange(arr, m + 1, r + 1);
  
        int i = 0, j = 0, k = l; long swaps = 0;
  
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j])
                arr[k++] = left[i++];
            else {
                arr[k++] = right[j++];
                swaps += (m + 1) - (l + i);
            }
        }
        while (i < left.length)
            arr[k++] = left[i++];
        while (j < right.length)
            arr[k++] = right[j++];
        return swaps;
    }
}
