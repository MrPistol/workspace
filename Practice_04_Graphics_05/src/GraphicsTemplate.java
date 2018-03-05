import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class GraphicsTemplate extends JFrame {

    String title = "Graphics Template";
    Color background = Color.black;

    void draw(Graphics2D g2) {
        final int N = 10; // number of sections
        int width = getWidth();
        int heght = getHeight();
        int minSide = Math.min(width, heght);
        int centrX = width/2;
        int centrY = heght/2;
        double alpha = 0;
        double step = 360d/N;
        g2.setColor(Color.red);


        for (int i = 0; i < N; ++i) {
            int x = (int) (centrX + Math.cos(Math.toRadians(alpha))*minSide/2);
            int y = (int) (centrY + Math.sin(Math.toRadians(alpha))*minSide/2);
            g2.drawLine(centrX, centrY, x, y);
            alpha += step;
            int prevX =(int) (centrX + Math.cos(Math.toRadians(alpha))*minSide/2);
            int prevY = (int) (centrY + Math.sin(Math.toRadians(alpha))*minSide/2);
            g2.drawLine(x, y, prevX, prevY);
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

