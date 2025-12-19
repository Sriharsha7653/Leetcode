class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n =arr.length;
        int[] nse=nsefunc(arr);
        int[] pse=psefunc(arr);
        int mod=(int)1e9+7;
        int sum=0;
        for(int i=0;i<n;i++){
            int left=i-pse[i];
            int right=nse[i]-i;
            long freq=left*right*1l;
            int val=(int)((freq*arr[i])%mod);
            sum=(sum+val)%mod;
        }
        return sum;
    }
    public int[] nsefunc(int[] arr){
        int n=arr.length;
        int[] ans= new int[n];
        Stack<Integer> st= new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty()&&arr[st.peek()]>=arr[i]){
                st.pop();
            }
            ans[i]=!st.isEmpty()?st.peek():n;
            st.push(i);
        }
        return ans;
    }
    public int[] psefunc(int[] arr){
        int n=arr.length;
        int[] ans= new int[n];
        Stack<Integer> st= new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty()&&arr[st.peek()]>arr[i]){
                st.pop();
                }
                ans[i]=!st.isEmpty()?st.peek():-1;
                st.push(i);
        }
        return ans;
    }
}