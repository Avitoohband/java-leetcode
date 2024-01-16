package src.validsudoku;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    public static void main(String[] args) {


        char[][] board =
                {{'5', '3', '.', '.', '7', '.', '.', '.', '.'}
                        , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                        , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                        , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                        , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                        , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                        , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                        , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                        , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

        System.out.println(isValidSudoku(board));
    }


    private static boolean isValidSudoku(char[][] board) {
        Set<String> seenSet = new HashSet<>();
        int n = 9;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] != '.') {
                    if (
                            !seenSet.add(String.format("%c in row %d", board[i][j], i)) ||
                                    !seenSet.add(String.format("%c in col %d", board[i][j], j)) ||
                                    !seenSet.add(String.format("%c in box %d-%d", board[i][j], i / 3, j / 3))) {
                        return false;
                    }
                }
            }

        }
        return true;
    }

    private static void printSudokoBoard(char[][] board) {
        for (char[] chars : board) {
            System.out.println(Arrays.toString(chars));
        }
    }

}
