class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> temp_res= new HashSet<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                HashSet<Long> set= new HashSet<>();
                for(int k=j+1;k<nums.length;k++){
                    long sum=nums[i]+nums[j];
                    sum+=nums[k];
                    long forth=target-sum;
                    if(set.contains(forth)){
                        List<Integer> temp= new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add((int)forth);
                        temp.sort(null);
                        temp_res.add(temp);
                    }
                    set.add((long)nums[k]);
                }
            }
        }
        List<List<Integer>> list= new ArrayList<>(temp_res);
        return list;
    }
}