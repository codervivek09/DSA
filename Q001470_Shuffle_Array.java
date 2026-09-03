// Q.1470 Shuffle the Array

class Q001470_Shuffle_Array {
    public int[] shuffle(int[] nums, int n) {
        int arr [] = new int[nums.length];
        for(int i=0; i<n; i++){
            arr[2 * i] = nums[i];
            arr[2 * i + 1] = nums[i + n];
        }
        return arr;   
    }
}
