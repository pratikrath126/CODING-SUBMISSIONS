class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int i=0; int mid=nums1.length;
        int j=0;  int high=nums2.length;
        int k=0;
        int ele1=Integer.MIN_VALUE;
        int ele2=Integer.MIN_VALUE;
        int index1=(nums1.length+nums2.length)/2;
        int count=0;
        int index2=index1-1;
        while(i<mid && j<high){
            if(nums1[i]>nums2[j]){
                if(count==index1) ele1=nums2[j];
                if(count==index2) ele2=nums2[j];
                j++;
                count++;
            }
            else{
                if(count==index1) ele1=nums1[i];
                if(count==index2) ele2=nums1[i];
                i++;
                count++;
            }
               
        }
        for(;i<mid;i++){
             if(count==index1) ele1=nums1[i];
             if(count==index2) ele2=nums1[i];
                count++;
        }
            
        for(;j<high;j++){
            if(count==index1) ele1=nums2[j];
            if(count==index2) ele2=nums2[j];
                count++;
        }
          
        if((nums1.length+nums2.length)%2==1){
             
            return (double)ele1;
        }
        

           
            return (double) (ele1+ele2)/2.0;
        
        
    }
}