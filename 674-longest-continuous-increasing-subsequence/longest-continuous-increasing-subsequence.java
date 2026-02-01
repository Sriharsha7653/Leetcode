class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int maxcount=1;
        int count=1;
        for(int i=0;i<nums.length&&i+1<nums.length;i++){
            if(nums[i+1]>=nums[i]&&nums[i]!=nums[i+1]){
                count++;
                maxcount=Math.max(maxcount,count);
            }
            else{
                count=1;
            }
        }
        return maxcount;
    }
}