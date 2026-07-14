class Solution {
    public boolean exist(char[][] board, String word) {

       // int index = 0;
        
        for(int r = 0; r < board.length; r++){
            for(int c = 0; c < board[0].length; c++){
                if(backtrack(board,word,r,c,0)){
                    return true;
                }
            }
        }  

        return false;          
        
    }
    public boolean backtrack(char[][] board,String word,int r, int c,int i){
        if(word.length() == i){
            return true;
        }
    if(word.length() == 1){
        if(word.charAt(0) == board[r][c])return true;
    }
        if(board[r][c] != word.charAt(i)){
                return false;
        }

        char temp = board[r][c];
        board[r][c] = '#';
        if(c < board[0].length -1){
            if(backtrack(board,word,r,c+1,i+1)){
                return true;
            }
        }
        if(r < board.length-1){
            if(backtrack(board,word,r+1,c,i+1)){
                return true;
            }
        }
        if(r > 0){
            if(backtrack(board,word,r-1,c,i+1)){
                return true;
            }
        }

        if(c > 0){
            if(backtrack(board,word,r,c-1,i+1)){
                return true;
            }
        }

        board[r][c] = temp;
        //e = e.substring(0,e.length() - 1);


        
        return false;
    }

        
}
