class Solution {
    public int[] nextGreaterElements(int[] nums) {
     int[] res= new int[nums.length];
     int n=nums.length;
     Stack<Integer> st= new Stack<>();
     for(int i=2*n-1;i>=0;i--){
        int index=i%n;
        int currele=nums[index];
        while(!st.isEmpty()&&st.peek()<=currele){
            st.pop();
        }
        if(i<n){
            if(st.isEmpty()){
                res[index]=-1;
            }
            else{
                res[index]=st.peek();
            }
        }
        st.push(currele);
     }   
     return res;
    }

}