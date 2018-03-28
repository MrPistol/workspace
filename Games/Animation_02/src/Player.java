import java.awt.*;


public class Player {


  private int x, y, size, count;
  private String name;
  private Color color;

  public Player(int x, int y, String name, Color color) {
    this.x = x;
    this.y = y;
    this.size = 20;
    this.count = 0;
    this.name = name;
    this.color = color;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  public void setCount(int count) {
    this.count = count;
  }

  public int getCount() {
    return count;
  }


  public void controller(
      int keyCode, int up, int right, int down, int left
  ) {
    if (keyCode == up) {
      this.y -= 10;
    }
    if (keyCode == right) {
      this.x += 10;
    }
    if (keyCode == down) {
      this.y += 10;
    }
    if (keyCode == left) {
      this.x -= 10;
    }
  }


  public void drawing(Graphics2D g2, int scoreX, int scoreY) {
    g2.setColor(color);
    g2.fillOval(x, y, size, size);
    g2.drawString("Player " + name + " Score: " + count,
        scoreX,
        scoreY
    );

    g2.drawString(name, x + size / 3, y + size + 15);

  }

  public void contactPlayer(Player p2) {
    if (this.x + this.size > p2.x && this.x < p2.x + p2.size && this.y < p2.y + p2.size
        && this.y + this.size > p2.y) {
      if (this.size > p2.size) {
        this.size += p2.size / 10;
        this.count += p2.size / 10;
        p2.size = 0;
      } else if (this.size < p2.size) {
        p2.size += this.size / 10;
        p2.count += this.size / 10;
        this.size = 0;
      }
    }
  }

}
