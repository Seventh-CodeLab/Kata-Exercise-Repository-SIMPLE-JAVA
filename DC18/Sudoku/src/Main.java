public class Main {
    public static void main(String[] args) {
        Sudoku board1 = new Sudoku();
        board1.printBoard(board1.getBoard());
        board1.solve(board1.getBoard());
    }
}
