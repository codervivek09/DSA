// Q. 136 Single Number

class Q00136_Single_Number {
    public int singleNumber(int[] nums) {
        int i = 0;
        for(int x : nums){
            i^=x;
        }
        return i;
    }
}