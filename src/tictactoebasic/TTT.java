package tictactoebasic;

public class TTT {
    
    private char [][] board;
    private char currentPlayerMark;
    
    public TTT(){}
    
    public void initializeBoard() {
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }
    
    public void printBoard() {
        System.out.println("-------------");
        
        for(int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.println(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }       
    }
    /*
    public boolean isBoardFull() {
        
    }
    
    public boolean checkForWin() {
        return(
        checkRowsForWin(); ||
        checkColumnsForWin(); ||
        checkDiagonalsForWin();
    )
    }
    */
    private boolean checkRowsForWin() {
        for( int i =0; i<3;i++ ) {
            if (checkRowCol(board[i][0], board[i][1], board[i][2]) == true) {
                return true;
            }
        }
        return false;
    }
    
    private boolean checkDiagonalsForWin() {
        return(checkRowCol(board[0][0], board[1][1], board[2][2]) == true) || (checkRowCol(board[0][2], board[1][1], board[2][0])== true);
    }
    
    private boolean checkColumnsForWin() {
        for( int i =0; i<3;i++ ) {
            if (checkRowCol(board[0][i], board[i][1], board[i][2]) == true) {
                return true;
            } 
       }
        return false;
    }
    
    private boolean checkRowCol(char c1, char c2, char c3) {
        return (c1 != '-' && c1 == c2 && c2 == c3);
    }
    
    private void changePlayer() {
        if (currentPlayerMark == 'x') {
            currentPlayerMark = 'o';
        }
        else {
            currentPlayerMark = 'x';
        }
    }
    
    
   
}
