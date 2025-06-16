package xyz;

import java.util.*;

public class NQueens {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        backtrack(result, board, 0);
        return result;
    }

    private void backtrack(List<List<String>> result, char[][] board, int row) {
        if (row == board.length) {
            List<String> solution = new ArrayList<>();
            for (char[] chars : board) {
                solution.add(new String(chars));
            }
            result.add(solution);
            return;
        }
        for (int col = 0; col < board.length; col++) {
            if (isValid(board, row, col)) {
                board[row][col] = 'Q';
                backtrack(result, board, row + 1);
                board[row][col] = '.';
            }
        }
    }

    private boolean isValid(char[][] board, int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 'Q' && (j == col || Math.abs(j - col) == row - i)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        NQueens solution = new NQueens();
        int n = 4;
        List<List<String>> result = solution.solveNQueens(n);
        for (List<String> solutionList : result) {
            for (String s : solutionList) {
                System.out.println(s);
            }
            System.out.println();
        }
    }
}