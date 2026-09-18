class Solution {
    public boolean isAnagram(String s, String t) {


        if(s.length()!=t.length()){
            return false;
        }
        Map<Character,Integer>  map = new HashMap<>();
            for(int i =0;i<s.length();i++){
                char c = s.charAt(i);
                char d = t.charAt(i);
                map.put(c,map.getOrDefault(c,0)+1);
                map.put(d,map.getOrDefault(d,0)-1);
            }
            for(int i =0;i<s.length();i++)
            {
                char c = s.charAt(i);
                if(map.get(c)!=0){
                    return false;
                }
            }
            return true;
    
}
}