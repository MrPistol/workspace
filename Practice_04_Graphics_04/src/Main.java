import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame {

    String title = "Graphics Template";
    Color background = Color.gray;

    void draw(Graphics2D g2) {
        final int N = 8; // number of rows and columns
        int width = getWidth();
        int height = getHeight();
        int minSide = Math.min(width, height);
        int margin = minSide/10;
        int size_square = (minSide - margin)/8;
        int startX = (width - minSide + margin)/2;
        int startY = (height - minSide + margin)/2;


        for (int k = 0; k < N; ++k) {
            for (int i = 0; i < N; ++i) {

                if ((i + k)%2 == 0) {
                    g2.setColor(Color.black);
                } else {
                    g2.setColor(Color.yellow);
                }

                g2.fillRect(startX, startY, size_square, size_square);
                startY += size_square;
            }
            startX += size_square;
            startY = (height - minSide + margin)/2;
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

