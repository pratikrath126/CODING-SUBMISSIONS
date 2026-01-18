class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        
        if(bloomDay.length<(long)m*k)
            return -1;
        int min=Integer.MAX_VALUE; int max=Integer.MAX_VALUE;
        for(int i=0;i<bloomDay.length;i++){
            min=Math.min(min,bloomDay[i]);
            max=Math.max(max,bloomDay[i]);
        }
        long low=min;
        long high=max;
        int ans=max;
        while(low<=high){
            long mid=(low+high)/2;
            if(isPossible(bloomDay,(int)mid,m,k)){
                ans=(int)mid;
                high=mid-1;
            }
            else
                low=mid+1;
        }
        return ans;
    }
    public boolean isPossible(int [] arr,int day,int m,int k){
        int count=0; int bookh=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=day)
                count++;
            else{
                bookh+=count/k;
                count=0;
            }
        }
        bookh+=count/k;
        if(bookh>=m)
            return true;
        else
            return false;
    }
}