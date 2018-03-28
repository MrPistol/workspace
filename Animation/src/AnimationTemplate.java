import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class AnimationTemplate extends JFrame {

    String title = "Animation Template";
    Color background = Color.black;
    int delay = 33;

    // Ваши переменные
    final int COUNT_FLAKE = 1000;

    int[] arrayX = new int[COUNT_FLAKE];
    int[] arrayY = new int[COUNT_FLAKE];
    int[] arrayRed = new int[COUNT_FLAKE];
    int[] arrayGreen = new int[COUNT_FLAKE];
    int[] arrayBlue = new int[COUNT_FLAKE];
    double[] arrayDiametr = new double[COUNT_FLAKE];


    void start() {
        // код для инициализации

        for (int i = 0; i < COUNT_FLAKE; ++i) {
            arrayX[i] = random(1, 1920);
            arrayY[i] = random(0, -1000);
            arrayRed[i] = random(150, 255);
            arrayGreen[i] = random(150, 255);
            arrayBlue[i] = random(150, 255);
            arrayDiametr[i] = random(5, 100);
        }


    }

    public int random(int min, int max) {
        return (int) (min + Math.random()*(max - min + 1));
    }

    void update() {
        // код для обновления свойств объектов
        for (int i = 0; i < COUNT_FLAKE; ++i) {
                if (i%3 == 1) {
                    arrayX[i] += 1;
                    arrayY[i] += 1;
                } else if (i%3 == 2) {
                    arrayX[i] -= 1;
                    arrayY[i] += 2;
                } else arrayY[i] += 3;

        }

    }

    void draw(Graphics2D g2) {

        // код для рисования следующего кадра

        for (int i = 0; i < COUNT_FLAKE; ++i) {


            g2.setColor(new Color(arrayRed[i], arrayGreen[i], arrayBlue[i]));
            g2.fillRect(arrayX[i], arrayY[i], (int) arrayDiametr[i], (int) arrayDiametr[i]);

        }
    }

    void input(int keyCode) {
        // код для обработки ввода
        if (keyCode == KeyEvent.VK_ESCAPE) {
            System.exit(0);
        } else if (keyCode == KeyEvent.VK_SPACE) {

        }// else if / switch...

    }

    public AnimationTemplate() {
        setTitle(title);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUndecorated(true);
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        DrawPanel panel = new DrawPanel();
        panel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                input(e.getKeyCode());
            }
        });
        add(panel);

        start();

        javax.swing.Timer timer = new javax.swing.Timer(delay, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                update();
                repaint();
            }
        });
        timer.start();

        setVisible(true);
    }

    public static void main(String[] args) {
        new AnimationTemplate();
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