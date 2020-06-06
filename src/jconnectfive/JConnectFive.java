package jconnectfive;

import java.util.Scanner;

/**
 * This class ++Does this++
 *
 * @author Yuri Doubas
 */
public class JConnectFive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TODO: Ask user if they want to play against a bot or a player.
        //TODO: ai logic
        //TODO: menu

        Player player = new Player(PlayerType.A, false, 'A');

        Player player2 = new Player(PlayerType.B, false, 'B');

        Scanner input = new Scanner(System.in);

        GameBoard board = new GameBoard();
        board.startGame();

        while (true) {
            board.printBoard();
            System.out.print(player.getSymbol() + "'s turn\nColumn: ");
            board.dropChecker(input.nextInt(), player);

            board.printBoard();
            System.out.print(player2.getSymbol() + "'s turn\nColumn: ");
            board.dropChecker(input.nextInt(), player2);
            
            

        }
/*
        board.printBoard();

        board.dropChecker(1, player);

        board.printBoard();

        board.dropChecker(2, player2);

        board.printBoard();

        board.dropChecker(1, player);

        board.printBoard();
*/
    }

}
