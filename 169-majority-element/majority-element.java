class Solution {
    public int majorityElement(int[] nums) {
      HashMap<Integer,Integer> hm = new HashMap<>();
      for(int i:nums){
        hm.put(i,hm.getOrDefault(i,0)+1);
      } 
      int res=0; 
      int resval=0;
      for(int i:hm.keySet()){
        if(hm.get(i)>resval){
            resval=hm.get(i);
            res=i;
        }
      }
      return res;
    }
}