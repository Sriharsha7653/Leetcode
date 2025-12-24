class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int total=0;
        int count=0;
        for(int i:apple){
            total+=i;
        }
        for(int i=capacity.length-1;i>=0;i--){
            if(total>0){
                count++;
                total-=capacity[i];
            }
        }
        return count;
    }
}