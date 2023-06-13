public class Solution {
    public int solve(int[] A, int B) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int xor = 0;
        int count = 0;
        for(int num : A){
            xor ^= num;
            if(xor == B){
                count++;
            }
            if(map.containsKey(xor ^ B)){
                count += map.get(xor ^ B);
            }
            int c = 0;
            if(map.containsKey(xor)){
                c = map.get(xor);
            }
            
            map.put(xor, c+1);
        }
        return count;
    }
}
