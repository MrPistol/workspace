import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame {

    String title = "Graphics Template";
    Color background = Color.black;

    void draw(Graphics2D g2) {


        int widht = getWidth();
        int height = getHeight();

        int minSize = Math.min(widht, height);

        int red = 50;
        int size = minSize;
        int alpha = 80;

        while (size > 0 && red < 255) {
            int centX = widht/2 - size/2;
            int centY = height/2 - size/2;
            g2.setColor(new Color(red, 0, 0, alpha));
            g2.fillOval(centX, centY, size, size);

            size -= 5;

            if (alpha < 100)
                alpha += 0.5;

            if (red < 255)
                red += 1;

        }

    }

    public Main() {
        setTitle(title);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUndecorated(true);
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        DrawPanel panel = new DrawPanel();
        panel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                System.exit(0);
            }
        });
        add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }

    class DrawPanel extends JPanel {
        public DrawPanel() {
            setBackground(background);
            setFocusable(true);
            requestFocusInWindow();
            setDoubleBuffered(true);
        }

        public void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g;
            RenderingHints hints = new RenderingHints(
                    RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON
            );
            g2.setRenderingHints(hints);

            super.paintComponent(g);
            draw(g2);
        }
    }

}

