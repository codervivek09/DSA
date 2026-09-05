// Q.1929 Concatenation of Array

class Q01929_Concatenation_of_Array {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int arr [] = new int[n*2];

        for(int i=0; i<nums.length; i++){
            arr[i] = nums[i];
            arr[i+n] = nums[i];
        }
        return arr;
    }
}   
