class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String>set=new HashSet<>();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if (board[i][j]=='.'){
                    continue;
                }
            if (set.contains(i+"row"+board[i][j]) ||
                set.contains(j+"col"+board[i][j]) ||
                set.contains(i/3+"row"+j/3+"col"+board[i][j])){
                return false;
            }
            set.add(i+"row"+board[i][j]);
            set.add(j+"col"+board[i][j]);
            set.add(i/3+"row"+j/3+"col"+board[i][j]);
            }
        }    
    return true;
    }
}