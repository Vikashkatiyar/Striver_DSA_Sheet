//Approach 1(Brute Force)
class Solution {
    public void setZeroes(int[][] mat) {
        //O(nm) 
        //O(n+m)
        int n=mat.length;
        int m=mat[0].length;
        
        int[] row=new int[n];
        int []col=new int[m];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(row[i]==1 || col[j]==1 ){
                    mat[i][j]=0;
                }
            }
        }
        
       
    }
}


// Approach 02 :-

//O(nm)
class Solution {
    public void setZeroes(int[][] mat) {
       
        int n=mat.length;
        int m=mat[0].length;
        
        //row:- mat[..][j]
        //col:- mat[i][..]
        
        int col=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0){
                    mat[i][0]=0;
                    
                    if(j!=0){
                        mat[0][j]=0;
                    }else{
                        col=0;
                    }
                    
                }
            }
        }
        
        
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(mat[i][j]!=0){
                        if(mat[0][j]==0 || mat[i][0]==0 ){
                        mat[i][j]=0;
                        }
                }
            }
        }
        
        if(mat[0][0]==0){
            for(int j=0;j<m;j++){
                mat[0][j]=0;
            }
        }
        
        if(col==0){
            for(int i=0;i<n;i++){
                mat[i][0]=0;
            }
        }
        
       
    }
}