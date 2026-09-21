class Solution {
    public int[] searchRange(int[] nums, int target) {

        int first = findFirst(nums,target);
        int last = findLast(nums,target);

        return new int[]{first,last};

        
    }

    static int findFirst(int[]nums, int target){
        int result =-1;
        int left =0;
        int right = nums.length-1;
        while(left<=right){
            int mid = left + (right -left)/2;
            if(nums[mid]==target){
                result = mid;
                right = mid-1;
            }else if (nums[mid]>target){
                right = mid -1;
            }else{
                left = mid +1;
            }
        }
        return result;
    }
        static int findLast(int[]nums, int target){
        int result =-1;
        int left =0;
        int right = nums.length-1;
        while(left<=right){
            int mid = left + (right -left)/2;
            if(nums[mid]==target){
                result = mid;
                left = mid+1;
            }else if (nums[mid]>target){
                right = mid -1;
            }else{
                left = mid +1;
            }
        }
        return result;
    }
}