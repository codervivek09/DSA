// Q.231 Power of Two

class Q00231_Power_of_Two{
    public boolean isPowerOfTwo(int n) {
        
            if(n<=0){
                return false;
            }

        for(int x=0; x<31; x++){
            if((1L<<x)==n){
                return true;
            }
        }
        return false;
    }
}