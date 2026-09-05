// Q.1920 Build Array from Permutation

class Q01920_Build_Array_from_Permutation {
    public int[] buildArray(int[] nums) {
       int ans [] = new int[nums.length];

       int n = 0;
       for(int i=0; i<nums.length; i++){
            n = nums[nums[i]];
            ans[i] = n;
       } 
       return ans;
    }
}    