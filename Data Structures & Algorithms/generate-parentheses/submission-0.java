class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        if(n==1){
            result.add("()");
            return result;
        }
        backtrack(n,result,0,0,"");
        return result;
    }

    public void backtrack(int n,List<String> result,int openCount,int closedCount,String paran){
        
        if(paran.length() == n * 2){
            result.add(paran);
            return ;
        }
        
        if(openCount < n){
            paran = paran + "(";
        backtrack(n,result,openCount+1,closedCount,paran);
        paran = paran.substring(0,paran.length()-1);
            
        }
        if(closedCount < openCount){
            paran = paran + ")";
            backtrack(n,result,openCount,closedCount+1,paran);

        }
        // backtrack(n,result,openCount+1,closedCount+1,paran);

    }
}
