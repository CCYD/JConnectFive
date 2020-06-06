package jconnectfive;

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

    public void dropChecker(int column, Player player) {
        column--;
        
        
        for (int i = 7; i >= 0; i--) {
            if (gameBoard[i][column] == '*') {
                gameBoard[i][column] = player.getSymbol();
                break;
            }
        }

    }

    public void checkForWin() {

    }

}
