class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int count=0;
        int i=0;
        while(i<fruits.length){
            for(int j=0;j<baskets.length;j++){
                if(fruits[i]<=baskets[j]){
                    count++;
                    baskets[j]=0;
                    break;
                }
            }
            i++;
        }
        return fruits.length-count;
    }
}