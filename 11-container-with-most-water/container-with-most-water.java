class Solution {
    public int maxArea(int[] height) {
        int left=0,right=height.length-1,max=Integer.MIN_VALUE;
        while(left<right){
            int h=Math.min(height[right],height[left]);
            int width=right-left;
            int area=h*width;
            max=Math.max(area,max);
            while(left<right&&height[left]<=h){
                left++;
            }
            while(left<right&&height[right]<=h){
                right--;
            }
        }
        return max;
    }
}