class Solution {
    public int maxDepth(String s) {
        
        int count=0;
        int countmax=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                count++;
                countmax=Math.max(count,countmax);
            }
            else if(c==')'){
                count--;
            }
        }
        return countmax;
    }
}