class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> seen = new HashSet<>();
        List<Integer> res = new ArrayList<>();

        for(int num:nums1){
            seen.add(num);
        }
        for(int num:nums2){
            if(seen.contains(num)){
                if(!res.contains(num)){
                res.add(num);
                }
            }
        }


        int[] result = new int[res.size()];
        for(int i =0;i<res.size();i++){
            result[i]=res.get(i);
        }
        return result;
    }
}