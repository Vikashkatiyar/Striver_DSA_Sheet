import java.util.ArrayList;
import java.util.Arrays;



class Solution {
    //Jai Baba Bhole
    //O(nlogn)
    public int[][] merge(int[][] intervals) {
        //Sort the Array on the basis of first element
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        
        ArrayList<int[]> list=new ArrayList<>();
        
        for(int[] interval : intervals){
            if(list.size()==0){
                list.add(interval);
            }else{
                int [] lastInterval=list.get(list.size()-1);
                if(interval[0]>lastInterval[1]){ 
                    list.add(interval);
                }else{
                    lastInterval[1]=Math.max(lastInterval[1],interval[1]);
                }
            }
        }
        
        return list.toArray(new int[list.size()][2]);
    }
}