class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int z = 0;
        int[] result = new int[n-k+1];
        Deque<Integer> dq = new ArrayDeque<>();

        for(int i=0; i<n; i++) {
            while(dq.isEmpty()!=true && dq.peekFirst() <= i-k) {
                dq.pollFirst();
            }

            while(!dq.isEmpty() && nums[dq.peekLast()]<nums[i]) {
                dq.pollLast();
            }

            dq.addLast(i);

            if(i>=k-1) {
                result[z] = nums[dq.peekFirst()];
                z++;
            }
        }

        return result;
    }
}