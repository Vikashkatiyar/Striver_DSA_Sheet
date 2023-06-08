class Solution {
    //Jai Baba Bhole
    // O(2nlogn)
    //O(1)
    public int reversePairs(int[] nums) {
        //Refer to Count inversions
        int[] temp=new int[nums.length];
        return mergeSort(nums,0,nums.length-1,temp);
        
    }
    public int countPair(int[]nums,int low,int mid,int high){
        int count=0;
        int right=mid+1;
        for(int i=low;i<=mid;i++){
            while(right<=high && nums[i]>(long)nums[right]*2){
                right++;
            }
            count+=(right-(mid+1));
        }
        return count;
    }
    public int mergeSort(int[]nums,int low,int high,int []temp){
        int count=0;
        if(low>=high){
            return count;
        }
        int mid=(low+high)/2;
        count+=mergeSort(nums,low,mid,temp);
        count+=mergeSort(nums,mid+1,high,temp);
        
        count+=countPair(nums,low,mid,high);
        
        merge(nums,low,mid,high,temp);
        return count;
        
    }
    public void merge(int[]nums,int low,int mid,int high,int[] temp){
        int left=low;
        int right=mid+1;
        
        int k=low;
        while(left<=mid && right<=high){
            if(nums[left]<=nums[right]){
                temp[k++]=nums[left++];
            }else{
                temp[k++]=nums[right++];
            }
        }
        
        while(left<=mid){
            temp[k++]=nums[left++];
        }
        
        while(right<=high){
            temp[k++]=nums[right++];
        }
        
        for(int i=low;i<=high;i++){
            nums[i]=temp[i];
        }
    }
}