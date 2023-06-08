//Brute force
    //O(n)
    //O(nlogn)
    //use HashMap<Integer,Integer> map=new HashMap<>();
                 //number,frequency


//Optimized Approach
class Solution {
    //Jai Baba Bhole
    public List<Integer> majorityElement(int[] nums) {
        //Bayer Moore Voting Algorithum
        //O(n)
        //O(1)
        int n=nums.length;
        int ele1=-1;
        int ele2=-1;
        
        int count1=0;
        int count2=0;
        
        for(int val:nums){
            if(ele1==val){
                count1++;
            }else if(ele2==val){
                count2++;
            }else if(count1==0){
                ele1=val;
                count1++;
            }else if(count2==0){
                ele2=val;
                count2++;
            }else{
                count1--;
                count2--;
            }
        }
        
        List<Integer> ans=new ArrayList<>();
        count1=0;
        count2=0;
        
        for(int val:nums){
            if(val==ele1){
                count1++;
            }else if(ele2==val){
                count2++;
            }
        }
        
        if(count1>n/3){
            ans.add(ele1);
        }
        if(count2>n/3){
            ans.add(ele2);
        }
        
        return ans;
    }
}