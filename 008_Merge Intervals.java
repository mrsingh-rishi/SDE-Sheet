class Solution {
    public int[][] merge(int[][] Intervals) {
        List<int[]> ans = new ArrayList<>();
        
        if(Intervals.length == 0 || Intervals == null)
            return ans.toArray(new int[0][]);
        
        Arrays.sort(Intervals, (a,b)->a[0]-b[0]);
        
        int start = Intervals[0][0];
        int end = Intervals[0][1];
        
        for(int[] i: Intervals){
            if(i[0] <= end){
                end = Math.max(end, i[1]);
            }
            else{
                ans.add(new int[]{start, end});
                start = i[0];
                end = i[1];
            }
        }
        ans.add(new int[]{start, end});
        
        return ans.toArray(new int[0][]);
    }
}
