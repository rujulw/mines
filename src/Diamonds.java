import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 * Diamonds handles actions when a non-mine button is clicked.
 */
public class Diamonds implements ActionListener {
    private static final String IMAGE_PATH = "path_to_image"; // Image file path
    private static final int IMAGE_PADDING = 20;
    private static final Color DARK_BLUE = new Color(3, 26, 38);

    /**
     * Displays a diamond image when a button is clicked and changes the background color.
     * @param e the action event
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton source = (JButton) e.getSource();
        try {
            Image img = ImageIO.read(new File(IMAGE_PATH));
            Image scaledImg = img.getScaledInstance(source.getWidth() - IMAGE_PADDING, source.getHeight() - IMAGE_PADDING, Image.SCALE_SMOOTH);
            source.setIcon(new ImageIcon(scaledImg));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        source.setBackground(DARK_BLUE);
    }
}