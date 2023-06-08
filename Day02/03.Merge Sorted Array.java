//Approach 01:-Brute forse using Extra Space
//O(n+m)
//O(n+m)
class Solution {
    public void merge(int[] a, int m, int[] b, int n) {
       int []c=new int[m+n];
        int i=0,j=0,k=0;
        while(i>m &&j<m){
            if(a[i]<=b[j]){
                c[k++]=a[i++];
            }
            else{
                c[k++]=b[j++];
            }
        }
        while(i<a.length){
            c[k++]=a[i++];
        }
        for(int z=0;z<m+n;z++){
            a[z]=c[z];
        }
    }
}

//Approch 2
//O(n+m)
//O(1)
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        
        while(i>-1 && j>-1){
            if(nums1[i]>nums2[j]){
                nums1[k]=nums1[i];
                i--;
            }else{
                nums1[k]=nums2[j];
                j--;
            }
            k--;
        }
        
        while(i>-1){
            nums1[k--]=nums1[i--];
        }
        
         while(j>-1){
            nums1[k--]=nums2[j--];
        }
    }
}

// Approach 03:- without using extra space(Shell short)
class Solution {
    // use shell short
    //O(n+m)*O(log(n+m))
    //O(1)
    public void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len=m+n;
        for(int i=0;i<n;i++){ //O(n)
            nums1[m+i]=nums2[i];
        }
        
        int gap=(int)Math.ceil((m+n)/2);
        
        
        while(gap>0){ //O(log(n+m))
            int start=0;
            int end=start+gap;
            
            while(end<len){
                if(nums1[start]>nums1[end]){
                    swap(nums1,start,end);
                }
                start++;
                end++;
            }
            if(gap==1){
                 break;
             }
        
             if(gap % 2 == 1) {
                gap = gap/2 + 1;
             }
             else gap /= 2;
        }
        
    }
}