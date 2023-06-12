// Approch 01:-
class Solution {
    //Jai Baba Bhole
    //O(2n)
    //O(n)
    public int lengthOfLongestSubstring(String S) {
        Set<Character> set=new HashSet<>();
        int i=0,j=0,len=0;
        while(j<S.length()){
            if(set.add(S.charAt(j))){
                len=Math.max(len,j-i+1);
                j++;
            }else{
                set.remove(S.charAt(i));
                i++;
            }
        }
        return len;
    }
}

// Approch02:-
class Solution {
    //Jai Baba Bhole
    //O(n)
    //O(n)
    public int lengthOfLongestSubstring(String s) {
        
        int left=0;
        int right=0;
        int n=s.length();
        HashMap<Character,Integer> map=new HashMap<>();
        
        int maxLen=0;
        while(right<n){
            char ch=s.charAt(right);
            if(map.containsKey(ch)){
                left=Math.max(map.get(ch)+1,left);
            }
            
            map.put(ch,right);
            maxLen=Math.max(maxLen,right-left+1);
            right++;
            
        }
        
        return maxLen;
    }
}