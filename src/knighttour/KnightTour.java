package src.knighttour;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class KnightTour {
    public static void main(String[] args) {
        boolean[][] chessBoard = new boolean[8][8];
        for (boolean[] row : chessBoard) {
            Arrays.fill(row, false);
        }
        knightTour(chessBoard);
    }

    private static void knightTour(boolean[][] chessBoard) {
        Set<String> route = new HashSet<>();
        if (generateRoute(chessBoard, route)) {
            printChessBoard(chessBoard);
            System.out.println(route.size());
            System.out.println(route);
        }
    }

    private static boolean generateRoute(boolean[][] chessBoard, Set<String> route) {
        return generateRouteHelper(chessBoard, route, 0, 0);
    }

    private static boolean generateRouteHelper(boolean[][] chessBoard, Set<String> route, int row, int col) {
        if (route.size() == (chessBoard.length * chessBoard[0].length)) {
            return true;
        }
        int[][] moves = {{-2, -1}, {-1, -2}, {-2, 1}, {-1, 2}, {2, -1}, {2, 1}, {1, -2}, {1, 2}};

        for (int[] move : moves) {
            int rowMove = row + move[0];
            int colMove = col + move[1];
            if (isValidDirectionAndNotVisited(chessBoard, rowMove, colMove)) {
                route.add(rowMove + "," + colMove);
                chessBoard[rowMove][colMove] = true;

                if (generateRouteHelper(chessBoard, route, rowMove, colMove)) {
                    return true;
                }
                route.remove(rowMove + "," + colMove);
                chessBoard[rowMove][colMove] = false;

            }
        }
        return false;
    }

    private static boolean isValidDirectionAndNotVisited(boolean[][] chessBoard, int row, int col) {
        return (
                (row >= 0 && row < chessBoard.length)
                        && (col >= 0 && col < chessBoard[0].length)
                        && !chessBoard[row][col]
        );
    }

    private static void printChessBoard(boolean[][] chessBoard) {
        for (boolean[] row : chessBoard) {
            System.out.println(Arrays.toString(row));
        }
    }
}
