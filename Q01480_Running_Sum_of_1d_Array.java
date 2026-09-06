// Q.1480 Running Sum of 1D Array

class Q01480_Running_Sum_of_1d_Array {
    public int[] runningSum(int[] nums) {
        int rev [] = new int [nums.length];

        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum = sum + nums[i];
            rev[i] = sum;
        } 
        return rev;
    }
}