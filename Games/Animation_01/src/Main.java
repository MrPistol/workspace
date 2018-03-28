import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame {

    String title = "Animation Template";
    Color background = Color.black;
    int delay = 33;

    // Ваши переменные
    final int COUNT_FLAKE = 1;


    int[] arrayX = new int[COUNT_FLAKE];
    int[] arrayY = new int[COUNT_FLAKE];
    int[] arrayRed = new int[COUNT_FLAKE];
    int[] arrayGreen = new int[COUNT_FLAKE];
    int[] arrayBlue = new int[COUNT_FLAKE];
    double[] arrayDiametr = new double[COUNT_FLAKE];

    int playerOneX = 0;
    int playerOneY = 0;


    int playerTwoX = 0;
    int playerTwoY = 0;

    int playerSizeOne;
    int playerSizeTwo;

    int direct = 0;
    String winner;

    void start() {
        // код для инициализации

        for (int i = 0; i < COUNT_FLAKE; ++i) {
            arrayX[i] = random(800, 1000);
            arrayY[i] = random(500, 500);
            arrayRed[i] = random(150, 255);
            arrayGreen[i] = random(150, 255);
            arrayBlue[i] = random(150, 255);
            arrayDiametr[i] = random(5, 100);
        }
        playerOneX = 1920/2;
        playerOneY = 1000;
        direct = 2;

        playerTwoX = 1920/2;
        playerTwoY = 11;
        playerSizeOne = 20;
        playerSizeTwo = 20;
        winner = "";


    }

    public int random(int min, int max) {
        return (int) (min + Math.random()*(max - min + 1));
    }

    void update() {


        // код для обновления свойств объектов
        for (int i = 0; i < COUNT_FLAKE; ++i) {
            arrayY[i] += direct;
            if (playerOneX + playerSizeOne > arrayX[i] &&
                    playerOneX < arrayX[i] + arrayDiametr[i] &&
                    playerOneY < arrayY[i] + arrayDiametr[i] &&
                    playerOneY > arrayY[i]) {

                direct += -2;
                playerSizeOne += 1;

            }
            if (playerTwoX + playerSizeTwo > arrayX[i] &&
                    playerTwoX < arrayX[i] + arrayDiametr[i] &&
                    playerTwoY < arrayY[i] + arrayDiametr[i] &&
                    playerTwoY + playerSizeTwo > arrayY[i]) {
                direct += 2;
                playerSizeTwo += 1;

            }


            if (arrayY[i] + arrayDiametr[i] < 0) {
                winner = "Player One is Winner!";
            }
            if (arrayY[i] + arrayDiametr[i] > 1080) {
                winner = "Player Two is Winner!";
            }

        }

    }

    void draw(Graphics2D g2) {

        // код для рисования следующего кадра


        for (int i = 0; i < COUNT_FLAKE; ++i) {
            g2.setColor(Color.green);
            g2.fillOval(playerOneX, playerOneY, playerSizeOne, playerSizeOne);
            g2.drawString("Player One", playerOneX + playerSizeOne, playerOneY);
            g2.drawString("Player One Size: "+ playerSizeOne,20,40);

            g2.setColor(Color.blue);
            g2.fillOval(playerTwoX, playerTwoY, playerSizeTwo, playerSizeTwo);
            g2.drawString("Player Two", playerTwoX + playerSizeTwo, playerTwoY);
            g2.drawString("Player Two Size: "+ playerSizeTwo,20,60);


            g2.setColor(new Color(arrayRed[i], arrayGreen[i], arrayBlue[i]));
            g2.drawString("Speed: "+ Math.abs(direct),20,20);
            g2.fillRect(arrayX[i], arrayY[i], (int) arrayDiametr[i], (int) arrayDiametr[i]);
            g2.setFont(new Font("TimesRoman", Font.PLAIN, 50));
            g2.drawString(winner, 100, 500);

        }
    }

    void input(int keyCode) {
        // код для обработки ввода
        if (keyCode == KeyEvent.VK_ESCAPE) {
            System.exit(0);
        } else if (keyCode == KeyEvent.VK_RIGHT) {
            playerOneX += 10;
        } else if (keyCode == KeyEvent.VK_LEFT) {
            playerOneX -= 10;
        } else if (keyCode == KeyEvent.VK_UP) {
            playerOneY -= 10;
        } else if (keyCode == KeyEvent.VK_DOWN) {
            playerOneY += 10;

        } else if (keyCode == KeyEvent.VK_D) {
            playerTwoX += 10;
        } else if (keyCode == KeyEvent.VK_A) {
            playerTwoX -= 10;
        } else if (keyCode == KeyEvent.VK_W) {
            playerTwoY -= 10;
        } else if (keyCode == KeyEvent.VK_S) {
            playerTwoY += 10;
        }

        else if (keyCode == KeyEvent.VK_ENTER) {
            start();
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