import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame {

  // Ваши переменные
  final int COUNT_FLAKE = 200;
  String title = "Game";
  Color background = Color.black;
  int delay = 33;
  Player playerOne;
  Player playerTwo;
  Player playerThree;
  Field field;

  void start() {
    // код для инициализации
    playerOne = new Player(500, 1000, "One", Color.red);
    playerTwo = new Player(1000, 1000, "Two", Color.blue);
    playerThree = new Player(1500, 1000, "Three", Color.green);
    field = new Field(1920, 900, COUNT_FLAKE);
  }

  void update() {
    // код для обновления свойств объектов
    field.contacPlayer(playerOne);
    field.contacPlayer(playerTwo);
    field.contacPlayer(playerThree);
    playerOne.contactPlayer(playerTwo);
    playerOne.contactPlayer(playerThree);
    playerTwo.contactPlayer(playerThree);
  }

  void draw(Graphics2D g2) {
    // код для рисования следующего кадра
    field.drawing(g2);
    g2.setColor(Color.black);
    g2.fillRect(10, 20, 150, 80);
    playerOne.drawing(g2, 20, 40);
    playerTwo.drawing(g2, 20, 60);
    playerThree.drawing(g2, 20, 80);
  }

  void input(int keyCode) {
    // код для обработки ввода
    playerOne.controller(keyCode, KeyEvent.VK_W, KeyEvent.VK_D, KeyEvent.VK_S, KeyEvent.VK_A);
    playerTwo
        .controller(keyCode, KeyEvent.VK_UP, KeyEvent.VK_RIGHT, KeyEvent.VK_DOWN, KeyEvent.VK_LEFT);
    playerThree.controller(keyCode, KeyEvent.VK_NUMPAD8, KeyEvent.VK_NUMPAD6, KeyEvent.VK_NUMPAD5,
        KeyEvent.VK_NUMPAD4);

    if (keyCode == KeyEvent.VK_ESCAPE) {
      System.exit(0);
    }
    if (keyCode == KeyEvent.VK_ENTER) {
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

    javax.swing.Timer timer;
    timer = new javax.swing.Timer(delay, new ActionListener() {
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
      RenderingHints hints = new RenderingHints(RenderingHints.KEY_ANTIALIASING,
          RenderingHints.VALUE_ANTIALIAS_ON);
      g2.setRenderingHints(hints);

      super.paintComponent(g);
      draw(g2);
    }
  }
}