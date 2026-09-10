// Q.258 Add Digits

class Q00258_Add_Digits {
    public int addDigits(int num) {
        while(num>=10){
        int sum = 0;
            while(num>0){
                int rem = num % 10;
                sum = sum + rem;
                num = num/10;
            }
            num = sum;
        }
        return num;
    }
}