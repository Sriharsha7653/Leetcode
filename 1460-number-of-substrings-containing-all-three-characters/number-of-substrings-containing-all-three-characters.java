class Solution {
    public int numberOfSubstrings(String s) {
        int[] freq=new int[3];
        int count=0;
        int left=0;
        for(int r=0;r<s.length();r++){
            freq[s.charAt(r)-'a']++;
            while(freq[0]>0&&freq[1]>0&&freq[2]>0){
                count+=s.length()-r;
                freq[s.charAt(left)-'a']--;
                left++;
            }
        }
        return count;
    }
}