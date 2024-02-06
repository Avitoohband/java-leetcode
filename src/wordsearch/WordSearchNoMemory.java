package src.wordsearch;

public class WordSearchNoMemory {
    public static void main(String[] args) {
        char[][] board = {{'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}};

        String word = "ABCCED";

        System.out.println(exist(board, word));

    }

    public static boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (solve(board, i, j, word, 0))
                    return true;
            }
        }
        return false;
    }

    private static boolean solve(char[][] board, int row, int col, String word, int currentLength) {
        if (!isValidMove(board, row, col))
            return false;
        if (board[row][col] != word.charAt(currentLength))
            return false;
        if (currentLength == word.length() - 1)
            return true;

        int[][] moves = {{-1, 0}, {1, 0}, {0, 1}, {0, -1}};

        char backup = board[row][col];
        board[row][col] = 0;
        for (int[] move : moves) {
            int moveRow = row + move[0];
            int moveCol = col + move[1];

            if (solve(board, moveRow, moveCol, word, currentLength + 1))
                return true;
        }
        board[row][col] = backup;

        return false;
    }

    private static boolean isValidMove(char[][] board, int row, int col) {
        return (row >= 0 && row < board.length
                && col >= 0 && col < board[0].length
                && board[row][col] != 0);
    }
}
