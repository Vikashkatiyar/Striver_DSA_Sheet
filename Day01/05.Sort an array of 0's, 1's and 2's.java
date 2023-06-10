//Duck National Flag Algorithums
class Solution {
    //Jai Baba Bhole
    //O(n);
    //O(1)
    public void swap(int []nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void sortColors(int[] nums) {
        int n=nums.length;
        
        int i=0;
        int j=0;
        int k=n-1;

        while(j<=k){
            if(nums[j]==0){
                swap(nums,i,j);
                i++;
                j++;
            }else if(nums[j]==1){
                j++;
            }else if(nums[j]==2){
                swap(nums,j,k);
                k--;
            }
        }
    }
    
}