class Solution {
    public int searchInsert(int[] nums, int target) {

        if(target>nums[nums.length-1]){
            return nums.length;
        }
        if(target<nums[0]){
            return 0;
        }

        int left =0;
        int right =nums.length-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return left;
    }
}