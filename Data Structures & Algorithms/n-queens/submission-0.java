class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        boolean[][] board = new boolean[n][n];

        backtrack(n,0,board,new ArrayList<>(),result);
        return result;
                
    }



    public void backtrack(int n, int r,boolean[][] board, List<String>queen,List<List<String>>result){
        if(r == n){
            result.add(new ArrayList(queen));
            // c = 4 , r == 0;            
            return;
        }


        for(int col = 0; col < n; col++){

            if(isSafe(board,r,col)){
                board[r][col] = true;

                StringBuilder row = new StringBuilder();
                for(int i = 0; i < n; i++){
                    if(i == col) row.append("Q");
                    else row.append(".");
                }
                queen.add(row.toString());
                backtrack(n,r+1,board,queen,result);
                queen.remove(queen.size()-1);
                board[r][col] = false;
            }         
            
        
        }           
            
    }

    public boolean isSafe(boolean[][] board,int r, int col){

        for(int i = 0; i < r; i++){
            // vertical check
            if(board[i][col]){
                return false;
            }          
        }

        // check right
        for(int i = 1; i <= Math.min(r,board.length - col - 1); i++){
            if(board[r-i][col + i]){
                return false;
            }
        }

        // check left
        for(int i = 1; i <= Math.min(r,col); i++){
            if(board[r - i][col - i]){
                return false;
            }
        }

        return true;
    }
}
