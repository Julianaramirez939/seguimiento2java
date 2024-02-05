package GameOf21;

import javax.swing.JOptionPane;

public class MainGameOf21 {
    public static void main(String[] args) {
        GameOf21 game = new GameOf21();

        game.dealInitialCards();

        int userChoice;
        do {
            userChoice = JOptionPane.showConfirmDialog(null, "Do you want to draw another card?", "Game of 21",
                    JOptionPane.YES_NO_OPTION);

            if (userChoice == JOptionPane.YES_OPTION) {
                game.userTurn();
                game.computerTurn();
                JOptionPane.showMessageDialog(null, "Your current score: " + game.getUserScore());
            }

        } while (userChoice == JOptionPane.YES_OPTION && game.getUserScore() <= 21 && game.getComputerScore() <= 21);

        JOptionPane.showMessageDialog(null, game.declareWinner());
    }
}
