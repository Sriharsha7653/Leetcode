class Solution {
    public int[] separateDigits(int[] nums) {
        List<Character> list= new ArrayList<>();
        for(int i:nums){
            String s=Integer.toString(i);
            for(char c:s.toCharArray()){
                list.add(c);
            }
        }
        int ind=0;
        int[] res= new int[list.size()];
        for(char c:list){
            res[ind++]=c-'0';
        }
        return res;
    }
}