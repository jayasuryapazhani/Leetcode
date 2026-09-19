class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>> map = new HashMap<>();
         for(String word : strs){
            String sorted = sortedWord(word);
            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(word);
         }
         return new ArrayList<>(map.values());

    
        
        
    }

    static String sortedWord (String word){
        char[] c = word.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
}