package src.wordsearch;

public class WordSearch {
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
                if (solve(board, i, j, word, "")) return true;
            }
        }
        return false;
    }

    private static boolean solve(char[][] board, int row, int col, String word, String attempt) {
        if (word.equals(attempt)) return true;

        if (row >= board.length || row < 0
                || col >= board[0].length || col < 0
                || board[row][col] == '0'
                || attempt.length() >= word.length()) return false;

        String newAttempt = attempt + board[row][col];
        char temp = board[row][col];
        board[row][col] = '0';
        // hor
        if (solve(board, row - 1, col, word, newAttempt)) return true;
        if (solve(board, row + 1, col, word, newAttempt)) return true;

        //ver
        if (solve(board, row, col + 1, word, newAttempt)) return true;
        if (solve(board, row, col - 1, word, newAttempt)) return true;

        board[row][col] = temp;


        return false;
    }
}
