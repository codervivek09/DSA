//Q. 154  Find Minimum in Rotated Sorted Array II

public class Q00154_Find_Min_in_Sorted_Array_II {
    public int findMin(int[] nums) {
       int low = 0;
       int high = nums.length-1;
       int ans = Integer.MAX_VALUE;

       while(low<=high){
            int mid = (low+high)/2;

            if (low == high) {
                ans = Math.min(ans, nums[low]);
                break;
            }

            if(nums[low]==nums[mid] && nums[mid]==nums[high]){
                ans = Math.min(ans, nums[low]);
                low=low+1;
                high=high-1;
                continue;
            }

            if(nums[low]<=nums[mid]){
                ans = Math.min(ans, nums[low]);
                low = mid + 1;
            } else {
                ans = Math.min(ans, nums[mid]);
                high = mid - 1;
            }
       } 
       return ans;
    }
}
