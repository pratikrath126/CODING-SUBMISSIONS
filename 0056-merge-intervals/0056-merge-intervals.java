class Solution {
    public int[][] merge(int[][] intervals) {
     Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));

     List<int[]> merged=new ArrayList<>();
    int i=0;
    int n=intervals.length;
    while(i<n){
        int start=intervals[i][0];
        int end=intervals[i][1];
        int j=i+1;
        while(j<n && intervals[j][0]<=end){
            end=Math.max(end,intervals[j][1]);
            j++;
        }
        int [] temp={start,end};
        merged.add(temp);
        i=j;
    }
    return merged.toArray(new int[merged.size()][2]);
    }
}