// Q.344 Reverse String

class Q00344_Reverse_String {
    public void reverseString(char[] s) {
        
        int i = 0, j = s.length-1;
        
        while(i<j){
            char ch = s[i];
            s[i]= s[j];
            s[j] = ch;
            i++;
            j--;
        }
        
    }
}