package GameOf21;

import java.util.ArrayList;
import java.util.Collections;

public class GameOf21 {
    private ArrayList<Integer> deck;
    private int userScore;
    private int computerScore;

    public GameOf21() {
        initializeDeck();
        userScore = 0;
        computerScore = 0;
    }

    private void initializeDeck() {
        deck = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            deck.add(i);
            deck.add(i);
        }
        Collections.shuffle(deck);
    }

    public int getUserScore() {
        return userScore;
    }

    public int getComputerScore() {
        return computerScore;
    }

    public void dealInitialCards() {
        for (int i = 0; i < 2; i++) {
            userScore += drawCard();
            computerScore += drawCard();
        }
    }

    private int drawCard() {
        if (deck.isEmpty()) {
            initializeDeck();
        }
        return deck.remove(0);
    }

    public void userTurn() {
        userScore += drawCard();
    }

    public void computerTurn() {
        computerScore += drawCard();
    }

    public String declareWinner() {
        if (userScore <= 21 && (userScore > computerScore || computerScore > 21)) {
            return "Congratulations! You Win!";
        } else {
            return "Computer wins. Better luck next time.";
        }
    }
}
