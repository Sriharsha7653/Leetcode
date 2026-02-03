class Solution {
    public String findCommonResponse(List<List<String>> responses) {
        HashMap<String,Integer> hm = new HashMap<>();
        for(List<String> list:responses){
            HashSet<String> set= new HashSet<>();
            Collections.sort(list);
            for(String s:list){
                set.add(s);
            }
            for(String s:set){
                hm.put(s,hm.getOrDefault(s,0)+1);
            }
        }
        int resval=0;
        String res="";
        for(String s:hm.keySet()){
            if(hm.get(s)>resval){
                resval=hm.get(s);
                res=s;
            }
            else if (hm.get(s) == resval) {
                     if (res == null || s.compareTo(res) < 0) {
                        res = s;
                     }
            }
        }
        return res;
    }
}