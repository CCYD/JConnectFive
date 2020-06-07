package jconnectfive;

import java.util.Scanner;

/**
 * This class ++Does this++
 *
 * @author Yuri Doubas
 */
public class GameBoard {

    private char[][] gameBoard = new char[8][8];

    public GameBoard() {

    }

    public void startGame() {
        initBoard();
    }

    private void initBoard() {
        // fills the gameboard with astericks

        for (int floor = 0; floor < gameBoard.length; floor++) {
            for (int spot = 0; spot < gameBoard[floor].length; spot++) {
                gameBoard[floor][spot] = '*';
            }
        }

    }

    public void printBoard() {
        //Print the game board
        System.out.println("          ~~Connect Five~~");
        System.out.print(" =================================");
        for (int floor = 0; floor < gameBoard.length; floor++) {
            System.out.println("");
            for (int spot = 0; spot < gameBoard[floor].length; spot++) {
                System.out.print(" | ");
                System.out.print(gameBoard[floor][spot]);
            }
            System.out.print(" |");
            System.out.print("\n =================================");
        }
        System.out.println("\n | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 |");
    }

    public boolean dropChecker(int column, Player player) {
        //This method checks if the checker is dropped in a valid column

        //TODO: check if column is full
        //TODO: error checking
        column--;

        for (int i = 7; i >= 0; i--) {
            if (gameBoard[i][column] == '*') {
                gameBoard[i][column] = player.getSymbol();
                return true;
            }
        }
        return false;
    }

    public boolean checkForWin(Player player) {
        //This function scans the board and checks if there are 5 checkers in a row
        
        //TODO replace souts with something else....

        //Check Horizontal
        for (int floor = 0; floor < gameBoard.length; floor++) {
            for (int spot = 0; spot < gameBoard[floor].length - 3; spot++) {
                if (spot < 4) {
                    if (gameBoard[floor][spot] == player.getSymbol()
                            && gameBoard[floor][spot + 1] == player.getSymbol()
                            && gameBoard[floor][spot + 2] == player.getSymbol()
                            && gameBoard[floor][spot + 3] == player.getSymbol()
                            && gameBoard[floor][spot + 4] == player.getSymbol()) {
                        //endGame(player, false);

                        System.out.println("horizontal winrar");

                        return true;
                    }
                }
            }
        }

        //Check vertical
        for (int floor = 0; floor < gameBoard.length; floor++) {
            for (int spot = 0; spot < gameBoard[floor].length - 3; spot++) {
                if (floor < 4) {
                    if (gameBoard[floor][spot] == player.getSymbol()
                            && gameBoard[floor + 1][spot] == player.getSymbol()
                            && gameBoard[floor + 2][spot] == player.getSymbol()
                            && gameBoard[floor + 3][spot] == player.getSymbol()
                            && gameBoard[floor + 4][spot] == player.getSymbol()) {

                        System.out.println("vertical winrar");

                        return true;
                    }
                }
            }
        }

        //Check diagonal
        for (int floor = 0; floor < gameBoard.length; floor++) {
            for (int spot = 0; spot < gameBoard[floor].length; spot++) {
                if (floor < 4 && spot < 4) {
                    if (gameBoard[floor][spot] == player.getSymbol()
                            && gameBoard[floor + 1][spot + 1] == player.getSymbol()
                            && gameBoard[floor + 2][spot + 2] == player.getSymbol()
                            && gameBoard[floor + 3][spot + 3] == player.getSymbol()
                            && gameBoard[floor + 4][spot + 4] == player.getSymbol()) {

                        System.out.println("diagonal winrar");

                        return true;
                    }
                }
                if (floor < 3 && spot >= 4) {
                    if (gameBoard[floor][spot] == player.getSymbol()
                            && gameBoard[floor + 1][spot - 1] == player.getSymbol()
                            && gameBoard[floor + 2][spot - 2] == player.getSymbol()
                            && gameBoard[floor + 3][spot - 3] == player.getSymbol()
                            && gameBoard[floor + 4][spot - 4] == player.getSymbol()) {

                        System.out.println("diagonal winrar");

                        return true;
                    }
                }
            }
        }
        
        //Check if board is full
        int counter = 0;
        
         for (int floor = 0; floor < gameBoard.length; floor++) {
            for (int spot = 0; spot < gameBoard[floor].length; spot++) {
                if (gameBoard[floor][spot] != '*') {
                    counter++;
                }
            }
         }
         if (counter == gameBoard.length*gameBoard[0].length) {
             System.out.println("Board is full. No one wins");
         }
        

        return false;
    }

    public void endGame(Player player, boolean tie) {
        //move this to gamemanager
        
        //TODO: when game ends print out the board

    }

}
