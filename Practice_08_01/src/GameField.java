public class GameField {
	private char[][] fieldState;


	public GameField(int width, int height, char emptyCellValue) {
		fieldState = new char[width][height];

		for (int x = 0; x < width; ++x) {
			for (int y = 0; y < height; ++y) {
				fieldState[x][y] = emptyCellValue;
			}
		}
	}


	public String toString() {
		StringBuilder result = new StringBuilder("");

		for (int y = 0; y < fieldState.length; ++y) {

			for (int x = 0; x < fieldState[0].length; ++x) {
				result.append(fieldState[x][y]);
			}
			result.append('\n');
		}
		return result.toString();
	}

	public String toString(Turtle turtle, char turtleSymbol) {
		StringBuilder result = new StringBuilder("");

		for (int y = 0; y < fieldState.length; ++y) {

			for (int x = 0; x < fieldState[0].length; ++x) {

				if (x == turtle.getX() && y == turtle.getY()) {
					result.append(turtleSymbol);
				} else {
					result.append(fieldState[x][y]);
				}
			}
			result.append('\n');
		}
		return result.toString();
	}

	public String toString(Turtle[] turtles, char turtleSymbol) {
		StringBuilder result = new StringBuilder("");

		for (int y = 0; y < fieldState.length; ++y) {
			outer:
			for (int x = 0; x < fieldState[0].length; ++x) {
				for (int i = 0; i < turtles.length; ++i) {

					if (x == turtles[i].getX()
							&& y == turtles[i].getY()) {
						result.append(turtleSymbol);
						continue outer;
					}
				}
				result.append(fieldState[x][y]);
			}
			result.append('\n');
		}
		return result.toString();
	}

	public boolean isInside(int x, int y) {
		return x >= 0
				&& x < fieldState.length
				&& y >= 0
				&& y < fieldState[0].length;


	}

	public void mark(int x, int y, char markValue) {
		if (isInside(x, y)) {
			fieldState[x][y] = markValue;
		}
	}

}
