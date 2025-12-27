class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> l= new ArrayList<>();
        
        for(int i=1;i<=numRows;i++){
            l.add(genRow(i));
        }
        return l;
    }
    public List<Integer> genRow(int row){
            List<Integer> temp= new ArrayList<>();
            temp.add(1);
            int res=1;
            for(int col=1;col<row;col++){
                res=res*(row-col);
                res=res/col;
                temp.add(res);
            }
            return temp;
        } 
}