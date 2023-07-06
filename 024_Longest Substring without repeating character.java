class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        int i = 0, j = 0;
        int ans = 0;
        while(j < n){
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
            while(i <= j && map.size() < (j-i + 1)){
                char ch = s.charAt(i);
                if(map.get(ch) == 1)
                    map.remove(ch);
                else
                    map.put(ch, map.get(ch) - 1);
                i++;
            }
            ans = Math.max(ans, j - i + 1);
            j++;
        }
        return ans;
    }
}
