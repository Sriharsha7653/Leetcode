class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String fstr=strs[0];
        String lstr=strs[strs.length-1];
        int index=0;
        for(int i=0;i<fstr.length();i++){
            if(fstr.charAt(i)!=lstr.charAt(i)){
                break;
            }
            index++;
        }
        return fstr.substring(0,index);
    }
}