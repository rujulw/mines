import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * MinesGUI is the main graphical interface for the game.
 */
public class MinesGUI extends JFrame {
    private static final int GRID_SIZE = 5;
    private static final Color LIGHT_BLUE = new Color(45, 71, 92);
    private static final Color DEEP_BLUE = new Color(11, 36, 56);

    /**
     * Initializes the Mines game GUI with a grid of buttons.
     */
    public MinesGUI() {
        setTitle("Mines");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(GRID_SIZE, GRID_SIZE));

        Random rand = new Random();
        int mine1 = rand.nextInt(GRID_SIZE * GRID_SIZE);
        int mine2 = rand.nextInt(GRID_SIZE * GRID_SIZE);
        int mine3 = rand.nextInt(GRID_SIZE * GRID_SIZE);

        for (int i = 0; i < GRID_SIZE * GRID_SIZE; i++) {
            JButton button = new JButton();
            button.setOpaque(true);
            button.setBackground(LIGHT_BLUE);
            button.setBorder(BorderFactory.createLineBorder(DEEP_BLUE, 4));
            if (i == mine1 || i == mine2 || i == mine3) {
                button.addActionListener(new Mines());
            } else {
                button.addActionListener(new Diamonds());
            }
            add(button);
        }

        setVisible(true);
    }

    /**
     * Main method to run the Mines game GUI.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(MinesGUI::new);
    }
}