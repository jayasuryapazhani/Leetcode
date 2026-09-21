class Solution {
    public int lengthOfLongestSubstring(String s) {

        int left =0;
        int maxLength =0;
        Set<Character> seen = new HashSet<>();

        for(int right =0;right<s.length();right++){
            while(seen.contains(s.charAt(right))){
                seen.remove(s.charAt(left));
                left++;
            }

            seen.add(s.charAt(right));
            int currentLength= right -left +1;
            maxLength = Math.max(currentLength,maxLength);
        }
        return maxLength;
        
    }
}