class Solution {
    //Jai Baba Bhole
    public boolean searchMatrix(int[][] matrix, int target) {
        //O(log(m*n))
        int lo=0;
        int hi=matrix[0].length-1;
        
        while(lo< matrix.length && hi>=0){
            if(matrix[lo][hi]==target){
                return true;
            }else if(matrix[lo][hi]>target){
                hi--;
            }else if(matrix[lo][hi]<target){
                lo++;
            }
        }
        return false;
    }
}