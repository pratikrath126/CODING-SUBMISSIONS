class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=piles[0];
        for(int i=1;i<piles.length;i++){
            if(piles[i]>max)
                max=piles[i];
        }
        int low=1;
        int high=max;
        int ans=max;
        while(low<=high){
            int mid=(low+high)/2;
            int time=timeToEat(piles,mid);
            if(time<=h){
                ans=mid;
                high=mid-1;
            }
            else
                low=mid+1;
        }
        return ans;//or low as low starts as maybe possible ans high is max possible ans at end high ends at not possible ans low ends up at min possible ans 
    }
    public int timeToEat(int [] piles,int ph){
        int ans=0;
        for(int i=0;i<piles.length;i++){
            ans+=Math.ceil((double)piles[i]/ph);
        }
        return ans;
    }
}