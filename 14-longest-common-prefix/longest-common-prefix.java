class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String start=strs[0];
        String end=strs[strs.length-1];
        int index=0;
        for(int i=0;i<start.length();i++){
            if(start.charAt(i)==end.charAt(i)){
                index++;
            }
            else{break;}
        }
        return start.substring(0,index);
    }
}