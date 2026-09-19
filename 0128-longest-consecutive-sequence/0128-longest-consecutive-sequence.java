class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> seen = new HashSet<>();
        int result =0;
        for(int num:nums){
            seen.add(num);
        }
        for(int num: seen){

            if(!seen.contains(num-1)){
                int current = num;
                int length=1;
                while(seen.contains(current+1)){
                    current++;
                    length++;
                }
                result = Math.max(result,length);
                
            }
        }
        return result;
        
    }
}