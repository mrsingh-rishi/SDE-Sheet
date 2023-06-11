class Solution {
    public List<List<Integer>> fourSum(int[] arr, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();
        if(arr.length < 4)  return ans;
        int count = 0;
        for(int i = 0; i < arr.length; i++)
            if(arr[i] >= 0)
                count++;
        if(count == arr.length && k < 0)    return ans;
        Arrays.sort(arr);
        for(int i = 0; i < arr.length - 3;i++){
            // if(i > 0 && arr[i] == arr[i+1]) continue;
            for(int j = i + 1; j < arr.length - 2; j++){
                // if(j>i+1 && arr[j] == arr[j-1])  continue;
                int x = j + 1, y = arr.length - 1;
                while(x < y){
                    int sum = arr[i] + arr[j] + arr[x] + arr[y];
                    if(k == sum){
                        List<Integer> list = new ArrayList<>();
                        list.add(arr[i]);
                        list.add(arr[j]);
                        list.add(arr[x]);
                        list.add(arr[y]);
                        set.add(list);
                        x++;
                        y--;
                        // while(x < y && arr[x] == arr[x+1])  x++;
                        // while(x < y && arr[y] == arr[y-1])  y--;
                    }
                    else if(sum < k){
                        x++;
                    }
                    else{
                        y--;
                    }
                }
            }
        }
        for(List<Integer> list: set){
            ans.add(list);
        }
        return ans;
    }
}
