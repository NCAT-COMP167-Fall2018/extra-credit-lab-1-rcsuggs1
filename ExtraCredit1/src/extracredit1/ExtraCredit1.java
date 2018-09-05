/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extracredit1;

/**
 *
 * @author rodneysuggs
 */
public class ExtraCredit1 {

    private static char[][] gameBoard;

    public static void main(String[] args) {
        gameBoard = createBoard('b');
        printBoard();

    }

    private static char[][] createBoard(char startingCharacter) {
        char[][] board = new char [6][7];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = startingCharacter;
            }
        }
        return board;
    }

    private static void printBoard() {
        
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard.length; j++) {
                
                System.out.print(gameBoard[i][j] + " | ");
                
                   

          
            }
            
             System.out.println(" ");
        }

    }

}
