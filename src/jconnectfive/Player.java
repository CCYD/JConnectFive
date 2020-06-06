

package jconnectfive;

/**
 * This class ++Does this++
 *
 * @author Yuri Doubas
 */
public class Player {
    
    private PlayerType playerType;
    private boolean bot;
    private char symbol;
    
    public Player(PlayerType playerType, boolean bot, char playerSymbol) {
        this.playerType = playerType;
        this.bot = bot;
        this.symbol = playerSymbol;
    }
    
    public char getSymbol() {
        return this.symbol;
    }

}
