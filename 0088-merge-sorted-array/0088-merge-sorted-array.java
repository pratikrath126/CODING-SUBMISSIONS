class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int a1=m-1;
        int a2=n-1;
        int right=nums1.length-1;
        while(a2>=0){
            if(a1>=0 && nums1[a1]>=nums2[a2]){
                nums1[right]=nums1[a1];
                a1--;
            }
            else{
                nums1[right]=nums2[a2];
                a2--;
            }
            right--;
        }
        
    }
}