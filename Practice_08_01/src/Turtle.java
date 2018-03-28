public class Turtle {
	private int x, y;
	private int dx, dy;
	private boolean isPenDown;
	private char directStatus;


	public Turtle() {
		this(0, 0);
	}

	public Turtle(int x, int y) {
		this.x = x;
		this.y = y;
		dx = 1;
		dy = 0;
		isPenDown = false;
		directStatus = '>';
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public char setDirectStatus() {
		if (dx == 1 && dy == 0) {
			directStatus = '>';
		} else if (dx == 0 && dy == -1) {
			directStatus = '^';
		} else if (dx == -1 && dy == 0) {
			directStatus = '<';
		} else if (dx == 0 && dy == 1) {
			directStatus = 'v';
		}
		return directStatus;
	}

	public void putPenDown() {
		isPenDown = true;
	}

	public void putPenUp() {
		isPenDown = false;
	}

	public void turnRight() {
		int temp = dx;
		dx = dy;
		dy = temp;
		dx *= -1;

	}

	public void turnLeft() {
		int temp = dx;
		dx = dy;
		dy = temp;
		dy *= -1;
	}

	public void move(int steps, GameField gameField, char markedCellValues) {
		for (int i = 0; i < steps; ++i) {

			int nextX = x + dx;
			int nextY = y + dy;
			if (!(gameField.isInside(nextX, nextY))) {
				break;
			} else {

				if (isPenDown) {
					gameField.mark(nextX,
							nextY,
							markedCellValues
					);
				}
				x = nextX;
				y = nextY;
			}
		}

	}

}
