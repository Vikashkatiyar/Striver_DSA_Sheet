// problem link -> https://www.codingninjas.com/studio/problems/find-minimum-number-of-coins_975277

//gfg problem link->https:practice.geeksforgeeks.org/problems/-minimum-number-of-coins4426/1?

// Coding Ninja Solution
import java.util.* ;
import java.io.*; 
public class Solution
{
public static int findMinimumCoins(int amount)
    {
        int arr[]={1,2,5,10,20,50,100,500,1000};
        int n=arr.length;

        int coin=0;
       for(int i=n-1;i>=0;i--){

            while(amount>=arr[i]){
                coin++;
                amount-=arr[i];
            }
       }

    return coin;
    }
}

//GFG Solution
// User function Template for Java

class Solution{
    static List<Integer> minPartition(int amount)
    {
        int arr[]={1,2,5,10,20,50,100,200,500,2000};
       int n=arr.length;

       List<Integer> list=new ArrayList<>();
       for(int i=n-1;i>=0;i--){

        while(amount>=arr[i]){
            list.add(arr[i]);
            amount-=arr[i];
        }
       } 

    return list;
        
    }
}
