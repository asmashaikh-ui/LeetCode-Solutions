class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int start = 0;
        int end = nums.length-1;
        int mid = -1;
        while(start<=end){

            mid = start+(end-start)/2;

            if(target == nums[mid]){
                
                break;
                
            }else if(target>nums[mid]){
                start = mid+1;

            }else{
                end = mid-1;
            }
        }
        if(start>end){
            return new int[]{-1,-1};
        }
        
        int first=mid;
        end=mid-1;
                
        while(start<=end){

            mid = start+(end-start)/2;

            if(target == nums[mid]){
                
                first=mid;
                end=mid-1;
                
            }else if(target>nums[mid]){
                start = mid+1;

            }else{
                end = mid-1;
            }        
        }

        int last = mid;
        start = mid+1;
        end = nums.length-1;
        while(start<=end){

            mid = start+(end-start)/2;

            if(target == nums[mid]){
                
                last=mid;
                start = mid+1;
                
            }else if(target>nums[mid]){
                start = mid+1;

            }else{
                end = mid-1;
            }        
        }
        return new int[]{first, last}; 
    }
}