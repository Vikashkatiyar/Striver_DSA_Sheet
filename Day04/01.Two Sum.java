//if problem says gives me the index of the numbers which formed the target 
// then use this Approch:-

class Solution {
    //Jai Baba Bhole
    //O(n)+O(nlogn)
    //O(nlogn)
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            int num2=target-nums[i];
            if(map.containsKey(num2)){
                return new int[]{i,map.get(num2)};
            }else{
                map.put(nums[i],i);
            }
            
        }
        
        return new int[]{-1,-1};
    }
}

//when problem says tell me there are two numbers exist which formed 
// the target
// Then Always use two pointer+Sorting Approch:-

class Solution {
    //Jai Baba Bhole
    //O(nlogn)
    //O(1)
    public String twoSum(int[] nums, int target) {
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        while(i<j){
            int sum=nums[i]+nums[j];
            if(sum==target){
                return "YES"
            }
            else if(sum>target){
                j--;
            }
            else{
                i++;
            }
        }
        return "NO";
    }
}