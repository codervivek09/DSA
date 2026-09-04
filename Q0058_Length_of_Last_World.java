// Q.58 Length of Last World

class Q0058_Length_of_Last_World {
    public int lengthOfLastWord(String s) {
        int count = 0;
    
        s = s.trim();

        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i)!=' '){
                count++;
            } else {
                break;
            }
        }
        return count;
    }
}