class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0,j=0,n=g.length,m=s.length;
        while(i<m&&j<n){
            if(g[j]<=s[i]){
                j++;
            }
            i++;
        }
        return j;
    }
}