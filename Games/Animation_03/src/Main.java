import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame {

  // Ваши переменные
  final int COUNT_FLAKE = 500;
  String title = "Animation Template";
  Color background = Color.black;
  int delay = 33;
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
  int playerOneCount;

  int playerSizeOne;
  int playerSizeTwo;
  int playerTwoCount;

  int player3X = 0;
  int player3Y = 0;
  int playerSize3;
  int player3Count;

  void start() {
    // код для инициализации
    for (int i = 0; i < COUNT_FLAKE; ++i) {
      arrayX[i] = random(-20, 1920);
      arrayY[i] = random(100, 900);
      arrayRed[i] = random(150, 255);
      arrayGreen[i] = random(150, 255);
      arrayBlue[i] = random(150, 255);
      arrayDiametr[i] = random(5, 100);
    }
    playerOneX = 500;
    playerOneY = 1000;
    playerSizeOne = 20;
    playerOneCount = 0;

    playerTwoX = 1000;
    playerTwoY = 1000;
    playerSizeTwo = 20;
    playerTwoCount = 0;

    player3X = 1500;
    player3Y = 1000;
    playerSize3 = 20;
    player3Count = 0;
  }

  public int random(int min, int max) {
    return (int) (min + Math.random() * (max - min + 1));
  }

  void update() {
    // код для обновления свойств объектов
    for (int i = 0; i < COUNT_FLAKE; ++i) {
      if (playerOneX + playerSizeOne > arrayX[i] && playerOneX < arrayX[i] + arrayDiametr[i]
          && playerOneY < arrayY[i] + arrayDiametr[i] && playerOneY + playerSizeOne > arrayY[i]) {
        playerSizeOne -= arrayDiametr[i] / 10;
        arrayDiametr[i] = 0;
      }

      if (playerTwoX + playerSizeTwo > arrayX[i] && playerTwoX < arrayX[i] + arrayDiametr[i]
          && playerTwoY < arrayY[i] + arrayDiametr[i] && playerTwoY + playerSizeTwo > arrayY[i]) {
        playerSizeTwo -= arrayDiametr[i] / 10;
        arrayDiametr[i] = 0;
      }

      if (player3X + playerSize3 > arrayX[i] && player3X < arrayX[i] + arrayDiametr[i]
          && player3Y < arrayY[i] + arrayDiametr[i] && player3Y + playerSize3 > arrayY[i]) {
        playerSize3 -= arrayDiametr[i] / 10;
        arrayDiametr[i] = 0;
      }
    }
  }

  void draw(Graphics2D g2) {

    // код для рисования следующего кадра
    for (int i = 0; i < COUNT_FLAKE; ++i) {
      if (playerSizeOne > 0) {
        g2.setColor(Color.green);
        g2.fillOval(playerOneX, playerOneY, playerSizeOne, playerSizeOne);
        g2.drawString("Player One", playerOneX + playerSizeOne, playerOneY
        );
        g2.drawString("Player One Score: " + playerSizeOne, 20, 40);
      } else {
        playerOneX = 0;
        playerOneY = 0;
      }

      if (playerSizeTwo > 0) {
        g2.setColor(Color.blue);
        g2.fillOval(playerTwoX, playerTwoY, playerSizeTwo, playerSizeTwo);
        g2.drawString("Player Two", playerTwoX + playerSizeTwo, playerTwoY);
        g2.drawString("Player Two Score: " + playerSizeTwo, 20, 60);
      } else {
        playerTwoX = 0;
        playerTwoY = 0;
      }
      if (playerSize3 > 0) {
        g2.setColor(Color.red);
        g2.fillOval(player3X, player3Y, playerSize3, playerSize3);
        g2.drawString("Player Three", player3X + playerSize3, player3Y);
        g2.drawString("Player Three Score: " + playerSize3, 20, 80);
      } else {
        player3X = 0;
        player3Y = 0;
      }

      g2.setColor(new Color(arrayRed[i], arrayGreen[i], arrayBlue[i]));
      g2.fillRect(arrayX[i], arrayY[i], (int) arrayDiametr[i], (int) arrayDiametr[i]);

    }
  }

  void input(int keyCode) {
    // код для обработки ввода
    if (keyCode == KeyEvent.VK_ESCAPE) {
      System.exit(0);
    } else if (keyCode == KeyEvent.VK_RIGHT) {
      playerTwoX += 10;
    } else if (keyCode == KeyEvent.VK_LEFT) {
      playerTwoX -= 10;
    } else if (keyCode == KeyEvent.VK_UP) {
      playerTwoY -= 10;
    } else if (keyCode == KeyEvent.VK_DOWN) {
      playerTwoY += 10;

    } else if (keyCode == KeyEvent.VK_D) {
      playerOneX += 10;
    } else if (keyCode == KeyEvent.VK_A) {
      playerOneX -= 10;
    } else if (keyCode == KeyEvent.VK_W) {
      playerOneY -= 10;
    } else if (keyCode == KeyEvent.VK_S) {
      playerOneY += 10;


    } else if (keyCode == KeyEvent.VK_NUMPAD6) {
      player3X += 10;
    } else if (keyCode == KeyEvent.VK_NUMPAD4) {
      player3X -= 10;
    } else if (keyCode == KeyEvent.VK_NUMPAD8) {
      player3Y -= 10;
    } else if (keyCode == KeyEvent.VK_NUMPAD5) {
      player3Y += 10;
    } else if (keyCode == KeyEvent.VK_ENTER) {
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

    javax.swing.Timer timer = new javax.swing.Timer(delay,
        new ActionListener() {
          public void actionPerformed(
              ActionEvent e
          ) {
            update();
            repaint();
          }
        }
    );
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
      RenderingHints
          hints
          = new RenderingHints(RenderingHints.KEY_ANTIALIASING,
          RenderingHints.VALUE_ANTIALIAS_ON
      );
      g2.setRenderingHints(hints);

      super.paintComponent(g);
      draw(g2);
    }
  }

}