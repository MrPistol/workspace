import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame {

    String title = "Graphics Template";
    Color background = Color.black;

    void draw(Graphics2D g2) {
        final int RAY_COUNT = 8;
        final int RADIUS = 200;
        final Color COLOR = Color.RED;
        final double FULL_ANGLE = 2 * Math.PI;
        int widht = getWidth();
        int hight = getHeight();

        int cx = widht / 2;
        int cy = hight / 2;

        drawStar(g2,cx,cy,RADIUS,RADIUS*0.3,8,COLOR);
        drawStar(g2,cx+300,cy+300,RADIUS*0.7,RADIUS*0.3*0.7,8,Color.yellow);
        drawStar(g2,cx-300,cy+300,RADIUS*0.7,RADIUS*0.3*0.7,8,Color.yellow);
        drawStar(g2,cx+300,cy-300,RADIUS*0.7,RADIUS*0.3*0.7,8,Color.yellow);
        drawStar(g2,cx-300,cy-300,RADIUS*0.7,RADIUS*0.3*0.7,8,Color.yellow);
    }

    void drawStar (Graphics2D g2, int x, int y, double outRadius, double inRadius ,int rayCount, Color color){
        final double FULL_ANGLE = 2 * Math.PI;
        double alphaStep = FULL_ANGLE / rayCount;
        double alpha = 0;
        g2.setColor(color);

        double radius = (rayCount - 1) % 2 == 0 ? outRadius : inRadius;
        int prevEndX = (int) (x + Math.cos(alpha - alphaStep) * radius);
        int prevEndY = (int) (y + Math.sin(alpha - alphaStep) * radius);
        for (int ray = 0; ray < rayCount; ++ray, alpha += alphaStep) {
            radius = ray % 2 == 0 ? outRadius : inRadius;
            int endX = (int) (x + Math.cos(alpha) * radius);
            int endY = (int) (y + Math.sin(alpha) * radius);
            g2.drawLine(x, y, endX, endY);
            g2.drawLine(endX, endY, prevEndX, prevEndY);
            prevEndX = endX;
            prevEndY = endY;

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
