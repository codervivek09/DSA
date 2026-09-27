// Q.1108 Defanging an IP Address

class Q001108_Defanging_an_IP_Address {
    public String defangIPaddr(String address) {
        
        String ans = "";

        for(int i=0; i<address.length(); i++){

            if(address.charAt(i) == '.'){
                ans = ans + "[.]";
            } else {
                ans = ans + address.charAt(i);
            }
        }
        return ans;
    }
}