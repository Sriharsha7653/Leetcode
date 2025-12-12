class Solution {
    public boolean checkEqual(int[] a1, int[] a2) {
        for(int i=0;i<a1.length;i++) {
            if(a1[i]!=a2[i]) return false;
        }
        return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
         List<Integer> li = new ArrayList<>();
         if(p.length()>s.length()) return li;  // If p is longer, no answer
        int[] as= new int[26];  // sliding window freq
        int[] ap= new int[26];   // freq of p

        for(char ele:p.toCharArray()) {
             ap[ele-'a']++;
        }
        int i=0,j=p.length()-1;
      // Build window (except last index)
        for(int k=i;k<j;k++) {
            as[s.charAt(k)-'a']++;
        }
        while(j<s.length()) {
            as[s.charAt(j++)-'a']++; // include new char
            if(checkEqual(as,ap)) li.add(i);
            as[s.charAt(i++)-'a']--;  // remove outgoing char
            
        }
        return li;
    }
}