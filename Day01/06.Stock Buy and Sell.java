class Solution {
    //Jai Baba Bhole
    //O(n)
    //O(1)
    public int maxProfit(int[] cost) {
        int minDayCost=cost[0];
        int profit=0;
        
        for(int i=1;i<cost.length;i++){
            int currProfit=cost[i]-minDayCost;
            
            if(currProfit>profit){
                profit=currProfit;
            }
            
            if(cost[i]<minDayCost){
                minDayCost=cost[i];
            }
        }
        return profit;
    }
}