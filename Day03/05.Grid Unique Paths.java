    // Google Problem

//Brute Force Recursive Solution
class Solution {
    //Jai Baba bhole
    //Exponential Time Comlexity
    //Exponential Space Comlexity
    public int uniquePaths(int m, int n) {
        return helper(0,0,m,n);
        
    }
    
    int helper(int i,int j,int m,int n){
        if(i==m-1 && j==n-1){
            return 1;
        }
        if(i>m-1 || j>n-1){
            return 0;
        }
        int down=helper(i+1,j,m,n);
        int right=helper(i,j+1,m,n);
        return down+right;
    }
}

//Memoization 
class Solution {
    //Jai Baba bhole
    //O(M*N)
    //O(M*N)+recursive call stack
    
    public int uniquePaths(int m, int n) {
        
        return helper(0,0,m,n,new int[m][n]);
        
    }
    
    int helper(int i,int j,int m,int n,int [][]dp){
        if(i==m-1 && j==n-1){
            return 1;
        }
        if(i>m-1 || j>n-1){
            return 0;
        }
        
        if(dp[i][j]!=0){
            return dp[i][j];
        }
        int down=helper(i+1,j,m,n,dp);
        int right=helper(i,j+1,m,n,dp);
        return dp[i][j]=down+right;
    }
}

//Combination Method (most optimized solution)
class Solution {
    public int uniquePaths(int m, int n) {
        //solving using combination
        // O(m-1) or O(n-1)
        //O(1)
        
        int N=n+m-2 ;
            //if m row then no of down direction is m-1
            //if n colm then no of right direction is n-1
            
        int r=m-1; // or n-1 any one 
        double res=1;    
            
        for(int i=1;i<=r;i++){  //calculate Ncr ==>10c3==> (10/3)*(9/2)*(8/1)
            res=res*(N-r+i)/i;
        }    
        
        return (int)res;
    }
}


//Tabulation
class Solution {
    //O(n*m)
    //O(n*m)
    public int uniquePaths(int m, int n) {
        int [][]dp=new int[m][n];
        
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                if(i==0 || j==0){
                    dp[i][j]=1;
                }else{

                dp[i][j]=dp[i-1][j]+dp[i][j-1];
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}




