class Solution {
    //Jai Baba Bhole
    //O(n)
    //O(1)
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int j=1;
        for(int i=0;i<n-1;i++){
            if(nums[i]!=nums[i+1]){
                nums[j++]=nums[i+1];
            }
        }
        
        return j;
    }
}