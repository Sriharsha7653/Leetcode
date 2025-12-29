class Solution {
    public int distributeCandies(int[] candyType) {
        int n=candyType.length;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i:candyType){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        int half=n/2;
        if(hm.size()>=half){
            return half;
        }
        return hm.size();
    }
}