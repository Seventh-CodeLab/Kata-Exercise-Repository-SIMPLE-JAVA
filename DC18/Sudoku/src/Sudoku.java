public class Sudoku {
    int[][] board = new int[][]{
            { 8, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 3, 6, 0, 0, 0, 0, 0 },
            { 0, 7, 0, 0, 9, 0, 2, 0, 0 },
            { 0, 5, 0, 0, 0, 7, 0, 0, 0 },
            { 0, 0, 0, 0, 4, 5, 7, 0, 0 },
            { 0, 0, 0, 1, 0, 0, 0, 3, 0 },
            { 0, 0, 1, 0, 0, 0, 0, 6, 8 },
            { 0, 0, 8, 5, 0, 0, 0, 1, 0 },
            { 0, 9, 0, 0, 0, 0, 4, 0, 0 }
    };

    Sudoku(){ } //Uses default Board

    // ================== RULE START =====================
    //Get the current board
    public int[][] getBoard(){
        return board;
    }

    //Check if row contains a number x
    private boolean isInRow(int row, int x){
        for(int i = 0; i < board[row].length; i++){
            if (board[row][i] == x){
                return true;
            }
        }
        return false;
    }

    //Check if column contains a number x
    private boolean isInCol(int col, int x){
        for(int i = 0; i < board.length; i++){
            if (board[i][col] == x){
                return true;
            }
        }
        return false;
    }

    //Check if box contains a number x
    private boolean isInBox(int row, int col, int x){
        int r = row - row % 3;
        int c = col - col % 3;

        for (int i = r; i < r+3; i++){
            for (int j = c; j<c+3; j++){
                if (board[i][j] == x){
                    return true;
                }
            }
        }
        return false;
    }

    //Goes through all checks and makes sure move is legal
    private boolean isLegal(int row, int col, int x){
        return !isInRow(row,x) && !isInCol(col,x) && !isInBox(row,col,x);
    }

    // ================== RULE END =====================


    //Prints out the board for display
    public void printBoard(int[][] board){
        System.out.println("==================!");
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }


    public boolean solve(int[][] board){
        //Iterate through board
        for(int i = 0; i < board.length; i++){
            for (int j = 0; j < board[i].length; j++){
                if (board[i][j] == 0) {
                    //Try value to empty cells
                    for (int num = 1; num <= board[i].length; num++){
                        if (isLegal(i,j,num)){
                            board[i][j] = num;
                            if (solve(board)){
                                return true;
                            } else {
                                board[i][j] = 0;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        printBoard(board);
        return true;
    }
}
