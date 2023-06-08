class Solution {
    public int majorityElement(int[] nums) {
        // Moore Voting Algorithums
        //O(n)
        //O(1)
        int count=0;
        int ele=0;
        
        for(int val:nums){
            if(count==0){
                ele=val;
            }
            
            if(ele==val){
                count++;
            }else{
                count--;
            }
        }
        
        return ele;
    }
}