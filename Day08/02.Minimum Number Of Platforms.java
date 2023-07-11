// minimum platforms needed in a railway station

class Solution
{
    //Jai Baba Bhole
    //O(nlogn)
    //O(1)
    static int findPlatform(int arr[], int dep[], int n)
    {
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        int maxTrain=1;
        int i=1;
        int j=0;
        int platform=0;
        
        while(i<n && j<n){
            if(arr[i]<=dep[j]){
                maxTrain++;
                i++;
            }
            else{
                maxTrain--;
                j++;
            }
            platform=Math.max(platform,maxTrain);
        }
        
        return platform;
    }
    
}