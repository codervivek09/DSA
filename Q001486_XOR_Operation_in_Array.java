// Q. 1486 XOR Operation in an Array

class Q001486_XOR_Operation_in_Array {
    public int xorOperation(int n, int start) {

        int x = 0;

        for(int i=0; i<n; i++){
            x = x ^ (start + 2 * i);
        }
        return x;
    }
}
