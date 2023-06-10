// Approach-01:-
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            Set<Integer> set=new HashSet<>();
            for(int j=i+1;j<n;j++){
                int third=-(nums[i]+nums[j]);
                if(set.contains(third)){
                    ArrayList<Integer> list=new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(third);
                    Collections.sort(list);
                    res.add(list);
                }
                set.add(nums[j]);
            }
        }
        
        return new ArrayList<>(res);
    }
}

// Approach2
class Solution {
    //Jai Baba Bhole
    //O(nlogn)+O(n2)
    //O(size of three  elements)
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> ans=new ArrayList<>();
        
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            
            int j=i+1;
            int k=n-1;
            while(j<k){
                int target=nums[i]+nums[j]+nums[k];
                if(target<0){
                    j++;
                }else if(target>0){
                    k--;
                }else{
                    List<Integer> list=new ArrayList<Integer>(Arrays.asList(nums[i],nums[j],nums[k]));
                    ans.add(list);
                    j++;
                    k--;
                    
                    while(j<k && nums[j]==nums[j-1]) j++;
                    while(j<k && nums[k]==nums[k+1]) k--;
                }
            }
        }
        
        return ans;
    }
}
