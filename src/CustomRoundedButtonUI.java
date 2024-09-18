import javax.swing.*;
import javax.swing.plaf.basic.BasicButtonUI;
import java.awt.*;

/**
 * CustomRoundedButtonUI provides a rounded UI for buttons with antialiasing.
 */
public class CustomRoundedButtonUI extends BasicButtonUI {
    private static final int RADIUS = 15;

    /**
     * Paints the button with a rounded background, border, and centered text.
     * @param g the Graphics object
     * @param c the component being painted
     */
    @Override
    public void paint(Graphics g, JComponent c) {
        JButton button = (JButton) c;
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Paint background
        if (button.isContentAreaFilled()) {
            g2.setColor(button.getBackground());
            g2.fillRoundRect(0, 0, button.getWidth(), button.getHeight(), RADIUS, RADIUS);
        }

        // Paint border
        if (button.isBorderPainted()) {
            g2.setColor(button.getForeground());
            g2.drawRoundRect(0, 0, button.getWidth() - 1, button.getHeight() - 1, RADIUS, RADIUS);
        }

        // Paint text
        FontMetrics fm = g2.getFontMetrics();
        Rectangle r = new Rectangle(0, 0, button.getWidth(), button.getHeight());
        Rectangle textRect = new Rectangle();
        SwingUtilities.layoutCompoundLabel(
                button, g2.getFontMetrics(), button.getText(), null,
                button.getVerticalAlignment(), button.getHorizontalAlignment(),
                button.getVerticalTextPosition(), button.getHorizontalTextPosition(),
                r, new Rectangle(), textRect, 0);
        
        g2.setColor(button.getForeground());
        g2.drawString(button.getText(), textRect.x, textRect.y + fm.getAscent());
        g2.dispose();
    }

    /**
     * Adjusts the button size to fit the rounded edges.
     * @param c the component
     * @return the adjusted Dimension
     */
    @Override
    public Dimension getPreferredSize(JComponent c) {
        Dimension d = super.getPreferredSize(c);
        d.width += RADIUS;
        return d;
    }
}
