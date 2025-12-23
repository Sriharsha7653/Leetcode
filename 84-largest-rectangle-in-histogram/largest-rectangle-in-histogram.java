class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st= new Stack<>();
        int n=heights.length;
        int[] nse= new int[n];
        int[] pse= new int[n];
        for(int i=0;i<n;i++){
            while(!st.isEmpty()&&heights[st.peek()]>=heights[i]){
                st.pop();
            }
            pse[i]= st.isEmpty()?0:st.peek()+1;
            st.push(i);
        }
        st.clear();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty()&&heights[st.peek()]>=heights[i]){
                st.pop();
            }
            nse[i]=st.isEmpty()?n-1:st.peek()-1;
            st.push(i);
        }
        int maxarea=0;
        for(int i=0;i<n;i++){
            int width=nse[i]-pse[i]+1;
            maxarea=Math.max(maxarea,width*heights[i]);
        }
        return maxarea;
    }
}