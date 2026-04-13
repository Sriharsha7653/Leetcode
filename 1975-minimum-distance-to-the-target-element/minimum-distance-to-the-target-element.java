class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int ans=Integer.MAX_VALUE;
        int dis=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                dis=Math.abs(i-start);
                ans=Math.min(ans,dis);

            }
            
        }
        return ans;
    }
}