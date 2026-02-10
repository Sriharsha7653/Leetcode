class Solution {
    public int[][] merge(int[][] intervals) {
        List<List<Integer>> temp= new ArrayList<>();
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        for(int i=0;i<intervals.length;i++){
            int start=intervals[i][0];
            int end=intervals[i][1];
            if(!temp.isEmpty()&&end<=temp.get(temp.size()-1).get(1)){
                    continue;
                }
            for(int j=i+1;j<intervals.length;j++){
                if(intervals[j][0]<=end){
                    end=Math.max(end,intervals[j][1]);
                }
                else{
                    break;
                }
            }
            temp.add(Arrays.asList(start,end));
        }
        int[][] res= new int[temp.size()][temp.get(0).size()];
       for(int i=0;i<res.length;i++){
        for(int j=0;j<res[i].length;j++){
            res[i][j]=temp.get(i).get(j);
        }
       }
       return res;
    }
}