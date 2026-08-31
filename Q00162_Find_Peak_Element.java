// Q. 162 Find Peak Element

public class Q00162_Find_Peak_Element {
    public int findPeakElement(int[] nums) {

        int Peak = nums[0];
        int index = 0;

        for(int i=1; i<nums.length; i++){
            if(nums[i]>Peak){
                Peak = nums[i];
                index = i;
            }
        }
     return index;   
    }
}
