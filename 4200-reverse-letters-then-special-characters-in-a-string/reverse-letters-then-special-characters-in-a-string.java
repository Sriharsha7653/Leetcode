class Solution {
    public String reverseByType(String s) {
        char[] arr=s.toCharArray();
        int l1=0,l2=0;
        int r1=arr.length-1,r2=arr.length-1;
        while(l1<r1){
            if(Character.isLetter(arr[l1])&&Character.isLetter(arr[r1])){
                char temp=arr[l1];
                arr[l1]=arr[r1];
                arr[r1]=temp;
                r1--;
                l1++;
            }
            else if(!Character.isLetter(arr[l1])){
                l1++;
            }
            else{
                r1--;
            }
        }
        while(l2<r2){
            if(!Character.isLetter(arr[l2])&&!Character.isLetter(arr[r2])){
                char temp=arr[l2];
                arr[l2]=arr[r2];
                arr[r2]=temp;
                r2--;
                l2++;
            }
            else if(Character.isLetter(arr[l2])){
                l2++;
            }
            else{
                r2--;
            }
        }
       String res="";
       for(char c:arr){
        res+=c;
       }
       return res;
    }
}