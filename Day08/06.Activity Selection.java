class Solution
{
    //Jai Baba Bhole
    //O(nlogn)+O(n)
    //O(n)
    
    
   
    public static int activitySelection(int start[], int end[], int n)
    {
        int[][] arr=new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=start[i];
            arr[i][1]=end[i];
        }
        
        Arrays.sort(arr,(a,b)->a[1]-b[1]);
        
        int count=1;
        int endP=arr[0][1];
        
        for(int i=1;i<n;i++){
            if(arr[i][0]>endP){
                count++;
                endP=arr[i][1];
            }
        }
        
        return count;
    }
}