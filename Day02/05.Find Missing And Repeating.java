class Solve {
    int[] findTwoElement(int arr[], int n) {
        
        //Jai Baba Bhole
        //O(n)
        //O(1)
        int[] hash=new int[n+1];
        for(int num:arr){
            hash[num]++;    
        }
        
        int repeating = -1,missing = -1;
        for(int i=1;i<hash.length;i++){
            if(hash[i]==0){
                missing=i;
            }
            
            if(hash[i]==2){
                repeating=i;
            }
            
            if(missing !=-1 && repeating !=-1){
                break;
            }
        }
        
        return new int[]{repeating,missing};
        
        
        
        
        //Why This solution is not work ?
        //S-SN=X-Y
        //S2-S2N=X2-Y2
        // long SN=(n*(n+1))/2;
        // long S2N=(n*(n+1)*(2*n+1))/6;
        
        // long S=0;
        // long S2=0;
        
        // for(int num:arr){
        //     S+=num;
        //     S2+=((long)num*(long)num);
        // }
        
        // long val1=S-SN;    //x-y
        // long val2=S2-S2N;  //val1*val2=S2N
        
        // val2=val2/val1; //x+y
        
        // long x=(val1+val2)/2;
        // long y=x-val1;
        
        // return new int[]{(int)x,(int)y};
        
        
    }
}