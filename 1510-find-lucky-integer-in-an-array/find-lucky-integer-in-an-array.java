class Solution {
    public int findLucky(int[] arr) {
        Arrays.sort(arr);
        HashMap<Integer,Integer> hm= new HashMap<>();
        for(int i:arr){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        int res=-1;
        for(int i:arr){
           if(i==hm.get(i)){
            res=i;
           }
        }
        return res;
    }
}