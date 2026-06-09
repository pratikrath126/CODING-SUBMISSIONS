class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==divisor)
            return 1;
        boolean sign=true;
        if(dividend>=0 && divisor<0)    sign=false;
        if(dividend<0 && divisor>0) sign=false;
        long n=Math.abs((long)dividend);
        long d=Math.abs((long)divisor);
        long q=0;
        while(n>=d){
            int count=0;
            while(n>=(d<<(count+1))){
                count++;
            }
            q+=1<<count;
            n-=(d<<count);
        }
        if(q==1<<31 && sign==true)
            return Integer.MAX_VALUE;
        
        return sign?(int)q:-(int)q;
    }
}