class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int [] nums3=new int[nums1.length+nums2.length];
        int i=0; int mid=nums1.length;
        int j=0;  int high=nums2.length;
        int k=0;
        while(i<mid && j<high){
            if(nums1[i]>nums2[j]){
                nums3[k++]=nums2[j++];
            }
            else
                nums3[k++]=nums1[i++];
        }
        for(;i<mid;i++)
            nums3[k++]=nums1[i];
        for(;j<high;j++)
            nums3[k++]=nums2[j];
        if(nums3.length%2==1){
             int x=nums3.length/2;
            return (double)nums3[x];
        }
        
            int x=nums3.length/2;
            int y=x-1;
           
            return (double) (nums3[x]+nums3[y])/2.0;
        
        
    }
}