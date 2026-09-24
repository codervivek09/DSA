// Q.1832 Check if the Sentence is Pangram

class Q001832_Check_if_sentence_is_Pangram {
    public boolean checkIfPangram(String sentence) {
        boolean [] alpha = new boolean [26];
    
        for(int i=0; i<sentence.length(); i++){
            char ch = sentence.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                  ch = (char) (ch + 32);   
                  int index = ch - 'a';
                  alpha[index] = true;  
            } 
            if (ch >= 'a' && ch <= 'z') {
                int index = ch - 'a';
                alpha[index] = true;
            }
      }
        boolean isPangram = true;
        for(int i=0; i<alpha.length; i++){
            if(alpha[i] == false){
                  isPangram = false;
                  break;
            }
        }
      return isPangram;
    }
}
