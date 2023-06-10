

public class Solution {
    public void rotate(int[][] matrix) {
        //transpose + Reverse Every Row
        //O(n2)
        int n=matrix.length;
        
        //Transpose
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                // swap(matrix,i,j);
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        
        //O(n2)
        //Reverse Every Row
         for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length/2;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j]=temp;
            }
        }
        
        
    }
} 
    

