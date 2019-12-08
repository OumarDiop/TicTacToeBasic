package tictactoebasic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner oumar = new Scanner(System.in);
        TTT game = new TTT();
        game.initializeBoard();
        System.out.println("Tic-Tac-Toe");
        do {
            System.out.println("Board:");
            game.printBoard();
            int row;
            int col;
            do {
                System.out.println("Player " + game.getCurrentPlayerMark() + " type in valid row and column:");
                row = oumar.nextInt()-1;
                col = oumar.nextInt()-1;
            }
            while (!game.placeMark(row, col));
            game.changePlayer();
        }   
        while (!game.checkForWin() && !game.isBoardFull());
        if (game.isBoardFull() && !game.checkForWin()) {
            System.out.println("Tie Game.");
        } 
        else {
            System.out.println("Board:");
            game.printBoard();
            game.changePlayer();
            System.out.println(Character.toUpperCase(game.getCurrentPlayerMark()) + " won");
        }
    }
}
