// Problem link:-
// https://www.interviewbit.com/problems/subarray-with-given-xor/


public class Solution {
    //Jai Baba Bhole
    //O(nlogn)
    //O(n)
    //Do dry Run
    public int solve(ArrayList<Integer> list, int B) {
        int count=0;
        int xor=0;
        
        HashMap<Integer,Integer> map=new HashMap<>();
        
        int n=list.size();
        for(int i=0;i<n;i++){
            xor=xor^list.get(i);
            
            if(map.get(xor^B)!=null){
                count+=map.get(xor^B);
            }
            
            if(xor==B){
                count++;
            }
            
            if(map.get(xor)!=null){
                map.put(xor,map.get(xor)+1);
            }
            else map.put(xor,1);
        }
        
        return count;
    }
}
