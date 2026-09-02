// 1299. Replace Elements with Greatest Element on Right Side

class Q001299_Replace_Elements {
    public int[] replaceElements(int[] arr) {
        int laststore=-1;
            for(int i=arr.length-1;i>=0;i--){
                int presentelement=arr[i];
                arr[i]=laststore;
            if(presentelement>laststore){
                laststore=presentelement;
            }
        }
       return arr;
    }
}

