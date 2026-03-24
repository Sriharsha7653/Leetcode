class Solution {
    public boolean check(int[] nums) {
        int count=0;
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            if(i<n-1&&nums[i]>nums[i+1]){
                count++;
            }
            else if(i==n-1&&nums[n-1]>nums[0]){
                count++;
            }
        }
        return count<2;
    }
}