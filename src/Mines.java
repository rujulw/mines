import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Image;
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 * Mines handles actions when a mine button is clicked.
 */
public class Mines implements ActionListener {
    private static final String MINE_PATH = "path_to_mine_image"; // Mine image file path
    private static final int MINE_PADDING = 30;
    private static final Color DARK_BLUE = new Color(3, 26, 38);

    /**
     * Displays a mine image when a button is clicked and changes the background color.
     * @param e the action event
     */
    public void actionPerformed(ActionEvent e) {
        JButton source = (JButton) e.getSource();
        try {
            Image img = ImageIO.read(new File(MINE_PATH));
            Image scaledImg = img.getScaledInstance(source.getWidth() - MINE_PADDING, source.getHeight() - MINE_PADDING, Image.SCALE_SMOOTH);
            source.setIcon(new ImageIcon(scaledImg));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        source.setBackground(DARK_BLUE);
    }
}
