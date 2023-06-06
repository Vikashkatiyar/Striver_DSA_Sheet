package Day01;

class Solution {
    //Jai Baba Bhole
    //O(n)
    public int maxSubArray(int[] nums) {
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;
        for(int val:nums){
            currSum+=val;
            
            if(currSum>maxSum){
                maxSum=currSum;
            }
            
            if(currSum<0){
                currSum=0;
            }
        }
        
        return maxSum;
    }
}