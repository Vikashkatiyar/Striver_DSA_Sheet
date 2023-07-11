// Approach 01(code)
/*
class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}
*/

class Solution
{
   //Jai Baba Bhole
   //O(nlogn)+O(n)
   //O(1)
    
    class ItemSet implements Comparator<Item>{
        
        
        public int compare(Item a,Item b){
            double r1=(double)a.value/(double)a.weight;
            double r2=(double)b.value/(double)b.weight;
            if(r1<r2){
                return 1;
            }else if(r1>r2){
                return -1;
            }else{
                return 0;
            }
        }
    }
    double fractionalKnapsack(int W, Item arr[], int n) 
    {
        Arrays.sort(arr,new ItemSet());
        
        double res=0.0;
        int w=W;
        
        for(int i=0;i<n;i++){
            if(w>=arr[i].weight){
                res+=(double)arr[i].value;
                w-=(double)arr[i].weight;
            }else{
                res+=((double)arr[i].value/(double)arr[i].weight)*w;
                break;
            }
        }
        
        return res;
    }
}

// Approach 02(code)

/*
class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}
*/

class Solution
{
    //Greedy Algorithum
    //Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int W, Item arr[], int n) 
    {
        
        Arrays.sort(arr,(a,b)->
            ((double)b.value/(double)b.weight>(double)a.value/(double)a.weight)?1:-1);
        double res=0.0;
        int w=W;
        
        for(int i=0;i<n;i++){
            if(arr[i].weight<=w){
                res+=arr[i].value;
                w-=arr[i].weight;
            }else{
                double v=((double)arr[i].value/(double)arr[i].weight)*(double)w;
                res+=v;
                break;
            }
        }
        return res;
    }
}
