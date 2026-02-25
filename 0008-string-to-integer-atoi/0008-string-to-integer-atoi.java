class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        if(s.length()==0)
            return 0;
        long result=0;
        int sign=1;
        if(s.charAt(0)=='-')
            sign=-1;
        int min=Integer.MIN_VALUE,max=Integer.MAX_VALUE;
        int i=(s.charAt(0)=='+'||s.charAt(0)=='-')?1:0;
        while(i<s.length()){
            if(!Character.isDigit(s.charAt(i)))
                break;
            result=result*10+(s.charAt(i)-'0');
            if(sign==-1 && sign*result<min) return min;
            if(sign==1 && sign*result>max) return max;   
            i++;
        }
        return (int)(sign*result);
    }
}