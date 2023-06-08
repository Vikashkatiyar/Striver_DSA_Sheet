class Solution {
    //Jai Baba Bhole
    public double myPow(double x, int n) {
        if(n<0){
            return 1/Pow(x,-n);
        }
        return Pow(x,n);
    }
    double Pow(double x,int n){
        if(n==0){
            return 1.0;
        }
        
        double x2=Pow(x,n/2);
        
        if(n%2==0){
            x2=x2*x2;
        }else{
            x2=x2*x2*x;
        }
        return x2;
    }
}