class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String alt="";
        for(char c:s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                alt+=c;
            }
        }
        int l=0,r=alt.length()-1;
        while(l<r){
            if(alt.charAt(l)!=alt.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}