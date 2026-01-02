class Solution {
    public int mergesort(int [] nums, int low,int high){
        int count=0;
        if(low>=high)
            return count;
        int mid=(low+high)/2;
        count+=mergesort(nums,low,mid);
        count+=mergesort(nums,mid+1,high);
        count+=revPairs(nums,low,mid,high);
        merge(nums,low,mid,high);
        return count;
    }
    public void merge(int [] nums,int low,int mid,int high){
        ArrayList<Integer> l=new ArrayList<>();
        int i=low;
        int j=mid+1;
        
        while(i<=mid && j<=high){
            if(nums[i]<=nums[j]){
                l.add(nums[i++]);
            }
            else{
                l.add(nums[j++]);
            }
        }
        while(i<=mid){
            l.add(nums[i++]);
            }
        while(j<=high){
            l.add(nums[j++]);
        }
        int k=0;
        for(i=low;i<=high;i++)
            nums[i]=l.get(k++);
    }
    public int revPairs(int [] nums,int low,int mid,int high){
        int count=0;
        int j=mid+1;
        for(int i=low;i<=mid;i++){

            while(j<=high && (long)nums[i]>(long)2*nums[j])
                j++;
            count+=(j-(mid+1));
        }
        return count;

    }
    public int reversePairs(int[] nums) {
        return mergesort(nums,0,nums.length-1);
        
    }
}