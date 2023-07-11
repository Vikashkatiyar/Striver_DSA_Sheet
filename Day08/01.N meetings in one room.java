//Approach 01:-
class Solution 
{
    //Jai Baba Bhole
    //O(NlogN)
    //O(N)
    static class Tribal {
        int start;
        int end;
        
        
        Tribal(int start,int end){
            this.start=start;
            this.end=end;
           
        }
      
    }
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int start[], int end[], int n)
    {
        ArrayList<Tribal> mList=new ArrayList<>();
        
        for(int i=0;i<n;i++){
            mList.add(new Tribal(start[i],end[i]));
        }
        
        Collections.sort(mList,(a,b)->(a.end-b.end));
        
        int count=1;
        int endP=mList.get(0).end;
        
        for(int i=1;i<n;i++){
            if(endP < mList.get(i).start){
                count++;
                endP=mList.get(i).end;
            }
        }
        
        return count;
    }
}

//Approach 02:-
class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int start[], int end[], int n)
    {
        int [][]meets=new int[n][2];
        for(int i=0;i<n;i++){
            meets[i][0]=start[i];
            meets[i][1]=end[i];
        }
        
        Arrays.sort(meets,(a,b)-> a[1]-b[1]);
        
        int count=1;
        int ends=meets[0][1];
        
        for(int i=1;i<n;i++){
            if(meets[i][0]>ends){
                count++;
                ends=meets[i][1];
            }
        }
        return count;
    }
}
