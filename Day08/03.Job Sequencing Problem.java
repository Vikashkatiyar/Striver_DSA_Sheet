/*
class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}
*/


class Solution
{
    //Jai Baba Bhole
    //O(nlogn)+O(n*m)
    //O(max of dealine)
    
    
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
         //1. Sort the job basis of profit
         Arrays.sort(arr,(a,b)->(b.profit-a.profit));
         
         //2. find the maximum deadline
         int maxi=0;
         for(int i=0;i<n;i++){
             maxi=Math.max(maxi,arr[i].deadline);
         }
         
         //3.make the array of maximum deadline
         int[] res=new int[maxi+1];
         Arrays.fill(res,-1);
         
         int jobCount=0;
         int maxP=0;
         for(int i=0;i<n;i++){
             for(int j=arr[i].deadline;j>0;j--){ //do linear search from back
                 if(res[j]==-1){
                     res[j]=arr[i].id;
                     jobCount++;
                     maxP+=arr[i].profit;
                     break;
                 }
             }
         }
         
         int[] ans=new int[2];
         ans[0]=jobCount;
         ans[1]=maxP;
         
         return ans;
    }
}

