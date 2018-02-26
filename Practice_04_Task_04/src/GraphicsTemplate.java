import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class GraphicsTemplate extends JFrame {

    String title = "Graphics Template";
    Color background = Color.BLACK;

    void draw(Graphics2D g2) {
        int count = 0;
        int width = getWidth();
        int height = getHeight();

        while (count < 200) {

            int randX = (int) (Math.random()*(width - 100));
            int randY = (int) (Math.random()*(height - 100));
            int randDiameter = (int) (5 + Math.random()*100);
            int randRed = (int) (0 + Math.random()*255);
            int randGreen = (int) (0 + Math.random()*255);
            int randBlue = (int) (0 + Math.random()*255);
            int randAlpha = (int) (90 + Math.random()*100);


            g2.setColor(new Color(randRed, randGreen, randBlue, randAlpha));
            g2.fillOval(randX, randY, randDiameter, randDiameter);
            ++count;
        }
    }

    public GraphicsTemplate() {
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
        new GraphicsTemplate();
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