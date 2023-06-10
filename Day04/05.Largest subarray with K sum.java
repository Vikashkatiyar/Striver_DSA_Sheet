// Best Optimized Approch for Positive + Negative Numbers
class GfG
{
    //Jai Baba Bhole
    //O(n)
    //O(nlogn) for map
    int maxLen(int nums[], int n)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        int k=0;
        int sum=0;
        int maxLen=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum==k){
                maxLen=i+1;
            }
            int rem=sum-k;
            if(map.containsKey(rem)){
                int len=i-map.get(rem);
                maxLen=Math.max(maxLen,len);
            }else{
                map.put(sum,i);
            }
            
        }
        
        return maxLen;
    }
}