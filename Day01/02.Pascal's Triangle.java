package Day01;

//Question1:- Given Row and Col number tell me the value of that location
        // calculate (n-1)c(r-1) gives the right element of that location
        int NcR(int n,int r){
            long res=1;
            for(int i=0;i<r;i++){
                res=res*(n-i);
                res=res/(i+1);
            }
            return (int)res;
        }

//Question2:- Given The row number tell me the full Row values
        // Nth Row==> N elements
        for(int r=1;r<=n;r++){ // O(n*r)
            System.out.println(NcR(n-1,r-1));
        }


//Question3:- Given the Row number Print the full Pascal Triangle

//  Approach01:-
class Solution {
    public List<List<Integer>> generate(int numRow) {
        List<List<Integer>> ans=new ArrayList<>();
        
        for(int i=0;i<numRow;i++){
            ans.add(new ArrayList<>());
            if(i==0){
                ans.get(i).add(1);
            }
            if(i==1){
                ans.get(i).add(1);
                ans.get(i).add(1);
            }
        }
        
        for(int i=2;i<numRow;i++){
            
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    ans.get(i).add(1);
                }
                else{
                    ans.get(i).add(ans.get(i-1).get(j-1)+ans.get(i-1).get(j));
                }
            }
            
        }
        return ans;
    }
}

// Approach 2 (optimized)
class Solution {
    //O(n2)
    public List<Integer> generateRow(int row){
        List<Integer> ansRow=new ArrayList<>();
        ansRow.add(1);
        long res=1;
        
        for(int col=1;col<row;col++){ //calculate ncr
            res=res*(row-col);
            res=res/col;
            ansRow.add((int)res);
        }
        
        return ansRow;
    }

    //Main Function
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        //numRow==> total number of Rows in Pascal Triangle
        for(int i=1;i<=numRows;i++){
            ans.add(generateRow(i));
        }
        return ans;
    }
}

