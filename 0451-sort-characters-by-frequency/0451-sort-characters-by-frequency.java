class Solution {
    public String frequencySort(String s) {
         StringBuilder b=new StringBuilder();
         HashMap<Character,Integer> hs=new HashMap<>();
         for(char c:s.toCharArray()){
            hs.put(c,hs.getOrDefault(c,0)+1);
         }
         List<Character> l =new ArrayList<>(hs.keySet());
         l.sort((obj1,obj2)->hs.get(obj2)-hs.get(obj1));
         for(char c :l){
            for(int i=0;i<hs.get(c);i++){
                b.append(c);
            }
         }
         return b.toString();
    }
}