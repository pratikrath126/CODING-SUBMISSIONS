class Solution {
    public String removeKdigits(String num, int k) {
        Deque<Character> st=new ArrayDeque<>();
        
        for(int i=0;i<num.length();i++){
            while(!st.isEmpty() && k>0 && st.peek()>num.charAt(i)){
                st.pop();
                k=k-1;
            }
            st.push(num.charAt(i));
        }
        while(k>0){
            k--;
            st.pop();
        }
        if(st.isEmpty())
            return "0";
     StringBuilder res = new StringBuilder();

        // Add digits from stack to result
        while (!st.isEmpty()) {
            res.append(st.pop());
        }

        // Trim the leading zeros
        while (res.length() > 0 && res.charAt(res.length() - 1) == '0') {
            res.deleteCharAt(res.length() - 1);
        }

        // Reverse the string to get the correct number
        res.reverse();

        // If result is empty, return "0"
        if (res.length() == 0) return "0";

        // Return the result as a string
        return res.toString();
        


    }
}