public class Board {

    private int size;
    private Cell[][] board;

    public Board(int size) {

        this.size = size;
        board = new Cell[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = new Cell(i, j, Symbol.EMPTY);
            }
        }

    }

    public boolean placeMove(int row, int column, Symbol symbol) {
        if (row < 0 || row >= size || column < 0 || column >= size) {
            System.out.println("Invalid move!");
            return false;
        }

        if (board[row][column].getSymbol() != Symbol.EMPTY) {
            System.out.println("Cell already occupied!");
            return false;
        }

        board[row][column].setSymbol(symbol);
        return true;

    }

    public boolean checkWinner(int row, int col, Symbol symbol) {

        return checkRow(row, symbol) ||
                checkColumn(col, symbol) ||
                checkMainDiagonal(symbol) ||
                checkAntiDiagonal(symbol);

    }

    public boolean checkRow(int row, Symbol symbol) {

        for (int j = 0; j < size; j++) {

            if (board[row][j].getSymbol() != symbol) {
                return false;
            }

        }

        return true;
    }

    public boolean checkColumn(int col, Symbol symbol) {

        for (int i = 0; i < size; i++) {

            if (board[i][col].getSymbol() != symbol) {
                return false;
            }

        }

        return true;
    }

    public boolean checkAntiDiagonal(Symbol symbol) {

        for (int i = 0; i < size; i++) {

            if (board[i][size - 1 - i].getSymbol() != symbol) {
                return false;
            }

        }

        return true;
    }

    public boolean checkMainDiagonal(Symbol symbol) {

        for (int i = 0; i < size; i++) {

            if (board[i][i].getSymbol() != symbol) {
                return false;
            }

        }

        return true;
    }

    public boolean isEmpty(int row, int col) {
        return board[row][col].getSymbol() == Symbol.EMPTY;
    }

    public boolean isDraw() {

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

                if (board[i][j].getSymbol() == Symbol.EMPTY) {
                    return false;
                }

            }
        }
        return true;

    }

    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(board[i][j].getSymbol() + " ");
            }
            System.out.println();
        }
    }

}
