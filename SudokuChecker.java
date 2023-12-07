public class SudokuChecker {
    public static boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            if (!isValidRow(board, i) || !isValidColumn(board, i) || !isValidBox(board, i / 3 * 3, i % 3 * 3)) {
                return false;
            }
        }
        return true;
    }
    private static boolean isValidRow(char[][] board, int row) {
        boolean[] seen = new boolean[9];
        for (int i = 0; i < 9; i++) {
            char num = board[row][i];
            if (num != '.') {
                if (seen[num - '1']) {
                    return false;
                }
                seen[num - '1'] = true;
            }
        }
        return true;
    }
    private static boolean isValidColumn(char[][] board, int col) {
        boolean[] seen = new boolean[9];
        for (int i = 0; i < 9; i++) {
            char num = board[i][col];
            if (num != '.') {
                if (seen[num - '1']) {
                    return false;
                }
                seen[num - '1'] = true;
            }
        }
        return true;
    }
    private static boolean isValidBox(char[][] board, int startRow, int startCol) {
        boolean[] seen = new boolean[9];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                char num = board[startRow + i][startCol + j];
                if (num != '.') {
                    if (seen[num - '1']) {
                        return false;
                    }
                    seen[num - '1'] = true;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        char[][] board1 = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        char[][] board2 = {
                {'8', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        System.out.println(isValidSudoku(board1));  
        System.out.println(isValidSudoku(board2));  
    }
}