import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame {

    String title = "Graphics Template";
    Color background = Color.black;

    void draw(Graphics2D g2) {
        final int N = 26; // number of vertices
        final int M = 12; // number of vertices you have skip connecting them
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
            double beta = alpha + (M-1)*step;
            int prevX =(int) (centrX + Math.cos(Math.toRadians(beta))*minSide/2);
            int prevY = (int) (centrY + Math.sin(Math.toRadians(beta))*minSide/2);
            g2.drawLine(x, y, prevX, prevY);
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

