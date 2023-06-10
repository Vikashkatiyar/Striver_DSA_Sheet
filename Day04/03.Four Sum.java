// Approch 01:- Similar as 3 Sum problem
class Solution {
    //Jai Baba Bhole
    //o(n3)*log(no of elements in the set)
    //O(N)+O(set of 4 values)*2
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> res=new HashSet<>();
        
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                Set<Long> set=new HashSet<>();
                for(int k=j+1;k<n;k++){
                    long sum=nums[i]+nums[j];
                    sum+=nums[k];
                    
                    long fourth=target-sum;
                    if(set.contains(fourth)){
                        List<Integer> list=new ArrayList<Integer>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        list.add((int)fourth);
                        
                        
                        Collections.sort(list);
                        res.add(list);
                    }
                    set.add((long)nums[k]);
                }
            }
        }
        List<List<Integer>> ans=new ArrayList<>(res);
        return ans;
    }
}

// Approach02:- Optimized

class Solution {
    //Jai Baba Bhole
    //O(n2*n)~=O(n3)
    //O(no of set of answers)
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        int n=nums.length;
        
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<n;j++){
                if(j>(i+1) && nums[j]==nums[j-1]) continue;
                
                int k=j+1;
                int l=n-1;
                
                while(k<l){
                    long sum=nums[i];
                    sum+=nums[j];
                    sum+=nums[k];
                    sum+=nums[l];
                    
                    if(sum<target){
                        k++;
                    }else if(sum>target){
                        l--;
                    }else{
                        List<Integer> list=new ArrayList<Integer>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        list.add(nums[l]);
                        
                        ans.add(list);
                        k++;
                        l--;
                        
                        while(k<l && nums[k]==nums[k-1]) k++;
                        while(k<l && nums[l]==nums[l+1]) l--;
                    }
                }
            }
        }
        return ans;
    }
}
