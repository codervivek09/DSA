// Q. 268 Missing Number

class Q00268_Missing_Number {
    public int missingNumber(int[] nums) {
        int xor = nums.length;
        for(int i=0; i<nums.length; i++){
            xor = xor ^ i ^ nums[i];
        }
        return xor;
    }
}