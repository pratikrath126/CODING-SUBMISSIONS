class Solution {
    public int lengthOfLongestSubstring(String s) {
       int arr[]=new int[256];
       Arrays.fill(arr,-1);
       int ans=0;
       int l=0;
       for(int r=0;r<s.length();r++){
        if(arr[s.charAt(r)]!=-1){
            if(arr[s.charAt(r)]>=l){
                l=arr[s.charAt(r)]+1;
            }
        }
        ans=Math.max(ans,r-l+1);
        
        arr[s.charAt(r)]=r;
       }
       return ans; 
    }
}