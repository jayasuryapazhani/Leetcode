class Solution {
    public boolean isPalindrome(String s) {

        int left =0;
        int right = s.length()-1;
        while(left<right){

            if(!Character.isLetterOrDigit(s.charAt(left))){
                left++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(right))){
                right--;
                continue;
            }
           char lChar = Character.toLowerCase(s.charAt(left));
           char rChar = Character.toLowerCase(s.charAt(right));

            if(lChar!=rChar){
                return false;
            }
            left++;
            right--;
        }
        return true;


        
    }
}