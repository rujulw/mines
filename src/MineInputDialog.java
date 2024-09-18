import javax.swing.*;
import java.awt.*;

/**
 * MineInputDialog displays a dialog to input the number of mines.
 */
public class MineInputDialog extends JFrame {
    private int numberOfMines;

    /**
     * Initializes the dialog for mine input.
     */
    public MineInputDialog() {
        setTitle("Mine Input Dialog");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setLocationRelativeTo(null);
        askNumberOfMines();
    }

    /**
     * Prompts the user for the number of mines.
     */
    private void askNumberOfMines() {
        String input = JOptionPane.showInputDialog(this, "How many mines?", "Mine Input", JOptionPane.QUESTION_MESSAGE);
        if (input != null) {
            try {
                numberOfMines = Integer.parseInt(input);
                setVisible(false);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Invalid input. Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
                askNumberOfMines();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Input canceled. Setting default number of mines to 10.", "Info", JOptionPane.INFORMATION_MESSAGE);
            numberOfMines = 10;
            setVisible(false);
        }
    }

    /**
     * Returns the number of mines input by the user.
     * @return number of mines
     */
    public int getNumberOfMines() {
        return numberOfMines;
    }
}
