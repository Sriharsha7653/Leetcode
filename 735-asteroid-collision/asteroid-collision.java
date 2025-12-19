class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        List<Integer> st= new ArrayList<>();
        for(int i=0;i<asteroids.length;i++){
            if(asteroids[i]>0){
                st.add(asteroids[i]);
            }
            else{
                while(!st.isEmpty()&&st.get(st.size()-1)>0
                &&st.get(st.size()-1)<Math.abs(asteroids[i])){
                    st.remove(st.size()-1);
                }
                if(!st.isEmpty()&&st.get(st.size()-1)==Math.abs(asteroids[i])){
                    st.remove(st.size()-1);
                }
                else if(st.isEmpty()||st.get(st.size()-1)<0){
                    st.add(asteroids[i]);
                }
            }
        }
        int[] res= new int[st.size()];
        int index=0;
        for(int i:st){
            res[index++]=i;
        }
return res;
    }
}