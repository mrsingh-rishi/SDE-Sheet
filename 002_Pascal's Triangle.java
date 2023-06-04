class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        
        List<Integer> next, prev = new ArrayList<>();;
        
        for(int i = 1; i <= numRows; i++){
            next = new ArrayList<>();
            
            for(int j = 1; j <= i; j++){
                if(j == 1 || j == i){
                    next.add(1);
                }
                else{
                    if( j < i)
                    {
                        next.add(prev.get(j-1) + prev.get(j-2));
                    }
                }
            }
            prev = next;
            ans.add(next);
        }
        
        return ans;
    }
}
