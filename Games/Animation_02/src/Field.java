import java.awt.*;

public class Field {

  private int[][] apples;
  private Color color;
  private int number;
  private int minSize, maxSize;


  public Field(int width, int height, int number) {
    minSize = 20;
    maxSize = 100;

    apples = new int[number][6];
    for (int[] x : apples) {
      x[0] = random(width);             // x
      x[1] = random(height);            // y
      x[2] = random(minSize, maxSize);  // size
      x[3] = random(100, 255);          // colorRed
      x[4] = random(100, 255);          // colorGreen
      x[5] = random(100, 255);          // colorBlue
    }

    this.number = number;
  }

  public void drawing(Graphics2D g2) {

    for (int[] x : apples) {
      g2.setColor(new Color(x[3], x[4], x[5]));
      g2.fillRect(x[0], x[1], x[2], x[2]);
    }
  }

  public void contacPlayer(Player player) {
    for (int x[] : apples) {
      if (player.getX() + player.getSize() > x[0] && player.getX() < x[0] + x[2]
          && player.getY() < x[1] + x[2] && player.getY() + player.getSize() > x[1]) {
        player.setSize(player.getSize() + x[2] / 10);
        player.setCount(player.getCount() + x[2] / 10);
        x[2] = 0;
      }
    }
  }

  public int random(int min, int max) {
    return (int) (min + Math.random() * (max - min + 1));
  }

  public int random(int max) {
    return (int) (Math.random() * (max + 1));
  }
}
