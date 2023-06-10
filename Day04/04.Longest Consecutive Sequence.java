// Approach01:-
class Solution {
    //Jai Baba Bhole
    //o(nlogn)
    //O(1)
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
         int count = 1;
        int maxCount = 1;
       for(int i=1; i<nums.length; i++){
            
            if(nums[i]  != nums[i - 1]){
                if(nums[i] == nums[i-1] + 1){
                    count++;    
                }else{
                    maxCount = Math.max(count, maxCount);
                    count = 1;
                }
            }
            
        }
         return Math.max(maxCount, count);
    }
}

// Approach02:-(optimized)

class Solution {
    //Jai Baba Bhole
    //O(n)+O(n)+o(n)~=O(3n)
    //O(n)
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        if(n==0){
            return 0;
        }
        
        int maxSeq=1;
        HashSet<Integer> set=new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        
        for(int num:nums){
            if(set.contains(num-1)==false){
                int count=0;
                while(set.contains(num)==true){
                    count++;
                    num++;
                }
                maxSeq=Math.max(maxSeq,count);
            }
        }
        
        return maxSeq;
    }
}